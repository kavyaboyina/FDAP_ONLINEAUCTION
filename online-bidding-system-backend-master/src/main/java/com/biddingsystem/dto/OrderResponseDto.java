package com.biddingsystem.dto;

import java.util.List;

import com.biddingsystem.entity.Orders;

import lombok.Data;

@Data
public class OrderResponseDto extends CommonApiResponse {
	
	public void setOrders(List<Orders> orders2) {
		// TODO Auto-generated method stub
		
	}

	public void setSuccess(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void setResponseMessage(String string) {
		@SuppressWarnings("unused")
		// TODO Auto-generated method stub
		class OrderResponseto {

		    // ... other fields and methods of OrderResponseDto

		    private String responseMessage;

		    // Getter and Setter for responseMessage
		    public String getResponseMessage() {
		        return responseMessage;
		    }

		    public void setResponseMessage(String responseMessage) {
		        this.responseMessage = responseMessage;
		    }

		    // ... other methods of OrderResponseDto
		}
		
	}

}
