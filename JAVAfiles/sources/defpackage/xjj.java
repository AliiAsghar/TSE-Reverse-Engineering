package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjj {
    private final xlb a;
    private final amvm b;

    public xjj(xlb xlbVar, amvm amvmVar) {
        amvmVar.getClass();
        this.a = xlbVar;
        this.b = amvmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjj)) {
            return false;
        }
        xjj xjjVar = (xjj) obj;
        if (d.F(this.a, xjjVar.a) && this.b == xjjVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncRequested(request=" + this.a + ", reason=" + this.b + ")";
    }
}
