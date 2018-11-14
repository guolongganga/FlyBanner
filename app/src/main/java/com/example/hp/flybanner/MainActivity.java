package com.example.hp.flybanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.recker.flybanner.FlyBanner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FlyBanner banner;

    private String[] mImagesUrl = {
            "http://img4.imgtn.bdimg.com/it/u=2430963138,1300578556&fm=23&gp=0.jpg",
            "http://img1.imgtn.bdimg.com/it/u=2755648979,3568014048&fm=23&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=2272739960,4287902102&fm=23&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1078051055,1310741362&fm=23&gp=0.jpg"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 加载本地图片
         */
       // initLocalBanner();
        //加载网络图片
        initNetBanner();
    }

    private void initNetBanner() {
        banner=findViewById(R.id.fly);
        List<String> list=new ArrayList<>();
        for (int i = 0; i <mImagesUrl.length; i++) {
            list.add(mImagesUrl[i]);


        }
        banner.setImagesUrl(list);
        banner.setOnItemClickListener(new FlyBanner.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this,"点击了第"+position+"张图片",Toast.LENGTH_SHORT).show();
            }
        });


    }

    /**
     * 加载本地图片
     */
    private void initLocalBanner() {
        banner=findViewById(R.id.fly);
        List<Integer> images=new ArrayList<>();
        images.add(R.drawable.img_1);
        images.add(R.drawable.img_2);
        images.add(R.drawable.img_3);
        images.add(R.drawable.img_4);
        banner.setImages(images);
        banner.setOnItemClickListener(new FlyBanner.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this,"点击了第"+position+"张图片",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
