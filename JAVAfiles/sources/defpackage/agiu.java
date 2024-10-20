package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agiu implements cue {
    final /* synthetic */ byn a;
    final /* synthetic */ duj b;
    final /* synthetic */ duh c;
    final /* synthetic */ byn d;
    private final /* synthetic */ int e;

    public agiu(byn bynVar, duj dujVar, duh duhVar, byn bynVar2, int i) {
        this.e = i;
        this.a = bynVar;
        this.b = dujVar;
        this.c = duhVar;
        this.d = bynVar2;
    }

    @Override // defpackage.cue
    public final /* synthetic */ int a(ctd ctdVar, List list, int i) {
        if (this.e != 0) {
            return cud.a(this, ctdVar, list, i);
        }
        return cud.a(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int b(ctd ctdVar, List list, int i) {
        if (this.e != 0) {
            return cud.b(this, ctdVar, list, i);
        }
        return cud.b(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int c(ctd ctdVar, List list, int i) {
        if (this.e != 0) {
            return cud.c(this, ctdVar, list, i);
        }
        return cud.c(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int d(ctd ctdVar, List list, int i) {
        if (this.e != 0) {
            return cud.d(this, ctdVar, list, i);
        }
        return cud.d(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        cuf et;
        cuf et2;
        if (this.e != 0) {
            this.a.a();
            long d = this.b.d(j, cuhVar.q(), this.c, list);
            this.d.a();
            et2 = cuhVar.et(dri.b(d), dri.a(d), arnw.a, new aaop(this.b, list, 1, null));
            return et2;
        }
        this.a.a();
        long d2 = this.b.d(j, cuhVar.q(), this.c, list);
        this.d.a();
        et = cuhVar.et(dri.b(d2), dri.a(d2), arnw.a, new afho(this.b, list, 17));
        return et;
    }
}
