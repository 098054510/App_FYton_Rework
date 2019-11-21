package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Details_plant1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_plant1);
    }

    public void History_Orquidea (View view){
        Button H = (Button)findViewById(R.id.H);
        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = new Intent(Details_plant1.this, History_Orquidea.class);
                startActivity(it2);
            }
        });
    }

    public void How_Create_Orquidea (View view){
        Button Create = (Button)findViewById(R.id.Create);
        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it3 = new Intent(Details_plant1.this, How_Create_Orquidea.class);
                startActivity(it3);
            }
        });
    }
}
