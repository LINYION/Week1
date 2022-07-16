import java.util.Date;

public class Lost {
    protected String LostName;      //失物名字
    protected Date LostDate;        //拾到日期
    protected String LostSpot;        //拾到地点
    protected String GetSpot;         //认领地点

    public Lost() {
    }

    public Lost(String LostNam, Date LostDa, String LostSp, String GetSp) {
        LostName = LostNam;
        LostDate = LostDa;
        LostSpot = LostSp;
        GetSpot = GetSp;
    }

    public void setGetSpot(String getSpot) {
        GetSpot = getSpot;
    }

    public void setLostDate(Date lostDate) {
        LostDate = lostDate;
    }

    public void setLostNumber(String lostName) {
        LostName = lostName;
    }

    public void setLostSpot(String lostSpot) {
        LostSpot = lostSpot;
    }

    public String getGetSpot() {
        return GetSpot;
    }

    public Date getLostDate() {
        return LostDate;
    }

    public String getLostName() {
        return LostName;
    }

    public String getLostSpot() {
        return LostSpot;
    }

    public String getInfo(){
        return "失物名称"+LostName+" "+"拾到地点"+LostSpot+" "+"拾到日期"+LostDate+" "+"认领地点"+GetSpot;
    }
}


