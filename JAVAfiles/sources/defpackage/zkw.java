package defpackage;

import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zkw {
    public final TwoStatePreference a;
    public final Preference b;
    public final TwoStatePreference c;
    public final Preference d;
    public final Preference e;
    public final Preference f;
    public final TwoStatePreference g;
    public final RcsSimStatusPreference h;

    public zkw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zkw) {
            zkw zkwVar = (zkw) obj;
            if (this.a.equals(zkwVar.a) && this.b.equals(zkwVar.b) && this.c.equals(zkwVar.c) && this.d.equals(zkwVar.d) && this.e.equals(zkwVar.e) && this.f.equals(zkwVar.f) && this.g.equals(zkwVar.g) && this.h.equals(zkwVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        RcsSimStatusPreference rcsSimStatusPreference = this.h;
        TwoStatePreference twoStatePreference = this.g;
        Preference preference = this.f;
        Preference preference2 = this.e;
        Preference preference3 = this.d;
        TwoStatePreference twoStatePreference2 = this.c;
        Preference preference4 = this.b;
        return "RcsSettingsPreferences{rcsEnabled=" + this.a.toString() + ", rcsFallback=" + preference4.toString() + ", autoRcsFallbackEnabled=" + twoStatePreference2.toString() + ", mobileDataAutoDownloadLimit=" + preference3.toString() + ", defaultSharingMethod=" + preference2.toString() + ", learnMore=" + preference.toString() + ", mobileDataAutoDownloadInRoamingEnabled=" + twoStatePreference.toString() + ", rcsSimStatusList=" + rcsSimStatusPreference.toString() + "}";
    }

    public zkw(TwoStatePreference twoStatePreference, Preference preference, TwoStatePreference twoStatePreference2, Preference preference2, Preference preference3, Preference preference4, TwoStatePreference twoStatePreference3, RcsSimStatusPreference rcsSimStatusPreference) {
        this.a = twoStatePreference;
        this.b = preference;
        this.c = twoStatePreference2;
        this.d = preference2;
        this.e = preference3;
        this.f = preference4;
        this.g = twoStatePreference3;
        this.h = rcsSimStatusPreference;
    }
}
