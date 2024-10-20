package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yml {
    public final ypk a;
    public final amzp b;

    public yml(ypk ypkVar, amzp amzpVar) {
        this.a = ypkVar;
        this.b = amzpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yml)) {
            return false;
        }
        yml ymlVar = (yml) obj;
        if (d.F(this.a, ymlVar.a) && this.b == ymlVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Verdict(confidenceScore=" + this.a + ", outcome=" + this.b + ")";
    }
}
