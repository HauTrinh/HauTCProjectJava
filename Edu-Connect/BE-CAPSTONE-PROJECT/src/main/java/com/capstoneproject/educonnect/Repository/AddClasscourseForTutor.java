package com.capstoneproject.educonnect.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstoneproject.educonnect.Entity.Teach;

@Repository
public interface AddClasscourseForTutor extends JpaRepository<Teach, Integer> {

}
