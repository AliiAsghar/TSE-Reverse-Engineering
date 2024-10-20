package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acsj extends acsy {
    public final int a = 2;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acsy) {
            acsy acsyVar = (acsy) obj;
            acsyVar.a();
            acsyVar.b();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        a.bm(2);
        return -718379952;
    }

    public final String toString() {
        return a.bW(Integer.toString(a.M(2)), "GbaAppTypeInfo{telephonyCode=5, appType=", "}");
    }

    @Override // defpackage.acsy
    public final void a() {
    }

    @Override // defpackage.acsy
    public final void b() {
    }
}
