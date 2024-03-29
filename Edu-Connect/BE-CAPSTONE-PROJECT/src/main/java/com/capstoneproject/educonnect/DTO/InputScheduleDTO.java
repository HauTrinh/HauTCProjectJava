package com.capstoneproject.educonnect.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputScheduleDTO {

	@JsonProperty("studentId")
	private int studentId;
	
	@JsonProperty("weeb")
	private String weeb;
	
	@JsonProperty("year")
	private String year;
}
