package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pyz {
    public final String a;

    public pyz(String str) {
        this.a = str;
    }

    public static final String a(pyz pyzVar) {
        if (pyzVar != null) {
            return pyzVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pyz) && d.F(this.a, ((pyz) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProcessingId(id=" + this.a + ")";
    }
}
