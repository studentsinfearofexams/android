package com.cmrit.tostapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToast=findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //custom toast
                Toast toast=new Toast(getApplicationContext());
               View view= getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup)
                       findViewById(R.id.viewContainer));
               toast.setView(view);
                TextView txtMsg=view.findViewById(R.id.txtMsg);
                txtMsg.setText("Message sent Successful");
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.RIGHT, 0,0);
                toast.show();
            }
        });
        //default toast
        Toast.makeText(getApplicationContext(), "CMR IT First Toast", Toast.LENGTH_LONG).show();
    }
}
