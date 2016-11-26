package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainPhrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_phrases);

        ArrayList<word> phrases = new ArrayList<word>();

        phrases.add(new word("minto wuksus","Where are you going?" ));
        phrases.add(new word("tinnә oyaase'nә","What is your name?" ));
        phrases.add(new word("oyaaset...","My name is..." ));
        phrases.add(new word("michәksәs?","How are you feeling?" ));
        phrases.add(new word("kuchi achit","I’m feeling good." ));
        phrases.add(new word("әәnәs'aa?","Are you coming?" ));
        phrases.add(new word("hәә’ әәnәm","Yes, I’m coming." ));
        phrases.add(new word("әәnәm","I’m coming." ));
        phrases.add(new word("yoowutis","Let’s go." ));
        phrases.add(new word("әnni'nem","Come here." ));

        WordAdapter wordAdaptor = new WordAdapter(this,phrases);
        ListView listView = (ListView) findViewById(R.id.list_phrases);
        listView.setAdapter(wordAdaptor);

    }
}
