package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.aklx;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ing extends iob implements akkh, apxq, akkf, aklk, akrw {
    private inh a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);

    @Deprecated
    public ing() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return inh.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            inh E = E();
            View inflate = layoutInflater.inflate(R.layout.inputs_layout, viewGroup, false);
            inflate.setOnApplyWindowInsetsListener(new ivf(1));
            if (!((Boolean) inh.b.e()).booleanValue()) {
                E.e(inflate);
            }
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

    @Override // defpackage.iob, defpackage.aiuc, defpackage.cg
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
    public final inh E() {
        inh inhVar = this.a;
        if (inhVar != null) {
            if (!this.ag) {
                return inhVar;
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
    public final void aa() {
        aksa b = this.c.b();
        try {
            aQ();
            inh E = E();
            ((ink) E.c.b()).g();
            iou iouVar = E.j;
            iouVar.b = null;
            iouVar.a = null;
            if (((Boolean) inh.b.e()).booleanValue()) {
                ipc ipcVar = E.f;
                if (ipcVar != null) {
                    ipcVar.k();
                }
            } else {
                ipc ipcVar2 = E.f;
                ipcVar2.getClass();
                ipcVar2.k();
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
            E().e = false;
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
            inh E = E();
            boolean z = true;
            E.e = true;
            inj injVar = E.g;
            if (injVar != null) {
                ioc iocVar = injVar.b;
                if (((Boolean) ((utz) iocVar.g.get()).e()).booleanValue()) {
                    View view = iocVar.b;
                    int i = 8;
                    if (view != null) {
                        iocVar.h.c(iocVar.c);
                        view.setTranslationY(iocVar.e);
                        if (true == iocVar.d) {
                            i = 0;
                        }
                        view.setVisibility(i);
                        view.setAlpha(iocVar.f);
                        if (iocVar.f != 1.0f) {
                            z = false;
                        }
                        iocVar.c(z);
                    } else {
                        View view2 = iocVar.a;
                        if (view2 != null) {
                            iocVar.h.c(iocVar.c);
                            view2.setTranslationY(iocVar.e);
                            if (true == iocVar.d) {
                                i = 0;
                            }
                            view2.setVisibility(i);
                            view2.setAlpha(iocVar.f);
                        }
                    }
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        ins insVar;
        this.c.k();
        try {
            bf(view, bundle);
            inh E = E();
            if (((Boolean) inh.b.e()).booleanValue()) {
                E.e(view);
            }
            if (bundle != null) {
                if (bundle.containsKey("visible_input_type")) {
                    ins[] values = ins.values();
                    int i = bundle.getInt("visible_input_type");
                    if (i >= 0 && i < values.length && (insVar = values[i]) != ins.IME) {
                        E.i = insVar;
                        inl b = E.b(true);
                        if (b != null) {
                            E.p(b);
                        }
                        inr i2 = ipq.i(insVar);
                        inj injVar = E.g;
                        injVar.getClass();
                        injVar.c(i2);
                    }
                }
                if (E.i == null && ((ink) E.c.b()).e()) {
                    E.r(ins.IME, false, false);
                }
                ipc ipcVar = E.f;
                ipcVar.getClass();
                ipcVar.j(true, new gsh(bundle, 20));
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

    @Override // defpackage.iob
    protected final /* bridge */ /* synthetic */ aklw d() {
        return new akls(this, true);
    }

    @Override // defpackage.iob, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        String g = ((kql) aS).g();
                        cg cgVar = (cg) ((apxx) ((kql) aS).d).a;
                        if (cgVar instanceof ing) {
                            ing ingVar = (ing) cgVar;
                            apya apyaVar = ((kql) aS).aq;
                            apya apyaVar2 = ((kql) aS).ar;
                            apya apyaVar3 = ((kql) aS).el.h;
                            alor m = alor.m(inr.C2O_FRAGMENT, new iom(1), inr.CAMERA_GALLERY_FRAGMENT, new iom(0));
                            krv krvVar = ((kql) aS).a;
                            krx krxVar = krvVar.a;
                            apya apyaVar4 = krxVar.cz;
                            apya apyaVar5 = krvVar.pH;
                            apya apyaVar6 = krxVar.cw;
                            kor korVar = (kor) ((kql) aS).as.b();
                            iou e = ((ips) ((apxq) ((aklj) ((kql) aS).el.f.b()).a).aS()).e();
                            e.getClass();
                            this.a = new inh(g, ingVar, apyaVar, apyaVar2, apyaVar3, m, apyaVar4, apyaVar5, apyaVar6, korVar, e, (ajwt) ((kql) aS).ej.b.b(), ((kql) aS).a.a.ct);
                            this.Z.c(new akli(this.c, this.e));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, inh.class));
                        }
                    } catch (ClassCastException e2) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } finally {
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void g(Bundle bundle) {
        this.c.k();
        try {
            aP(bundle);
            inh E = E();
            E.e = true;
            ink inkVar = (ink) E.c.b();
            inh a = E.a();
            inkVar.g();
            inkVar.c = a;
            inkVar.b.k(a);
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
            inh E = E();
            ins insVar = E.i;
            if (insVar != null) {
                bundle.putInt("visible_input_type", insVar.ordinal());
            }
            ipc ipcVar = E.f;
            if (ipcVar != null) {
                ipcVar.j(false, new ipk(bundle, 1));
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
        inh E = E();
        inj injVar = E.g;
        injVar.getClass();
        injVar.f = inj.a(injVar.a);
        ini iniVar = injVar.g;
        if (iniVar != null) {
            injVar.d(iniVar);
        }
        ipc ipcVar = E.f;
        ipcVar.getClass();
        ipcVar.j(false, gvj.k);
    }

    @Override // defpackage.iob, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
