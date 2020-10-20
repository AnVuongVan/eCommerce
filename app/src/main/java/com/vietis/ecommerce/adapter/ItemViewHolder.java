package com.vietis.ecommerce.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vietis.ecommerce.R;
import com.vietis.ecommerce.inteface.ItemClickListener;

public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtProductName, txtProductDesc, txtProductPrice, txtProductState;
    public ImageView imageView;
    private ItemClickListener listener;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.product_image_seller);
        txtProductName = itemView.findViewById(R.id.product_name_seller);
        txtProductPrice = itemView.findViewById(R.id.product_price_seller);
        txtProductDesc = itemView.findViewById(R.id.product_description_seller);
        txtProductState = itemView.findViewById(R.id.product_state_seller);
    }

    public void setItemClickListener(ItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        listener.onClick(view, getAdapterPosition(), false);
    }
}
