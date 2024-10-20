package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpn {
    public final agmh a;
    public final agmh b;
    public final rpo c;
    public final boolean d;

    public rpn(agmh agmhVar, agmh agmhVar2, rpo rpoVar, boolean z) {
        rpoVar.getClass();
        this.a = agmhVar;
        this.b = agmhVar2;
        this.c = rpoVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpn)) {
            return false;
        }
        rpn rpnVar = (rpn) obj;
        if (d.F(this.a, rpnVar.a) && d.F(this.b, rpnVar.b) && d.F(this.c, rpnVar.c) && this.d == rpnVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "ForeignKeySpec(backupFkColumn=" + this.a + ", bugleFkColumn=" + this.b + ", referencedTable=" + this.c + ", nullable=" + this.d + ")";
    }

    public /* synthetic */ rpn(agmh agmhVar, agmh agmhVar2, rpo rpoVar) {
        this(agmhVar, agmhVar2, rpoVar, false);
    }
}
