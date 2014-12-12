package androlite.spinneractivity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/*
* Ardhitya Wiedha Irawan @papap_aila ardhityawiedhairawan@gmail.com
*
*
* */
public class MyActivity extends ActionBarActivity {
    private Spinner opsiActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        opsiActivity = (Spinner) findViewById(R.id.selectActivity);
        opsiActivity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                Intent i;
                switch (position) {
                    case 1:
                        i = new Intent(getApplicationContext(),Activity1.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(getApplicationContext(),Activity2.class);
                        startActivity(i);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
