package com.egiftcard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.egiftcard.dao.INotificationServiceReceivedRepository;
import com.egiftcard.dao.INotificationServiceRedeemRepository;

import com.egiftcard.entity.GiftReceivedDetails;
import com.egiftcard.entity.GiftRedeemDetails;
import com.egiftcard.exception.InvalidReceiveIdException;
import com.egiftcard.exception.NoReceivedDetailsFoundException;
import com.egiftcard.exception.NoRedeemDetailsFoundException;
import com.egiftcard.exception.NotificationException;


@Service("service")
public class NotificationServiceImpl implements NotificationService
{
	@Autowired
	private INotificationServiceReceivedRepository GiftReceivedRepo;
	
	@Override
	public List<GiftReceivedDetails> getAllGift_recd_details() throws NoReceivedDetailsFoundException{
		// TODO Auto-generated method stub
		System.out.println("Inside Service Layer");
		if(GiftReceivedRepo.findAll().isEmpty()) {
			throw new NoReceivedDetailsFoundException("No Details Found");
		}
		return GiftReceivedRepo.findAll();
	}
	
	@Autowired
	private INotificationServiceRedeemRepository GiftRedeemRepo;
	@Override
	public List<GiftRedeemDetails> getAllGift_redeem_details() throws NoRedeemDetailsFoundException {
		// TODO Auto-generated method stub
		System.out.println("Inside Service Layer");
		if( GiftRedeemRepo.findAll().isEmpty()) {
			throw new NoRedeemDetailsFoundException("No Details found");
		}
		return GiftRedeemRepo.findAll();
	}

	@Override
	public GiftRedeemDetails sendGift_redeem_detailsNotification(int gift_redeem_id) throws InvalidReceiveIdException  {
		// TODO Auto-generated method stub
		System.out.println("Here");
		if(!GiftRedeemRepo.findById(gift_redeem_id).isPresent()) {
			throw new InvalidReceiveIdException("Id is wrong");
		}
		Optional<GiftRedeemDetails>Op=GiftRedeemRepo.findById(gift_redeem_id);
		return Op.get();
	}

	
  public GiftReceivedDetails sendGift_recd_detailsNotification(int giftReceivedId) throws InvalidReceiveIdException {
		// TODO Auto-generated method stub
		System.out.println("Here");
		if(!GiftReceivedRepo.findById(giftReceivedId).isPresent()) {
			throw new InvalidReceiveIdException("Id is Wrong");
		}
		Optional<GiftReceivedDetails>Op=GiftReceivedRepo.findById(giftReceivedId);{
		return Op.get();
			
		}
	
	}

	
	}




