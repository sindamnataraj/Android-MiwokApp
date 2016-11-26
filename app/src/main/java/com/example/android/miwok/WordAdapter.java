package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sindamnataraj on 11/18/2016.
 */

public class WordAdapter extends ArrayAdapter<word> {

    public  WordAdapter(Activity context,ArrayList<word> words)
    {
        super(context,0,words);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View recycledView = convertView;
        if(recycledView==null)
        {
            recycledView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        word currentWord = getItem(position);

        TextView wordMiwok = (TextView) recycledView.findViewById(R.id.miworkWord);
        wordMiwok.setText(currentWord.Miwok);

        TextView wordEnglish = (TextView) recycledView.findViewById(R.id.englishWord);
        wordEnglish.setText(currentWord.English);

        ImageView imageMiwok = (ImageView) recycledView.findViewById(R.id.miwokImage);

        if(currentWord.ImageId != 0) {

            imageMiwok.setImageResource(currentWord.ImageId);
        }
        else
        {
            imageMiwok.setVisibility(View.GONE);
        }

        return recycledView;
    }
}
