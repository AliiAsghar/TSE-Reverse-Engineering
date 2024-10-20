package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqpg implements aqpf {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;

    static {
        altg altgVar = altg.a;
        a = ahvj.b("7", "SURVEYS", "com.google.android.libraries.surveys", altgVar, true, false);
        b = ahvj.c("9", false, "com.google.android.libraries.surveys", altgVar, true, false);
        c = ahvj.c("6", true, "com.google.android.libraries.surveys", altgVar, true, false);
    }

    @Override // defpackage.aqpf
    public final String a(Context context) {
        return (String) a.a(context);
    }

    @Override // defpackage.aqpf
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.aqpf
    public final boolean c(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }
}
