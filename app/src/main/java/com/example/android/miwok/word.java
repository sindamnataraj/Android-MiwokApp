package com.example.android.miwok;

/**
 * Created by sindamnataraj on 11/18/2016.
 */

public class word {
    public String Miwok;
    public String English;
    public int ImageId;

    public word(String word1,String word2,int ResourceId)
    {
        Miwok = word1;
        English = word2;
        ImageId = ResourceId;
    }

    public word(String word1,String word2)
    {
        Miwok = word1;
        English = word2;
    }
}
