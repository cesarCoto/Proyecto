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
 * {@link SumaVectoresFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SumaVectoresFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SumaVectoresFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SumaVectoresFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SumaVectoresFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SumaVectoresFragment newInstance(String param1, String param2) {
        SumaVectoresFragment fragment = new SumaVectoresFragment();
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

        //aqui se programa el contenido del fragment
        View view = inflater.inflate(R.layout.fragment_suma_vectores, container, false);

        //p1
        WebView webViewParrafo1 = view.findViewById(R.id.texto_suma_vectores_parrafo1);
        webViewParrafo1.setVerticalScrollBarEnabled(false);
        webViewParrafo1.loadData(getString(R.string.vectores_parrafo5), "text/html; charset=utf-8", "utf-8");

        //p2
        WebView webViewParrafo2 = view.findViewById(R.id.texto_suma_vectores_parrafo2);
        webViewParrafo2.setVerticalScrollBarEnabled(false);
        webViewParrafo2.loadData(getString(R.string.vectores_parrafo6), "text/html; charset=utf-8", "utf-8");

        //p3
        WebView webViewParrafo3 = view.findViewById(R.id.texto_suma_vectores_parrafo3);
        webViewParrafo3.setVerticalScrollBarEnabled(false);
        webViewParrafo3.loadData(getString(R.string.vectores_parrafo7), "text/html; charset=utf-8", "utf-8");

        //p4
        WebView webViewParrafo4 = view.findViewById(R.id.texto_suma_vectores_parrafo4);
        webViewParrafo4.setVerticalScrollBarEnabled(false);
        webViewParrafo4.loadData(getString(R.string.vectores_parrafo8), "text/html; charset=utf-8", "utf-8");

        //p5
        WebView webViewParrafo5 = view.findViewById(R.id.texto_suma_vectores_parrafo5);
        webViewParrafo5.setVerticalScrollBarEnabled(false);
        webViewParrafo5.loadData(getString(R.string.vectores_parrafo9), "text/html; charset=utf-8", "utf-8");

        //p5
        WebView webViewParrafo6 = view.findViewById(R.id.texto_suma_vectores_parrafo6);
        webViewParrafo6.setVerticalScrollBarEnabled(false);
        webViewParrafo6.loadData(getString(R.string.vectores_parrafo10), "text/html; charset=utf-8", "utf-8");

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
