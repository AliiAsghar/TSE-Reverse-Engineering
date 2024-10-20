package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class loz implements lkf {
    public final boolean a;
    public final arqr b;

    public loz() {
        jfo jfoVar = new jfo((arpe) null, 2, (char[]) null);
        this.a = true;
        this.b = jfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loz)) {
            return false;
        }
        loz lozVar = (loz) obj;
        boolean z = lozVar.a;
        if (d.F(this.b, lozVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(true) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UpdateStoredLocation(requestPermission=true, onPermissionGranted=" + this.b + ")";
    }
}
