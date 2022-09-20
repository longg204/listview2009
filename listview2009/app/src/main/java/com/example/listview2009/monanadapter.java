package com.example.listview2009;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class monanadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<cacmonan> cacmonanList;

    public monanadapter(Context context, int layout, List<cacmonan> cacmonanList) {
        this.context = context;
        this.layout = layout;
        this.cacmonanList = cacmonanList;
    }

    @Override
    public int getCount() {
        return cacmonanList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHoder{
        ImageView imgmonan, imgthem, imgtru;
        TextView txttenmon, txtchitiet, txtgiatien;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoder hoder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            hoder = new ViewHoder();

            hoder.txttenmon = (TextView) view.findViewById(R.id.text_tenmon);
            hoder.txtchitiet = (TextView) view.findViewById(R.id.text_chitiet);
            hoder.txtgiatien = (TextView) view.findViewById(R.id.text_giatien);
            hoder.imgthem = (ImageView) view.findViewById(R.id.them_img);
            hoder.imgtru = (ImageView) view.findViewById(R.id.tru_img);
            hoder.imgmonan = (ImageView) view.findViewById(R.id.image_monan);
            view.setTag(hoder);
        }else{
            hoder = (ViewHoder) view.getTag();
        }

        cacmonan cacmonan =cacmonanList.get(i);
        hoder.txttenmon.setText(cacmonan.getTenmon());
        hoder.txtchitiet.setText(cacmonan.getChitiet());
        hoder.txtgiatien.setText(cacmonan.getGiatien());
        hoder.imgthem.setImageResource(cacmonan.getImg());
        hoder.imgtru.setImageResource(cacmonan.getImg());
        hoder.imgmonan.setImageResource(cacmonan.getImg());

        return view;
    }
}
