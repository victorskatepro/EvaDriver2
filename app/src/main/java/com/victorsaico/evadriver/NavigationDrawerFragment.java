package com.victorsaico.evadriver;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by JARVIS on 23/04/2018.
 */

public class NavigationDrawerFragment extends Fragment {
    private DrawerLayout drawerLayout;
    public NavigationDrawerFragment()
    {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        return view;
    }
    public void setDrawer(DrawerLayout drawerLayout) {
        this.drawerLayout = drawerLayout;
    }
}
