package com.kylingo.jetpack;

import com.me.ui.library.sample.SampleFragment;

import java.util.List;

/**
 * @author kylingo
 * @since 2019/11/04 19:54
 */
public class MainFragment extends SampleFragment<String> {

    @Override
    protected void addItems(List<String> items) {
        items.add("DataBinding");
    }

    @Override
    protected void onClickItem(String item) {
        switch (item) {
            case "DataBinding":
                break;
        }
    }
}
