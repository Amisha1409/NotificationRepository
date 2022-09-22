package com.egiftcard.EGiftCardApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.egiftcard.dao.INotificationServiceReceivedRepository;
import com.egiftcard.dao.INotificationServiceRedeemRepository;
import com.egiftcard.entity.GiftRedeemDetails;
import com.egiftcard.entity.UserGiftDetails;
import com.egiftcard.exception.InvalidReceiveIdException;
import com.egiftcard.exception.NoRedeemDetailsFoundException;
import com.egiftcard.service.NotificationServiceImpl;
@SpringBootTest
public class NotificationServiceTest {
	

		@Autowired
		private NotificationServiceImpl NotificationService;
		@MockBean
		private INotificationServiceReceivedRepository NotificationServiceDao;
		@MockBean
		private INotificationServiceRedeemRepository NotificationServiceRedeemDao;
		
		
	    @Test
		public void testsendGift_redeem_detailsNotification() throws InvalidReceiveIdException {
			Optional<GiftRedeemDetails>giftRedeem=Optional.of(new GiftRedeemDetails());
			GiftRedeemDetails giftRedeem1=giftRedeem.get();
			when(NotificationServiceRedeemDao.findById(12)).thenReturn(giftRedeem);
			assertEquals(giftRedeem1,NotificationService.sendGift_redeem_detailsNotification(12));
			}
			
		@Test
		void testGetAllGiftRedeemDeatils() throws NoRedeemDetailsFoundException {
			GiftRedeemDetails giftRedeemObj=new GiftRedeemDetails(12,true,null,500,3000,new UserGiftDetails());
			List<GiftRedeemDetails>list=new ArrayList<>();
			list.add(giftRedeemObj);
			when(NotificationServiceRedeemDao.findAll()).thenReturn(list);
			assertEquals(list,NotificationService.getAllGift_redeem_details());
		}
		
		
		@Test
		public void testSendGiftReceiveDetailsShouldThrowInvalidReceiveIdException() {
					
					assertThrows(InvalidReceiveIdException.class, ()->{
		        	NotificationService.sendGift_recd_detailsNotification(99);
		            });
					
		}
		@Test
		public void testSendGiftRedeemDetailsShouldThrowInvalidReceiveIdException() {
			
			assertThrows(InvalidReceiveIdException.class, ()->{
	    	NotificationService.sendGift_recd_detailsNotification(78);
	        });
			
		}
				
				
	 


		
		
		
	}



