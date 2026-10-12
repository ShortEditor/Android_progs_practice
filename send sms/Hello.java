import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.telephony.*;

import androidx.appcompat.app.AppCompatActivity;
public class Hello extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle bc){
        super.onCreate(bc);
        setContentView(R.layout.activity_hello);
        EditText phn=findViewById(R.id.phone);
        EditText msg=findViewById(R.id.msg);
        Button btn=findViewById(R.id.send);
        btn.setOnClickListener(v->{
            SmsManager sm=SmsManager.getDefault();
            sm.sendTextMessage(phn.getText().toString(),null,msg.getText().toString(),null,null);
            Toast.makeText(this,"Message Sent!",Toast.LENGTH_LONG).show();
        });
    }
}