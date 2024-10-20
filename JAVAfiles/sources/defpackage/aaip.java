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
public final class aaip extends aaif implements akkh, apxq, akkf, aklk, akrw {
    private aair b;
    private Context c;
    private final eno d = new eno(this);
    private boolean e;

    @Deprecated
    public aaip() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aair.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [akgh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a.k();
        try {
            q(layoutInflater, viewGroup, bundle);
            aair E = E();
            layoutInflater.getClass();
            if (((Optional) E.c.b()).isPresent() && ((kpb) ((Optional) E.c.b()).get()).b() && ((Optional) ((apxx) E.f).a).isPresent()) {
                ((aohs) E.a.b()).C(new akfk((ansy) E.g.b(), new aaiq((kpd) ((Optional) ((apxx) E.f).a).get(), 0), "ditto_satellite_mode_key", 2), E.h);
            } else {
                E.b();
            }
            akqj.p();
            return null;
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
        return this.d;
    }

    @Override // defpackage.aaif, defpackage.cg
    public final void Y(Activity activity) {
        this.a.k();
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
        if (this.c == null) {
            this.c = new aklm(this, super.x());
        }
        return this.c;
    }

    @Override // defpackage.akle, defpackage.akrw
    public final aktr aW() {
        return this.a.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.akle, defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.a.e(aktrVar, z);
    }

    @Override // defpackage.akle, defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.a.b = aktrVar;
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

    @Override // defpackage.aaif
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.aaif, defpackage.akle, defpackage.cg
    public final void f(Context context) {
        this.a.k();
        try {
            if (!this.e) {
                super.f(context);
                if (this.b == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof aaip) {
                            aaip aaipVar = (aaip) cgVar;
                            apya apyaVar = ((kqm) aS).r;
                            apwt a = apxv.a(((kqm) aS).bh.aa);
                            apya apyaVar2 = ((kqm) aS).aF;
                            krv krvVar = ((kqm) aS).a;
                            this.b = new aair(aaipVar, apyaVar, a, apyaVar2, krvVar.a.bF, ((kqm) aS).ap, krvVar.ct);
                            this.Z.c(new akli(this.a, this.d));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, aair.class));
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

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.a.k();
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

    @Override // defpackage.cg
    public final void i() {
        aksa a = this.a.a();
        try {
            p();
            this.e = true;
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
    public final aair E() {
        aair aairVar = this.b;
        if (aairVar != null) {
            if (!this.e) {
                return aairVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.aaif, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
