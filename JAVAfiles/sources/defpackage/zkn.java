package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.apxm;
import defpackage.zkv;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkn extends zit implements akkh, apxq, akkf, aklk, akrw {
    private zkv ak;
    private Context al;
    private boolean ao;
    public final eno aj = new eno(this);
    private final akqf an = new akqf(this);

    @Deprecated
    public zkn() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zkv.class;
    }

    @Override // defpackage.aiua, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
        try {
            View K = super.K(layoutInflater, viewGroup, bundle);
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
        return this.aj;
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
            zkv E = E();
            if (i == 1038) {
                if (i2 == -1) {
                    E.j(wiz.TOGGLE_STATE_ENABLED);
                    E.i();
                    E.k();
                    if (((pml) E.Z.b()).a()) {
                        ((wih) E.R.b()).k();
                    } else {
                        ((ahiy) E.H.b()).q(aktp.ag(null), ((wih) E.R.b()).d().a());
                    }
                }
            } else if (i == 201) {
                aaxz aaxzVar = E.h;
                cj fe = E.q.fe();
                fe.getClass();
                aaxzVar.s(fe, i2);
                if (i2 == -1) {
                    E.j(wiz.TOGGLE_STATE_ENABLED);
                    E.i();
                    E.k();
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.zit, defpackage.aiua, defpackage.cg
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

    @Override // defpackage.gfl
    public final void aN(Bundle bundle) {
        zkv E = E();
        cj fe = E.q.fe();
        if (fe != null && ((zas) E.w.b()).g(fe)) {
            return;
        }
        ((aohs) E.B.b()).C(((qif) E.A.b()).b(), E.ae);
        E.O.c(bundle);
        E.P.c(bundle);
        E.h = ((aaya) E.y.b()).a(amlx.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST, 2);
        E.d();
    }

    @Override // defpackage.zit
    protected final /* synthetic */ apxh aQ() {
        return new aklt(this);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.al == null) {
            this.al = new aklm(this, super.x());
        }
        return this.al;
    }

    @Override // defpackage.akkh
    /* renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final zkv E() {
        zkv zkvVar = this.ak;
        if (zkvVar != null) {
            if (!this.ao) {
                return zkvVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
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
            zkv E = E();
            if (!((pml) E.Z.b()).a()) {
                ((vrn) ((xyt) E.u.b()).a()).l(E);
            }
            SharedPreferences q = E.q.d().q();
            q.getClass();
            q.unregisterOnSharedPreferenceChangeListener(E);
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (defpackage.zkv.m(((defpackage.vrn) ((defpackage.xyt) r1.u.b()).a()).d()) != false) goto L13;
     */
    @Override // defpackage.aiua, defpackage.cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void af() {
        /*
            r3 = this;
            akqf r0 = r3.an
            aksa r0 = r0.b()
            super.af()     // Catch: java.lang.Throwable -> L6d
            zkv r1 = r3.E()     // Catch: java.lang.Throwable -> L6d
            armf r2 = r1.Z     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L6d
            pml r2 = (defpackage.pml) r2     // Catch: java.lang.Throwable -> L6d
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L2c
            armf r2 = r1.u     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L6d
            xyt r2 = (defpackage.xyt) r2     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L6d
            vrn r2 = (defpackage.vrn) r2     // Catch: java.lang.Throwable -> L6d
            r2.h(r1)     // Catch: java.lang.Throwable -> L6d
        L2c:
            armf r2 = r1.S     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L6d
            okr r2 = (defpackage.okr) r2     // Catch: java.lang.Throwable -> L6d
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L41
            boolean r2 = r1.l()     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L69
            goto L59
        L41:
            armf r2 = r1.u     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L6d
            xyt r2 = (defpackage.xyt) r2     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L6d
            vrn r2 = (defpackage.vrn) r2     // Catch: java.lang.Throwable -> L6d
            amwt r2 = r2.d()     // Catch: java.lang.Throwable -> L6d
            boolean r2 = defpackage.zkv.m(r2)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L69
        L59:
            zkn r2 = r1.q     // Catch: java.lang.Throwable -> L6d
            androidx.preference.PreferenceScreen r2 = r2.d()     // Catch: java.lang.Throwable -> L6d
            android.content.SharedPreferences r2 = r2.q()     // Catch: java.lang.Throwable -> L6d
            r2.getClass()     // Catch: java.lang.Throwable -> L6d
            r2.registerOnSharedPreferenceChangeListener(r1)     // Catch: java.lang.Throwable -> L6d
        L69:
            r0.close()
            return
        L6d:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L72
            goto L76
        L72:
            r0 = move-exception
            r1.addSuppressed(r0)
        L76:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkn.af():void");
    }

    @Override // defpackage.lzh, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.an.k();
        try {
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

    @Override // defpackage.zit, defpackage.cg
    public final void f(Context context) {
        zkn zknVar = this;
        zknVar.an.k();
        try {
            if (!zknVar.ao) {
                super.f(context);
                if (zknVar.ak == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof zkn) {
                            zkn zknVar2 = (zkn) cgVar;
                            krv krvVar = ((kqm) aS).a;
                            apya apyaVar = krvVar.dt;
                            apya apyaVar2 = krvVar.cE;
                            apya apyaVar3 = krvVar.bO;
                            apya apyaVar4 = krvVar.lt;
                            apya apyaVar5 = krvVar.je;
                            apya apyaVar6 = krvVar.yJ;
                            krx krxVar = krvVar.a;
                            try {
                                zknVar = this;
                                zknVar.ak = new zkv(zknVar2, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, krxVar.fP, krvVar.gY, krvVar.bB, ((kqm) aS).bh.d, ((kqm) aS).Z, krvVar.av, ((kqm) aS).Y, ((kqm) aS).aa, krvVar.on, ((kqm) aS).r, ((kqm) aS).d, ((kqm) aS).ab, ((kqm) aS).ac, krvVar.at, krvVar.zl, krvVar.gL, krvVar.aB, ((kqm) aS).o, krvVar.aC, krvVar.td, ((kqm) aS).ad, ((kqm) aS).R, krxVar.b, ((kqm) aS).ae, ((kqm) aS).af, ((kqm) aS).ag, krvVar.hr, krvVar.gb, krvVar.fY, krxVar.gu, krvVar.bV, krvVar.sR, krvVar.sZ, krxVar.x, krxVar.w, krxVar.gv, krvVar.hs, krvVar.ht, krvVar.aM, krxVar.gw, krxVar.gs, krvVar.hp);
                                zknVar.Z.c(new akli(zknVar.an, zknVar.aj));
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
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, zkv.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                eoz eozVar = zknVar.E;
                if (eozVar instanceof akrw) {
                    akqf akqfVar = zknVar.an;
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
        akgr d;
        this.an.k();
        try {
            super.g(bundle);
            zkv E = E();
            ((akgu) E.C.b()).a(R.id.rcs_default_on_consent_subscription_id, new wiq((aayd) E.N.b(), 2), new isj(E, 9));
            akgu akguVar = (akgu) E.C.b();
            if (((pml) E.Z.b()).a()) {
                d = ((wih) E.R.b()).e(E.q.aj);
            } else {
                d = ((wih) E.R.b()).d();
            }
            akguVar.a(R.id.rcs_settings_subscription_id, d, E.ab);
            ((akbo) E.G.b()).b(E.af);
            E.L = new zkv.a();
            ((akbo) E.G.b()).b(E.L);
            ((akbo) E.G.b()).b(E.ac);
            ((akbo) E.G.b()).b(E.ad);
            ((akbo) E.G.b()).b(E.ag);
            if (((orb) E.V.b()).a()) {
                E.ah = E.q.M(new sl(), new yjk(E, 3));
            }
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
            LayoutInflater cloneInContext = aD.cloneInContext(new apxm.a(aD, this));
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
            zkv E = E();
            E.O.a(bundle);
            E.P.a(bundle);
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

    @Override // defpackage.zit, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
