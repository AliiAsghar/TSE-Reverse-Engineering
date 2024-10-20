package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aggg {
    public final aggh a;
    public final aeke b;

    public aggg(aggh agghVar, aeke aekeVar) {
        this.a = agghVar;
        this.b = aekeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aggg)) {
            return false;
        }
        aggg agggVar = (aggg) obj;
        if (d.F(this.a, agggVar.a) && d.F(this.b, agggVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ReactiveSpanResolver(rowSpanCountResolver=" + this.a + ", itemSpanSizeResolver=" + this.b + ")";
    }
}
