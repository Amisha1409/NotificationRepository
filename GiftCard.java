package com.egiftcard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gift_card")
public class GiftCard {

	
	   
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "gift_card_id")
	    private long giftCardId;
	    @Column(name = "gift_card_name")
	    private String giftCardName;
	    @Column(name = "brand_list")
	    private String brandList;
	    @Column(name = "redemption_details")
	    private String redemptionDetails;
	    @Column(name = "minimum_amount")
	    private float minimumAmount;
	    @Column(name = "maximum_amount")
	    private float maximumAmount;
	    @Column(name = "about_gift_card")
	    private String aboutGiftCard;
	   
	   
	    public long getGiftCardId() {
	        return giftCardId;
	    }
	    public void setGiftCardId(long giftCardId) {
	        this.giftCardId = giftCardId;
	    }
	    public String getGiftCardName() {
	        return giftCardName;
	    }
	    public void setGiftCardName(String giftCardName) {
	        this.giftCardName = giftCardName;
	    }
	    public String getBrandList() {
	        return brandList;
	    }
	    public void setBrandList(String brandList) {
	        this.brandList = brandList;
	    }
	    public String getRedemptionDetails() {
	        return redemptionDetails;
	    }
	    public void setRedemptionDetails(String redemptionDetails) {
	        this.redemptionDetails = redemptionDetails;
	    }
	    public float getMinimumAmount() {
	        return minimumAmount;
	    }
	    public void setMinimumAmount(float minimumAmount) {
	        this.minimumAmount = minimumAmount;
	    }
	    public float getMaximumAmount() {
	        return maximumAmount;
	    }
	    public void setMaximumAmount(float maximumAmount) {
	        this.maximumAmount = maximumAmount;
	    }
	    public String getAboutGiftCard() {
	        return aboutGiftCard;
	    }
	    public void setAboutGiftCard(String aboutGiftCard) {
	        this.aboutGiftCard = aboutGiftCard;
	    }
	   
	   
	    @Override
	    public String toString() {
	        return "GiftCard [giftCardId=" + giftCardId + ", giftCardName=" + giftCardName + ", brandList=" + brandList
	                + ", redemptionDetails=" + redemptionDetails + ", minimumAmount=" + minimumAmount + ", maximumAmount="
	                + maximumAmount + ", aboutGiftCard=" + aboutGiftCard + "]";
	    }
		public GiftCard(long giftCardId, String giftCardName, String brandList, String redemptionDetails,
				float minimumAmount, float maximumAmount, String aboutGiftCard) {
			super();
			this.giftCardId = giftCardId;
			this.giftCardName = giftCardName;
			this.brandList = brandList;
			this.redemptionDetails = redemptionDetails;
			this.minimumAmount = minimumAmount;
			this.maximumAmount = maximumAmount;
			this.aboutGiftCard = aboutGiftCard;
		}
		public GiftCard() {
			super();
			// TODO Auto-generated constructor stub
		}
	   
	   
	   
	   
	}


