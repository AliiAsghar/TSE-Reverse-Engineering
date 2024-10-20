package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aefd extends adcx {
    public final iar a;
    public final aefe b;

    public aefd(iar iarVar, aefe aefeVar) {
        super(null, null);
        this.a = iarVar;
        this.b = aefeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aefd)) {
            return false;
        }
        aefd aefdVar = (aefd) obj;
        if (d.F(this.a, aefdVar.a) && d.F(this.b, aefdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
