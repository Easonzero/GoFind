package com.eason.gofind.factory;

import com.baidu.mapapi.map.MapView;
import com.eason.gofind.struct.Element;
import com.eason.gofind.define.BluePrint;
import com.eason.gofind.define.MarkerBean;

/**
 * Created by eason on 8/22/16.
 */
public class BluePrintFactory {
    public static Element createElement(MapView mapView, MarkerBean bean){
        BluePrint bp = BluePrint.valueOf(bean.type);
        Element element = new Element(bp.createAction(),bp.createView(),bean);
        return element;
    }
}
