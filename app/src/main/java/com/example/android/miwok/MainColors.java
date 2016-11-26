package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainColors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_colors);

        ArrayList<word> colors = new ArrayList<word>();

        colors.add(new word("weṭeṭṭi","red",R.drawable.color_red));
        colors.add(new word("chokokki","green",R.drawable.color_green));
        colors.add(new word("ṭakaakki","brown",R.drawable.color_brown));
        colors.add(new word("ṭopoppi","gray",R.drawable.color_gray));
        colors.add(new word("kululli","black",R.drawable.color_black));
        colors.add(new word("kelelli","white",R.drawable.color_white));
        colors.add(new word("ṭopiisә","dusty yellow",R.drawable.color_dusty_yellow));
        colors.add(new word("chiwiiṭә","mustard yellow",R.drawable.color_mustard_yellow));

        WordAdapter wordAdaptor = new WordAdapter(this,colors);
        ListView listView = (ListView) findViewById(R.id.list_colors);
        listView.setAdapter(wordAdaptor);
    }
}
