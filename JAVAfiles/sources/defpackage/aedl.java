package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aedl extends adcx {
    public final aect a;
    public final List b;
    public final List c;

    public aedl(aect aectVar, List list, List list2) {
        super(null, null);
        this.a = aectVar;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aedl)) {
            return false;
        }
        aedl aedlVar = (aedl) obj;
        if (d.F(this.a, aedlVar.a) && d.F(this.b, aedlVar.b) && d.F(this.c, aedlVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
