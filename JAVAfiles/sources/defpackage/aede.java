package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aede extends adcx {
    public final adzz a;
    public final long b;
    public final aeab c;
    public final String d;

    public aede(adzz adzzVar, long j, aeab aeabVar, String str) {
        super(null, null);
        this.a = adzzVar;
        this.b = j;
        this.c = aeabVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aede)) {
            return false;
        }
        aede aedeVar = (aede) obj;
        if (d.F(this.a, aedeVar.a) && a.bB(this.b, aedeVar.b) && d.F(this.c, aedeVar.c) && d.F(this.d, aedeVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = arut.a;
        int A = (a.A(this.b) * 31) + this.c.hashCode();
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (A * 31) + hashCode;
    }
}
