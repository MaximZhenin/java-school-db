package homework.localdata;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args)throws Exception {
        String sDate1="31/12/1998";
        System.out.println(DataUtils.convert(sDate1));
        System.out.println(DataUtils.convert(LocalDate.now()));
    }
}
