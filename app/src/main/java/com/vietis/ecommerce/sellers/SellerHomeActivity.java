package com.vietis.ecommerce.sellers;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.vietis.ecommerce.R;
import com.vietis.ecommerce.admin.AdminCategoryActivity;
import com.vietis.ecommerce.buyers.MainActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SellerHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_home);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new DashboardFragment()).commit();
        }

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.navigation_home:
                            Fragment fragment = new DashboardFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                    fragment).commit();
                            break;
                        case R.id.navigation_add:
                            startActivity(new Intent(SellerHomeActivity.this, AdminCategoryActivity.class));
                            break;
                        case R.id.navigation_logout:
                            final FirebaseAuth mAuth;
                            mAuth = FirebaseAuth.getInstance();
                            mAuth.signOut();

                            Intent intent = new Intent(SellerHomeActivity.this, MainActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                            finish();
                            break;
                    }
                    return true;
                }
            };
}