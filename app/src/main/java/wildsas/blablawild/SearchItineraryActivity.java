package wildsas.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static wildsas.blablawild.R.id.activity_search_itinerary;

public class SearchItineraryActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;
    Button button;
    public final static String EXTRA_TRAJET = "trajet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_itinerary);

        editText1 = (EditText) findViewById(R.id.editTextSearchDeparture);
        editText2 = (EditText) findViewById(R.id.editTextSearchDestination);
        editText3 = (EditText) findViewById(R.id.editTextSearchDate);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (editText1.length() == 0 || editText2.length() == 0)
                {
                    Toast.makeText(SearchItineraryActivity.this, getString(R.string.renseigner),
                            Toast.LENGTH_LONG).show();
                }
                    else
                    {
                        String mDepart = editText1.getText().toString();
                        String mDestination = editText2.getText().toString();
                        String mDate = editText3.getText().toString();
                        informationsclasse trajet= new informationsclasse(mDepart, mDestination, mDate);
                        Intent intentgoresults = new Intent(SearchItineraryActivity.this, ViewSearchItineraryResultsListActivity.class);
                        intentgoresults.putExtra(SearchItineraryActivity.EXTRA_TRAJET, trajet);

                        startActivity(intentgoresults);
                    }

            }
        });
    }
}
