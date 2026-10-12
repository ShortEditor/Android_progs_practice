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
        TextView res=findViewById(R.id.res);    
        Button add=findViewById(R.id.add);
        Button sub=findViewById(R.id.sub);
        Button mul=findViewById(R.id.mul);
        Button div=findViewById(R.id.div);
        EditText a=findViewById(R.id.a);
        EditText b=findViewById(R.id.b);
        add.setOnClickListener(v->{
            int x=Integer.parseInt(a.getText().toString());
            int y=Integer.parseInt(b.getText().toString());
            res.setText("Result is:"+(x+y));
        });
        sub.setOnClickListener(v->{
            int x=Integer.parseInt(a.getText().toString());
            int y=Integer.parseInt(b.getText().toString());
            res.setText("Result is:"+(x-y));
        });
        mul.setOnClickListener(v->{
            int x=Integer.parseInt(a.getText().toString());
            int y=Integer.parseInt(b.getText().toString());
            res.setText("Result is:"+(x*y));
        });
        div.setOnClickListener(v->{
            try{
                int x=Integer.parseInt(a.getText().toString());
                double y=Integer.parseInt(b.getText().toString());
                res.setText("Result is:"+(x/y));
            } catch (ArithmeticException e) {
                res.setText("Error: Division by zero");
            }
        });
    }
}
