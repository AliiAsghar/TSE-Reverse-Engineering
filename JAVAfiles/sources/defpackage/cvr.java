package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvr extends cvw {
    public cwa a;

    public cvr(cwa cwaVar) {
        this.a = cwaVar;
    }

    @Override // defpackage.cvw
    public final Object a(cvt cvtVar) {
        if (cvtVar != this.a.j()) {
            csg.c("Check failed.");
        }
        return this.a.k();
    }

    @Override // defpackage.cvw
    public final void b(cvt cvtVar, Object obj) {
        throw null;
    }

    @Override // defpackage.cvw
    public final boolean c(cvt cvtVar) {
        if (cvtVar == this.a.j()) {
            return true;
        }
        return false;
    }
}
