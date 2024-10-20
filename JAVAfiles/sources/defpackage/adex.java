package defpackage;

import android.net.Network;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adex {
    public final Optional a;
    public final Optional b;
    public final boolean c;

    public adex() {
        throw null;
    }

    public static adex a(String str, Network network, boolean z) {
        return new adex(Optional.ofNullable(str), Optional.ofNullable(network), z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adex) {
            adex adexVar = (adex) obj;
            if (this.a.equals(adexVar.a) && this.b.equals(adexVar.b) && this.c == adexVar.c) {
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
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        Optional optional = this.b;
        return "ImsNetworkInfo{ipAddress=" + this.a.toString() + ", network=" + optional.toString() + ", registered=" + this.c + "}";
    }

    public adex(Optional optional, Optional optional2, boolean z) {
        this.a = optional;
        this.b = optional2;
        this.c = z;
    }
}
