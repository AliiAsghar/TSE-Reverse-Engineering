package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avm extends cga.c {
    private avj a;

    public avm(avj avjVar) {
        this.a = avjVar;
    }

    private final void b() {
        avj avjVar = this.a;
        if (avjVar instanceof avk) {
            avjVar.getClass();
            ((avk) avjVar).a.m(this);
        }
    }

    public final void a(avj avjVar) {
        b();
        if (avjVar instanceof avk) {
            ((avk) avjVar).a.n(this);
        }
        this.a = avjVar;
    }

    @Override // cga.c
    public final boolean dL() {
        return false;
    }

    @Override // cga.c
    public final void dQ() {
        a(this.a);
    }

    @Override // cga.c
    public final void s() {
        b();
    }
}
