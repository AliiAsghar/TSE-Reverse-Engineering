package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzq {
    public final CharSequence a;
    public final long b;

    public afzq(CharSequence charSequence, long j) {
        this.a = charSequence;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afzq)) {
            return false;
        }
        afzq afzqVar = (afzq) obj;
        if (d.F(this.a, afzqVar.a) && a.bB(this.b, afzqVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.A(this.b);
    }

    public final String toString() {
        return "TextPlaceholder(value=" + ((Object) this.a) + ", color=" + cku.g(this.b) + ")";
    }
}
