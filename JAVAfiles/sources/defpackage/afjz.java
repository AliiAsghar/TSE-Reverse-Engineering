package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjz {
    public final Object a;
    public final afiu b;
    public final Instant c;
    public final String d;

    public afjz() {
    }

    public final afiu a() {
        return this.b;
    }

    public final Instant b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afjz)) {
            return false;
        }
        afjz afjzVar = (afjz) obj;
        if (d.F(this.a, afjzVar.a) && d.F(this.b, afjzVar.b) && d.F(this.c, afjzVar.c) && d.F(this.d, afjzVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int hashCode2 = (((hashCode * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode2 * 31) + i;
    }

    public final String toString() {
        return "EntityUsage(entity=" + this.a + ", context=" + this.b + ", time=" + this.c + ", searchTerm=" + this.d + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public afjz(Object obj, afiu afiuVar, Instant instant, String str) {
        this();
        afiuVar.getClass();
        instant.getClass();
        this.a = obj;
        this.b = afiuVar;
        this.c = instant;
        this.d = str;
    }
}
