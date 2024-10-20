package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agbs extends arrp implements arqr {
    final /* synthetic */ agbv a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbs(agbv agbvVar, boolean z, int i) {
        super(1);
        this.a = agbvVar;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aozy createBuilder;
        agbw agbwVar = (agbw) obj;
        if (agbwVar == null || (createBuilder = agbw.a.createBuilder(agbwVar)) == null) {
            createBuilder = agbw.a.createBuilder();
            createBuilder.getClass();
        }
        agbv agbvVar = this.a;
        boolean z = this.b;
        int i = this.c;
        apct b = apds.b(agbvVar.a.f().toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        agbw agbwVar2 = (agbw) apagVar;
        b.getClass();
        agbwVar2.e = b;
        agbwVar2.b |= 4;
        if (z) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            agbw agbwVar3 = (agbw) createBuilder.b;
            agbwVar3.b |= 1;
            agbwVar3.c = i;
        } else {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            agbw agbwVar4 = (agbw) createBuilder.b;
            agbwVar4.b |= 2;
            agbwVar4.d = i;
        }
        agbw agbwVar5 = (agbw) createBuilder.s();
        this.a.d = agbwVar5;
        return agbwVar5;
    }
}
