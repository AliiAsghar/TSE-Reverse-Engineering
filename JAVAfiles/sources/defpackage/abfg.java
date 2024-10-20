package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfg {
    public final abff a;
    public final Optional b;

    public abfg(abff abffVar, Optional optional) {
        abffVar.getClass();
        optional.getClass();
        this.a = abffVar;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abfg)) {
            return false;
        }
        abfg abfgVar = (abfg) obj;
        if (this.a == abfgVar.a && d.F(this.b, abfgVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LaunchPathDetails(launchPath=" + this.a + ", accountInfo=" + this.b + ")";
    }
}
