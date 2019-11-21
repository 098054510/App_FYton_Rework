package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Help_page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page2);
    }

    public void Help_Button3 (View view){
        Button Avancar2 = (Button)findViewById(R.id.Avancar2);
        Avancar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Help_page2.this, Help_page3.class);
                startActivity(it);
            }
        });
    }
}
