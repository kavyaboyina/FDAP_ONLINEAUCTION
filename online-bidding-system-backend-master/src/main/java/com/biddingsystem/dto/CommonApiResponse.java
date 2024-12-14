package com.biddingsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonApiResponse {

	private String responseMessage;
	
	private boolean isSuccess;

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}

}