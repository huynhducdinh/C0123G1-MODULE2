package module_2_apj.util.regex;

import module_2_apj.method.CheckTrueOfFalse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    //Họ và tên
    private static final String REGEX_NAME = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";

    public static boolean checkName(String serviceName) {
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(serviceName);
        return matcher.matches();

    }

    private static final String REGEX_NAME_SERVICE = "^[A-Z][a-z]+$";

    public static boolean checkNameService(String serviceName) {
        Pattern pattern = Pattern.compile(REGEX_NAME_SERVICE);
        Matcher matcher = pattern.matcher(serviceName);
        return matcher.matches();

    }

    //    Họ và tên tiếng việt
    private static final String REGEX_NAME1 = "^\\p{Lu}\\p{Ll}*(\\s\\p{Lu}\\p{Ll}*)*$";
    //    emil
    private static final String REGEX_EMAIL = "^[a-z]\\w{5,}\\@[a-z]{3,5}\\.[a-z]{2,5}$";

    public static boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    //    số điện thoại
    private static final String REGEX_SDT = "^((\\+84)||0)[0-9]{10}$";

    public static boolean checkPhoneNumber(String number) {
        Pattern pattern = Pattern.compile(REGEX_SDT);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    //    này tháng năm sinh
    private static final String REGEX_BIRTH = "^((0[1-9])|((1|2)[0-9])|3[0-1])[\\/|-]((0[1-9])|1[0-2])[\\/|-]((19((2[4-9])|([3-9][0-9])))|200[0-5])$";

    public static boolean checkBirth(String birth) {
        Pattern pattern = Pattern.compile(REGEX_BIRTH);
        Matcher matcher = pattern.matcher(birth);
        return matcher.matches();
    }

    //    mã khách hàng
    private static final String REGEX_CODE_VL = "^(SV)(VL)\\-[0-9]{4}$";

    public static boolean checkCodeVl(String code) {
        Pattern pattern = Pattern.compile(REGEX_CODE_VL);
        Matcher matcher = pattern.matcher(code);
        return matcher.matches();
    }

    private static final String REGEX_CODE_HO = "^(SV)(HO)\\-[0-9]{4}$";

    public static boolean checkCodeHo(String code1) {
        Pattern pattern = Pattern.compile(REGEX_CODE_HO);
        Matcher matcher = pattern.matcher(code1);
        return matcher.matches();
    }

    private static final String REGEX_CODE_RO = "^(SV)(RO)\\-[0-9]{4}$";

    public static boolean checkCodeRo(String code2) {
        Pattern pattern = Pattern.compile(REGEX_CODE_RO);
        Matcher matcher = pattern.matcher(code2);
        return matcher.matches();
    }

    //căn cước công dân có 12 số
    private static final String REGEX_CMND = "^(\\d{9}|\\d{12})$";

    public static boolean checkCmnd(String cmnd) {
        Pattern pattern = Pattern.compile(REGEX_CMND);
        Matcher matcher = pattern.matcher(cmnd);
        return matcher.matches();
    }

    //mã nhân viên -khách hàng
    private static final String REGEX_ID = "^(MNV)-[0-9]{4}$";

    public static boolean checkId(String id) {
        Pattern pattern = Pattern.compile(REGEX_ID);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    private static final String REGEX_CODE = "^(MKH)-[0-9]{4}$";

    public static boolean checkCode(String code) {
        Pattern pattern = Pattern.compile(REGEX_CODE);
        Matcher matcher = pattern.matcher(code);
        return matcher.matches();
    }

    private static final String REGEX_LEASE = "^\\d{2}/\\d{2}/\\d{4}\\-\\d{2}(h):\\d{2}$";

    public static boolean checkLease(String lease) {
        Pattern pattern = Pattern.compile(REGEX_LEASE);
        Matcher matcher = pattern.matcher(lease);
        return matcher.matches();
    }

    private static final String REGEX_ADDRESS = "^[A-Z][a-z]*(\\s[A-Z][a-z]+)*$";

    public static boolean checkAddress(String address) {
        Pattern pattern = Pattern.compile(REGEX_ADDRESS);
        Matcher matcher = pattern.matcher(address);
        return matcher.matches();
    }

    private static final String REGEX_CODE_BOOKING = "^(MBK)-[0-9]{4}$";

    public static boolean checkCodeBooking(String booking) {
        Pattern pattern = Pattern.compile(REGEX_CODE_BOOKING);
        Matcher matcher = pattern.matcher(booking);
        return matcher.matches();
    }

    private static final String REGEX_CODE_CUSTOMER = "^(MKH)-[0-9]{4}$";

    public static boolean checkCodeCustomer(String customer) {
        Pattern pattern = Pattern.compile(REGEX_CODE_CUSTOMER);
        Matcher matcher = pattern.matcher(customer);
        return matcher.matches();
    }

    static final String DATE_BOOKING = "^(((0[1-9])|[12][0-9])|3[01])[\\/|-]((0[1-9])|1[0-2])[\\/|-]([2-9]((0[2-9][3-9])|[1-9][0-9][0-9]))$";

    public static boolean checkDateBooking(String date) {
        Pattern pattern = Pattern.compile(DATE_BOOKING);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
}


