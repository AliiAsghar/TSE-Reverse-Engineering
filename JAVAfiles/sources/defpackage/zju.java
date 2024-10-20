package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import defpackage.aklx;
import defpackage.zjx;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zju extends znb implements akkh, apxq, akkf, aklk, akrw, akwc {
    private zjx aj;
    private Context ak;
    private boolean ao;
    private final eno al = new eno(this);
    private final akqf an = new akqf(this);
    private final akmy ap = new akmy((byte[]) null);

    @Deprecated
    public zju() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zjx.class;
    }

    @Override // defpackage.aiua, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
        try {
            View K = super.K(layoutInflater, viewGroup, bundle);
            if (K == null) {
                aabr.aO(this, E());
            }
            akqj.p();
            return K;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg, defpackage.enm
    public final enh N() {
        return this.al;
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void W(Bundle bundle) {
        this.an.k();
        try {
            super.W(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        aksa f = this.an.f();
        try {
            super.X(i, i2, intent);
            E().ah.X(i, i2, intent);
            throw null;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.znb, defpackage.aiua, defpackage.cg
    public final void Y(Activity activity) {
        this.an.k();
        try {
            super.Y(activity);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.cg
    public final boolean aC(MenuItem menuItem) {
        aksa j = this.an.j();
        try {
            boolean aC = super.aC(menuItem);
            j.close();
            return aC;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void aG(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        super.aG(intent);
    }

    @Override // defpackage.cg
    public final void aH(int i, int i2) {
        this.an.h(i, i2);
        akqj.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03bd  */
    @Override // defpackage.gfl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aN(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zju.aN(android.os.Bundle):void");
    }

    @Override // defpackage.akkh
    /* renamed from: aP, reason: merged with bridge method [inline-methods] */
    public final zjx E() {
        zjx zjxVar = this.aj;
        if (zjxVar != null) {
            if (!this.ao) {
                return zjxVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.znb
    protected final /* bridge */ /* synthetic */ aklw aQ() {
        return new akls(this, true);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.ak == null) {
            this.ak = new aklm(this, super.x());
        }
        return this.ak;
    }

    @Override // defpackage.akrw
    public final aktr aW() {
        return this.an.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.an.e(aktrVar, z);
    }

    @Override // defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.an.b = aktrVar;
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void aa() {
        aksa b = this.an.b();
        try {
            super.aa();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void ad() {
        this.an.k();
        try {
            super.ad();
            zjx E = E();
            E.ah.d().q().unregisterOnSharedPreferenceChangeListener(E);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void af() {
        aksa b = this.an.b();
        try {
            super.af();
            zjx E = E();
            E.ah.d().q().registerOnSharedPreferenceChangeListener(E);
            E.f();
            E.d();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lzh, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.an.k();
        try {
            aktp.bH(this).a = view;
            E();
            aabr.aO(this, E());
            super.ag(view, bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void ak(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        albo.U(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ak(bundle);
    }

    @Override // defpackage.cg
    public final void ar(boolean z) {
        d.H(z);
    }

    @Override // defpackage.cg
    public final void au(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        aG(intent);
    }

    @Override // defpackage.lzh
    protected final boolean ba() {
        return true;
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ap.k(akvvVar);
    }

    @Override // defpackage.znb, defpackage.cg
    public final void f(Context context) {
        zju zjuVar = this;
        zjuVar.an.k();
        try {
            if (!zjuVar.ao) {
                super.f(context);
                if (zjuVar.aj == null) {
                    try {
                        Object aS = aS();
                        Optional optional = (Optional) ((apxx) ((kql) aS).a.zl).a;
                        Optional empty = Optional.empty();
                        mbl mblVar = (mbl) ((kql) aS).a.bB.b();
                        xcd xcdVar = (xcd) ((kql) aS).a.vt.b();
                        rft rftVar = (rft) ((kql) aS).a.iR.b();
                        zfh zfhVar = (zfh) ((kql) aS).a.pf.b();
                        xbf xbfVar = (xbf) ((kql) aS).a.hA.b();
                        yjy yjyVar = (yjy) ((kql) aS).a.aF.b();
                        yjr yjrVar = (yjr) ((kql) aS).a.bO.b();
                        zxy zxyVar = (zxy) ((kql) aS).a.gK.b();
                        anen anenVar = (anen) ((kql) aS).a.z.b();
                        lzv lzvVar = (lzv) ((kql) aS).a.yJ.b();
                        zas zasVar = (zas) ((kql) aS).dX.b();
                        kqh kqhVar = ((kql) aS).el;
                        apya apyaVar = kqhVar.k;
                        try {
                            krv krvVar = ((kql) aS).a;
                            zlc zlcVar = new zlc(krvVar.gK, krvVar.hA, kqhVar.e, krvVar.hB);
                            zbl zblVar = new zbl((zfh) ((kql) aS).a.pf.b(), (ansy) ((kql) aS).a.ct.b(), (yjy) ((kql) aS).a.aF.b(), (anen) ((kql) aS).a.z.b(), (xnv) ((kql) aS).a.bV.b());
                            aohs aohsVar = (aohs) ((kql) aS).s.b();
                            akbo akboVar = (akbo) ((kql) aS).e.b();
                            zbl zblVar2 = (zbl) ((kql) aS).a.hB.b();
                            akvf akvfVar = (akvf) ((kql) aS).dJ.b();
                            apya apyaVar2 = ((kql) aS).ej.d;
                            abbu abbuVar = (abbu) ((kql) aS).a.yF.b();
                            ahiy ahiyVar = (ahiy) ((kql) aS).a.aC.b();
                            Optional empty2 = Optional.empty();
                            Optional optional2 = (Optional) ((kql) aS).el.F.b();
                            krv krvVar2 = ((kql) aS).a;
                            apya apyaVar3 = krvVar2.ee;
                            apya apyaVar4 = krvVar2.kI;
                            apya apyaVar5 = ((kql) aS).dY;
                            apya apyaVar6 = ((kql) aS).cU;
                            Optional empty3 = Optional.empty();
                            krv krvVar3 = ((kql) aS).a;
                            apya apyaVar7 = krvVar3.de;
                            apya apyaVar8 = krvVar3.gQ;
                            Optional empty4 = Optional.empty();
                            qif qifVar = (qif) ((kql) aS).a.on.b();
                            adtn adtnVar = (adtn) ((kql) aS).a.aB.b();
                            krv krvVar4 = ((kql) aS).a;
                            ihr ihrVar = new ihr(qifVar, adtnVar, krvVar4.de, (ansy) krvVar4.ct.b(), (xnv) ((kql) aS).a.bV.b(), ((kql) aS).a.G(), (anen) ((kql) aS).a.m.b(), (anen) ((kql) aS).a.z.b());
                            krv krvVar5 = ((kql) aS).a;
                            oat aw = krvVar5.aw();
                            apya apyaVar9 = krvVar5.dd;
                            ajwt ajwtVar = (ajwt) ((kql) aS).ej.b.b();
                            cg cgVar = (cg) ((apxx) ((kql) aS).d).a;
                            if (cgVar instanceof zju) {
                                zju zjuVar2 = (zju) cgVar;
                                qyo qyoVar = (qyo) ((kql) aS).a.a.b.b();
                                krv krvVar6 = ((kql) aS).a;
                                zjx zjxVar = new zjx(optional, empty, mblVar, xcdVar, rftVar, zfhVar, xbfVar, yjyVar, yjrVar, zxyVar, anenVar, lzvVar, zasVar, apyaVar, zlcVar, zblVar, aohsVar, akboVar, zblVar2, akvfVar, apyaVar2, abbuVar, ahiyVar, empty2, optional2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, empty3, apyaVar7, apyaVar8, empty4, ihrVar, aw, apyaVar9, ajwtVar, zjuVar2, qyoVar, krvVar6.dq, krvVar6.a.ev, ((kql) aS).ea);
                                zjuVar = this;
                                zjuVar.aj = zjxVar;
                                zjuVar.Z.c(new akli(zjuVar.an, zjuVar.al));
                            } else {
                                throw new IllegalStateException(hht.e(cgVar, zjx.class));
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                akqj.p();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                eoz eozVar = zjuVar.E;
                if (eozVar instanceof akrw) {
                    akqf akqfVar = zjuVar.an;
                    if (akqfVar.a == null) {
                        akqfVar.e(((akrw) eozVar).aW(), true);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void g(Bundle bundle) {
        this.an.k();
        try {
            super.g(bundle);
            zjx E = E();
            E.w = new zjx.c();
            E.x = new zjx.a();
            E.ad = new zjx.h();
            E.ae = new zjx.d();
            E.P.b(E.w);
            E.P.b(E.x);
            E.P.b(E.ad);
            E.P.b(E.ae);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.an.k();
        try {
            LayoutInflater aD = aD();
            LayoutInflater cloneInContext = aD.cloneInContext(new aklx.a(aD, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new aklm(this, cloneInContext));
            akqj.p();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void h() {
        aksa b = this.an.b();
        try {
            super.h();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void i() {
        aksa a = this.an.a();
        try {
            super.i();
            this.ao = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void j(Bundle bundle) {
        this.an.k();
        try {
            super.j(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void k() {
        this.an.k();
        try {
            super.k();
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void l() {
        this.an.k();
        try {
            super.l();
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akwc
    public final void o(Class cls, akvz akvzVar) {
        this.ap.l(cls, akvzVar);
    }

    @Override // defpackage.znb, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
