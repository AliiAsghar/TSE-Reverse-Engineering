package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibk implements akgs {
    final /* synthetic */ Preference a;
    final /* synthetic */ Preference b;
    final /* synthetic */ Preference c;
    final /* synthetic */ ibm d;
    final /* synthetic */ gfl e;

    public ibk(Preference preference, Preference preference2, Preference preference3, ibm ibmVar, gfl gflVar) {
        this.a = preference;
        this.b = preference2;
        this.c = preference3;
        this.d = ibmVar;
        this.e = gflVar;
    }

    private final void c(Preference preference) {
        if (preference != null) {
            this.e.d().af(preference);
        }
    }

    @Override // defpackage.akgs
    public final void a(Throwable th) {
        c(this.a);
        c(this.b);
        c(this.c);
    }

    @Override // defpackage.akgs
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i = 1;
        if (d.F((Boolean) obj, true)) {
            Preference preference = this.a;
            if (preference != null) {
                preference.o = new lpi(this.d, i);
                preference.J(R.string.device_logging_consent_settings_summary);
                Preference preference2 = this.a;
                preference2.z = R.layout.logging_consent_preference_icon;
                preference2.N(true);
            }
            Preference preference3 = this.b;
            if (preference3 != null) {
                preference3.N(true);
            }
            Preference preference4 = this.c;
            if (preference4 != null) {
                preference4.N(true);
                return;
            }
            return;
        }
        Preference preference5 = this.a;
        if (preference5 != null) {
            preference5.n(this.e.S(R.string.device_logging_consent_settings_summary_on_error));
            preference5.N(true);
        }
    }
}
