package fr.aston.guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fr.aston.guide.models.Restaurant;

public class ListingActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private ListView listViewData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        textViewTitle = findViewById(R.id.textViewTitle);
        listViewData = findViewById(R.id.listViewData);

        if(getIntent().getExtras() != null) {
            boolean isRestaurant = getIntent().getExtras().getBoolean("isRestaurant");

            if(isRestaurant) {
                textViewTitle.setText("Les Restaurants");

                // Mes restaurants
                final List<Restaurant> restaurantList = new ArrayList<>();
                restaurantList.add(new Restaurant("Mac Do", "Fast Food", "info@macdo.fr", "0102030405", "http://www..mcdonalds.fr", "http://www.lejournaldessables.fr/files/2015/04/Mc-Do-1.JPG"));
                restaurantList.add(new Restaurant("La Crémaillère", "Gastronomique", "info@cremaillere.fr", "0202030405", "http://www..cremaillere.fr", "https://medias.logishotels.com/property-images/1543/facade/retro/grand/hotel-la-cremaillere-facade-courseulles-sur-mer-481506.jpg"));
                restaurantList.add(new Restaurant("La Pergola", "Fast Food", "info@pergola.fr", "0302030405", "http://www.pergola.fr", "http://www.handball-courseulles.net/wp-content/uploads/pergola.jpg"));

                listViewData.setAdapter(new RestaurantAdapter(ListingActivity.this,R.layout.item_restaurant,restaurantList));

                listViewData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intentRestaurant = new Intent(ListingActivity.this, DetailsActivity.class);

                        // Passage de l'objet Restaurant
                        intentRestaurant.putExtra("objet", restaurantList.get(position));

                        startActivity(intentRestaurant); // Démarrage

                    }
                });
            } else { // Hotel
                textViewTitle.setText(R.string.Listing_hotel_title);
            }
        }
    }
}
