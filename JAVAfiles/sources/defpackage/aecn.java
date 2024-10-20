package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aecn extends adcx {
    private final String a;
    private final String b;
    private final double c;

    public aecn(String str, String str2, double d) {
        super(null, null);
        this.a = str;
        this.b = str2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aecn)) {
            return false;
        }
        aecn aecnVar = (aecn) obj;
        if (d.F(this.a, aecnVar.a) && d.F(this.b, aecnVar.b) && Double.compare(this.c, aecnVar.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + d.aI(this.c);
    }
}
