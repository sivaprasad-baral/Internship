package com.example.intern;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btn_logIn(View view) {
        btn=(Button) findViewById(R.id.Btn_login);
        txt=(TextView)findViewById(R.id.show_name);
        editText=(EditText)findViewById(R.id.edit_Text);
        String ed = editText.getText().toString();
        if (ed.isEmpty()) {
            Toast.makeText(MainActivity.this,"Field can't be blank",Toast.LENGTH_LONG).show();
        }
        else {
            if (editText.length() == 10 ) {
                btn.setBackgroundColor(Color.parseColor("#008000"));
                txt.setText("Sivaprasad Baral");
            }
            else {
                Toast.makeText(MainActivity.this,"Enter the 10 digit registration number",Toast.LENGTH_LONG).show();
            }
        }

    }
}
