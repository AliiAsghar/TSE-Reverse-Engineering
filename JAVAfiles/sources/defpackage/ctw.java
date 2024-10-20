package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctw extends cvc.a {
    private final cya a;

    public ctw(cya cyaVar) {
        this.a = cyaVar;
    }

    @Override // cvc.a
    public final int a() {
        return this.a.u();
    }

    @Override // cvc.a
    public final cti b() {
        cti G;
        cya cyaVar = this.a;
        if (cyaVar.k) {
            G = null;
        } else {
            G = cyaVar.G();
        }
        if (G == null) {
            cyaVar.I().x.h();
        }
        return G;
    }

    @Override // cvc.a
    public final drk c() {
        return this.a.q();
    }
}
