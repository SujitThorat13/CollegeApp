package com.example.collegeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.collegeapp.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
//import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
//import com.smarteist.autoimageslider.SliderAnimations;
//import com.smarteist.autoimageslider.SliderView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity{
    private BottomNavigationView bottomNavigationView;
    private NavController navController;

/*    SliderView sliderView;
    int[] images =
            {R.drawable.ic_rgit,
            R.drawable.prin,
            R.drawable.fecu,
            R.drawable.fac,
            R.drawable.alumini};*/
/*
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        sliderView = findViewById(R.id.image_slider);

        HomeFragment homeFragment = new HomeFragment(images);

        sliderView.setSliderAdapter(homeFragment);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
        sliderView.setScrollTimeInSec(2);
*/

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navController = Navigation.findNavController(this, R.id.frame_layout);
        /*drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.start, R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);
*/
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

/*
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.navigation_developer:
                Toast.makeText(this, "Developer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigation_video:
                Toast.makeText(this, "Video lectures", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigation_rate:
                Toast.makeText(this, "Rate us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigation_ebook:
                Toast.makeText(this, "Ebooks", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigation_theme:
                Toast.makeText(this, "Theme", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigation_website:
                Toast.makeText(this, "Website", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigation_share:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();

        }
        return true;*/
    }
}