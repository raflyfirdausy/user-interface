package pmo2.kelompok4.userinterface;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SmartphoneDetailFragment extends Fragment {

    private long smartphoneId;

    public SmartphoneDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_smartphone_detail, container, false);
    }

    public void setSmartphoneId(long smartphoneId) {
        this.smartphoneId = smartphoneId;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null){
            ImageView iv_gambar = (ImageView) view.findViewById(R.id.iv_gambar);
            TextView tv_nama    = (TextView) view.findViewById(R.id.tv_nama);
            TextView tv_harga   = (TextView) view.findViewById(R.id.tv_harga);

            SmartphoneModel smartphoneModel = SmartphoneModel.daftarSmartphone[(int) smartphoneId];

            iv_gambar.setImageResource(smartphoneModel.getGambar());
            tv_nama.setText(smartphoneModel.getNama());
            tv_harga.setText(smartphoneModel.getHarga());
        }
    }
}
