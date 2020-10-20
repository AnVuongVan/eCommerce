package com.vietis.ecommerce.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vietis.ecommerce.R;
import com.vietis.ecommerce.buyers.HomeActivity;
import com.vietis.ecommerce.buyers.MainActivity;

public class AdminHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        Button logoutBtn = findViewById(R.id.admin_logout_btn);
        Button checkOrderBtn = findViewById(R.id.check_orders_btn);
        Button maintainProductsBtn = findViewById(R.id.maintain_btn);
        Button approvedProductsBtn = findViewById(R.id.check_approved_orders_btn);

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHomeActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        checkOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminHomeActivity.this, AdminOrdersActivity.class));
            }
        });

        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHomeActivity.this, HomeActivity.class);
                //intent.putExtra("SESSION_LOGIN", "ADMIN");
                startActivity(intent);
            }
        });

        approvedProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHomeActivity.this, CheckNewProductsActivity.class);
                startActivity(intent);
            }
        });

    }
}