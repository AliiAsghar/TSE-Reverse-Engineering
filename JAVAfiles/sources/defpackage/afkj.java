package defpackage;

import com.google.android.apps.messaging.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afkj {
    public static final afkj a;
    public static final afkj b;
    public static final afkj c;
    public static final afkj d;
    public static final afkj e;
    public static final afkj f;
    public static final afkj g;
    public static final afkj h;
    public static final afkj i;
    public static final afkj j;
    private static final /* synthetic */ afkj[] n;
    public final alog k;
    public final int l;
    public final alog m;

    static {
        alog r = alog.r("android.permission.CAMERA");
        r.getClass();
        afkj afkjVar = new afkj("CAMERA", 0, r, R.string.access_camera_permission_name);
        a = afkjVar;
        alog r2 = alog.r("android.permission.ACCESS_FINE_LOCATION");
        r2.getClass();
        afkj afkjVar2 = new afkj("FINE_LOCATION", 1, r2, R.string.access_fine_location_permission_name);
        b = afkjVar2;
        alog r3 = alog.r("android.permission.READ_EXTERNAL_STORAGE");
        r3.getClass();
        afkj afkjVar3 = new afkj("READ_EXTERNAL_STORAGE", 2, r3, R.string.read_external_storage_permission_name);
        c = afkjVar3;
        alog r4 = alog.r("android.permission.READ_MEDIA_AUDIO");
        r4.getClass();
        int i2 = R.string.read_media_images_permission_name;
        afkj afkjVar4 = new afkj("READ_MEDIA_AUDIO", 3, r4, i2);
        d = afkjVar4;
        alog s = alog.s("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        s.getClass();
        afkj afkjVar5 = new afkj("READ_MEDIA_IMAGES", 4, s, i2);
        e = afkjVar5;
        alog s2 = alog.s("android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        s2.getClass();
        int i3 = R.string.read_media_videos_permission_name;
        afkj afkjVar6 = new afkj("READ_MEDIA_VIDEOS", 5, s2, i3);
        f = afkjVar6;
        alog r5 = alog.r("android.permission.RECORD_AUDIO");
        r5.getClass();
        afkj afkjVar7 = new afkj("RECORD_AUDIO", 6, r5, R.string.record_audio_permission_name);
        g = afkjVar7;
        alog r6 = alog.r("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        r6.getClass();
        alog s3 = alog.s("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");
        s3.getClass();
        afkj afkjVar8 = new afkj("READ_MEDIA_VISUAL_USER_SELECTED", 7, r6, R.string.read_media_images_permission_name, s3);
        h = afkjVar8;
        alog r7 = alog.r("android.permission.READ_MEDIA_IMAGES");
        r7.getClass();
        afkj afkjVar9 = new afkj("FULL_READ_MEDIA_IMAGES", 8, r7, i2);
        i = afkjVar9;
        alog r8 = alog.r("android.permission.READ_MEDIA_VIDEO");
        r8.getClass();
        afkj afkjVar10 = new afkj("FULL_READ_MEDIA_VIDEOS", 9, r8, i3);
        j = afkjVar10;
        afkj[] afkjVarArr = {afkjVar, afkjVar2, afkjVar3, afkjVar4, afkjVar5, afkjVar6, afkjVar7, afkjVar8, afkjVar9, afkjVar10};
        n = afkjVarArr;
        arhi.f(afkjVarArr);
    }

    private afkj(String str, int i2, alog alogVar, int i3, alog alogVar2) {
        this.k = alogVar;
        this.l = i3;
        this.m = alogVar2;
    }

    public static afkj[] values() {
        return (afkj[]) n.clone();
    }

    public /* synthetic */ afkj(String str, int i2, alog alogVar, int i3) {
        this(str, i2, alogVar, i3, alsx.a);
    }
}
