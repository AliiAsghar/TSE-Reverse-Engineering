package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysb {
    public final apzi a;
    public final aqgb b;
    public final aqfn c;
    public final aqge d;

    public ysb(apzi apziVar, aqgb aqgbVar, aqfn aqfnVar, aqge aqgeVar) {
        apziVar.getClass();
        aqgbVar.getClass();
        aqfnVar.getClass();
        aqgeVar.getClass();
        this.a = apziVar;
        this.b = aqgbVar;
        this.c = aqfnVar;
        this.d = aqgeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysb)) {
            return false;
        }
        ysb ysbVar = (ysb) obj;
        if (d.F(this.a, ysbVar.a) && d.F(this.b, ysbVar.b) && d.F(this.c, ysbVar.c) && d.F(this.d, ysbVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RequestObjects(stub=" + this.a + ", requestHeader=" + this.b + ", reporterId=" + this.c + ", spamContextInfo=" + this.d + ")";
    }
}
