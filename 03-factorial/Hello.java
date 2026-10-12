import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

import androidx.appcompat.app.AppCompatActivity;
public class Hello extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_hello);
        TextView res=findViewById(R.id.res);    
        Button btn=findViewById(R.id.btn);
        EditText et=findViewById(R.id.inp);
        btn.setOnClickListener(v->{
            int input=Integer.parseInt(et.getText().toString().trim());
            long fact=1;
            for(int i=1;i<=input;i++){
                fact*=i;
            }
            res.setText("Factorial of " + input + " is " + fact);
        });
    }
}
