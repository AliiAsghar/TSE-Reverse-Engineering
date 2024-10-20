package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akxi {
    public final Optional a;

    public akxi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akxi) {
            return this.a.equals(((akxi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Output{executionStatus=" + String.valueOf(this.a) + "}";
    }

    public akxi(Optional optional) {
        this.a = optional;
    }
}
