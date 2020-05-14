package com.example.controlpanellab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* SEMPRE FAZER A ATRIBUIÇÃO DE VALORES DEPOIS DO SETCONTENTVIEW */
        mainLayout = findViewById(R.id.main_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //PEGO O INFLATER DO MENU
        MenuInflater menuInflater = getMenuInflater();
        //"INFLO" NA TELA O MENU
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        /*
        --AQUI EU PRECISO PASSAR O APPLICATION CONTEXT PORQUE
        --SE PASSAR THIS, ELE IRÁ ENTENDER COM O CONTEXTO DA CLASSE ANONIMA E NÃO O COMPONENTE DA TELA
        switch(item.getItemId()) {
            case R.id.menu_help:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(getApplicationContext(), menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                break;

            case R.id.menu_refresh:
                Toast.makeText(this,"menu refresh", Toast.LENGTH_LONG)
                        .show();
                break;
        }
        */


        /*
        --AQUI EU NÃO PRECISO PASSAR O APPLICATION CONTEXT PORQUE
        --NÃO ESTÁ DENTRO DE UMA CLASSE ANONIMA ENTÃO ELE PEGA O CONTEXTO DO ELEMENTO CHAMADOR ATRAVÉS DO THIS
        */
        switch(item.getItemId()) {
            case R.id.menu_help:
                /*Toast.makeText(this,item.getTitle(), Toast.LENGTH_LONG)
                        .show();*/
               // Snackbar.make(getWindow().getDecorView(), item.getTitle(), Snackbar.LENGTH_SHORT).show();
                Snackbar.make(mainLayout, item.getTitle(), Snackbar.LENGTH_SHORT).show();
                break;

            case R.id.menu_refresh:
                /*Toast.makeText(this,item.getTitle(), Toast.LENGTH_LONG)
                        .show();*/
                Snackbar.make(mainLayout, item.getTitle(), Snackbar.LENGTH_SHORT).show();
                //Snackbar.make(getWindow().getDecorView(), item.getTitle(), Snackbar.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
