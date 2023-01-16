import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Database {

    static HashMap<String, ArrayList<String>> bookDetailsMap = new HashMap<>();
    static HashMap<String, String> userDetailsMap = new HashMap<>();


    void userDisplay(){
        Iterator<String> it = userDetailsMap.keySet().iterator();
        int count = 0;
        while(it.hasNext()){
            count+=1;
            System.out.println(count + ". " + (String)it.next() + "," + );
        }
    }

    void booksDatabase(){

    }
}
