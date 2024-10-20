package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fgz implements etm {
    public final /* synthetic */ fgm a;
    public final /* synthetic */ fgr b;
    public final /* synthetic */ apuv c;
    private final /* synthetic */ int d;

    public /* synthetic */ fgz(apuv apuvVar, fgm fgmVar, fgr fgrVar, int i) {
        this.d = i;
        this.c = apuvVar;
        this.a = fgmVar;
        this.b = fgrVar;
    }

    @Override // defpackage.etm
    public final void a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                fgr fgrVar = this.b;
                ((fhb) obj).g(0, (fgv) this.c.b, this.a, fgrVar);
                return;
            } else {
                fgr fgrVar2 = this.b;
                ((fhb) obj).j(0, (fgv) this.c.b, this.a, fgrVar2);
                return;
            }
        }
        fgr fgrVar3 = this.b;
        ((fhb) obj).h(0, (fgv) this.c.b, this.a, fgrVar3);
    }
}
