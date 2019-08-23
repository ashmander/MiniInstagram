package com.example.miniinstagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NoticeAdapter extends BaseAdapter {

    private ArrayList<Notice> notices;

    public NoticeAdapter () {
        notices = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return notices.size();
    }

    @Override
    public Object getItem(int i) {
        return notices.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.row_new, null);
        ImageView imageImg = v.findViewById(R.id.image_img);
        ImageView likeImg = v.findViewById(R.id.like_img);
        TextView dateTv = v.findViewById(R.id.date_tv);
        ImageView deleteImg = v.findViewById(R.id.delete_btn);
        imageImg.setImageResource(R.drawable.photo1);
        return v;
    }
}
