package com.yao.tagviewdemo.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.yao.tagviewdemo.R;

/**
 * Created by ASUS on 2015/9/30.
 */
public class TagLayoutView extends RelativeLayout{
    TagView tagView;
    CircleImageView circleImageView;
    TextView textView;
    Context context;

    public TagLayoutView(Context context) {
        super(context);
    }

    public TagLayoutView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
       /* View root = LayoutInflater.from(context).inflate(R.layout.tagview_layout, this, true);
        tagView = (TagView) root.findViewById(R.id.tag);
        circleImageView = (CircleImageView)root.findViewById(R.id.avatar);
        textView = (TextView)root.findViewById(R.id.tag_number);*/
    }
}
