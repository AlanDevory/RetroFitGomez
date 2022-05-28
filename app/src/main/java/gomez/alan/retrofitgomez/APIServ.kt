package gomez.alan.retrofitgomez

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIServ {
    @GET
    suspend fun getDogsByBreeds(@Url url:String):Response<DogResponse>
}