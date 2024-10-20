package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahyj implements acig {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ aogy c;
    private final /* synthetic */ int d;

    public /* synthetic */ ahyj(aogy aogyVar, long j, int i, int i2) {
        this.d = i2;
        this.c = aogyVar;
        this.a = j;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, aegu] */
    @Override // defpackage.acig
    public final Object a(acir acirVar) {
        if (this.d != 0) {
            aogy aogyVar = this.c;
            long a = aogyVar.a.a();
            aozy createBuilder = anac.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anac anacVar = (anac) createBuilder.b;
            anacVar.c = 14;
            anacVar.b |= 1;
            int i = ahiy.i(acirVar);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            anac anacVar2 = (anac) apagVar;
            long j = this.a;
            anacVar2.d = i - 1;
            anacVar2.b |= 2;
            long j2 = a - j;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            Object obj = aogyVar.f;
            int i2 = this.b;
            anac anacVar3 = (anac) createBuilder.b;
            anacVar3.b |= 4;
            anacVar3.e = (int) j2;
            ((ahiy) obj).f((anac) createBuilder.s(), i2);
            return (aibk) acirVar.h();
        }
        aogy aogyVar2 = this.c;
        int i3 = this.b;
        ((ahiy) aogyVar2.f).h(acirVar, this.a, aogyVar2.a.a(), 2, i3, ahws.a);
        return (aibm) acirVar.h();
    }
}
