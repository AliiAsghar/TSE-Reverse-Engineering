package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vlc {
    public final Optional a;
    public final Bundle b;

    public vlc() {
        throw null;
    }

    public static vlc a(Optional optional, Optional optional2) {
        return new vlc(optional, (Bundle) optional2.orElse(new Bundle()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vlc) {
            vlc vlcVar = (vlc) obj;
            if (this.a.equals(vlcVar.a) && this.b.equals(vlcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Bundle bundle = this.b;
        return "NotificationInteractionInfo{intentToRun=" + this.a.toString() + ", callbackBundle=" + bundle.toString() + "}";
    }

    public vlc(Optional optional, Bundle bundle) {
        this.a = optional;
        if (bundle == null) {
            throw new NullPointerException("Null callbackBundle");
        }
        this.b = bundle;
    }
}
