package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xhf {
    public final Optional a;
    public final Optional b;
    public final Optional c;

    public xhf(Optional optional, Optional optional2, Optional optional3) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhf)) {
            return false;
        }
        xhf xhfVar = (xhf) obj;
        if (d.F(this.a, xhfVar.a) && d.F(this.b, xhfVar.b) && d.F(this.c, xhfVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TelephonyWipeoutDetectorResult(wipeoutResult=" + this.a + ", telephonySmsCount=" + this.b + ", telephonyMmsCount=" + this.c + ")";
    }
}
