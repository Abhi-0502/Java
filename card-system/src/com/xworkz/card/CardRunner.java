package com.xworkz.card;


import com.xworkz.card.dto.cardDto;


public class CardRunner {
    public static void main(String[] args) {
        cardDto cardDto = new cardDto();
        cardDto.setcardId(1);
        cardDto.setcardHolderName("abhi");
        cardDto.setcardNo(1234567898768l);
        cardDto.setcardcvv(123);
        cardDto.setcardexpiryDate("12/24");

        int cardId = cardDto.getcardId();
        System.out.println(cardId);
        String cardHolderName = cardDto.getcardHolderName();
        System.out.println(cardHolderName);
        long cardNo = cardDto.getcardNo();
        System.out.println(cardNo);
        int cardcvv = cardDto.getcardcvv();
        System.out.println(cardcvv);
        String cardexpirydate = cardDto. getcardexpiryDate();
        System.out.println(cardexpirydate);

    }
}