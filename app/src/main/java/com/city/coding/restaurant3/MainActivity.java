package com.city.coding.restaurant3;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.ramotion.foldingcell.FoldingCell;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {
    /*reference initialization*/
    private ViewPager viewPager ;
    private TabLayout tabLayout;
    private viewFragmentPagerAdapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate main", "onCreate: done" );
        /*find View's id's*/
        findViewsById();
        adapter = new viewFragmentPagerAdapter(getSupportFragmentManager());
        addFragment();
        addFragmentTitle();
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    //inflate menu search item
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    //end







    /*one place for finding view's id's*/
    private void findViewsById()
    {
       viewPager = findViewById(R.id.home_view_pager_id);
       tabLayout = findViewById(R.id.home_tabeLayout_id);

    }

    /*add fragment to viewFragmentPagerAdapter*/
    private void addFragment()
    {
        Log.e("add fragment ", "addFragment: done" );
        adapter.addFragment(new homeFragment());
        adapter.addFragment(new favFragment());
        adapter.addFragment(new newsFragment());
    }
    //end

    /*add tab title to showUp on tabLayout*/
    private void addFragmentTitle()
    {
        adapter.addFragmentTitle("Home");
        adapter.addFragmentTitle("Favorite");
        adapter.addFragmentTitle("News");
    }
    //end




}
