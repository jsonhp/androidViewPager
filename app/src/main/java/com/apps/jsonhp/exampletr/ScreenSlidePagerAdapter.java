package com.apps.jsonhp.exampletr;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by jeisson_herrera on 13/04/16.
 */
public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

    private static final int NUM_PAGES = 5;

    public ScreenSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new Slide1Fragment();
                break;
            case 1:
                fragment = new Slide2Fragment();
                break;
            case 2:
                fragment = new Slide1Fragment();
                break;
            case 3:
                fragment = new Slide2Fragment();
                break;
            case 4:
                fragment = new Slide1Fragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }

}
