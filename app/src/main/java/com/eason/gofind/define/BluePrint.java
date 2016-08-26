package com.eason.gofind.define;

import com.eason.gofind.R;
import com.eason.gofind.action.Action;
import com.eason.gofind.action.DemoAction;
import com.eason.gofind.view.DemoView;
import com.eason.gofind.view.View;

/**
 * Created by eason on 8/22/16.
 */
public enum BluePrint {
    SOMETHING(DemoAction.class,DemoView.class, R.mipmap.ic_launcher),
    CITY(DemoAction.class,DemoView.class,R.drawable.city),
    HOTEL(DemoAction.class,DemoView.class,R.drawable.hotel),
    SCENIC(DemoAction.class,DemoView.class,R.drawable.scenic);

    Class action;
    Class view;
    int resource;

    BluePrint(Class<? extends Action> action,Class<? extends View> view,int resource){
        this.action = action;
        this.view = view;
        this.resource = resource;
    }

    public Action createAction() {
        try {
            return (Action)action.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public View createView() {
        try {
            return (View)view.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
