package defpackage;

import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwr {
    public final TelephonyManager.BootstrapAuthenticationCallback a;

    public adwr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adwr) {
            return this.a.equals(((adwr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BootstrapAuthenticationCallbackWrapper{callback=" + this.a.toString() + "}";
    }

    public adwr(TelephonyManager.BootstrapAuthenticationCallback bootstrapAuthenticationCallback) {
        this.a = bootstrapAuthenticationCallback;
    }
}
