package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gfl extends cg implements gft, gfr, gfs, gep {
    public final gfh a = new gfh(this);
    public int ag = R.layout.preference_list_fragment;
    public final Handler ah = new gfg(this, Looper.getMainLooper());
    public final Runnable ai = new fyk(this, 9, null);
    public gfu b;
    public RecyclerView c;
    public boolean d;
    public boolean e;

    @Override // defpackage.gep
    public final Preference a(CharSequence charSequence) {
        gfu gfuVar = this.b;
        if (gfuVar == null) {
            return null;
        }
        return gfuVar.d(charSequence);
    }

    @Override // defpackage.gft
    public boolean aM(Preference preference) {
        boolean z = false;
        if (preference.u == null) {
            return false;
        }
        for (cg cgVar = this; !z && cgVar != null; cgVar = cgVar.E) {
            if (cgVar instanceof gfj) {
                z = ((gfj) cgVar).a();
            }
        }
        if (!z && (x() instanceof gfj)) {
            z = ((gfj) x()).a();
        }
        if (!z) {
            if (!(fe() instanceof gfj) || !((gfj) fe()).a()) {
                Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                da H = H();
                Bundle r = preference.r();
                cm i = H.i();
                F().getClassLoader();
                cg b = i.b(preference.u);
                b.ak(r);
                b.aF(this);
                bd bdVar = new bd(H);
                bdVar.z(((View) L().getParent()).getId(), b);
                bdVar.t(null);
                bdVar.i();
                return true;
            }
            return true;
        }
        return true;
    }

    public abstract void aN(Bundle bundle);

    @Override // defpackage.gfs
    public final void aO() {
        boolean z = false;
        for (cg cgVar = this; !z && cgVar != null; cgVar = cgVar.E) {
            if (cgVar instanceof gfk) {
                z = ((gfk) cgVar).a();
            }
        }
        if (!z && (x() instanceof gfk)) {
            z = ((gfk) x()).a();
        }
        if (!z && (fe() instanceof gfk)) {
            ((gfk) fe()).a();
        }
    }

    public final PreferenceScreen d() {
        gfu gfuVar = this.b;
        if (gfuVar == null) {
            return null;
        }
        return gfuVar.b;
    }

    public final void fR(int i) {
        q();
        r(this.b.e(y(), i, d()));
    }

    public final void fS() {
        PreferenceScreen d = d();
        if (d != null) {
            this.c.ag(new gfp(d));
            d.B();
        }
    }

    @Override // defpackage.cg
    public void g(Bundle bundle) {
        super.g(bundle);
        TypedValue typedValue = new TypedValue();
        y().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        y().getTheme().applyStyle(i, false);
        gfu gfuVar = new gfu(y());
        this.b = gfuVar;
        gfuVar.e = this;
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        aN(bundle);
    }

    @Override // defpackage.cg
    public void h() {
        this.ah.removeCallbacks(this.ai);
        this.ah.removeMessages(1);
        if (this.d) {
            this.c.ag(null);
            PreferenceScreen d = d();
            if (d != null) {
                d.D();
            }
        }
        this.c = null;
        super.h();
    }

    @Override // defpackage.cg
    public void k() {
        super.k();
        gfu gfuVar = this.b;
        gfuVar.c = this;
        gfuVar.d = this;
    }

    @Override // defpackage.cg
    public void l() {
        super.l();
        gfu gfuVar = this.b;
        gfuVar.c = null;
        gfuVar.d = null;
    }

    @Override // defpackage.gfr
    public final void p(Preference preference) {
        bw geyVar;
        boolean z = false;
        for (cg cgVar = this; !z && cgVar != null; cgVar = cgVar.E) {
            if (cgVar instanceof gfi) {
                z = ((gfi) cgVar).a();
            }
        }
        if (!z && (x() instanceof gfi)) {
            z = ((gfi) x()).a();
        }
        if (!z) {
            if ((!(fe() instanceof gfi) || !((gfi) fe()).a()) && H().e("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (preference instanceof EditTextPreference) {
                    String str = preference.s;
                    geyVar = new ger();
                    Bundle bundle = new Bundle(1);
                    bundle.putString("key", str);
                    geyVar.ak(bundle);
                } else if (preference instanceof ListPreference) {
                    String str2 = preference.s;
                    geyVar = new gev();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("key", str2);
                    geyVar.ak(bundle2);
                } else if (preference instanceof MultiSelectListPreference) {
                    String str3 = preference.s;
                    geyVar = new gey();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString("key", str3);
                    geyVar.ak(bundle3);
                } else {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                geyVar.aF(this);
                geyVar.p(H(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }
    }

    public final void q() {
        if (this.b != null) {
        } else {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    public void r(PreferenceScreen preferenceScreen) {
        throw null;
    }
}
