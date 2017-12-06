package com.robot.maker.proyecto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class ConversionsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //se crea la clase fragmentManager para poder desplegar las pantallas en cada menu
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.contenido_conversiones,new InicioConversionesFragment()).commit();

        //se referencia el menu de hamburgesa
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Aqui se cambia la posision del activities y se manda que fragment ocupara el espacio estalbecido como contenido conversiones
        int id = item.getItemId();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (id == R.id.nav_inicio_conversiones) {
            transaction.replace(R.id.contenido_conversiones,new InicioConversionesFragment()).commit();
        } else if (id == R.id.nav_ejemplos_conversiones) {
            transaction.replace(R.id.contenido_conversiones, new ExamplesConversioesFragment()).commit();
        /*} else if (id == R.id.nav_exercises_conversiones) {
            transaction.replace(R.id.contenido_conversiones, new EjerciciosConversionesFragment()).commit();*/
        } else if (id == R.id.nav_feedback){
            //Se crea un intent explicito con el mandar un mail al desarrollador
            Intent intentMensaje = new Intent(Intent.ACTION_SEND);
            intentMensaje.setData(Uri.parse("email"));
            String [] correo = {"developfisiapp@gmail.com"};
            intentMensaje.putExtra(Intent.EXTRA_EMAIL,correo);
            intentMensaje.putExtra(Intent.EXTRA_SUBJECT,getString(R.string.conversions_title));
            intentMensaje.putExtra(Intent.EXTRA_TEXT,getString(R.string.escribe_esto));
            intentMensaje.setType("menssage/rfc822");
            Intent chooser = Intent.createChooser(intentMensaje,getString(R.string.email_chooser));
            startActivity(chooser);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
