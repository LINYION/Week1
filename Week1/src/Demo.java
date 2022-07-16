import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Lost[] Losts = new Lost[5];
        try {
            Losts[0] = new Lost("眼镜", format.parse("2022-07-12"), "风华操场", "风华认领处");
            Losts[1] = new Lost("眼镜", format.parse("2022-07-13"), "图书馆", "二教认领处");
            Losts[2] = new Lost("衣服", format.parse("2022-07-11"), "风华操场", "风华认领处");
            Losts[3] = new Lost("衣服", format.parse("2022-07-16"), "图书馆", "二教认领处");
            Losts[4] = new Lost("耳机", format.parse("2022-07-15"), "风华操场", "风华认领处");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        sortLost(Losts);
        for (Lost lost : Losts) {
            System.out.println(lost.getInfo());
        }
        Losts = selectByKeyword(Losts,"风华操场");
        for (Lost lost : Losts) {
            System.out.println(lost.getInfo());
        }
    }


        /**
         * 失物排序方法
         *
         * @param lostArray 待排序的失物数组
         */
        public static void sortLost(Lost[] lostArray) {
            Lost temp = new Lost();
            for (int i = 0; i < lostArray.length; i++) {
                for (int j = 0; j < lostArray.length - 1 - i; j++) {
                    if(lostArray[j].LostDate.after(lostArray[j+1].LostDate)){
                        temp = lostArray[j];
                        lostArray[j] = lostArray[j+1];
                        lostArray[j+1] = temp;
                    }
                }
            }
        }

        /**
         * 字符串转日期
         */
        public static Date StrToDate(String str) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = format.parse(str);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            return date;
        }

        /**
         * 按关键字搜索失物的方法，这里假设按照失物的领取地点进行搜索
         *
         * @param lostArray 失物数组
         * @param keyword   用户输入的关键字
         * @return 返回查找到的失物
         */
        public static Lost[] selectByKeyword(Lost[] lostArray, String keyword) {
            ArrayList<Lost> lost =new ArrayList<>();
            for(int i = 0;i< lostArray.length;i++){
                if(lostArray[i].LostSpot.contains(keyword)){
                    lost.add(lostArray[i]);
                }
            }
            Lost[] losts = lost.toArray(new Lost[lost.size()]);
            return losts;
        }
}