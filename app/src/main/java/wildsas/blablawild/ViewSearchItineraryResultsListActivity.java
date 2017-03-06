package wildsas.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ViewSearchItineraryResultsListActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_search_itinerary_results_list);

        Intent intentGoResults = getIntent();
        informationsclasse trajet = getIntent().getExtras().getParcelable(SearchItineraryActivity.EXTRA_TRAJET);
        this.setTitle(trajet.getmDepart() + " " + trajet.getmDestination() + " " + trajet.getmDate());

        Toast.makeText(ViewSearchItineraryResultsListActivity.this, getString(R.string.felicitations) + " " + trajet.getmDepart() + " " + getString(R.string.le) + " " + trajet.getmDate(),
                Toast.LENGTH_LONG).show();


    }
}
