package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afvy {
    public final List a;
    public final agek b;
    public final String c;

    public afvy(List list, agek agekVar, String str) {
        this.a = list;
        this.b = agekVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afvy)) {
            return false;
        }
        afvy afvyVar = (afvy) obj;
        if (d.F(this.a, afvyVar.a) && this.b == afvyVar.b && d.F(this.c, afvyVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        agek agekVar = this.b;
        int i = 0;
        if (agekVar == null) {
            hashCode = 0;
        } else {
            hashCode = agekVar.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ProxyScreenArguments(categories=" + this.a + ", initialScreen=" + this.b + ", initialSearchTerm=" + this.c + ")";
    }
}
