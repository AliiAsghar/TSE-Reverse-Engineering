package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdj implements zdv {
    public final aesp a;
    private final String b;
    private final zdj c = this;

    public zdj(String str, aesp aespVar) {
        this.b = str;
        this.a = aespVar;
    }

    @Override // defpackage.zdv
    public final zdj a() {
        return this.c;
    }

    @Override // defpackage.zdv
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdj)) {
            return false;
        }
        zdj zdjVar = (zdj) obj;
        if (d.F(this.b, zdjVar.b) && d.F(this.a, zdjVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "ContactSuggestionsRowUiData(key=" + this.b + ", itemUiData=" + this.a + ")";
    }
}
