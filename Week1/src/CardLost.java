import java.util.Date;

public class CardLost extends Lost {
    private String CardName;        //丢失者姓名
    private String CardNumber;      //丢失者学号
    private String CardSchool;      //丢失者学院

    public CardLost(String CardNa, String CardNum, String CardSch, Date LostDa, String LostSp, String GetSp) {
        CardName = CardNa;
        CardNumber = CardNum;
        CardSchool = CardSch;
        LostName = "一卡通";
        LostDate = LostDa;
        LostSpot = LostSp;
        GetSpot = GetSp;
    }

    public CardLost() {
    }

    public String getCardName() {
        return CardName;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public String getCardSchool() {
        return CardSchool;
    }

    public void setCardName(String cardName) {
        CardName = cardName;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public void setCardSchool(String cardSchool) {
        CardSchool = cardSchool;
    }
}
