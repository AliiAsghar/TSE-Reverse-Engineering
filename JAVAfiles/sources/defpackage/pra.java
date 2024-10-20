package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pra {
    public final String a;
    public final Optional b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pra(String str) {
        this(str, Optional.empty());
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pra)) {
            return false;
        }
        pra praVar = (pra) obj;
        if (d.F(this.a, praVar.a) && d.F(this.b, praVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DomainAndOptionalPath(domainRoot=" + this.a + ", path=" + this.b + ")";
    }

    public pra(String str, Optional optional) {
        str.getClass();
        this.a = str;
        this.b = optional;
    }
}
