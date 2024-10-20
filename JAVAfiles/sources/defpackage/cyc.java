package defpackage;

import defpackage.cxt;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cyc extends cya implements cuc {
    private Map f;
    public final cyn g;
    public long h = 0;
    public final ctx n = new ctx(this);
    public final uv o = new uv((byte[]) null);
    private cuf p;

    public cyc(cyn cynVar) {
        this.g = cynVar;
    }

    public final cwf A() {
        cxt.a aVar = this.g.r.x.s;
        aVar.getClass();
        return aVar;
    }

    public final void B(long j) {
        if (!a.bB(this.h, j)) {
            this.h = j;
            cxt.a aVar = I().x.s;
            if (aVar != null) {
                aVar.p();
            }
            Q(this.g);
        }
        if (!this.k) {
            N(H());
        }
    }

    public final void C(cuf cufVar) {
        arnb arnbVar;
        Map map;
        if (cufVar != null) {
            w((cufVar.k() << 32) | (cufVar.j() & 4294967295L));
            arnbVar = arnb.a;
        } else {
            arnbVar = null;
        }
        if (arnbVar == null) {
            w(0L);
        }
        if (!d.F(this.p, cufVar) && cufVar != null && ((((map = this.f) != null && !map.isEmpty()) || !cufVar.m().isEmpty()) && !d.F(cufVar.m(), this.f))) {
            ((cxt.a) A()).q.e();
            Map map2 = this.f;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.f = map2;
            }
            map2.clear();
            map2.putAll(cufVar.m());
        }
        this.p = cufVar;
    }

    public final long D(cyc cycVar) {
        long j = 0;
        cyc cycVar2 = this;
        while (!d.F(cycVar2, cycVar)) {
            boolean z = cycVar2.i;
            j = dre.d(j, cycVar2.h);
            cyn cynVar = cycVar2.g.v;
            cynVar.getClass();
            cycVar2 = cynVar.z();
            cycVar2.getClass();
        }
        return j;
    }

    @Override // defpackage.cya
    public final long F() {
        return this.h;
    }

    @Override // defpackage.cya
    public final cti G() {
        return this.n;
    }

    @Override // defpackage.cya
    public final cuf H() {
        cuf cufVar = this.p;
        if (cufVar != null) {
            return cufVar;
        }
        csg.a("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new armj();
    }

    @Override // defpackage.cya, defpackage.cye
    public final cxn I() {
        return this.g.r;
    }

    @Override // defpackage.cya
    public final cya K() {
        cyn cynVar = this.g.u;
        if (cynVar != null) {
            return cynVar.z();
        }
        return null;
    }

    @Override // defpackage.cya
    public final cya L() {
        cyn cynVar = this.g.v;
        if (cynVar != null) {
            return cynVar.z();
        }
        return null;
    }

    @Override // defpackage.cya
    public final void O() {
        ee(this.h, brg.a, null);
    }

    @Override // defpackage.cya
    public final boolean P() {
        if (this.p != null) {
            return true;
        }
        return false;
    }

    public int a(int i) {
        throw null;
    }

    public int b(int i) {
        throw null;
    }

    public int c(int i) {
        throw null;
    }

    public int d(int i) {
        throw null;
    }

    @Override // defpackage.dqv
    public final float ec() {
        return this.g.ec();
    }

    @Override // defpackage.drc
    public final float ed() {
        return this.g.ed();
    }

    @Override // defpackage.cvc
    protected final void ee(long j, float f, arqr arqrVar) {
        B(j);
        if (this.j) {
            return;
        }
        y();
    }

    @Override // defpackage.cya, defpackage.ctd
    public final boolean ev() {
        return true;
    }

    @Override // defpackage.cvc, defpackage.ctc
    public final Object f() {
        return this.g.f();
    }

    @Override // defpackage.ctd
    public final drk q() {
        return this.g.q();
    }

    protected void y() {
        H().o();
    }

    public final long z() {
        return (this.a << 32) | (this.b & 4294967295L);
    }
}
