package com.eason.gofind.utils.define;

import com.eason.gofind.utils.utils.JsonResponseParser;

import org.xutils.http.annotation.HttpResponse;

/**
 * Created by eason on 8/26/16.
 */
@HttpResponse(parser = JsonResponseParser.class)
public class AnShengJson {
    public String errcode;
    public String errmsg;
    public String guid;
    public PrepareDataJson data;
}
