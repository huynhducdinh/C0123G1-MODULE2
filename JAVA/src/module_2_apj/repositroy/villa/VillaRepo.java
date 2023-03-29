package module_2_apj.repositroy.villa;

import module_2_apj.molel.furama.Villa;
import module_2_apj.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaRepo implements IVillaRepo{
    private static final String VILLA_LIST_PATH="src\\module_2_apj\\data\\villa.csv";
    static Scanner sc =new Scanner(System.in);


    @Override
    public List<Villa> getAllDisplay() {
        List<Villa>villa1List=new ArrayList<>();
        List<String> stringList= ReadAndWrite.readFile(VILLA_LIST_PATH);
        int line=stringList.size();
        for (int i = 0; i <line ; i++) {
            String str=stringList.get(i);
            String[]arr=str.split(",");
            Villa villa1=new Villa(arr[0],Integer.parseInt(arr[1]),arr[2]);
            villa1List.add(villa1);
        }
        return villa1List;
    }

    @Override
    public void add(Villa villa1) {
        ReadAndWrite.writeFile(VILLA_LIST_PATH,villa1.convertLine4(),true);

    }
}
