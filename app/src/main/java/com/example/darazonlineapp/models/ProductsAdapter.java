package com.example.darazonlineapp.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.darazonlineapp.R;
import com.example.darazonlineapp.models.Products;
import com.squareup.picasso.Picasso;
import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder> {

    Context mContext;
    List<Products>productsList;

    public ProductsAdapter(Context mContext, List<Products> productsList) {
        this.mContext = mContext;
        this.productsList = productsList;
    }


    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dashboard,parent,false);

        return new ProductsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder holder, int position) {
        Products products=productsList.get(position);
        holder.tvProductName.setText(products.getProduct_name());
        holder.tvPrice.setText(products.getProduct_price());
        Picasso.get()
                .load("http://www.piyushp.com.np/sport_fanatic/api/member/image/daraz_image/product/"+products.getProduct_image())
                .placeholder(R.drawable.ic_launcher_background)
                .resize(220, 220)
                .centerCrop()
                .into(holder.productImage);
        //  holder.productImage.setImageResource(products.getImageId());
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public class ProductsViewHolder extends RecyclerView.ViewHolder {

        ImageView productImage;
        TextView tvProductName,tvPrice;
        public ProductsViewHolder(@NonNull View itemView) {
            super(itemView);

            productImage=itemView.findViewById(R.id.productImage);

            tvProductName=itemView.findViewById(R.id.tvProductName);
            tvPrice=itemView.findViewById(R.id.tvPrice);

        }
    }
}