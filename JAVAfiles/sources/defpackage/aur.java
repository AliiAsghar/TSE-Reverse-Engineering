package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aur extends arrp implements arqr<Integer, atx> {
    final /* synthetic */ asb a;
    final /* synthetic */ long b;
    final /* synthetic */ aum c;
    final /* synthetic */ long d;
    final /* synthetic */ ahp e;
    final /* synthetic */ cfq.b f;
    final /* synthetic */ cfq.c g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aur(asb asbVar, long j, aum aumVar, long j2, ahp ahpVar, cfq.b bVar, cfq.c cVar) {
        super(1);
        this.a = asbVar;
        this.b = j;
        this.c = aumVar;
        this.d = j2;
        this.e = ahpVar;
        this.f = bVar;
        this.g = cVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int intValue = ((Number) obj).intValue();
        long j = this.b;
        aum aumVar = this.c;
        long j2 = this.d;
        ahp ahpVar = this.e;
        cfq.b bVar = this.f;
        cfq.c cVar = this.g;
        asb asbVar = this.a;
        return aus.a(asbVar, intValue, j, aumVar, j2, ahpVar, bVar, cVar, asbVar.q());
    }
}
