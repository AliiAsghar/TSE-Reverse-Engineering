package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeiz {
    public final afbd a;
    public final qdq b;

    public aeiz(afbd afbdVar, qdq qdqVar) {
        this.a = afbdVar;
        this.b = qdqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeiz)) {
            return false;
        }
        aeiz aeizVar = (aeiz) obj;
        if (d.F(this.a, aeizVar.a) && d.F(this.b, aeizVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Transcript(uiData=" + this.a + ", uiAction=" + this.b + ")";
    }
}
