package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aejr implements aejs {
    private final String a = "";

    @Override // defpackage.aejt
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aejr) && d.F(this.a, ((aejr) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(contentDescription=" + this.a + ")";
    }
}
