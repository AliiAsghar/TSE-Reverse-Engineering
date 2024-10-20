package defpackage;

import android.content.Intent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vlb {
    public final vlc a;
    public final Intent b;
    public final boolean c;
    public final int d;

    public vlb() {
        throw null;
    }

    public static vlb a(Intent intent, boolean z, Optional optional, Optional optional2) {
        return b(intent, z, 0, optional, optional2);
    }

    public static vlb b(Intent intent, boolean z, int i, Optional optional, Optional optional2) {
        return new vlb(vlc.a(optional, optional2), intent, z, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vlb) {
            vlb vlbVar = (vlb) obj;
            if (this.a.equals(vlbVar.a) && this.b.equals(vlbVar.b) && this.c == vlbVar.c && this.d == vlbVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.d;
    }

    public final String toString() {
        Intent intent = this.b;
        return "NotificationInteractionActivityInfo{notificationInteractionInfo=" + this.a.toString() + ", activityIntent=" + intent.toString() + ", shouldAddParentStack=" + this.c + ", requestCode=" + this.d + "}";
    }

    public vlb(vlc vlcVar, Intent intent, boolean z, int i) {
        this.a = vlcVar;
        if (intent == null) {
            throw new NullPointerException("Null activityIntent");
        }
        this.b = intent;
        this.c = z;
        this.d = i;
    }
}
