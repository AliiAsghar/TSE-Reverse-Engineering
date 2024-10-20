package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqqq implements aqqp {
    public static final ahvf a;
    public static final ahvf b;

    static {
        altg altgVar = altg.a;
        a = ahvj.c("13", false, "com.google.android.libraries.surveys", altgVar, true, false);
        b = ahvj.c("10", true, "com.google.android.libraries.surveys", altgVar, true, false);
    }

    @Override // defpackage.aqqp
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.aqqp
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }
}
