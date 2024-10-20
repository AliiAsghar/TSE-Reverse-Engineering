package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agex implements agfe {
    public final agfm a;
    private final agfc b;
    private final int c;
    private final agcb d;

    public agex(agfc agfcVar, int i, agfm agfmVar, agcb agcbVar) {
        agfcVar.getClass();
        this.b = agfcVar;
        this.c = i;
        this.a = agfmVar;
        this.d = agcbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agex)) {
            return false;
        }
        agex agexVar = (agex) obj;
        if (d.F(this.b, agexVar.b) && this.c == agexVar.c && d.F(this.a, agexVar.a) && d.F(this.d, agexVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c) * 31) + this.a.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "InputOverKeyboard(inputState=" + this.b + ", inputHeight=" + this.c + ", displayed=" + this.a + ", keyboard=" + this.d + ")";
    }
}
