package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Plants_Page_three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants__page_three);
    }

    public void Orelha_Gato_Details (View view){
        Button Details_Cacto_Gato = (Button)findViewById(R.id.Details_Cacto_Gato);
        Details_Cacto_Gato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it =  new Intent(Plants_Page_three.this, Cacto_Orelha_de_Gato_Detalhes.class);
                startActivity(it);
            }
        });
    }
}
