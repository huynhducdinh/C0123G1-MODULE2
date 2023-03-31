import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class VeHinhThoi {
 public static void main(String[] args) {
  int [] a = {-1, 150, 190, 170, -1, -1, 160, 180};
  for (int i=0;i<a.length;i++){
   int min =i;
   for(int j=i+1;j<a.length;j++){
    if(a[j]<a[min]&&a[j]!=-1){
     min=j;
    }
   }
   if(min!=i){
    int temp=a[min];
    a[min]=a[i];
    a[i]=temp;
   }
  }
  System.out.println(Arrays.toString(a));
 }
 }