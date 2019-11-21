package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Erica_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erica__details);
    }

    public void History_erica (View view){
        Button H = (Button)findViewById(R.id.h);
        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Erica_Details.this, History_Erica.class);
                startActivity(it);
            }
        });
    }

    public void How_Create_Erica (View view){
        Button create2 = (Button)findViewById(R.id.create2);
        create2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = new Intent(Erica_Details.this, How_Create_Erica.class);
                startActivity(it2);
            }
        });
    }
}
