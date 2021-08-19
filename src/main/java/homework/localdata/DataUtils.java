package homework.localdata;
import java.text.ParseException;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
//String sDate1="31/12/1998";
public class DataUtils {

    public static LocalDate convert(String date) throws ParseException {
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
        System.out.println(date+"\t"+date1);
        return date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static String convert(LocalDate localDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LL/yyyy");
        String formattedString = localDate.format(formatter);
        return formattedString;
    }
}

