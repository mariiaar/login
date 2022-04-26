package com.example.login;



import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button login;
    private TextView Info;
    private EditText pword;
    private EditText name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Info = (TextView)findViewById(R.id.txtInfo);
        Info.setText("Kirjaudu kirjoittamalla käyttäjänimi ja salasana");
        login = (Button)findViewById(R.id.btnlog);
        name = (EditText)findViewById(R.id.etname);
        pword = (EditText)findViewById(R.id.etpword);
        //findViewById is the method that finds the View by the ID which it has given.
        //pword=password
        //name=username
        //info= textview on screen
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("admin") && pword.getText().toString().equals("sala")) {
                    Info.setText("Olet kirjautunut");
                } else {
                    Info.setText("Väärä käyttäjätunnus tai salasana, yritä uudestaan");

                }
            }
        });
    }
}