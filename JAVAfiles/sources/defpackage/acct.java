package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acct {
    public static String a(String str) {
        try {
            Object u = abgj.u("get", new acak(String.class, str), new acak(String.class, ""));
            if (u == null) {
                return "";
            }
            return (String) u;
        } catch (ReflectiveOperationException unused) {
            return "";
        }
    }

    public static int b() {
        try {
            Object u = abgj.u("getInt", new acak(String.class, "ro.boot.flash.locked"), new acak(Integer.TYPE, (Object) (-1)));
            if (u == null) {
                return -1;
            }
            return ((Integer) u).intValue();
        } catch (ReflectiveOperationException unused) {
            return -1;
        }
    }
}
