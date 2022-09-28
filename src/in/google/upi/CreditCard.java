package in.google.upi;

public class CreditCard {
    String cardHolderName;
    double cardNumber;
    boolean status;

    public double getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(double cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName(){
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName){
        this.cardHolderName=cardHolderName;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }

    public  void displayCardDetails(CreditCard c)
    {
        System.out.println("Card Holder Name : "+c.getCardHolderName());
        System.out.println("Card Number : "+c.getCardHolderName());
        System.out.println("Card Status : "+c.getStatus());

    }

    public static void main(String args[])
    {
        CreditCard card=new CreditCard();
        card.setCardNumber(11112222);
        card.setCardHolderName("Rashmikanta Panda");
        card.setStatus(true);

        card.displayCardDetails(card);


    }
}
