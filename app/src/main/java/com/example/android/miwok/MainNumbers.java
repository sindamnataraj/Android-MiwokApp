package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_numbers);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("lutti","One",R.drawable.number_one));
        words.add(new word("otiiko","two",R.drawable.number_two));
        words.add(new word("tolookosu","three",R.drawable.number_three));
        words.add(new word("oyyisa","four",R.drawable.number_four));
        words.add(new word("massokka","five",R.drawable.number_five));
        words.add(new word("temmokka","six",R.drawable.number_six));
        words.add(new word("kenekaku","seven",R.drawable.number_seven));
        words.add(new word("kawinta","eight",R.drawable.number_eight));
        words.add(new word("wo’e","nine",R.drawable.number_nine));
        words.add(new word("na’aacha","ten",R.drawable.number_ten));

        WordAdapter wordAdapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);




    }
}
