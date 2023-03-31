package module_2_apj.repositroy.contract;

import module_2_apj.molel.bookingorcontract.Contract;
import module_2_apj.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ContractRepo implements IContract {
private static final String HOPDONG_LIST_PATH="src\\module_2_apj\\data\\hopdong.csv";
    @Override
    public List<Contract> getAllDisplay() {
        List<Contract> hopDongThue=new ArrayList<>();
        List<String>stringList= ReadAndWrite.readFile(HOPDONG_LIST_PATH);
        int line =stringList.size();
        for (int i = 0; i <line ; i++) {
            String str=stringList.get(i);
            String []arr=str.split(",");
            Contract hopDongThue3=new Contract(arr[0],arr[1],arr[2],arr[3],arr[4]);
        hopDongThue.add(hopDongThue3);
        }
        return hopDongThue;
    }

    @Override
    public void add(Contract hopDongThue3) {
    ReadAndWrite.writeFile(HOPDONG_LIST_PATH, hopDongThue3.convertLine5(), true);
    }

    @Override
    public void update(Contract hopDongThue4) {
        ReadAndWrite.writeFile(HOPDONG_LIST_PATH, hopDongThue4.convertLine5(), true);

    }
}
