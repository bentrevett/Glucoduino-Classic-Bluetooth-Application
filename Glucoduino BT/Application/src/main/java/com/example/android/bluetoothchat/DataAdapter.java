package com.example.android.bluetoothchat;

/**
 * Created by bentr_000 on 11/03/2015.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.bluetoothchat.models.Data;

import java.util.List;

public class DataAdapter extends ArrayAdapter<Data> {
    private LayoutInflater inflater;

    public DataAdapter(Activity activity, List<Data> datas){
        super(activity, R.layout.row_data, datas);
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Data data = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_data, parent, false);
        }

        TextView tvDate = (TextView) convertView.findViewById(R.id.textDate);
        TextView tvBody = (TextView) convertView.findViewById(R.id.textBody);

        tvDate.setText(data.getDate());
        tvBody.setText(data.getBody());

        return convertView;
    }

}
