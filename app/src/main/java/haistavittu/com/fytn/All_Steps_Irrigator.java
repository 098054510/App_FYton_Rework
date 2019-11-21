package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class All_Steps_Irrigator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__steps__irrigator);
    }

    public void Materials1 (View view){
        Button Materials_Needed = (Button)findViewById(R.id.Materials_Needed);
        Materials_Needed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it4 = new Intent(All_Steps_Irrigator.this, Request_materials.class);
                startActivity(it4);
            }
        });
    }

    public void Thirteen_Steps_to_NoWhere (View view){
        Button Assembly = (Button)findViewById(R.id.Assembly);
        Assembly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it5 = new Intent(All_Steps_Irrigator.this, Thirteen_Steps_to_Nowhere.class);
                startActivity(it5);
            }
        });
    }
}
