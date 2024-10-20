package defpackage;

import defpackage.ajt;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bky {
    public final float a;

    public bky(float f) {
        this.a = f;
    }

    public final cas a(boolean z, ajq ajqVar, bwj bwjVar, int i) {
        boolean z2;
        boolean z3;
        float f;
        bwjVar.y(-1763481333);
        bwjVar.y(-734823932);
        float f2 = brg.a;
        if (ajqVar == null) {
            bwk bwkVar = (bwk) bwjVar;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(new dqy(brg.a), cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            bwkVar.Y();
            return bynVar;
        }
        bwk bwkVar2 = (bwk) bwjVar;
        bwkVar2.Y();
        Object T2 = bwkVar2.T();
        if (T2 == bwj.a.a) {
            T2 = new cez();
            bwkVar2.ad(T2);
        }
        cez cezVar = (cez) T2;
        boolean z4 = false;
        if ((((i & 112) ^ 48) > 32 && bwjVar.G(ajqVar)) || (i & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object T3 = bwkVar2.T();
        if (z2 || T3 == bwj.a.a) {
            T3 = new bkw(ajqVar, cezVar, null);
            bwkVar2.ad(T3);
        }
        bxl.g(ajqVar, (arqv) T3, bwjVar);
        ajp ajpVar = (ajp) aqjn.ad(cezVar);
        if (z && !(ajpVar instanceof ajt.b)) {
            if (ajpVar instanceof ajn) {
                f = this.a;
            } else if (!(ajpVar instanceof ajk) && (ajpVar instanceof aji)) {
                f = 6.0f;
            }
            f2 = f;
        }
        Object T4 = bwkVar2.T();
        if (T4 == bwj.a.a) {
            T4 = new zj(new dqy(f2), aci.c, null, 12);
            bwkVar2.ad(T4);
        }
        zj zjVar = (zj) T4;
        dqy dqyVar = new dqy(f2);
        boolean I = bwjVar.I(zjVar) | bwjVar.D(f2);
        if ((((i & 14) ^ 6) > 4 && bwjVar.H(z)) || (i & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = I | z3;
        if ((((i & 896) ^ 384) > 256 && bwjVar.G(this)) || (i & 384) == 256) {
            z4 = true;
        }
        boolean I2 = z5 | z4 | bwjVar.I(ajpVar);
        Object T5 = bwkVar2.T();
        if (I2 || T5 == bwj.a.a) {
            bkx bkxVar = new bkx(zjVar, f2, z, this, ajpVar, null);
            bwkVar2.ad(bkxVar);
            T5 = bkxVar;
        }
        bxl.g(dqyVar, (arqv) T5, bwjVar);
        zt ztVar = zjVar.b;
        bwkVar2.Y();
        return ztVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bky)) {
            return false;
        }
        bky bkyVar = (bky) obj;
        if (dqy.b(brg.a, brg.a) && dqy.b(brg.a, brg.a) && dqy.b(brg.a, brg.a) && dqy.b(this.a, bkyVar.a) && dqy.b(brg.a, brg.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(brg.a) * 31) + Float.floatToIntBits(brg.a)) * 31) + Float.floatToIntBits(brg.a)) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(brg.a);
    }
}
