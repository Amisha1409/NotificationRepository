package com.egiftcard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.egiftcard.entity.GiftReceivedDetails;
import com.egiftcard.entity.GiftRedeemDetails;
import com.egiftcard.exception.InvalidReceiveIdException;
import com.egiftcard.exception.NoReceivedDetailsFoundException;
import com.egiftcard.exception.NoRedeemDetailsFoundException;

@Service
public interface NotificationService {

	List<GiftReceivedDetails> getAllGift_recd_details() throws NoReceivedDetailsFoundException;
	List<GiftRedeemDetails> getAllGift_redeem_details() throws  NoRedeemDetailsFoundException ;
	
	GiftRedeemDetails sendGift_redeem_detailsNotification(int gift_redeem_id)throws InvalidReceiveIdException ;
	GiftReceivedDetails sendGift_recd_detailsNotification(int gift_received_id)throws InvalidReceiveIdException;

	 
	}
