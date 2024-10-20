package defpackage;

import defpackage.bbk;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbh extends cga.c implements ddn, cwm, cwz, bbk.a {
    public bbk a;
    public ayd b;
    public bfb c;
    public final byn d = new byu(null, cav.a);

    public bbh(bbk bbkVar, ayd aydVar, bfb bfbVar) {
        this.a = bbkVar;
        this.b = aydVar;
        this.c = bfbVar;
    }

    @Override // bbk.a
    public final ddz a() {
        return (ddz) cwn.a(this, dch.j);
    }

    @Override // cga.c
    public final void dQ() {
        this.a.j(this);
    }

    @Override // defpackage.cwz
    public final void i(cti ctiVar) {
        this.d.h(ctiVar);
    }

    @Override // cga.c
    public final void s() {
        this.a.l(this);
    }
}
