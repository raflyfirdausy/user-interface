package pmo2.kelompok4.userinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        SmartphoneDetailFragment smartphoneDetailFragment = (SmartphoneDetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detailFragment);
        Bundle bundle = getIntent().getExtras();
        smartphoneDetailFragment.setSmartphoneId(bundle.getLong("id"));
    }
}
