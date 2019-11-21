package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Assistacia_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistacia__details);
    }

    public void How_Create_Coromandel (View view){
        Button create3 = (Button)findViewById(R.id.create3);
        create3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Assistacia_Details.this, How_Create_Coromandel.class);
                startActivity(it);
            }
        });
    }

    public void History_Assitacia (View view){
        Button h3 = (Button)findViewById(R.id.h3);
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = new Intent(Assistacia_Details.this, History_Assitacia.class);
                startActivity(it2);
            }
        });
    }
}
