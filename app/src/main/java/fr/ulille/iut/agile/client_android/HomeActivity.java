package fr.ulille.iut.agile.client_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    public void onClickLogin(View view) {
        ActivitySwitcher.switchActivity(this, LoginActivity.class, false);
    }
/*
    public void onClickArea(View view) {
        ActivitySwitcher.switchActivity(this, AreaActivity.class, false);
    }

    public void onClickDashboard(View view) {
        ActivitySwitcher.switchActivity(this, DashboardActivity.class, false);
    }*/
}
