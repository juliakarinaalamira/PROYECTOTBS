package com.example.tbs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class miperfil extends AppCompatActivity {

    private RecyclerView recyclerV;
    private adapters adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miperfil);
     //   loadComponents();


        recyclerV=(RecyclerView) findViewById(R.id.recicler);
        recyclerV.setLayoutManager(new LinearLayoutManager(this));

        adapter=new adapters(obtencion());
        recyclerV.setAdapter(adapter);

    }
public List<models> obtencion(){
        List<models> datos= new ArrayList<>();
        datos.add(new models("title","descripcion","est",R.drawable.coco));
    datos.add(new models("title","descripcion","est",R.drawable.coco));
        return datos;

}
   /* private void loadComponents() {


//agarra las imagenes de drwable
        Integer[] image = new Integer[]{R.drawable.fresa, R.drawable.uvas, R.drawable.pina, R.drawable.coco};
        String[] titles = new String[]{"fresa", "uvas", "pina", "coco"};
        String[] descrip = new String[]{"mel", "cat", "hca", "pe"};
        String[] adicional = new String[]{"adi", "cio", "nal", "izar"};
      //crear instncia
        ArrayList<models> listdata = new ArrayList<>();
        for (int i = 0; i < image.length; i++) {
            models info = new models();
            info.setImg(image[i]);
            info.setTitle(titles[i]);
            info.setDescripcion(descrip[i]);
            info.setAdicional(adicional[i]);
            listdata.add(info);
        }


                 /*  ArrayList<String> datoslist = new ArrayList<>();
            for (int i = 0; i < 20; i++){
                datoslist.add("Item" + i);
            }
   //     ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datoslist);
            adapters adapter = new adapters(this,listdata);
            list.setAdapter(adapter);
        }
*/

    }

