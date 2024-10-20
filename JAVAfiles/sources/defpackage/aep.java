package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aep extends cga.c implements czp {
    public static final a a = new a();
    private final arqr b;
    private final Object c = a;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
    }

    public aep(arqr arqrVar) {
        this.b = arqrVar;
    }

    public final void a(cti ctiVar) {
        this.b.a(ctiVar);
        aep aepVar = (aep) czq.a(this);
        if (aepVar != null) {
            aepVar.a(ctiVar);
        }
    }

    @Override // defpackage.czp
    public final Object dP() {
        return this.c;
    }
}
