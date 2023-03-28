package module_2_apj.util.regex;

public class Regex {
//    tên ít nhất có 6 kí tự dài nhất 12 kí tự có []{}
//    + bắt đàu bằng ^
//    +dấu cách kết thức bắt dấu &

    public static final String REGEX_NAME="^[a-zA-Z ]{6,12}$";
//    heeyeon09082002@gmail.com
    public static final String REGEX_EMAIL="^[a-z]\\w{5,}\\@[a-z]{3,5}\\.[a-z]{2,5}$";
    public static final String REGEX_SDT="^((\\+84)||0)[0-9]{9}$";
    public static final String REGEX_BIRTH="^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";
}
