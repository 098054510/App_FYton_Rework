package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Help_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help__page);
    }

    public void Help_Button2 (View view){
        Button Avancar = (Button)findViewById(R.id.Avancar);
        Avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Help_Page.this, Help_page2.class);
                startActivity(it);
            }
        });
    }
}
