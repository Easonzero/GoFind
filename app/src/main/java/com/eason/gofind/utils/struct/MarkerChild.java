package com.eason.gofind.utils.struct;

import com.baidu.mapapi.clusterutil.clustering.ClusterItem;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.model.LatLng;
import com.eason.gofind.utils.define.MarkerBean;

/**
 * Created by eason on 8/26/16.
 */
public class MarkerChild implements ClusterItem {
    private final MarkerBean data;

    public MarkerChild(MarkerBean data) {
        this.data = data;
    }

    @Override
    public LatLng getPosition() {
        return data.point;
    }

    @Override
    public BitmapDescriptor getBitmapDescriptor() {
        return BitmapDescriptorFactory
                .fromResource(data.getResourceId());
    }
}
