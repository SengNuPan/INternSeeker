package com.example.sengnupan.android_pj;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;


public class their_stories extends AppCompatActivity {
    private ListView listview;
    private ArrayList<stories> models;
    private StoriesAdapter movieAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_their_stories);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        listview=findViewById(R.id.list_view);
        models= ListDetails.getList();
        movieAdapter=new StoriesAdapter(their_stories.this,models);
        listview.setAdapter(movieAdapter);
       /* listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                stories model=models.get(i);
                Toast.makeText(their_stories.this,"Details of"+" "+model.getMovieName(),Toast.LENGTH_LONG).show();
                AlertDialog alertDialog = new AlertDialog.Builder(their_stories.this).create();

                alertDialog.setTitle("About"+" "+model.getMovieName());
                alertDialog.setMessage(model.getAboutMovie());
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });*/
        //task complete

    }

   /* public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.stories_menu, menu);
        return true;
    }*/





    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                //drawer.openDrawer(GravityCompat.START);

                return true;
            case R.id.action_search:
                Intent intent = new Intent(their_stories.this, MainActivity.class);
                intent.putExtra("Back to home", 1);
                startActivity(intent);
//to search company

        }
        return super.onOptionsItemSelected(item);
    }
}
