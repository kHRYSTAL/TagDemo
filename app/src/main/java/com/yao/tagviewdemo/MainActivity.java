package com.yao.tagviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.yao.tagviewdemo.model.Tag;
import com.yao.tagviewdemo.view.TagListView;
import com.yao.tagviewdemo.view.TagView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TagListView.OnTagCheckedChangedListener {

    private TagListView mTagListView;
    private final List<Tag> mTags = new ArrayList<Tag>();
    private final String[] titles = { "安全必备", "音乐", "父母学", "上班族必备",
            "360手机卫士", "QQ","输入法", "微信", "最美应用", "AndevUI", "蘑菇街" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_tag_activity);

        mTagListView = (TagListView) findViewById(R.id.tagview);
        setUpData();
        mTagListView.setTags(mTags,true);
        mTagListView.setDeleteMode(true);
        mTagListView.setOnTagCheckedChangedListener(this);
    }

    private void setUpData() {
        for (int i = 0; i < 10; i++) {
            Tag tag = new Tag();
            tag.setId(i);
            if (i%2==0)
            tag.setChecked(true);
            tag.setTitle(titles[i]);
            mTags.add(tag);
        }
    }

    @Override
    public void onTagCheckedChanged(TagView tagView, Tag tag) {
        if (tagView.isSelected()) {
            tagView.setSelected(true);
        }else {
            tagView.setSelected(true);
        }
    }
}
