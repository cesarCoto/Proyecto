package com.robot.maker.proyecto;


import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    // This code was made by Cesar Uriel Coto Coazozon and the help of Jose Manuel Coutiño Vazques


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.contenido, new HomeFragment()).commit();
                    return true;
                case R.id.navigation_dashboard:
                    transaction.replace(R.id.contenido, new ExamFragment()).commit();
                    return true;
                case R.id.navigation_more:
                    transaction.replace(R.id.contenido, new VideosFragment()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.contenido , new HomeFragment()).commit();



    }
    // Codigo para inflar el popup menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.conversions, menu);
        return true;
    }
    //casos del menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_feedback) {
            //Se crea un intent explicito con el mandar un mail al desarrollador
            Intent intentMensaje = new Intent(Intent.ACTION_SEND);
            intentMensaje.setData(Uri.parse("email"));
            String [] correo = {"developfisiapp@gmail.com"};
            intentMensaje.putExtra(Intent.EXTRA_EMAIL,correo);
            intentMensaje.putExtra(Intent.EXTRA_SUBJECT,getString(R.string.app_name));
            intentMensaje.putExtra(Intent.EXTRA_TEXT,getString(R.string.escribe_esto));
            intentMensaje.setType("menssage/rfc822");
            Intent chooser = Intent.createChooser(intentMensaje,getString(R.string.email_chooser));
            startActivity(chooser);
            return true;
        }else if (id == R.id.action_about) {
            Intent intentAboutActivity = new Intent(this,AboutActivity.class);
            startActivity(intentAboutActivity);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
