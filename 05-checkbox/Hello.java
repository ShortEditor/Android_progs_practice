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
        CheckBox c1=findViewById(R.id.c1);
        CheckBox c2=findViewById(R.id.c2);
        CheckBox c3=findViewById(R.id.c3);
        TextView selected=findViewById(R.id.selected);
        Button show=findViewById(R.id.show);
        show.setOnClickListener(v->{
            StringBuilder sb=new StringBuilder();
            if(c1.isChecked()){
                sb.append(c1.getText().toString()).append("\n");
            }
            if(c2.isChecked()){
                sb.append(c2.getText().toString()).append("\n");
            }
            if(c3.isChecked()){
                sb.append(c3.getText().toString()).append("\n");
            }
            selected.setText(sb.toString());
        });
    }
}
