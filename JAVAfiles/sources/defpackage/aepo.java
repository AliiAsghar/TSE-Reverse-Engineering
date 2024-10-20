package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepo {
    public final int a;
    public final arqw b;

    public aepo(int i, arqw arqwVar) {
        this.a = i;
        this.b = arqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aepo)) {
            return false;
        }
        aepo aepoVar = (aepo) obj;
        if (this.a == aepoVar.a && d.F(this.b, aepoVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "VoiceInputErrorUiData(errorMessage=" + this.a + ", onError=" + this.b + ")";
    }
}
