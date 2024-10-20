package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mjt implements yfx {
    private static final xze c = xze.g("Bugle", "ConfigurationStore");
    public final SharedPreferences.OnSharedPreferenceChangeListener a;
    public final zxy b;
    private final ykw d;
    private final yjy e;
    private final yjf f;
    private final mju g;
    private final mju h;
    private final mjs i;

    public mjt(ykw ykwVar, zxy zxyVar, yjy yjyVar, yjf yjfVar, anen anenVar, wfh wfhVar, lpg lpgVar, aksr aksrVar) {
        this.d = ykwVar;
        this.b = zxyVar;
        this.e = yjyVar;
        this.f = yjfVar;
        new anew(anenVar);
        mjv n = lpgVar.n(R.string.send_seen_report_rcs_pref_key, R.bool.send_seen_report_rcs_pref_default);
        this.g = n;
        mjv n2 = lpgVar.n(R.string.share_typing_status_rcs_pref_key, R.bool.share_typing_status_rcs_pref_default);
        this.h = n2;
        mjs mjsVar = new mjs(alpt.s("rcs_settings_value", n.a, n2.a), wfhVar.Y(this));
        this.i = mjsVar;
        this.a = new akse(aksrVar, mjsVar, "ConfigurationStore#init", 0);
    }

    @Override // defpackage.yfx
    public final void fs() {
        if (this.f.i()) {
            this.e.n(new mjr(this, 1));
        } else {
            c.q("Cannot register for subscription prefs changes, no phone permission");
        }
        this.d.m(this.a);
    }

    @Override // defpackage.yfx
    public final void ft() {
        if (this.f.i()) {
            this.e.n(new mjr(this, 0));
        } else {
            c.q("Cannot unregister subscription prefs changes, no phone permission");
        }
        this.d.o(this.a);
    }
}
