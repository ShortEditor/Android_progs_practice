import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

import androidx.appcompat.app.AppCompatActivity;
public class Hello extends AppCompatActivity{
    @Override
    void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_hello);    
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(v->{
            Toast.makeText(this,"Hello This is a toast",Toast.LENGTH_LONG).show();
        });
    }
}
