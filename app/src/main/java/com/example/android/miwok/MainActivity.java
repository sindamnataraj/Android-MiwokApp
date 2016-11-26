/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }

    public void openNumbersList(View view)
    {
        Intent intent = new Intent(this,MainNumbers.class);
        startActivity(intent);
    }
    public void openFamilyList(View view)
    {
        Intent intent = new Intent(this,MainFamily.class);
        startActivity(intent);

    }
    public void openColorsList(View view)
    {
        Intent intent = new Intent(this,MainColors.class);
        startActivity(intent);
    }
    public void openPhrasesList(View view)
    {
        Intent intent = new Intent(this,MainPhrases.class);
        startActivity(intent);
    }

}
