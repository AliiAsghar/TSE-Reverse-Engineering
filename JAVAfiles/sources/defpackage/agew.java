package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agew implements agfe {
    public final agfm a;
    private final agfc b;
    private final int c;

    public agew(agfc agfcVar, int i, agfm agfmVar) {
        agfcVar.getClass();
        this.b = agfcVar;
        this.c = i;
        this.a = agfmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agew)) {
            return false;
        }
        agew agewVar = (agew) obj;
        if (d.F(this.b, agewVar.b) && this.c == agewVar.c && d.F(this.a, agewVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Input(inputState=" + this.b + ", inputHeight=" + this.c + ", displayed=" + this.a + ")";
    }
}
