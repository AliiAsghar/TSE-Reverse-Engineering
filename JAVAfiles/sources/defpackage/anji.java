package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anji {
    public final aqfn a;
    public final Optional b;

    public /* synthetic */ anji(aqfn aqfnVar, Optional optional, int i) {
        optional = (i & 2) != 0 ? Optional.empty() : optional;
        aqfnVar.getClass();
        optional.getClass();
        this.a = aqfnVar;
        this.b = optional;
        asku askuVar = asku.GROUP_ID;
        asku b = asku.b(aqfnVar.b);
        if (askuVar == (b == null ? asku.UNRECOGNIZED : b)) {
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anji)) {
            return false;
        }
        anji anjiVar = (anji) obj;
        if (d.F(this.a, anjiVar.a) && d.F(this.b, anjiVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GroupId(id=" + this.a + ", conferenceUri=" + this.b + ")";
    }
}
