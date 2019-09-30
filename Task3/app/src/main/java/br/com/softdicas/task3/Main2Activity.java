package br.com.softdicas.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main2Activity extends AppCompatActivity {

    RadioGroup radio;
    RadioButton radioSexButton;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        radio = findViewById(R.id.radioGroup);
        Button btnSelecionar = findViewById(R.id.btnSelecionar);
        btnSelecionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = radio.getCheckedRadioButtonId();
                radioSexButton = findViewById(selectedId);
                string = radioSexButton.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("resposta", string);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
