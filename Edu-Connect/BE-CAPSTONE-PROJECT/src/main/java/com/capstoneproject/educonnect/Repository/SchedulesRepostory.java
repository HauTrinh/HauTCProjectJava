package com.capstoneproject.educonnect.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capstoneproject.educonnect.DTO.EmailDTO;
import com.capstoneproject.educonnect.DTO.InforuserDTO;
import com.capstoneproject.educonnect.DTO.ScheduleDTO;
import com.capstoneproject.educonnect.Entity.BookingEntity;

@Repository
public interface SchedulesRepostory extends JpaRepository<BookingEntity, Integer> {
	
	@Query(value = "select DISTINCT scheduled_date, ls.lessonline, tl.timeline, b.linkmeet,\r\n"
			+ "u.fullname, CONCAT_WS(' ', cs.coursename, c.class) AS courses, b.bookid\r\n"
			+ "from\r\n"
			+ "(\r\n"
			+ "WITH RECURSIVE DateRange AS (\r\n"
			+ " SELECT b.startdate AS scheduled_date, b.bookid\r\n"
			+ " FROM booking b\r\n"
			+ " where b.studentid = :studentId AND b.classcourseid = :clid and b.enddate >= sysdate()\r\n"
			+ " UNION ALL\r\n"
			+ " SELECT DATE_ADD(scheduled_date, INTERVAL 1 DAY), b.bookid\r\n"
			+ " FROM DateRange, booking b\r\n"
			+ " WHERE DATE_ADD(scheduled_date, INTERVAL 1 DAY) <= b.enddate and b.studentid = :studentId AND b.classcourseid = :clid and b.enddate >= sysdate()\r\n"
			+ " )\r\n"
			+ " SELECT scheduled_date, WEEKDAY(scheduled_date) AS day_of_week, bookid\r\n"
			+ " FROM DateRange\r\n"
			+ " )n\r\n"
			+ " inner join timebook t on t.bookid = n.bookid \r\n"
			+ " inner join lesson ls on ls.lessonid = t.lessonid and ls.dayofweek = day_of_week\r\n"
			+ " inner join timeline tl on tl.timeid = t.timeid\r\n"
			+ " inner join booking b on b.bookid = n.bookid\r\n"
			+ " inner join classcourse cl on cl.classcourseid = b.classcourseid\r\n"
			+ " inner join tutor tt on tt.tutorid = b.tutorid\r\n"
			+ " inner join user u on u.userid = tt.tutorid\r\n"
			+ " inner join class c on c.classid = cl.classid\r\n"
			+ " inner join course cs on cs.courseid = cl.courseid\r\n"
			+ " where 1=1\r\n"
			+ " and not exists (\r\n"
			+ " select 1\r\n"
			+ " from changecalender cc\r\n"
			+ " inner join booking bk on bk.bookid = cc.bookid\r\n"
			+ " where cc.datechange = n.scheduled_date and cc.timechange = tl.timeline\r\n"
			+ " )\r\n"
			+ " and b.studentid = :studentId\r\n"
			+ " AND WEEK(n.scheduled_date) = :week\r\n"
			+ " AND YEAR(n.scheduled_date) = :year\r\n"
			+ " order by scheduled_date ASC;", nativeQuery = true)
    List<ScheduleDTO> scheduleStudent(@Param("studentId") int studentId, @Param("week") String week, @Param("year") String year, @Param("clid") int clid);
	
	@Query(value = "select u.email\r\n"
			+ " from\r\n"
			+ " (\r\n"
			+ " WITH RECURSIVE DateRange AS (\r\n"
			+ " SELECT b.startdate AS scheduled_date, b.bookid\r\n"
			+ " FROM booking b\r\n"
			+ " where b.studentid = :studentId AND b.classcourseid = :clid and b.enddate >= sysdate()\r\n"
			+ " UNION ALL\r\n"
			+ " SELECT DATE_ADD(scheduled_date, INTERVAL 1 DAY), b.bookid\r\n"
			+ " FROM DateRange, booking b\r\n"
			+ " WHERE DATE_ADD(scheduled_date, INTERVAL 1 DAY) <= b.enddate and b.studentid = :studentId AND b.classcourseid = :clid and b.enddate >= sysdate()\r\n"
			+ " )\r\n"
			+ " SELECT scheduled_date, WEEKDAY(scheduled_date) AS day_of_week, bookid\r\n"
			+ " FROM DateRange\r\n"
			+ " )n\r\n"
			+ " inner join timebook t on t.bookid = n.bookid \r\n"
			+ " inner join timeline tl on tl.timeid = t.timeid\r\n"
			+ " inner join lesson ls on ls.lessonid = t.lessonid and ls.dayofweek = day_of_week\r\n"
			+ " inner join booking b on b.bookid = n.bookid\r\n"
			+ " inner join student s on s.studentid = b.studentid\r\n"
			+ " inner join user u on u.userid = s.studentid\r\n"
			+ " where 1=1\r\n"
			+ " and not exists (\r\n"
			+ " select 1\r\n"
			+ " from changecalender cc\r\n"
			+ " inner join booking bk on bk.bookid = cc.bookid\r\n"
			+ " where cc.datechange = n.scheduled_date and cc.timechange = tl.timeline\r\n"
			+ " )"
			+ " and b.studentid = :studentId\r\n"
			+ " and :date = n.scheduled_date\r\n"
			+ " and tl.timeline = :time ;", nativeQuery = true)
	EmailDTO sendmail (@Param("studentId") int studentId, @Param("date") String date, @Param("time") String time, @Param("clid") int clid);
	
	@Query(value = "select u.email\r\n"
			+ "from changecalender c\r\n"
			+ "inner join booking b on b.bookid = c.bookid\r\n"
			+ "inner join timeline t on t.timeid = c.timeid\r\n"
			+ "inner join student s on s.studentid = b.studentid\r\n"
			+ "inner join user u on u.userid = s.studentid\r\n"
			+ "inner join classcourse cl on cl.classcourseid = b.classcourseid\r\n"
			+ "inner join class ca on ca.classid = cl.classid\r\n"
			+ "inner join course cs on cs.courseid = cl.courseid\r\n"
			+ "where 1=1\r\n"
			+ "and b.studentid = :studentId\r\n"
			+ "and :date = c.datelearn\r\n"
			+ "and t.timeline = :time "
			+ "and b.classcourseid = :clid ;", nativeQuery = true)
	EmailDTO sendmailstudent (@Param("studentId") int studentId, @Param("date") String date, @Param("time") String time, @Param("clid") int clid);
	
	
	@Query(value = "select u.email\r\n"
			+ " from\r\n"
			+ " (\r\n"
			+ " WITH RECURSIVE DateRange AS (\r\n"
			+ " SELECT b.startdate AS scheduled_date, b.bookid\r\n"
			+ " FROM booking b\r\n"
			+ " where b.tutorid = :tutorid AND b.classcourseid = :clid and b.enddate >= sysdate()\r\n"
			+ " UNION ALL\r\n"
			+ " SELECT DATE_ADD(scheduled_date, INTERVAL 1 DAY), b.bookid\r\n"
			+ " FROM DateRange, booking b\r\n"
			+ " WHERE DATE_ADD(scheduled_date, INTERVAL 1 DAY) <= b.enddate and b.tutorid = :tutorid AND b.classcourseid = :clid and b.enddate >= sysdate()\r\n"
			+ " )\r\n"
			+ " SELECT scheduled_date, WEEKDAY(scheduled_date) AS day_of_week, bookid\r\n"
			+ " FROM DateRange\r\n"
			+ " )n\r\n"
			+ " inner join timebook t on t.bookid = n.bookid \r\n"
			+ " inner join timeline tl on tl.timeid = t.timeid\r\n"
			+ " inner join lesson ls on ls.lessonid = t.lessonid and ls.dayofweek = day_of_week\r\n"
			+ " inner join booking b on b.bookid = n.bookid\r\n"
			+ " inner join tutor tt on tt.tutorid = b.tutorid\r\n"
			+ " inner join user u on u.userid = tt.tutorid\r\n"
			+ " where 1=1\r\n"
			+ " and not exists (\r\n"
			+ " select 1\r\n"
			+ " from changecalender cc\r\n"
			+ " inner join booking bk on bk.bookid = cc.bookid\r\n"
			+ " where cc.datechange = n.scheduled_date and cc.timechange = tl.timeline\r\n"
			+ " )"
			+ " and b.tutorid = :tutorid\r\n"
			+ " and :date = n.scheduled_date\r\n"
			+ " and tl.timeline = :time ;", nativeQuery = true)
	EmailDTO sendmailtutor (@Param("tutorid") int studentId, @Param("date") String date, @Param("time") String time, @Param("clid") int clid);
	
	@Query(value = "select u.email\r\n"
			+ "from changecalender c\r\n"
			+ "inner join booking b on b.bookid = c.bookid\r\n"
			+ "inner join timeline t on t.timeid = c.timeid\r\n"
			+ "inner join tutor tt on tt.tutorid = b.tutorid\r\n"
			+ "inner join user u on u.userid = tt.tutorid\r\n"
			+ "inner join classcourse cl on cl.classcourseid = b.classcourseid\r\n"
			+ "inner join class ca on ca.classid = cl.classid\r\n"
			+ "inner join course cs on cs.courseid = cl.courseid\r\n"
			+ "where 1=1\r\n"
			+ "and b.tutorid = :tutorid\r\n"
			+ "and :date = c.datelearn\r\n"
			+ "and t.timeline = :time "
			+ "and b.classcourseid = :clid ;", nativeQuery = true)
	EmailDTO sendmailtutorchange (@Param("tutorid") int studentId, @Param("date") String date, @Param("time") String time, @Param("clid") int clid);
	
	
	@Query(value = "select u1.email, u.fullname, CONCAT_WS(' ', cs.coursename, c.class) AS courses\r\n"
			+ "from booking b\r\n"
			+ "inner join student st on st.studentid = b.studentid\r\n"
			+ "inner join user u1 on u1.userid = st.studentid\r\n"
			+ "inner join tutor t on t.tutorid = b.tutorid\r\n"
			+ "inner join user u on u.userid = t.tutorid\r\n"
			+ "inner join classcourse cl on cl.classcourseid = b.classcourseid\r\n"
			+ "inner join course cs on cs.courseid = cl.courseid\r\n"
			+ "inner join class c on c.classid = cl.classid\r\n"
			+ "where b.studentid = :studentId and b.enddate = :date ;", nativeQuery = true)
	List<InforuserDTO> sendmailclosecousestudent (@Param("studentId") int studentId, @Param("date") String date);
	
	@Query(value = "select u.email, u1.fullname, CONCAT_WS(' ', cs.coursename, c.class) AS courses\r\n"
			+ "from booking b\r\n"
			+ "inner join student st on st.studentid = b.studentid\r\n"
			+ "inner join user u1 on u1.userid = st.studentid\r\n"
			+ "inner join tutor t on t.tutorid = b.tutorid\r\n"
			+ "inner join user u on u.userid = t.tutorid\r\n"
			+ "inner join classcourse cl on cl.classcourseid = b.classcourseid\r\n"
			+ "inner join course cs on cs.courseid = cl.courseid\r\n"
			+ "inner join class c on c.classid = cl.classid\r\n"
			+ "where b.studentid = :studentId and b.enddate = :date ;", nativeQuery = true)
	List<InforuserDTO> sendmailclosecousetutor (@Param("studentId") int studentId, @Param("date") String date);
	
	@Query(value = "select DISTINCT scheduled_date, ls.lessonline, tl.timeline, b.linkmeet,\r\n"
			+ "u.fullname, CONCAT_WS(' ', cs.coursename, c.class) AS courses, b.bookid, ch.datechange\r\n"
			+ "from\r\n"
			+ "(\r\n"
			+ "WITH RECURSIVE DateRange AS (\r\n"
			+ " SELECT b.startdate AS scheduled_date, b.bookid\r\n"
			+ " FROM booking b\r\n"
			+ " where b.tutorid = :tutorid AND b.classcourseid = :clid and b.enddate >= sysdate()\r\n"
			+ " UNION ALL\r\n"
			+ " SELECT DATE_ADD(scheduled_date, INTERVAL 1 DAY), b.bookid\r\n"
			+ " FROM DateRange, booking b\r\n"
			+ " WHERE DATE_ADD(scheduled_date, INTERVAL 1 DAY) <= b.enddate and b.tutorid = :tutorid AND b.classcourseid = :clid and b.enddate >= sysdate()\r\n"
			+ " )\r\n"
			+ " SELECT scheduled_date, WEEKDAY(scheduled_date) AS day_of_week, bookid\r\n"
			+ " FROM DateRange\r\n"
			+ " )n\r\n"
			+ " inner join timebook t on t.bookid = n.bookid \r\n"
			+ " inner join lesson ls on ls.lessonid = t.lessonid and ls.dayofweek = day_of_week\r\n"
			+ " inner join timeline tl on tl.timeid = t.timeid\r\n"
			+ " inner join booking b on b.bookid = n.bookid\r\n"
			+ " inner join classcourse cl on cl.classcourseid = b.classcourseid\r\n"
			+ " inner join student tt on tt.studentid = b.studentid\r\n"
			+ " inner join user u on u.userid = tt.studentid\r\n"
			+ " inner join class c on c.classid = cl.classid\r\n"
			+ " inner join course cs on cs.courseid = cl.courseid"
			+ " left join changecalender ch on ch.bookid = b.bookid and ch.datechange = n.scheduled_date\r\n"
			+ " where 1=1\r\n"
			+ "and not exists (\r\n"
			+ "	select 1\r\n"
			+ "    from changecalender cc\r\n"
			+ "    inner join booking bk on bk.bookid = cc.bookid\r\n"
			+ "    where cc.datechange = n.scheduled_date and cc.timechange = tl.timeline\r\n"
			+ ")\r\n"
			+ " and b.tutorid = :tutorid\r\n"
			+ " AND WEEK(n.scheduled_date) = :week\r\n"
			+ " AND YEAR(n.scheduled_date) = :year\r\n"
			+ " order by scheduled_date ASC;", nativeQuery = true)
    List<ScheduleDTO> scheduletutor(@Param("tutorid") int tutorid, @Param("week") String week, @Param("year") String year, @Param("clid") int clid);
	
	@Query(value = "select c.datelearn scheduled_date, c.lessonline, t.timeline, b.linkmeet, u.fullname,\r\n"
			+ "CONCAT_WS(' ', cs.coursename, ca.class) AS courses, b.bookid, c.datelearn\r\n"
			+ "from changecalender c\r\n"
			+ "inner join booking b on b.bookid = c.bookid\r\n"
			+ "inner join timeline t on t.timeid = c.timeid\r\n"
			+ "inner join tutor tt on tt.tutorid = b.tutorid\r\n"
			+ "inner join user u on u.userid = tt.tutorid\r\n"
			+ "inner join classcourse cl on cl.classcourseid = b.classcourseid\r\n"
			+ "inner join class ca on ca.classid = cl.classid\r\n"
			+ "inner join course cs on cs.courseid = cl.courseid\r\n"
			+ "where \r\n"
			+ "week(c.datelearn) = :week and year(c.datelearn) = :year and b.tutorid = :tutorid and b.classcourseid = :clid", nativeQuery = true)
    List<ScheduleDTO> scheduletutors(@Param("tutorid") int tutorid, @Param("week") String week, @Param("year") String year, @Param("clid") int clid);
	
	@Query(value = "select c.datelearn scheduled_date, c.lessonline, t.timeline, b.linkmeet, u.fullname,\r\n"
			+ "CONCAT_WS(' ', cs.coursename, ca.class) AS courses, b.bookid\r\n"
			+ "from changecalender c\r\n"
			+ "inner join booking b on b.bookid = c.bookid\r\n"
			+ "inner join timeline t on t.timeid = c.timeid\r\n"
			+ "inner join student s on s.studentid = b.studentid\r\n"
			+ "inner join user u on u.userid = s.studentid\r\n"
			+ "inner join classcourse cl on cl.classcourseid = b.classcourseid\r\n"
			+ "inner join class ca on ca.classid = cl.classid\r\n"
			+ "inner join course cs on cs.courseid = cl.courseid\r\n"
			+ "where \r\n"
			+ "week(c.datelearn) = :week and year(c.datelearn) = :year and b.studentid = :studentid and b.classcourseid = :clid", nativeQuery = true)
    List<ScheduleDTO> schedulestudents(@Param("studentid") int studentid, @Param("week") String week, @Param("year") String year, @Param("clid") int clid);
	
	@Query(value = "select DISTINCT scheduled_date, ls.lessonline, tl.timeline, b.linkmeet,\r\n"
			+ "u.fullname, CONCAT_WS(' ', cs.coursename, c.class) AS courses, b.bookid\r\n"
			+ "from\r\n"
			+ "(\r\n"
			+ "WITH RECURSIVE DateRange AS (\r\n"
			+ " SELECT b.startdate AS scheduled_date, b.bookid\r\n"
			+ " FROM booking b\r\n"
			+ " where b.tutorid = :tutorid and b.enddate >= sysdate()\r\n"
			+ " UNION ALL\r\n"
			+ " SELECT DATE_ADD(scheduled_date, INTERVAL 1 DAY), b.bookid\r\n"
			+ " FROM DateRange, booking b\r\n"
			+ " WHERE DATE_ADD(scheduled_date, INTERVAL 1 DAY) <= b.enddate and b.tutorid = :tutorid and b.enddate >= sysdate()\r\n"
			+ " )\r\n"
			+ " SELECT scheduled_date, WEEKDAY(scheduled_date) AS day_of_week, bookid\r\n"
			+ " FROM DateRange\r\n"
			+ " )n\r\n"
			+ " inner join timebook t on t.bookid = n.bookid \r\n"
			+ " inner join lesson ls on ls.lessonid = t.lessonid and ls.dayofweek = day_of_week\r\n"
			+ " inner join timeline tl on tl.timeid = t.timeid\r\n"
			+ " inner join booking b on b.bookid = n.bookid\r\n"
			+ " inner join classcourse cl on cl.classcourseid = b.classcourseid\r\n"
			+ " inner join student tt on tt.studentid = b.studentid\r\n"
			+ " inner join user u on u.userid = tt.studentid\r\n"
			+ " inner join class c on c.classid = cl.classid\r\n"
			+ " inner join course cs on cs.courseid = cl.courseid\r\n"
			+ " where 1=1\r\n"
			+ " and b.tutorid = :tutorid \r\n"
			+ " AND n.scheduled_date = :time \r\n"
			+ " and tl.timeid = :timeid \r\n"
			+ " order by scheduled_date ASC;", nativeQuery = true)
    ScheduleDTO detailschdule(@Param("tutorid") int tutorid, @Param("time") String time, @Param("timeid") int timeid);
	
}
