package com.example.acastro.sendtext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.boton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_TEXT,((EditText)findViewById(R.id.sndText)).getText().toString());

                if(sendIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(sendIntent);
                }
            }
        });
    }


}
