package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dji extends djg {
    public final String a;

    public dji(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dji) && d.F(this.a, ((dji) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.a + ')';
    }
}
