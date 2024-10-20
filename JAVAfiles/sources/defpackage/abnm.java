package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnm {
    public final Context a;
    public final String b;
    public abns c;
    public final alhr d = new abnl(0);
    public abon e = abon.a;
    public apwa f;
    public String g;
    public ahxe h;

    public abnm(Context context, String str) {
        abhg.m(context);
        this.a = context;
        abhg.k(str);
        this.b = str;
    }

    public final abnr a() {
        return new abnr(this.a, this.b, this.g, this.e, this.f, this.c, null, this.d, this.h);
    }

    public final void b(abon abonVar) {
        abhg.m(abonVar);
        this.e = abonVar;
        abnn.d(abonVar);
    }

    public final void c(apwa apwaVar) {
        abhg.m(apwaVar);
        this.f = apwaVar;
    }
}
