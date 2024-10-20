package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjp {
    public final Optional a;
    public final Optional b;
    public final anix c;

    public anjp() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    public final boolean a() {
        if (this.a.isEmpty() && this.b.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anjp)) {
            return false;
        }
        anjp anjpVar = (anjp) obj;
        if (d.F(this.a, anjpVar.a) && d.F(this.b, anjpVar.b) && d.F(this.c, anjpVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        anix anixVar = this.c;
        if (anixVar == null) {
            hashCode = 0;
        } else {
            hashCode = anixVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "GroupPropertiesUpdate(name=" + this.a + ", icon=" + this.b + ", traceId=" + this.c + ")";
    }

    public /* synthetic */ anjp(Optional optional, Optional optional2, anix anixVar, int i) {
        optional = (i & 1) != 0 ? Optional.empty() : optional;
        optional2 = (i & 2) != 0 ? Optional.empty() : optional2;
        anixVar = (i & 4) != 0 ? null : anixVar;
        optional.getClass();
        optional2.getClass();
        this.a = optional;
        this.b = optional2;
        this.c = anixVar;
    }
}
