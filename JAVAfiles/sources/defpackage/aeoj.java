package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeoj {
    public final String a;
    public final long b;
    public final Character c;
    public final String d;

    public aeoj(String str, long j, Character ch, String str2) {
        str2.getClass();
        this.a = str;
        this.b = j;
        this.c = ch;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeoj)) {
            return false;
        }
        aeoj aeojVar = (aeoj) obj;
        if (d.F(this.a, aeojVar.a) && a.bB(this.b, aeojVar.b) && d.F(this.c, aeojVar.c) && d.F(this.d, aeojVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + a.A(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ComposeRowSimData(carrierName=" + this.a + ", iconColor=" + cku.g(this.b) + ", iconChar=" + this.c + ", phoneNumber=" + this.d + ")";
    }
}
