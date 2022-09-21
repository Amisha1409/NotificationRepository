package com.egiftcard.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egiftcard.entity.GiftReceivedDetails;
import com.egiftcard.entity.GiftRedeemDetails;
import com.egiftcard.exception.InvalidReceiveIdException;
import com.egiftcard.exception.NoReceivedDetailsFoundException;
import com.egiftcard.exception.NoRedeemDetailsFoundException;
import com.egiftcard.service.NotificationService;
@RestController
@RequestMapping("/api")
public class NotificationController {
	@Autowired
	private NotificationService Notification;
	@GetMapping(value="/show")
	public List<GiftReceivedDetails> getAllGift_recd_details()throws NoReceivedDetailsFoundException {
		
		System.out.println("Inside Controller Layer");
	return Notification.getAllGift_recd_details();
}
	
	

	@GetMapping(value="/view")
	public List<GiftRedeemDetails> getAllGift_redeem_details() throws NoRedeemDetailsFoundException {
		
		
		System.out.println("Inside Controller Layer");
		return Notification.getAllGift_redeem_details();
	
	}


	@GetMapping("/GiftReceivedId/{gift_redeem_id}")
  public ResponseEntity<GiftRedeemDetails>sendGift_redeem_detailsNotification(@PathVariable int gift_redeem_id)throws InvalidReceiveIdException{
		GiftRedeemDetails giftRedeemId=Notification.sendGift_redeem_detailsNotification(gift_redeem_id);

		
		return new ResponseEntity<GiftRedeemDetails>(giftRedeemId,HttpStatus.OK); 	
	}
		
	
	@GetMapping("/Gifts/{giftReceivedId}")
	 public ResponseEntity<GiftReceivedDetails>sendGift_recd_detailsNotification(@PathVariable int giftReceivedId) throws InvalidReceiveIdException {
			GiftReceivedDetails giftId=Notification.sendGift_recd_detailsNotification(giftReceivedId);
			
			
		 return new ResponseEntity<GiftReceivedDetails>(giftId,HttpStatus.OK) ;	
	}
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	

	
	


