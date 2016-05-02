package com.coffeearmy.data.api;

import com.coffeearmy.data.dto.SunriseSunsetDto;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ApiSunrise {
    @GET("json")
    Observable<SunriseSunsetDto> getSunriseSunsetInfo(@Query("lat") float latitude, @Query("lon")
    float longitute);
}
