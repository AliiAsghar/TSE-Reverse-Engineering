package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflo extends aflp {
    public final CharSequence a;

    public aflo(CharSequence charSequence) {
        charSequence.getClass();
        this.a = charSequence;
    }

    @Override // defpackage.aflw
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aflo) && d.F(this.a, ((aflo) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Plain(literal=" + ((Object) this.a) + ")";
    }
}
