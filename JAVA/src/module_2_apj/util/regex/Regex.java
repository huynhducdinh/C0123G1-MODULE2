package module_2_apj.util.regex;

public class Regex {
//    tên ít nhất có 6 kí tự dài nhất 12 kí tự có []{}
//    + bắt đàu bằng ^
//    +dấu cách kết thức bắt dấu &

    public static final String REGEX_NAME="^[a-zA-Z ]{6,12}$";
//    heeyeon09082002@gmail.com
    public static final String REGEX_EMAIL="^\\w+@\\w+(\\.\\w+{2.3}$";
    public static final String REGEX_SDT="^[0-9]{10}$";
    public static final String REGEX_BIRTH="^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";
}
