package pmo2.kelompok4.userinterface;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SmartphoneFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id) {
        View view = findViewById(R.id.detail_fragment);
        try{
            if (view != null){
                SmartphoneDetailFragment smartphoneDetailFragment = new SmartphoneDetailFragment();
                smartphoneDetailFragment.setSmartphoneId(id);
                FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.detail_fragment, smartphoneDetailFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null);
                fragmentTransaction.commit();
            } else {
//                Toast.makeText(this,""+id, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this.getApplicationContext(), DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putLong("id", id);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        } catch (Exception e){
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
