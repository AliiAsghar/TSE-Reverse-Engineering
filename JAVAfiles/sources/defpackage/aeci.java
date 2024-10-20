package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeci extends adcx {
    public final aect a;
    private final List b;
    private final List c;

    public aeci(List list, aect aectVar, List list2) {
        super(null, null);
        this.b = list;
        this.a = aectVar;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeci)) {
            return false;
        }
        aeci aeciVar = (aeci) obj;
        if (d.F(this.b, aeciVar.b) && d.F(this.a, aeciVar.a) && d.F(this.c, aeciVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 31) * 31) + this.c.hashCode();
    }
}
