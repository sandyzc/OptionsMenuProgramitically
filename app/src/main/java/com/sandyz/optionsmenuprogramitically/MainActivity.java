package com.sandyz.optionsmenuprogramitically;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int MENU_ID_1 = 100;
    private static final int MENU_ID_2 = 101;
    private static final int MENU_ID_3 = 102;
    private static final int MENU_ID_4 = 103;
    private static final int MENU_ID_5 = 104;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0,MENU_ID_1,1,"Computer");
        menu.add(0,MENU_ID_2,2,"Gamepad");
        menu.add(0,MENU_ID_3,3,"Camera");
        menu.add(0,MENU_ID_4,4,"Video");
        menu.add(0,MENU_ID_5,5,"Email");


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==MENU_ID_1 && item.getGroupId()==0){
            Toast.makeText(getApplicationContext(),"Clicked on " +item.getTitle(),Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==MENU_ID_2 && item.getGroupId()==0){
            Toast.makeText(getApplicationContext(),"Clicked on " +item.getTitle(),Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==MENU_ID_3 && item.getGroupId()==0){
            Toast.makeText(getApplicationContext(),"Clicked on " +item.getTitle(),Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==MENU_ID_4 && item.getGroupId()==0){
            Toast.makeText(getApplicationContext(),"Clicked on " +item.getTitle(),Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==MENU_ID_5 && item.getGroupId()==0){
            Toast.makeText(getApplicationContext(),"Clicked on " +item.getTitle(),Toast.LENGTH_LONG).show();
        }
        else{
            return false;
        }
        return true;
    }
}
