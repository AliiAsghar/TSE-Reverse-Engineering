package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzh {
    public final ascv a;
    public final ascv b;
    public final ascv c;
    public final int d;
    public final jzg e;

    public jzh(ascv ascvVar, ascv ascvVar2, ascv ascvVar3, int i, jzg jzgVar) {
        ascvVar.getClass();
        ascvVar2.getClass();
        ascvVar3.getClass();
        this.a = ascvVar;
        this.b = ascvVar2;
        this.c = ascvVar3;
        this.d = i;
        this.e = jzgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzh)) {
            return false;
        }
        jzh jzhVar = (jzh) obj;
        if (d.F(this.a, jzhVar.a) && d.F(this.b, jzhVar.b) && d.F(this.c, jzhVar.c) && this.d == jzhVar.d && d.F(this.e, jzhVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "MessageListFooterUiData(typingIndicatorUiDataFlow=" + this.a + ", suggestionListUiDataFlow=" + this.b + ", sendingAsUiDataFlow=" + this.c + ", maximumSuggestionRows=" + this.d + ", flags=" + this.e + ")";
    }
}
