package pmo2.kelompok4.userinterface;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SmartphoneFragment extends ListFragment {

    private Listener listener;

    public SmartphoneFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] nama   = new String[SmartphoneModel.daftarSmartphone.length];
        for (int i = 0; i < nama.length ; i++) {
            nama[i] = SmartphoneModel.daftarSmartphone[i].getNama();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
          inflater.getContext(), android.R.layout.simple_list_item_1, nama
        );
        setListAdapter(adapter);
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_smartphone, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public interface Listener{
        void itemClicked(long id);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener) context;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(listener != null){
            listener.itemClicked(id);
        }
    }
}
