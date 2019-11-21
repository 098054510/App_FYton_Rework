package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import haistavittu.com.fytn.ui.dashboard.DashboardFragment;

public class plants_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants_two);
    }

    public void Coromandel_details (View view){
        Button Coromandel_details = (Button)findViewById(R.id.Coromandel_details);
        Coromandel_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(plants_two.this, Assistacia_Details.class);
                startActivity(it);
            }
        });
    }

    public void Planta_Q_Fura1 (View view){
        Button Rabo_De_Raposa_Details = (Button)findViewById(R.id.Rabo_De_Raposa_Details);
        Rabo_De_Raposa_Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = new Intent(plants_two.this, Cacto_Rabo_de_Raposa_Details.class);
                startActivity(it2);
            }
        });
    }

    public void Page_three_plants (View view){
        Button Pagina3 = (Button)findViewById(R.id.Pagina3);
        Pagina3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it3 = new Intent(plants_two.this, Plants_Page_three.class);
                startActivity(it3);
            }
        });
    }
}
