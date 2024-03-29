package com.capstoneproject.educonnect.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class GetTutorRequestDTO {

	@JsonProperty("fullname")
	private String fullname;
	
	@JsonProperty("courseid")
	private int courseId;
}
