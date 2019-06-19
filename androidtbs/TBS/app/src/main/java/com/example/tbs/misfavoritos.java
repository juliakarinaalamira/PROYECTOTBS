package com.example.tbs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tbs.adaptadores.adaptersmisfavoritos;
import com.example.tbs.modelos_datainfo.modelsmisfavoritos;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link misfavoritos.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link misfavoritos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class misfavoritos extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    RecyclerView recicler ;
    ArrayList<modelsmisfavoritos> listarecycler;

    public misfavoritos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment misfavoritos.
     */
    // TODO: Rename and change types and number of parameters
    public static misfavoritos newInstance(String param1, String param2) {
        misfavoritos fragment = new misfavoritos();
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
    public List<modelsmisfavoritos> obtencion(){
        List<modelsmisfavoritos> datos= new ArrayList<>();
        listarecycler.add(new modelsmisfavoritos("3s0","asdtitle","descripcion","est",R.drawable.coco));

        listarecycler.add(new modelsmisfavoritos( "3s0","asdtitle","descripcion","est",R.drawable.coco));
        return listarecycler;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_misfavoritos, container, false);
        View vista=inflater.inflate(R.layout.fragment_misfavoritos, container, false);
//copiado
        listarecycler= new ArrayList<>();
        recicler=vista.findViewById(R.id.reciclermisfavoritos);
        recicler.setLayoutManager(new LinearLayoutManager(getContext()));
        obtencion();
        adaptersmisfavoritos adapter = new adaptersmisfavoritos(listarecycler);
        recicler.setAdapter(adapter);
        return vista;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

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
