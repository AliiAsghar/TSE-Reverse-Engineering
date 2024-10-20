package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqp {
    public final Optional a;
    public final Optional b;
    public final String c;

    public qqp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qqp) {
            qqp qqpVar = (qqp) obj;
            if (this.a.equals(qqpVar.a) && this.b.equals(qqpVar.b) && this.c.equals(qqpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "AnonymizedPhoneNumber{implicitCountryCode=" + this.a.toString() + ", explicitCountryCode=" + optional.toString() + ", nationalNumber=" + this.c + "}";
    }

    public qqp(Optional optional, Optional optional2, String str) {
        this.a = optional;
        this.b = optional2;
        this.c = str;
    }
}
