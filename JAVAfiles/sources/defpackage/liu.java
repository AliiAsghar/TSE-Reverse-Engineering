package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class liu implements lji {
    private final String a;
    private final arqg b;
    private final arml c;

    public liu(String str, arqg arqgVar) {
        this.a = str;
        this.b = arqgVar;
        this.c = armd.b(3, arqgVar);
    }

    @Override // defpackage.lji
    public final lio a() {
        return (lio) this.c.a();
    }

    @Override // defpackage.lji
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liu)) {
            return false;
        }
        liu liuVar = (liu) obj;
        if (d.F(this.a, liuVar.a) && d.F(this.b, liuVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LazySuggestionsRowUiData(key=" + this.a + ", initializer=" + this.b + ")";
    }
}
