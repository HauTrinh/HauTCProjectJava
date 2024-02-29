package com.capstoneproject.educonnect.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StaffViewProfileStudentDTO {

	@JsonProperty("studentid")
	private int studentid;

	@JsonProperty("fullname")
	private String fullname;

	@JsonProperty("img")
    private String img;
	
	@JsonProperty("birthdate")
    private String birthdate;

	@JsonProperty("city")
    private String city;

    @JsonProperty("wards")
    private String wards;
    
    @JsonProperty("email")
	private String email;

    @JsonProperty("phone")
	private String phone;
    
       
    @JsonProperty("class")
	private String className;
}
