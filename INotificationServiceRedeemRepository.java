package com.egiftcard.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egiftcard.entity.GiftRedeemDetails;

public interface INotificationServiceRedeemRepository extends JpaRepository<GiftRedeemDetails,Integer>{
	

}

