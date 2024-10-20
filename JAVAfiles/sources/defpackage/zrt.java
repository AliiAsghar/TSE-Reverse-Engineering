package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.apxm;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrt extends zrq implements akkh, apxq, akkf, aklk, akrw {
    private zrw a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);

    @Deprecated
    public zrt() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zrw.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            zrw E = E();
            if (((Optional) E.g.b()).isPresent() && ((kpb) ((Optional) E.g.b()).get()).b()) {
                ((Optional) ((apxx) E.h).a).ifPresent(new zrg(E, 11));
            } else {
                E.d();
            }
            View aM = E.n.aM(layoutInflater, viewGroup, bundle);
            akqj.p();
            return aM;
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

    @Override // defpackage.zrq, defpackage.aiuc, defpackage.cg
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

    @Override // defpackage.zrq
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.zrq, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof zrt) {
                            zrt zrtVar = (zrt) cgVar;
                            Activity activity = (Activity) ((kqm) aS).bh.c.b();
                            krv krvVar = ((kqm) aS).a;
                            apya apyaVar = krvVar.si;
                            apya apyaVar2 = krvVar.a.bF;
                            apya apyaVar3 = krvVar.yF;
                            apya apyaVar4 = krvVar.qV;
                            apya apyaVar5 = krvVar.rQ;
                            apya apyaVar6 = ((kqm) aS).ao;
                            apya apyaVar7 = ((kqm) aS).r;
                            apwt a = apxv.a(((kqm) aS).bh.aa);
                            apya apyaVar8 = ((kqm) aS).ap;
                            krv krvVar2 = ((kqm) aS).a;
                            apya apyaVar9 = krvVar2.ct;
                            krx krxVar = krvVar2.a;
                            try {
                                zrw zrwVar = new zrw(zrtVar, activity, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, apyaVar7, a, apyaVar8, apyaVar9, krxVar.gg, krvVar2.aM, krvVar2.dd, krvVar2.nk, ((kqm) aS).aq, krvVar2.aF, krxVar.gx, krvVar2.rZ);
                                this.a = zrwVar;
                                zrwVar.n = this;
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
                            throw new IllegalStateException(hht.e(cgVar, zrw.class));
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
    public final zrw E() {
        zrw zrwVar = this.a;
        if (zrwVar != null) {
            if (!this.ag) {
                return zrwVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.zrq, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
