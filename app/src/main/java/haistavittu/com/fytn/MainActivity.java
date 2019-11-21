package haistavittu.com.fytn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

    public void page_two_plants (View view){
        Button page_two = (Button)findViewById(R.id.page_two_plants);
        page_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, plants_two.class);
                startActivity(it);
            }
        });
    }

    public void Details_plant1 (View view){
        Button Details_plant1 = (Button)findViewById(R.id.Details_plant1);
        Details_plant1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = new Intent(MainActivity.this, haistavittu.com.fytn.Details_plant1.class);
                startActivity(it2);
            }
        });
    }

    public void What_is_irrigator (View view){
        Button How_irrigator = (Button)findViewById(R.id.Wii);
        How_irrigator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2  = new Intent(MainActivity.this, Vertical_Irrigator.class);
                startActivity(it2);
            }
        });
    }

    public void All_Steps_Irrigator1 (View view){
        Button step = (Button)findViewById(R.id.step);
        step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it3 = new Intent(MainActivity.this, All_Steps_Irrigator.class);
                startActivity(it3);
            }
        });
    }

    public void Details_Erica (View view){
        Button erica_details = (Button)findViewById(R.id.erica_details);
        erica_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it4 = new Intent(MainActivity.this, Erica_Details.class);
                startActivity(it4);
            }
        });
    }

    public void Details_Coromandel (View view){
        Button Coromandel_details = (Button)findViewById(R.id.Coromandel_details);
        Coromandel_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it5 = new Intent(MainActivity.this, Assistacia_Details.class);
                startActivity(it5);
            }
        });
    }

    public void Planta_Q_Fura1 (View view){
        Button Rabo_De_Raposa_Details = (Button)findViewById(R.id.Cacto_Raposa_Details2);
        Rabo_De_Raposa_Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it6 = new Intent(MainActivity.this, Cacto_Rabo_de_Raposa_Details.class);
                startActivity(it6);
            }
        });
    }

    public void Help_Button (View view){
        Button Help_Button = (Button)findViewById(R.id.Help_Button);
        Help_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it7 = new Intent(MainActivity.this, Help_Page.class);
                startActivity(it7);
            }
        });
    }
}
