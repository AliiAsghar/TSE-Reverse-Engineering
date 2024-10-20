package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qtm {
    public final qto a;
    public final xwb b;
    private final qtr c;
    private final xwb d;

    public qtm(xwb xwbVar, xwb xwbVar2, qtr qtrVar, qto qtoVar) {
        xwbVar.getClass();
        xwbVar2.getClass();
        qtrVar.getClass();
        this.d = xwbVar;
        this.b = xwbVar2;
        this.c = qtrVar;
        this.a = qtoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtm)) {
            return false;
        }
        qtm qtmVar = (qtm) obj;
        if (d.F(this.d, qtmVar.d) && d.F(this.b, qtmVar.b) && d.F(this.c, qtmVar.c) && d.F(this.a, qtmVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Group(token=" + this.d + ", groupId=" + this.b + ", members=" + this.c + ", details=" + this.a + ")";
    }
}
