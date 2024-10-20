package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yji {
    private static final String[] A;
    private static final String[] B;
    private static final String[] C;
    private static final String[] D;
    private static final String[] E;
    private static final String[] F;
    public static final String[] a;
    public static final String[] b;
    static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public static final String[] p;
    public static final String[] q;
    public static final alor r;
    private static final String[] s;
    private static final String[] t;
    private static final String[] u;
    private static final String[] v;
    private static final String[] w;
    private static final String[] x;
    private static final String[] y;
    private static final String[] z;

    static {
        String[] strArr;
        String[] strArr2 = {"android.permission.RECORD_AUDIO"};
        a = strArr2;
        String[] strArr3 = {"android.permission.SCHEDULE_EXACT_ALARM"};
        b = strArr3;
        String[] strArr4 = {"android.permission.CAMERA"};
        c = strArr4;
        String[] strArr5 = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        s = strArr5;
        String[] strArr6 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"};
        t = strArr6;
        String[] strArr7 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        u = strArr7;
        if (yhx.h) {
            strArr5 = strArr7;
        } else if (yhx.f) {
            strArr5 = strArr6;
        }
        d = strArr5;
        String[] strArr8 = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        v = strArr8;
        String[] strArr9 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES"};
        w = strArr9;
        String[] strArr10 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        x = strArr10;
        if (yhx.h) {
            strArr8 = strArr10;
        } else if (yhx.f) {
            strArr8 = strArr9;
        }
        e = strArr8;
        String[] strArr11 = (String[]) alzz.V(strArr8, strArr2, String.class);
        y = strArr11;
        String[] strArr12 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_VIDEO", "android.permission.RECORD_AUDIO"};
        z = strArr12;
        String[] strArr13 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_VIDEO", "android.permission.RECORD_AUDIO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        A = strArr13;
        if (yhx.h) {
            strArr11 = strArr13;
        } else if (yhx.f) {
            strArr11 = strArr12;
        }
        f = strArr11;
        String[] strArr14 = {"android.permission.ACCESS_FINE_LOCATION"};
        g = strArr14;
        String[] strArr15 = {"android.permission.READ_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_SMS", "android.permission.RECEIVE_MMS"};
        h = strArr15;
        String[] strArr16 = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
        i = strArr16;
        String[] strArr17 = {"android.permission.READ_PHONE_STATE"};
        j = strArr17;
        alog.r("android.permission.READ_PRIVILEGED_PHONE_STATE");
        String[] strArr18 = {"android.permission.CALL_PHONE"};
        k = strArr18;
        String[] strArr19 = {"android.permission.READ_CALL_LOG"};
        l = strArr19;
        String[] strArr20 = {"android.permission.CALL_PRIVILEGED"};
        m = strArr20;
        String[] strArr21 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        B = strArr21;
        String[] strArr22 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
        C = strArr22;
        String[] strArr23 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        D = strArr23;
        if (yhx.h) {
            strArr22 = strArr23;
        } else if (!yhx.f) {
            strArr22 = strArr21;
        }
        n = strArr22;
        String[] strArr24 = {"android.permission.RECEIVE_WAP_PUSH"};
        o = strArr24;
        String[] strArr25 = (String[]) alzz.V(strArr15, (String[]) alzz.V(strArr17, strArr16, String.class), String.class);
        p = strArr25;
        String[] strArr26 = {"android.permission.POST_NOTIFICATIONS"};
        E = strArr26;
        if (!yhx.f) {
            strArr26 = new String[0];
        }
        F = strArr26;
        if (yhx.e) {
            strArr = new String[]{"android.permission.READ_PHONE_NUMBERS"};
        } else {
            strArr = new String[0];
        }
        q = strArr;
        alok alokVar = new alok();
        alokVar.h(yjh.RECORD_AUDIO_PERMISSIONS, strArr2);
        alokVar.h(yjh.CAMERA_GALLERY_ROLL_PERMISSIONS, strArr5);
        alokVar.h(yjh.CAMERA_IMAGE_PERMISSIONS, strArr8);
        alokVar.h(yjh.CAMERA_VIDEO_PERMISSIONS, strArr11);
        alokVar.h(yjh.STORAGE_PERMISSIONS, strArr22);
        alokVar.h(yjh.LOCATION_PERMISSIONS, strArr14);
        alokVar.h(yjh.CALL_PHONE_PERMISSIONS, strArr18);
        alokVar.h(yjh.MINIMUM_REQUIRED_PERMISSIONS, strArr25);
        alokVar.h(yjh.CAMERA_PERMISSIONS, strArr4);
        alokVar.h(yjh.RECEIVE_WAP_PUSH_PERMISSIONS, strArr24);
        alokVar.h(yjh.CONTACTS_PERMISSIONS, strArr16);
        alokVar.h(yjh.PRIVILEGED_CALL_PERMISSIONS, strArr20);
        alokVar.h(yjh.CALL_LOG_PERMISSIONS, strArr19);
        alokVar.h(yjh.SCHEDULED_SEND_PERMISSIONS, strArr3);
        alokVar.h(yjh.NOTIFICATIONS, strArr26);
        alokVar.h(yjh.READ_PHONE_NUMBERS, strArr);
        r = alokVar.b();
    }
}
