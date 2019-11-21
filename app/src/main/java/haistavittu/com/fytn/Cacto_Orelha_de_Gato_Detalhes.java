package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cacto_Orelha_de_Gato_Detalhes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cacto__orelha_de__gato__detalhes);
    }

    public void Cacto_Gato_Create (View view){
        Button How_Create_Gato = (Button)findViewById(R.id.How_Create_Gato);
        How_Create_Gato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Cacto_Orelha_de_Gato_Detalhes.this, Create_Cacto_Gato.class);
                startActivity(it);
            }
        });
    }

    public void Cacto_Gato_History (View view){
        Button Cacto_Gato_History = (Button)findViewById(R.id.Cacto_Gato_History);
        Cacto_Gato_History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = new Intent(Cacto_Orelha_de_Gato_Detalhes.this, haistavittu.com.fytn.Cacto_Gato_History.class);
                startActivity(it2);
            }
        });
    }
}
