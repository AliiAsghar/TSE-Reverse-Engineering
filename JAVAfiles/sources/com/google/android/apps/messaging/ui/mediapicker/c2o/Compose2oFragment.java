package com.google.android.apps.messaging.ui.mediapicker.c2o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import defpackage.aaas;
import defpackage.aajq;
import defpackage.aapa;
import defpackage.aapb;
import defpackage.aapc;
import defpackage.aaph;
import defpackage.aaqk;
import defpackage.abbu;
import defpackage.abdc;
import defpackage.ahmv;
import defpackage.aiut;
import defpackage.akec;
import defpackage.akkf;
import defpackage.akkh;
import defpackage.akli;
import defpackage.aklk;
import defpackage.aklm;
import defpackage.aklt;
import defpackage.akqj;
import defpackage.akrw;
import defpackage.aksa;
import defpackage.akto;
import defpackage.aktr;
import defpackage.apxh;
import defpackage.apxm;
import defpackage.apxq;
import defpackage.apxx;
import defpackage.apya;
import defpackage.aqws;
import defpackage.cg;
import defpackage.d;
import defpackage.enh;
import defpackage.eno;
import defpackage.epj;
import defpackage.hht;
import defpackage.ivf;
import defpackage.iwv;
import defpackage.kqm;
import defpackage.krv;
import defpackage.mbl;
import defpackage.qky;
import defpackage.xnv;
import defpackage.yti;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Compose2oFragment extends aaph implements akkh, apxq, akkf, aklk, akrw {
    public final eno a = new eno(this);
    private boolean ag;
    private aapc d;
    private Context e;

    @Deprecated
    public Compose2oFragment() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aapc.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            aapc E = E();
            E.a = (CoordinatorLayout) layoutInflater.inflate(R.layout.compose2o_grid_view_m2, viewGroup, false);
            E.b = E.a.findViewById(R.id.compose2o_shadow);
            E.e = (ContentGridView) E.a.findViewById(R.id.c2o_content_grid);
            E.e.aL(new aapa(E));
            E.r.x();
            E.e.aj(new ContentGridLayoutManager());
            E.e.aN(E.d);
            E.f();
            Compose2oFragment compose2oFragment = E.r;
            E.x = new aajq(compose2oFragment);
            aapb aapbVar = E.c;
            int i = 8;
            if (aapbVar != null) {
                ContentGridView contentGridView = E.e;
                epj.a(compose2oFragment);
                aapbVar.l(contentGridView);
                E.b();
            } else {
                E.a.setVisibility(8);
                E.j = true;
            }
            E.a.setSystemUiVisibility(1280);
            E.a.setOnApplyWindowInsetsListener(new ivf(11));
            E.e.setOnApplyWindowInsetsListener(new iwv(E, i));
            CoordinatorLayout coordinatorLayout = E.a;
            akqj.p();
            return coordinatorLayout;
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
        return this.a;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        aksa f = this.c.f();
        try {
            aO(i, i2, intent);
            aapc E = E();
            E.w = new aaas(i, i2, intent);
            aapb aapbVar = E.c;
            if (aapbVar == null) {
                E.l = true;
            } else {
                aapbVar.m(E.w);
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

    @Override // defpackage.aaph, defpackage.aiuc, defpackage.cg
    public final void Y(Activity activity) {
        this.c.k();
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

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aapc E() {
        aapc aapcVar = this.d;
        if (aapcVar != null) {
            if (!this.ag) {
                return aapcVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.cg
    public final void aG(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        super.aG(intent);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.e == null) {
            this.e = new aklm(this, super.x());
        }
        return this.e;
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final aktr aW() {
        return this.c.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.c.e(aktrVar, z);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.c.b = aktrVar;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void aa() {
        aksa b = this.c.b();
        try {
            aQ();
            aapc E = E();
            aapb aapbVar = E.c;
            if (aapbVar == null) {
                E.q = true;
            } else {
                E.q = false;
                aapbVar.d();
            }
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ad() {
        this.c.k();
        try {
            ba();
            aapc E = E();
            aapb aapbVar = E.c;
            if (aapbVar == null) {
                E.q = true;
            } else {
                E.q = false;
                aapbVar.f();
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void af() {
        aksa b = this.c.b();
        try {
            bb();
            aapc E = E();
            E.q = false;
            aapb aapbVar = E.c;
            int i = 1;
            if (aapbVar == null) {
                E.p = true;
                E.k = true;
            } else {
                E.p = false;
                aapbVar.g();
                if (((Boolean) E.v.b()).booleanValue()) {
                    aapb aapbVar2 = E.c;
                    aapbVar2.getClass();
                    aiut.e(new aaqk(aapbVar2, i));
                } else {
                    E.c.k();
                }
            }
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

    @Override // defpackage.aaph
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.aaph, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.d == null) {
                    try {
                        Object aS = aS();
                        Optional empty = Optional.empty();
                        Optional optional = (Optional) ((kqm) aS).a.a.cv.b();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof Compose2oFragment) {
                            Compose2oFragment compose2oFragment = (Compose2oFragment) cgVar;
                            mbl mblVar = (mbl) ((kqm) aS).a.bB.b();
                            ahmv ahmvVar = (ahmv) ((kqm) aS).aI.b();
                            krv krvVar = ((kqm) aS).a;
                            apya apyaVar = krvVar.a.cs;
                            yti ytiVar = (yti) krvVar.oX.b();
                            abdc abdcVar = (abdc) ((kqm) aS).a.a.cX.b();
                            this.d = new aapc(empty, optional, compose2oFragment, mblVar, ahmvVar, apyaVar, ytiVar, abdcVar, (qky) ((kqm) aS).a.a.cL.b(), (xnv) ((kqm) aS).a.bV.b(), (aqws) ((kqm) aS).bh.k.b(), (abbu) ((kqm) aS).a.yF.b(), ((kqm) aS).a.a.cw);
                            this.Z.c(new akli(this.c, this.a));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, aapc.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void g(Bundle bundle) {
        this.c.k();
        try {
            aP(bundle);
            aapc E = E();
            E.q = false;
            aapb aapbVar = E.c;
            if (aapbVar != null && E.e != null) {
                E.m = false;
                aapbVar.c(bundle);
                akqj.p();
            }
            E.m = true;
            E.n = bundle;
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
        this.c.k();
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

    @Override // defpackage.aiuc, defpackage.cg
    public final void i() {
        aksa a = this.c.a();
        try {
            aV();
            this.ag = true;
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void j(Bundle bundle) {
        this.c.k();
        try {
            bc(bundle);
            aapb aapbVar = E().c;
            if (aapbVar != null) {
                aapbVar.h(bundle);
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void k() {
        this.c.k();
        try {
            bd();
            aapc E = E();
            E.q = false;
            aapb aapbVar = E.c;
            if (aapbVar == null) {
                E.o = true;
            } else {
                E.o = false;
                aapbVar.i();
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void l() {
        this.c.k();
        try {
            be();
            aapc E = E();
            aapb aapbVar = E.c;
            if (aapbVar == null) {
                E.q = true;
            } else {
                E.q = false;
                aapbVar.j();
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

    @Override // defpackage.aiuc, defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aapc E = E();
        if ((E.i && configuration.orientation == 1) || (!E.i && configuration.orientation == 2)) {
            E.f();
        }
        aapb aapbVar = E.c;
        if (aapbVar != null) {
            aapbVar.b(configuration);
        }
    }

    @Override // defpackage.aiuc, defpackage.cg, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        aapb aapbVar = E().c;
        if (aapbVar != null) {
            aapbVar.e();
        }
    }

    @Override // defpackage.aaph, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
