package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkt {
    public final arqg a;

    public jkt(arqg arqgVar) {
        this.a = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jkt) && d.F(this.a, ((jkt) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DirectSendImageCompressionUiData(onTuneButtonClick=" + this.a + ")";
    }

    public jkt() {
        this(jlc.b);
    }
}
