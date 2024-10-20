package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrs {
    private final Optional a;
    private final int b;

    public adrs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adrs)) {
            return false;
        }
        adrs adrsVar = (adrs) obj;
        int i = this.b;
        int i2 = adrsVar.b;
        if (i != 0) {
            if (i2 == 1 && this.a.equals(adrsVar.a)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        a.aS(this.b);
        return this.a.hashCode() ^ (-722379962);
    }

    public final String toString() {
        String str;
        if (this.b != 1) {
            str = "null";
        } else {
            str = "OK";
        }
        return "SendCpimMessageResponse{type=" + str + ", error=" + String.valueOf(this.a) + "}";
    }

    public adrs(Optional optional) {
        this.b = 1;
        this.a = optional;
    }
}
