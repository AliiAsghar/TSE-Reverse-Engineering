package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeon implements aenp {
    public final String a;
    public final boolean b;
    public final arqr c;
    public final arqr d;
    public final arqg e;
    public final arqg f;

    public aeon(String str, boolean z, arqr arqrVar, arqr arqrVar2, arqg arqgVar, arqg arqgVar2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = arqrVar;
        this.d = arqrVar2;
        this.e = arqgVar;
        this.f = arqgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeon)) {
            return false;
        }
        aeon aeonVar = (aeon) obj;
        if (d.F(this.a, aeonVar.a) && this.b == aeonVar.b && d.F(this.c, aeonVar.c) && d.F(this.d, aeonVar.d) && d.F(this.e, aeonVar.e) && d.F(this.f, aeonVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + a.v(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "ComposeRowSubjectUrgentUiData(subject=" + this.a + ", isUrgent=" + this.b + ", onSubjectChange=" + this.c + ", onUrgentChange=" + this.d + ", onClick=" + this.e + ", onDismiss=" + this.f + ")";
    }
}
