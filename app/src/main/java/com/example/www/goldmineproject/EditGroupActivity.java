package com.example.www.goldmineproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.realm.Realm;

/**
 * Created by Аделя on 28.02.2018.
 */

public class EditGroupActivity extends AppCompatActivity {

    private TextView groupTextView;
    private Realm realm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent=getIntent();
        String groupName=intent.getStringExtra("name");

    }
}
