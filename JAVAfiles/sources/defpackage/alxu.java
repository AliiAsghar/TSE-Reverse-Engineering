package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alxu {
    private static String a = "alyc";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "alyp";
    private static final String[] d = {"alyc", "com.google.common.flogger.backend.google.GooglePlatform", "alyp"};

    public static int a() {
        return ((alzx) alzx.a.get()).b;
    }

    public static long b() {
        return alxs.a.c();
    }

    public static alww d(String str) {
        return alxs.a.e(str);
    }

    public static alxa f() {
        return i().b();
    }

    public static alxt g() {
        return alxs.a.h();
    }

    public static alyt i() {
        return alxs.a.j();
    }

    public static alzk k() {
        return i().d();
    }

    public static String l() {
        return alxs.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().e(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract alww e(String str);

    protected abstract alxt h();

    protected alyt j() {
        return alzb.a;
    }

    protected abstract String m();
}
