package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.apxm;
import defpackage.zly;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlu extends ziy implements akkh, apxq, akkf, aklk, akrw, akwc {
    private zly a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public zlu() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zly.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akfb zlsVar;
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            zly E = E();
            int d = ahnz.d(viewGroup, R.attr.colorOnSurface);
            int d2 = ahnz.d(viewGroup, R.attr.colorPrimaryBackground);
            int d3 = ahnz.d(viewGroup, R.attr.colorOnPrimaryBrandIcon);
            int d4 = ahnz.d(viewGroup, R.attr.colorPrimaryBrandIcon);
            View inflate = layoutInflater.inflate(R.layout.sim_messages_list_v2, viewGroup, false);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(android.R.id.list);
            inflate.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            recyclerView.aj(linearLayoutManager);
            recyclerView.aJ(new mb(inflate.getContext(), linearLayoutManager.k));
            algm algmVar = new algm(new zlv(E, layoutInflater, d4, d3, d2, d));
            xea xeaVar = new xea(2);
            algl alglVar = new algl(xeaVar, algh.a);
            akht akhtVar = new akht();
            int i = 1;
            albo.U(true, "DataDiffer was provided without a StableIdFunction or Equivalence.");
            E.l = new akhu(algmVar, xeaVar, alglVar, akhtVar, new arrt((char[]) null));
            recyclerView.ag(E.l);
            TextView textView = (TextView) inflate.findViewById(R.id.no_sim_message);
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.sim_messages_loading);
            progressBar.getClass();
            progressBar.setVisibility(0);
            aohs aohsVar = (aohs) E.e.b();
            zlt zltVar = (zlt) E.d.b();
            int i2 = E.j;
            if (yhx.d) {
                Uri uri = zlt.a;
                if (i2 != -1) {
                    uri = new Uri.Builder().scheme("content").authority("sms").appendPath("icc_subId").appendPath(String.valueOf(i2)).build();
                }
                ikg ikgVar = new ikg(zltVar, i2, 20);
                zlsVar = new akfk(new akev(zltVar.h, uri, new String[0]), new akez(ikgVar, i), zltVar.e, 1);
            } else {
                zlsVar = new zls(zltVar, i2);
            }
            aohsVar.C(zlsVar, new zlw(E, progressBar, textView));
            if (inflate == null) {
                aabr.aN(this, E());
            }
            akqj.p();
            return inflate;
        } finally {
        }
    }

    @Override // defpackage.cg, defpackage.enm
    public final enh N() {
        return this.e;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void W(Bundle bundle) {
        this.c.k();
        try {
            aN(bundle);
            E().c.am(true);
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

    @Override // defpackage.ziy, defpackage.aiuc, defpackage.cg
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
        if (this.d == null) {
            this.d = new aklm(this, super.x());
        }
        return this.d;
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
    public final void ag(View view, Bundle bundle) {
        this.c.k();
        try {
            aktp.bH(this).a = view;
            E();
            aabr.aN(this, E());
            bf(view, bundle);
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

    @Override // defpackage.ziy
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    @Override // defpackage.ziy, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof zlu) {
                            zlu zluVar = (zlu) cgVar;
                            apya apyaVar = ((kqm) aS).ah;
                            apya apyaVar2 = ((kqm) aS).r;
                            apya apyaVar3 = ((kqm) aS).o;
                            apya apyaVar4 = ((kqm) aS).bh.aG;
                            krv krvVar = ((kqm) aS).a;
                            this.a = new zly(zluVar, apyaVar, apyaVar2, apyaVar3, apyaVar4, krvVar.yF, krvVar.pR, ((kqm) aS).c());
                            this.Z.c(new akli(this.c, this.e));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, zly.class));
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
            zly E = E();
            E.m = -1;
            E.n = new zly.a();
            ((akbo) E.f.b()).b(E.n);
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

    @Override // defpackage.akwc
    public final void o(Class cls, akvz akvzVar) {
        this.ah.l(cls, akvzVar);
    }

    @Override // defpackage.akkh
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final zly E() {
        zly zlyVar = this.a;
        if (zlyVar != null) {
            if (!this.ag) {
                return zlyVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.ziy, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
