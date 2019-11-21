package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cacto_Rabo_de_Raposa_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cacto__rabo_de__raposa__details);
    }

    public void How_To_Create_Raposa (View view){
        Button Como_Criar_Raposa = (Button)findViewById(R.id.Como_Criar_Raposa);
        Como_Criar_Raposa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Cacto_Rabo_de_Raposa_Details.this, Cacto_Raposa_How_Create.class);
                startActivity(it);
            }
        });
    }

    public void Cacto_Raposa_History (View view){
        Button Cacto_Raposa_History = (Button)findViewById(R.id.Cacto_Raposa_History);
        Cacto_Raposa_History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = new Intent(Cacto_Rabo_de_Raposa_Details.this, haistavittu.com.fytn.Cacto_Raposa_History.class);
                startActivity(it2);
            }
        });
    }
}
