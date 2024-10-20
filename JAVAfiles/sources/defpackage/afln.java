package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afln extends aflp {
    public final CharSequence a;
    public final Set b;
    private final arml e;

    public afln(CharSequence charSequence, Set set) {
        set.getClass();
        this.a = charSequence;
        this.b = set;
        this.e = armd.a(new afjm(this, 4));
    }

    @Override // defpackage.aflw
    public final CharSequence a() {
        return (CharSequence) this.e.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afln)) {
            return false;
        }
        afln aflnVar = (afln) obj;
        if (d.F(this.a, aflnVar.a) && d.F(this.b, aflnVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PersonComposed(plainLiteral=" + ((Object) this.a) + ", supportedGenders=" + this.b + ")";
    }
}
