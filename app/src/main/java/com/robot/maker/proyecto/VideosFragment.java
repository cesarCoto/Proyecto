package com.robot.maker.proyecto;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.WIFI_SERVICE;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link VideosFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link VideosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VideosFragment extends Fragment  {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;


    public VideosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VideosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VideosFragment newInstance(String param1, String param2) {
        VideosFragment fragment = new VideosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //se crean los titulos de cadad elemento en la lista
        String [] titulos = {getString(R.string.conversions_title),getString(R.string.vectors_title),
                getString(R.string.magnitudes_title),getString(R.string.ley_inercia_title),getString(R.string.segunda_ley_title),
                getString(R.string.tercera_ley_title)};
        //despricciones
        String [] descripciones = {"1","2","3","4","5","6"};
        //imagenes
        int [] imagenes = {R.drawable.conversiones_img, R.drawable.vectores_img,R.drawable.magnitudes_img,
                R.drawable.primera_ley_new_img,R.drawable.segunda_ley_new_img,R.drawable.tercera_lew_new_img};
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_videos, container, false);
        ListView listView = view.findViewById(R.id.lista_videos);

        MyAdapter adapter = new MyAdapter(getActivity(),titulos,descripciones,imagenes);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    String conversiones = "https://androidprototipo.blogspot.mx/2017/11/converciones.html";
                    Intent intent = new Intent (getActivity(),VideosContainerActivity.class);
                    intent.putExtra("page",conversiones);
                    startActivity(intent);
                }else if(position ==1){
                    String vectores = "https://androidprototipo.blogspot.mx/2017/11/vectores.html";
                    Intent intent = new Intent (getActivity(),VideosContainerActivity.class);
                    intent.putExtra("page",vectores);
                    startActivity(intent);
                }else if (position ==2){
                    String magnitudes = "https://androidprototipo.blogspot.mx/2017/11/magnirudes.html";
                    Intent intent = new Intent (getActivity(),VideosContainerActivity.class);
                    intent.putExtra("page",magnitudes);
                    startActivity(intent);
                }else if(position ==3){
                    String primeraLey = "https://androidprototipo.blogspot.mx/2017/11/primera-ley-de-newton.html";
                    Intent intent = new Intent (getActivity(),VideosContainerActivity.class);
                    intent.putExtra("page",primeraLey);
                    startActivity(intent);
                }else if(position ==4 ){
                    String segundaLey = "https://androidprototipo.blogspot.mx/2017/11/segunda-ley-de-newton.html";
                    Intent intent = new Intent (getActivity(),VideosContainerActivity.class);
                    intent.putExtra("page",segundaLey);
                    startActivity(intent);
                }else if(position ==5){
                    String terceraLey = "https://androidprototipo.blogspot.mx/2017/11/tercera-ley-de-newton.html";
                    Intent intent = new Intent (getActivity(),VideosContainerActivity.class);
                    intent.putExtra("page",terceraLey);
                    startActivity(intent);
                }
            }
        });



        return view;
    }
    // se crea el arraycustom

    class MyAdapter extends ArrayAdapter {
        int[] imagenArray;
        String[] titleArray;
        String[] descipccionArray;

        public MyAdapter(Context context, String[] title1, String[]description1, int[]imagenes){
            super(context, R.layout.custom_list_view,R.id.texttitle,title1);
            this.imagenArray=imagenes;
            this.titleArray = title1;
            this.descipccionArray=description1;
        }

        @NonNull
        @Override
        public View getView(int position,  View convertView, ViewGroup parent) {
            // inflamos el layout
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.custom_list_view,parent,false);
            //referencicamos
            ImageView myImage = (ImageView) row.findViewById(R.id.imagend);
            TextView myTitle = (TextView) row.findViewById(R.id.texttitle);
            TextView myDescription = (TextView) row.findViewById(R.id.textdescripcion);

            //se seleccionan las posisiones y el contenido que tendra

            myImage.setImageResource(imagenArray[position]);
            myTitle.setText(titleArray[position]);
            myDescription.setText(descipccionArray[position]);
            return row;
        }
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
