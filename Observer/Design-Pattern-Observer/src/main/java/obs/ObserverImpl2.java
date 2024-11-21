package obs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public class ObserverImpl2 implements Observer {
    private List<Integer> history=new ArrayList<>();
    @Override
    public void update(Observable obs){
        System.out.println("==========Impl2========");
        history.add(((ObservableImpl)obs).getState());
        double sum=0;
        for (int i = 0; i < history.size(); i++) {
            sum+= history.get(i);

        }
        System.out.println("la moyenne est "+sum/history.size());



        System.out.println("==================");


    }
}
