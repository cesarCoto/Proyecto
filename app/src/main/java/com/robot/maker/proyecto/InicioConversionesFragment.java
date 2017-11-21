package com.robot.maker.proyecto;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InicioConversionesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link InicioConversionesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InicioConversionesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public InicioConversionesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InicioConversionesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InicioConversionesFragment newInstance(String param1, String param2) {
        InicioConversionesFragment fragment = new InicioConversionesFragment();
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
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_inicio_conversiones, container, false);
        // se agregan los texto dentro del WebView referenciado al archivo tipo string
        WebView webViewparrafo1 = view.findViewById(R.id.texto_home_conversiones_parrafo1);
        WebView webViewparrafo2 = view.findViewById(R.id.texto_home_conversiones_parrafo2);
        WebView webViewparrafo3 = view.findViewById(R.id.texto_home_conversiones_parrafo3);
        webViewparrafo1.setVerticalScrollBarEnabled(false);
        webViewparrafo2.setVerticalScrollBarEnabled(false);
        webViewparrafo3.setVerticalScrollBarEnabled(false);
        webViewparrafo1.loadData(getString(R.string.conversiones_que_son_parrafo1), "text/html; charset=utf-8", "utf-8");
        webViewparrafo2.loadData(getString(R.string.conversiones_que_son_parrafo2), "text/html; charset=utf-8", "utf-8");
        webViewparrafo3.loadData(getString(R.string.conversiones_que_son_parrafo3), "text/html; charset=utf-8", "utf-8");
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
