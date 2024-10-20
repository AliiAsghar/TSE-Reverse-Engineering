package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.apxm;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibj extends ibe implements akkh, apxq, akkf, aklk, akrw {
    private ibm aj;
    private Context ak;
    private final eno al = new eno(this);
    private final akqf an = new akqf(this);
    private boolean ao;

    @Deprecated
    public ibj() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return ibm.class;
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

    @Override // defpackage.ibe, defpackage.aiua, defpackage.cg
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
        ibm E = E();
        E.b.b.f("bugle");
        E.b.fR(R.xml.logging_consent_preference);
        ibj ibjVar = E.b;
        Preference a = ibjVar.a(ibjVar.S(R.string.logging_consent_link_to_checkbox_pref_key));
        if (a != null) {
            a.N(false);
            a.L(R.string.device_logging_consent_settings_title);
            a.J(R.string.device_logging_consent_settings_summary);
        }
        ibj ibjVar2 = E.b;
        Preference a2 = ibjVar2.a(ibjVar2.S(R.string.gaia_logging_consent_pref_key));
        if (a2 != null) {
            a2.N(false);
            a2.L(R.string.gaia_logging_consent_setting_title);
            a2.J(R.string.gaia_logging_consent_setting_summary);
        }
        ibj ibjVar3 = E.b;
        Preference a3 = ibjVar3.a(ibjVar3.S(R.string.logging_consent_settings_learn_more_pref_key));
        ibj ibjVar4 = E.b;
        if (a3 != null) {
            a3.N(false);
            a3.M(aabr.ad(ibjVar4.fe(), R.string.logging_consent_pref_inform));
        }
        E.e.a(R.id.logging_consent_subscription_mixin_id, new ibl(E, E.b.y()), new ibk(a, a2, a3, E, E.b));
    }

    @Override // defpackage.ibe
    protected final /* synthetic */ apxh aQ() {
        return new aklt(this);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.ak == null) {
            this.ak = new aklm(this, super.x());
        }
        return this.ak;
    }

    @Override // defpackage.akkh
    /* renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final ibm E() {
        ibm ibmVar = this.aj;
        if (ibmVar != null) {
            if (!this.ao) {
                return ibmVar;
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
        E();
        return false;
    }

    @Override // defpackage.ibe, defpackage.cg
    public final void f(Context context) {
        this.an.k();
        try {
            if (!this.ao) {
                super.f(context);
                if (this.aj == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof ibj) {
                            ibj ibjVar = (ibj) cgVar;
                            krv krvVar = ((kqm) aS).a;
                            this.aj = new ibm(ibjVar, krvVar.BD, krvVar.fS, (akgu) ((kqm) aS).d.b(), (arwe) ((kqm) aS).a.dP.b(), (arwe) ((kqm) aS).e.b());
                            this.Z.c(new akli(this.an, this.al));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, ibm.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                eoz eozVar = this.E;
                if (eozVar instanceof akrw) {
                    akqf akqfVar = this.an;
                    if (akqfVar.a == null) {
                        akqfVar.e(((akrw) eozVar).aW(), true);
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

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void g(Bundle bundle) {
        this.an.k();
        try {
            super.g(bundle);
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

    @Override // defpackage.ibe, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
