package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioa {
    public final arqr a;
    public final arqg b;
    public final arqg c;
    private final arqg d;

    public ioa(arqr arqrVar, arqg arqgVar, arqg arqgVar2, arqg arqgVar3) {
        this.a = arqrVar;
        this.b = arqgVar;
        this.c = arqgVar2;
        this.d = arqgVar3;
    }

    public final long a() {
        return ((Number) this.b.a()).longValue();
    }

    public final boolean b() {
        int intValue = ((Number) this.a.a(false)).intValue();
        if (intValue != 30 && intValue != 40) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioa)) {
            return false;
        }
        ioa ioaVar = (ioa) obj;
        if (d.F(this.a, ioaVar.a) && d.F(this.b, ioaVar.b) && d.F(this.c, ioaVar.c) && d.F(this.d, ioaVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SendingCapabilities(draftMessageType=" + this.a + ", maxSizeBytes=" + this.b + ", currentDraftSizeBytes=" + this.c + ", isGroup=" + this.d + ")";
    }
}
