class SimCardRunner
{
	public static void main(String[] simcard)
  {
  
		SimCard ref =new SimCard();
		ref.createSimCard("airtel" , 10, "1 week", 200,1);
		ref.displaySimCardInfo();
		
		SimCard ref1 =new SimCard();
		ref1.createSimCard("Jio" , 16, "20 days", 210, 2);
		ref1.displaySimCardInfo();
		
		SimCard ref2 =new SimCard();
		ref2.createSimCard("BSNL" , 10, "1 month", 200, 3);
		ref2.displaySimCardInfo();
		
		SimCard ref3 =new SimCard();
		ref3.createSimCard("VI" , 19, "2 month", 250, 4);
		ref3.displaySimCardInfo();
		
		SimCard ref4 =new SimCard();
		ref4.createSimCard("Nokia" , 13, "2 month", 509, 5);
		ref4.displaySimCardInfo();
		
		SimCard ref5 =new SimCard();
		ref5.createSimCard("airtel" ,  12, "1 year", 3000, 6);
		ref5.displaySimCardInfo();
		
		SimCard ref6 =new SimCard();
		ref6.createSimCard("samsang" , 15, "6 month", 400, 7);
		ref6.displaySimCardInfo();
		
		SimCard ref7 =new SimCard();
		ref7.createSimCard("TTBS" , 17, " 3 month", 800, 8);
		ref7.displaySimCardInfo();
		
		SimCard ref8 =new SimCard();
		ref8.createSimCard("Tray" , 12, "6 month", 500, 9);
		ref8.displaySimCardInfo();
		
		SimCard ref9 =new SimCard();
		ref9.createSimCard("MTNL" ,19, "3 month", 900, 4);
		ref9.displaySimCardInfo();
		
		SimCard ref10 =new SimCard();
		ref10.createSimCard("JIO" ,12, "1 year",  2000, 3);
		ref10.displaySimCardInfo();
		
		SimCard ref11 =new SimCard();
		ref11.createSimCard("Vi" , 2, "6 month", 995, 2);
		ref11.displaySimCardInfo();
		
		SimCard ref12 =new SimCard();
		ref12.createSimCard("Nokia" , 19,  "3 month", 625, 6);
		ref12.displaySimCardInfo();
		
		SimCard ref13 =new SimCard();
		ref13.createSimCard("Mtnl" , 15, "20 days",200, 5);
		ref13.displaySimCardInfo();
		
		SimCard ref14 =new SimCard();
		ref14.createSimCard("airtel" , 14, "3 month", 600, 7);
		ref14.displaySimCardInfo();
	}
}