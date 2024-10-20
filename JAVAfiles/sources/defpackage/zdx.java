package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdx {
    public final aept a;
    public final zcx b;

    public zdx(aept aeptVar, zcx zcxVar) {
        zcxVar.getClass();
        this.a = aeptVar;
        this.b = zcxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdx)) {
            return false;
        }
        zdx zdxVar = (zdx) obj;
        if (d.F(this.a, zdxVar.a) && d.F(this.b, zdxVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AutoCompleteContactBarUiData(contactBarUiData=" + this.a + ", contactSuggestionListUiData=" + this.b + ")";
    }
}
