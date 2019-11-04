package com.kylingo.jetpack;

import com.me.ui.library.sample.SampleActivity;

import androidx.fragment.app.Fragment;

public class MainActivity extends SampleActivity {

    @Override
    protected String getSampleTitle() {
        return getString(R.string.app_name);
    }

    @Override
    protected Fragment getSampleFragment() {
        return new MainFragment();
    }
}
