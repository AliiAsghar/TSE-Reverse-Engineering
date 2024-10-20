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
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.widgets.SwatchieIllustrationPreference;
import defpackage.apxm;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfn extends zfg implements akkh, apxq, akkf, aklk, akrw {
    private zfp aj;
    private Context ak;
    private final eno al = new eno(this);
    private final akqf an = new akqf(this);
    private boolean ao;

    @Deprecated
    public zfn() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zfp.class;
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

    @Override // defpackage.zfg, defpackage.aiua, defpackage.cg
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
        zfp E = E();
        zfn zfnVar = (zfn) E.a.b();
        zfnVar.b.f("bugle");
        zfnVar.fR(R.xml.spotlight_preferences);
        SwatchieIllustrationPreference swatchieIllustrationPreference = (SwatchieIllustrationPreference) zfnVar.d().l(zfnVar.S(R.string.spotlights_illustration_pref_key));
        if (swatchieIllustrationPreference != null) {
            swatchieIllustrationPreference.l(ajco.a);
        }
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) zfnVar.d().l(zfnVar.S(R.string.spotlights_enabled_pref_key));
        byte[] bArr = null;
        if (switchPreferenceCompat != null) {
            qjh.l(ene.b(zfnVar), null, new whw(switchPreferenceCompat, E, (arpe) null, 8), 3);
            switchPreferenceCompat.n = new zkr(E, zfnVar, 1, bArr);
        } else {
            switchPreferenceCompat = null;
        }
        E.g = switchPreferenceCompat;
        Preference l = zfnVar.d().l(zfnVar.S(R.string.spotlights_location_pref_key));
        if (l != null) {
            l.o = new lpi(E, 2);
        }
    }

    @Override // defpackage.zfg
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
    public final zfp E() {
        zfp zfpVar = this.aj;
        if (zfpVar != null) {
            if (!this.ao) {
                return zfpVar;
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
        return true;
    }

    @Override // defpackage.zfg, defpackage.cg
    public final void f(Context context) {
        this.an.k();
        try {
            if (!this.ao) {
                super.f(context);
                if (this.aj == null) {
                    try {
                        Object aS = aS();
                        apya apyaVar = ((kqm) aS).W;
                        krv krvVar = ((kqm) aS).a;
                        this.aj = new zfp(apyaVar, krvVar.vE, ((kqm) aS).o, ((kqm) aS).bh.f, krvVar.bU, krvVar.yF, krvVar.au);
                        this.Z.c(new akli(this.an, this.al));
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
            zfp E = E();
            ((akbo) E.c.b()).b(E.h);
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

    @Override // defpackage.zfg, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
