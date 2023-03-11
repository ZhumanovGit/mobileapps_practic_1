package com.mirea.zhumanovta.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItsNotMe);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener()  {
            @Override
            public void onClick(View v){
                textViewStudent.setText("мой номер по списку № 8");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
        public void onMyButtonClick(View view){
            Toast.makeText(this, "еще один способ!")
        }
    }
}