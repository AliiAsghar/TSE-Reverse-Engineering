package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwd extends cvw {
    private final cvt a;
    private final byn b = new byu(null, cav.a);

    public cwd(cvt cvtVar) {
        this.a = cvtVar;
    }

    @Override // defpackage.cvw
    public final Object a(cvt cvtVar) {
        if (cvtVar != this.a) {
            csg.c("Check failed.");
        }
        Object a = this.b.a();
        if (a == null) {
            return null;
        }
        return a;
    }

    @Override // defpackage.cvw
    public final void b(cvt cvtVar, Object obj) {
        if (cvtVar != this.a) {
            csg.c("Check failed.");
        }
        this.b.h(obj);
    }

    @Override // defpackage.cvw
    public final boolean c(cvt cvtVar) {
        if (cvtVar == this.a) {
            return true;
        }
        return false;
    }
}
