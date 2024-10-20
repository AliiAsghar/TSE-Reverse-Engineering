package defpackage;

import defpackage.apxb;
import defpackage.apxd;
import defpackage.apxi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqk implements apxb.a, apxd.b, apxi.a, apxp {
    private final krv a;
    private apya b;
    private final kqk c;

    public kqk() {
        throw null;
    }

    @Override // apxd.b
    public final apxa a() {
        return (apxa) this.b.b();
    }

    @Override // apxb.a
    public final ktk c() {
        return new ktk(this.a, (Object) this.c);
    }

    public kqk(krv krvVar) {
        this.c = this;
        this.a = krvVar;
        this.b = apxv.c(new krd(1));
    }

    @Override // apxi.a
    public final void b() {
    }
}
