package com.google.android.ims.rcsservice.chatsession.message;

import defpackage.alob;
import defpackage.alog;
import defpackage.aoop;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GeneralPurposeRichCardMediaInfo {
    private static final String IMAGE_GIF = "image/gif";
    public static final String IMAGE_HEIGHT_MEDIUM = "MEDIUM_HEIGHT";
    public static final String IMAGE_HEIGHT_SHORT = "SHORT_HEIGHT";
    public static final String IMAGE_HEIGHT_TALL = "TALL_HEIGHT";
    private static final String IMAGE_JPEG = "image/jpeg";
    private static final String IMAGE_JPG = "image/jpg";
    private static final String IMAGE_PNG = "image/png";
    private static final String VIDEO_H263 = "video/h263";
    private static final String VIDEO_M4V = "video/m4v";
    private static final String VIDEO_MP4 = "video/mp4";
    private static final String VIDEO_MPEG = "video/mpeg";
    private static final String VIDEO_MPEG4 = "video/mpeg4";
    private static final String VIDEO_WEBM = "video/webm";
    static final alog<String> supportedMediaImageTypes;
    private static final alog<String> supportedMediaVideoTypes;
    public static final alog<String> supportedRichCardMediaTypes;

    @aoop
    public String height;

    @aoop
    public String mediaContentType;

    @aoop
    public Long mediaFileSize;

    @aoop
    public String mediaUrl;

    @aoop
    public String thumbnailContentType;

    @aoop
    public Long thumbnailFileSize;

    @aoop
    public String thumbnailUrl;

    static {
        alog<String> u = alog.u(IMAGE_JPEG, IMAGE_JPG, IMAGE_GIF, IMAGE_PNG);
        supportedMediaImageTypes = u;
        alog<String> w = alog.w(VIDEO_H263, VIDEO_M4V, VIDEO_MP4, VIDEO_MPEG, VIDEO_MPEG4, VIDEO_WEBM);
        supportedMediaVideoTypes = w;
        alob alobVar = new alob();
        alobVar.j(u);
        alobVar.j(w);
        supportedRichCardMediaTypes = alobVar.g();
    }
}
