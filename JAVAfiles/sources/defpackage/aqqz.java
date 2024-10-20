package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqqz implements aqqy {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;
    public static final ahvf d;

    static {
        altg altgVar = altg.a;
        a = ahvj.b("20", "com.google.android.surveys.testapp,com.google.android.tvrecommendations,com.google.android.apps.tv.launcherx", "com.google.android.libraries.surveys", altgVar, true, false);
        b = ahvj.c("18", false, "com.google.android.libraries.surveys", altgVar, true, false);
        c = ahvj.c("22", true, "com.google.android.libraries.surveys", altgVar, true, false);
        d = ahvj.c("21", false, "com.google.android.libraries.surveys", altgVar, true, false);
    }

    @Override // defpackage.aqqy
    public final String a(Context context) {
        return (String) a.a(context);
    }

    @Override // defpackage.aqqy
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.aqqy
    public final boolean c(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }

    @Override // defpackage.aqqy
    public final boolean d(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }
}
