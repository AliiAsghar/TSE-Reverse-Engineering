package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.apxm;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadt extends aadp implements akkh, apxq, akkf, aklk, akrw {
    private aadu a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);

    @Deprecated
    public aadt() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aadu.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aadu E = E();
            layoutInflater.getClass();
            ((alwl) aadu.a.g()).q("Attempted to launch RbmDeepLinkFragment.");
            View inflate = layoutInflater.inflate(R.layout.rbm_open_deep_link_fragment, viewGroup, false);
            Object b = E.c.b();
            b.getClass();
            qjh.l((arwe) b, null, new aanv(E, (arpe) null, 1), 3);
            akqj.p();
            return inflate;
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
        return this.e;
    }

    @Override // defpackage.aadp, defpackage.aiuc, defpackage.cg
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

    @Override // defpackage.aadp
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.aadp, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            try {
                if (!this.ag) {
                    super.f(context);
                    if (this.a == null) {
                        try {
                            Object aS = aS();
                            Activity activity = (Activity) ((kqm) aS).bh.c.b();
                            cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                            if (cgVar instanceof aadt) {
                                aadt aadtVar = (aadt) cgVar;
                                apya apyaVar = ((kqm) aS).e;
                                krv krvVar = ((kqm) aS).a;
                                apya apyaVar2 = krvVar.nk;
                                apya apyaVar3 = krvVar.dd;
                                apya apyaVar4 = krvVar.mZ;
                                apya apyaVar5 = krvVar.si;
                                krx krxVar = krvVar.a;
                                try {
                                    aadu aaduVar = new aadu(activity, aadtVar, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, krxVar.bF, krvVar.iL, krvVar.qV, krvVar.sv, ((kqm) aS).r, ((kqm) aS).az, krxVar.gF, krxVar.gh, krxVar.gg, krvVar.rZ, krvVar.su);
                                    this.a = aaduVar;
                                    aaduVar.n = this;
                                    this.Z.c(new akli(this.c, this.e));
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
                                throw new IllegalStateException(hht.e(cgVar, aadu.class));
                            }
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                        }
                    }
                    akqj.p();
                    return;
                }
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
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

    @Override // defpackage.akkh
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final aadu E() {
        aadu aaduVar = this.a;
        if (aaduVar != null) {
            if (!this.ag) {
                return aaduVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.aadp, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
