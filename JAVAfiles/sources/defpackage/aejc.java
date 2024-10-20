package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aejc implements aejf {
    private final String a;

    public aejc(String str) {
        this.a = str;
    }

    @Override // defpackage.aejt
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aejc) && d.F(this.a, ((aejc) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(contentDescription=" + this.a + ")";
    }
}
