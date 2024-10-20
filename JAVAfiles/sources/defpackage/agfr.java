package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfr {
    public static final Duration a;
    public static final long b;
    public final arwe c;
    public final ascd d;
    public arxm e;
    public final ascv f;

    static {
        Duration cd = albo.cd(1);
        a = cd;
        b = arut.i(arsd.p(cd.getSeconds(), aruv.d), arsd.o(cd.getNano(), aruv.a));
    }

    public agfr(arwe arweVar) {
        arweVar.getClass();
        this.c = arweVar;
        ascd a2 = ascy.a(Duration.ZERO);
        this.d = a2;
        this.f = new ascf(a2);
    }

    public final void a() {
        arxm arxmVar = this.e;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.e = null;
    }
}
