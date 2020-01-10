package com.example.darazonlineapp.api;

import com.example.darazonlineapp.models.Products;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductsAPI {
    @GET("daraz_products")
     Call<List<Products>> getallProduct();
}
