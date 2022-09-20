package com.example.listview2009;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvmonan;
    ArrayList<cacmonan> arraymonan;
    monanadapter adapter;
    private int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvmonan = (ListView) findViewById(R.id.listviewmonana);
        arraymonan = new ArrayList<>();
        arraymonan.add(new cacmonan("Bún Bò Huế", "Bún bò là  đặc sản\ncủa xứ Huế", "7$",R.drawable.ic_add,R.drawable.ic_minus,R.drawable.bunbohue));
        arraymonan.add(new cacmonan("Bún Bò Huế", "Bún bò là  đặc sản\ncủa xứ Huế", "7$",R.drawable.ic_add,R.drawable.ic_minus,R.drawable.mon44));
        arraymonan.add(new cacmonan("Bún Bò Huế", "Bún bò là  đặc sản\ncủa xứ Huế", "7$",R.drawable.ic_add,R.drawable.ic_minus,R.drawable.mon44));
        arraymonan.add(new cacmonan("Bún Bò Huế", "Bún bò là  đặc sản\ncủa xứ Huế", "7$",R.drawable.ic_add,R.drawable.ic_minus,R.drawable.mon44));
        arraymonan.add(new cacmonan("Bún Bò Huế", "Bún bò là  đặc sản\ncủa xứ Huế", "7$",R.drawable.ic_add,R.drawable.ic_minus,R.drawable.bunbohue));
        arraymonan.add(new cacmonan("Bún Bò Huế", "Bún bò là  đặc sản\ncủa xứ Huế", "7$",R.drawable.ic_add,R.drawable.ic_minus,R.drawable.bunbohue));
        arraymonan.add(new cacmonan("Bún Bò Huế", "Bún bò là  đặc sản\ncủa xứ Huế", "7$",R.drawable.ic_add,R.drawable.ic_minus,R.drawable.bunbohue));
        arraymonan.add(new cacmonan("Bún Bò Huế", "Bún bò là  đặc sản\ncủa xứ Huế", "7$",R.drawable.ic_add,R.drawable.ic_minus,R.drawable.bunbohue));


        adapter = new monanadapter(this, R.layout.monan, arraymonan);
        lvmonan.setAdapter(adapter);
        //sukien click den trang detail
        lvmonan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(MainActivity.this, detail.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent = new Intent(MainActivity.this, detail.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent = new Intent(MainActivity.this, detail.class);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent = new Intent(MainActivity.this, detail.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent = new Intent(MainActivity.this, detail.class);
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent = new Intent(MainActivity.this, detail.class);
                    startActivity(intent);
                }
            }
        });

        //sukien longclickdelete
        lvmonan.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                vitri = i;
                new AlertDialog.Builder(MainActivity.this)
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure?")
                        .setMessage("Do you want delete this Item?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                arraymonan.remove(vitri);
                                adapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
                return true;
            }
        });
    }
}
