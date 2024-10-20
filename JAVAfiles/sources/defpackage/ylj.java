package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ylj {
    public final Optional a;
    public final int b;
    public final acyf c;

    public ylj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ylj) {
            ylj yljVar = (ylj) obj;
            if (this.a.equals(yljVar.a) && this.b == yljVar.b && this.c.equals(yljVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        acyf acyfVar = this.c;
        return "PhenotypeRegistrationData{phenotypeReregistrationTimer=" + String.valueOf(this.a) + ", subId=" + this.b + ", appProperties=" + acyfVar.toString() + "}";
    }

    public ylj(Optional optional, int i, acyf acyfVar) {
        if (optional == null) {
            throw new NullPointerException("Null phenotypeReregistrationTimer");
        }
        this.a = optional;
        this.b = i;
        if (acyfVar != null) {
            this.c = acyfVar;
            return;
        }
        throw new NullPointerException("Null appProperties");
    }
}
