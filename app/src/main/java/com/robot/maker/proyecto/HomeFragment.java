package com.robot.maker.proyecto;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

// This code was made by Cesar Uriel Coto Coazozon and the help of Jose Manuel Coutiño Vazques

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
    /*Creado por CESAR COTO, JOSE COUTIÑO*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //Aqui se hace un intent que al hacer click se manda a la actividad seleccionada en cada caso
        //caso conversiones
        ImageButton imageButtonConversiones = view.findViewById(R.id.imageButton_Conversiones);
        TextView textViewConversiones = view.findViewById(R.id.textView_Conversiones);
        View.OnClickListener onClickListenerConversiones = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_conversiones = new Intent(getActivity(),ConversionsActivity.class);
                startActivity(intent_conversiones);
            }
        };
        imageButtonConversiones.setOnClickListener(onClickListenerConversiones);
        textViewConversiones.setOnClickListener(onClickListenerConversiones);
        //caso vectors
        ImageButton imageButtonVectores = view.findViewById(R.id.imageButton_Vectores);
        TextView textViewVectores = view.findViewById(R.id.textView_Vectores);
        View.OnClickListener onClickListenerVectores = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenVectores = new Intent(getActivity(),VectorActivity.class);
                startActivity(intenVectores);
            }
        };
        imageButtonVectores.setOnClickListener(onClickListenerVectores);
        textViewVectores.setOnClickListener(onClickListenerVectores);

        //caso Magnitudes
        ImageButton imageButtonMagnitudes = view.findViewById(R.id.imageButton_Magnitudes);
        TextView textViewMagnitudes = view.findViewById(R.id.textView_Magnitudes);
        View.OnClickListener onClickListenerMagnitudes = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMagnitudes = new Intent(getActivity(), MagnitudesActivity.class);
                startActivity(intentMagnitudes);
            }
        };
        imageButtonMagnitudes.setOnClickListener(onClickListenerMagnitudes);
        textViewMagnitudes.setOnClickListener(onClickListenerMagnitudes);

        //caso primera ley de Newton
        ImageButton imageButtonLeyUno = view.findViewById(R.id.imageButton_Primera_Ley_New);
        TextView textViewLeyUno = view.findViewById(R.id.textView_Primera_Ley_New);
        View.OnClickListener onClickListenerLeyUno = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLeyUno = new Intent(getActivity(), PrimeraLeyActivity.class);
                startActivity(intentLeyUno);
            }
        };
        imageButtonLeyUno.setOnClickListener(onClickListenerLeyUno);
        textViewLeyUno.setOnClickListener(onClickListenerLeyUno);

        //caso Segunda ley de Newton
        ImageButton imageButtonSL = view.findViewById(R.id.imageButton_Segunda_Ley_New);
        TextView textViewSL = view.findViewById(R.id.textView_Segunda_Ley_New);
        View.OnClickListener onClickListenerSL = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSL = new Intent(getActivity(), SegundaLeyActivity.class);
                startActivity(intentSL);
            }
        };
        imageButtonSL.setOnClickListener(onClickListenerSL);
        textViewSL.setOnClickListener(onClickListenerSL);

        //caso Tercera Ley de Newton
        ImageButton imageButtonTL = view.findViewById(R.id.imageButton_Tercera_Ley_New);
        TextView textViewTL = view.findViewById(R.id.textView_Tercera_Ley_New);
        View.OnClickListener onClickListenerTL = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTL = new Intent(getActivity(), TerceraLeyActivity.class);
                startActivity(intentTL);
            }
        };
        imageButtonTL.setOnClickListener(onClickListenerTL);
        textViewTL.setOnClickListener(onClickListenerTL);
        return view;
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
