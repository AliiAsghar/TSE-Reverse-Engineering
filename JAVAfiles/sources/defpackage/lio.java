package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lio implements lji {
    public final aesp a;
    private final String b;
    private final lio c = this;

    public lio(String str, aesp aespVar) {
        this.b = str;
        this.a = aespVar;
    }

    @Override // defpackage.lji
    public final lio a() {
        return this.c;
    }

    @Override // defpackage.lji
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lio)) {
            return false;
        }
        lio lioVar = (lio) obj;
        if (d.F(this.b, lioVar.b) && d.F(this.a, lioVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "BasicSuggestionsRowUiData(key=" + this.b + ", itemUiData=" + this.a + ")";
    }
}
