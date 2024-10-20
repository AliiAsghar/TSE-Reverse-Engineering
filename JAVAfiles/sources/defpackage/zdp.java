package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdp implements zdv {
    private final String a;
    private final arqg b;
    private final arml c;

    public zdp(String str, arqg arqgVar) {
        this.a = str;
        this.b = arqgVar;
        this.c = armd.b(3, arqgVar);
    }

    @Override // defpackage.zdv
    public final zdj a() {
        return (zdj) this.c.a();
    }

    @Override // defpackage.zdv
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdp)) {
            return false;
        }
        zdp zdpVar = (zdp) obj;
        if (d.F(this.a, zdpVar.a) && d.F(this.b, zdpVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LazyContactSuggestionsRowUiData(key=" + this.a + ", initializer=" + this.b + ")";
    }
}
