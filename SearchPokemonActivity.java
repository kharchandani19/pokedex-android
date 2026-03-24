package com.example.project2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.project2.model.Pokemon;
import com.example.project2.model.PokemonResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchPokemonActivity extends AppCompatActivity {
    // Other existing methods and variables

    // Method to add Pokémon to the wishlist
    private void addToWishlist(Pokemon pokemon) {
        // Code to add the Pokémon to the wishlist
        SharedPreferences prefs = getSharedPreferences("wishlist", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(pokemon.getName(), pokemon.toJson());
        editor.apply();

        // Toast notification to confirm addition to wishlist
        Toast.makeText(this, pokemon.getName() + " added to wishlist!", Toast.LENGTH_SHORT).show();
    }

    // Removed unused fetchAndSaveRandomPokemon method
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_pokemon);
        // Other initialization code
    }

    // Other existing methods
}