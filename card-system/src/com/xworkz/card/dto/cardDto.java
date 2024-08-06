package com.xworkz.card.dto;

public class cardDto {

    private int cardId = 1;
    private String cardHolderName = "abhi";
    private long cardNo = 1234567l;
    private int cardcvv = 123;
    private String cardexpiryDate = "12/24";


    public cardDto() {
        System.out.println("created sucessfully");
    }
     public void setcardId(int cardId) {
         this.cardId = cardId;

     }
    public int getcardId() {
        return cardId;
    }

    public void setcardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
      public String getcardHolderName(){
        return cardHolderName;
      }
      public void setcardNo(long cardNo){
        this.cardNo = cardNo;
      }
    public long getcardNo() {
        return cardNo;
    }
       public void setcardcvv(int cardcvv){
        this.cardcvv = cardcvv;
       }

    public int getcardcvv(){
        return cardcvv;
    }
    public void setcardexpiryDate(String cardexpirydate){
        this.cardexpiryDate = cardexpirydate;
    }

    public String getcardexpiryDate() {
        return cardexpiryDate;
    }

}