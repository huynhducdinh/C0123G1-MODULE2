import java.time.LocalDate;
import java.util.Scanner;

public class VeHinhThoi {
 public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  System.out.println("nhập ngày tháng nắminh");
  LocalDate localDate= LocalDate.parse(sc.nextLine());
  System.out.println(localDate);
 }}