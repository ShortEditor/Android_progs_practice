import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

import androidx.appcompat.app.AppCompatActivity;
public class Hello extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle bc){
        super.onCreate(bc);
        setContentView(R.layout.activity_hello);
        String items[]={"Apple","Banana","Mango","Grapes"};
        Spinner sp=findViewById(R.id.spinner);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,items);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(ad);
        sp.onItemSelectedListener(AdapterView<?> p,View v,int pos,long id){
            tv.setText("You selected: " + items[pos]);
        }
    }
}