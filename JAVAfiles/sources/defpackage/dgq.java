package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgq extends cga.c implements czk {
    public boolean a;
    public arqr b;
    private final boolean c;

    public dgq(boolean z, boolean z2, arqr arqrVar) {
        this.a = z;
        this.c = z2;
        this.b = arqrVar;
    }

    @Override // defpackage.czk
    public final void dM(dho dhoVar) {
        this.b.a(dhoVar);
    }

    @Override // defpackage.czk
    public final boolean dY() {
        return this.c;
    }

    @Override // defpackage.czk
    public final boolean dZ() {
        return this.a;
    }
}
