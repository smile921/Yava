package com.yava921.frere.yava.views.adapters;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.List;

/**
 * Created by frere on 2016/8/19.
 * @功能描述：ViewPager适配器，用来绑定数据和view
 */
public class ViewPagerAdapter extends PagerAdapter {
    // 界面列表
    private List<View> views;

    public ViewPagerAdapter(List<View> views){
        this.views = views;
    }

    @Override
    public int getCount() {
        if(views==null){
            return 0;
        }
        return views.size();
    }

    /**
     * 判断是否由对象生成界面
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==object);
    }

    /**
     * 销毁position位置的界面
     */
    @Override
    public void destroyItem(View container,int position,Object obj){
        ((ViewPager)container).removeView(views.get(position));
    }
    /**
     * 初始化position位置的界面
     */
    @Override
    public Object instantiateItem(View contaioner,int position){
        ((ViewPager)contaioner).addView(views.get(position),0);
        return  views.get(position);
    }
}
