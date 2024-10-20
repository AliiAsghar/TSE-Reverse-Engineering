package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aihr implements aiia {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aihr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aiia
    public final void a(aihy aihyVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                aihw.c.execute(new ahnu(this.a, aihyVar, 13));
                return;
            }
            if (aczf.A()) {
                advr.c("Logging DNS request, type = %s", aihyVar.b);
                aozy createBuilder = apir.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                apir apirVar = (apir) apagVar;
                apirVar.c = 1;
                apirVar.b = 1 | apirVar.b;
                String str = aihyVar.a;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                apir apirVar2 = (apir) apagVar2;
                apirVar2.b |= 32;
                apirVar2.g = str;
                apiq apiqVar = aihyVar.b;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                apir apirVar3 = (apir) apagVar3;
                apirVar3.d = apiqVar.f;
                apirVar3.b |= 2;
                boolean z = aihyVar.e;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                apir apirVar4 = (apir) createBuilder.b;
                apirVar4.b |= 512;
                apirVar4.k = z;
                if (actx.k() == 2) {
                    acnx.t(createBuilder, aihyVar);
                }
                ((acnx) this.a).k((apir) createBuilder.s());
                return;
            }
            advr.c("Skipped logging DNS request of type = %s", aihyVar.b);
            return;
        }
        ((aihw) this.a).f.a(aihy.a(aihyVar));
    }
}
