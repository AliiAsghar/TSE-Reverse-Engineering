package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqqn implements aqqm {
    public static final ahvf a;
    public static final ahvf b;

    static {
        altg altgVar = altg.a;
        a = ahvj.c("12", true, "com.google.android.libraries.surveys", altgVar, true, false);
        b = ahvj.c("11", true, "com.google.android.libraries.surveys", altgVar, true, false);
    }

    @Override // defpackage.aqqm
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.aqqm
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }
}
