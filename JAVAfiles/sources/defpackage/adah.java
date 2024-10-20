package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adah {
    static final acyz a = aczd.a(182478066);
    public static final ContentType b;
    public static final String c;
    public static final ContentType d;
    public static final String e;
    public static final ContentType f;
    public static final ContentType g;
    public static final ContentType h;
    public static final ContentType i;

    static {
        aoad g2 = ContentType.g();
        g2.C("application");
        g2.B("vnd.google.rcs.encrypted");
        ContentType y = g2.y();
        b = y;
        c = y.toString();
        aoad g3 = ContentType.g();
        g3.C("application");
        g3.B("vnd.google.rcs.ftd");
        ContentType y2 = g3.y();
        d = y2;
        e = y2.toString();
        aoad g4 = ContentType.g();
        g4.C("application");
        g4.B("vnd.google.rcs.success");
        f = g4.y();
        aoad g5 = ContentType.g();
        g5.C("video");
        g5.B("aliasing");
        g = g5.y();
        aoad g6 = ContentType.g();
        g6.C("video");
        g6.B("key-frame-request");
        h = g6.y();
        aoad g7 = ContentType.g();
        g7.C("video");
        g7.B("ok");
        i = g7.y();
    }

    public static boolean a(ContentType contentType) {
        if (((Boolean) a.a()).booleanValue()) {
            if (!b.e(contentType) && !g.e(contentType)) {
                return false;
            }
            return true;
        }
        return b(contentType.toString());
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        if (((Boolean) a.a()).booleanValue()) {
            try {
                return a(ContentType.d(str));
            } catch (IllegalArgumentException unused) {
                advr.q("Failed to parse MIME type: %s", str);
                return false;
            }
        }
        if (!c.equals(str) && !"video/aliasing".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean c(ContentType contentType) {
        if (((Boolean) a.a()).booleanValue()) {
            if (!d.e(contentType) && !h.e(contentType)) {
                return false;
            }
            return true;
        }
        return d(contentType.toString());
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        if (((Boolean) a.a()).booleanValue()) {
            try {
                return c(ContentType.d(str));
            } catch (IllegalArgumentException unused) {
                advr.q("Failed to parse MIME type: %s", str);
                return false;
            }
        }
        if (!e.equals(str) && !"video/key-frame-request".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean e(ContentType contentType) {
        if (((Boolean) a.a()).booleanValue()) {
            if (!f.e(contentType) && !i.e(contentType)) {
                return false;
            }
            return true;
        }
        return f(contentType.toString());
    }

    public static boolean f(String str) {
        if (str == null) {
            return false;
        }
        if (((Boolean) a.a()).booleanValue()) {
            try {
                return e(ContentType.d(str));
            } catch (IllegalArgumentException unused) {
                advr.q("Failed to parse MIME type: %s", str);
                return false;
            }
        }
        if (!"video/ok".equals(str) && !"application/vnd.google.rcs.success".equals(str)) {
            return false;
        }
        return true;
    }
}
