package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akxe {
    public final Optional a;

    public akxe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akxe) {
            return this.a.equals(((akxe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Argument{softwareInstruction=" + String.valueOf(this.a) + "}";
    }

    public akxe(Optional optional) {
        this.a = optional;
    }
}
