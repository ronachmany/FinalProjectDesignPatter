import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime()));

    }
}
