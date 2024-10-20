package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qso {
    public final qss a;
    public final qsn b;
    public final String c;

    public qso(qss qssVar, qsn qsnVar, String str) {
        qsnVar.getClass();
        str.getClass();
        this.a = qssVar;
        this.b = qsnVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qso)) {
            return false;
        }
        qso qsoVar = (qso) obj;
        if (d.F(this.a, qsoVar.a) && this.b == qsoVar.b && d.F(this.c, qsoVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Destination(token=" + this.a + ", type=" + this.b + ", address=" + this.c + ")";
    }
}
