package com.egiftcard.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="payment_details")
public class PaymentDetails {
    
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "payment_id")
        private int paymentId;
        
        @Column(name="payment_date")
        private Date paymentDate;
        
        @Column(name="payment_amount")
        private float paymentAmount;
        

        @Column(name="name_on_card")
        private String nameOnCard;
        
        @Column(name="card_number")
        private int cardNumber;
        
        @Column(name="card_expiry")
        private Date cardExpiry;
        
        @Column(name="cvv")
        private int cvv; 
        
         @ManyToOne(cascade = CascadeType.ALL)
            @JoinColumn(name = "user_gift_id")
            private UserGiftDetails userGiftID;

        public int getPaymentId() {
            return paymentId;
        }

        public void setPaymentId(int paymentId) {
            this.paymentId = paymentId;
        }

        public Date getPaymentDate() {
            return paymentDate;
        }

        public void setPaymentDate(Date paymentDate) {
            this.paymentDate = paymentDate;
        }

        public String getNameOnCard() {
            return nameOnCard;
        }

        public void setNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
        }

        public int getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(int cardNumber) {
            this.cardNumber = cardNumber;
        }

        public Date getCardExpiry() {
            return cardExpiry;
        }

        public void setCardExpiry(Date cardExpiry) {
            this.cardExpiry = cardExpiry;
        }

        public int getCvv() {
            return cvv;
        }

        public void setCvv(int cvv) {
            this.cvv = cvv;
        }

       
        public float getPaymentAmount() {
            return paymentAmount;
        }

        public void setPaymentAmount(float paymentAmount) {
            this.paymentAmount = paymentAmount;
        }

        public UserGiftDetails getUserGiftID() {
            return userGiftID;
        }

        public void setUserGiftID(UserGiftDetails userGiftID) {
            this.userGiftID = userGiftID;
        }

        @Override
        public String toString() {
            return "PaymentDetails [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", paymentAmount="
                    + paymentAmount + ", nameOnCard=" + nameOnCard + ", cardNumber=" + cardNumber + ", cardExpiry="
                    + cardExpiry + ", cvv=" + cvv + ", userGiftID=" + userGiftID + "]";
        }
        
        
    } 