package com.bp.doantonghop.services;



import com.bp.doantonghop.model.AddressTextSearchResponse;
import com.bp.doantonghop.model.AddressTextSearchResponse;
import com.bp.doantonghop.model.Ebike;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface DataClient {

    @GET("json")
    Call<AddressTextSearchResponse> loadAddressResponse(@Query("query") String query,
                                                        @Query("key") String key);

    @GET("/Ebike.json")
    Call<List<Ebike>> loadEBike();

    @GET("/Ebike1.json")
    Call<List<Ebike>> loadEBike1();
}
