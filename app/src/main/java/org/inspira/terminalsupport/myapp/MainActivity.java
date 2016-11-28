package org.inspira.terminalsupport.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.inspira.terminalsupport.MyListeners.MyClickListener;


public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.activy_main_encabezado);
        tv.setOnClickListener(  new MyClickListener()
/*
                new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    tv.setText("Hola mundo desde clase anónima!");
                }
            }
*/
        );
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    public void onBackPressed(){

    }
}
