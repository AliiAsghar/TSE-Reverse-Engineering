package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aejn implements aejo {
    private final String a = "";

    @Override // defpackage.aejt
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aejn) && d.F(this.a, ((aejn) obj).a)) {
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
