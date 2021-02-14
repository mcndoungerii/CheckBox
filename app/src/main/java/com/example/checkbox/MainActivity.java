package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private CheckBox momCheckbox;
    private CheckBox dadCheckbox;
    private CheckBox grandpaCheckbox;


    private Button showButton;
    private TextView showTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connecting variables with Resources ID's
        momCheckbox = (CheckBox) findViewById(R.id.momID);
        dadCheckbox = (CheckBox) findViewById(R.id.dadID);
        grandpaCheckbox = (CheckBox) findViewById(R.id.grandID);
        showTextView = (TextView) findViewById(R.id.resultTextID);
        showButton = (Button) findViewById(R.id.showButtonID);

        //listern to events
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(momCheckbox.getText().toString() + " Status is: " + momCheckbox.isChecked() +"\n" );
                stringBuilder.append(dadCheckbox.getText().toString() + "Status is: " +dadCheckbox.isChecked() + "\n");
                stringBuilder.append(grandpaCheckbox.getText().toString() + "Status is: "+grandpaCheckbox.isChecked() + "\n");

                showTextView.setVisibility(View.VISIBLE);
                showTextView.setText(stringBuilder);
            }
        });
    }
}