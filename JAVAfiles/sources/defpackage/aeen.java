package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeen extends arrp implements arqr {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeen(aozb aozbVar, aozb aozbVar2, long j, int i) {
        super(1);
        this.d = i;
        this.b = aozbVar;
        this.c = aozbVar2;
        this.a = j;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        if (this.d != 0) {
            ((yhp) this.b).b.post(new ybh((wfh) this.c, 8));
            ((yhp) this.b).f.s(3);
            ((yhp) this.b).f.u(14);
            long j = this.a;
            yhp yhpVar = (yhp) this.b;
            yhpVar.f.o(yhpVar.a(j));
            ((yhp) this.b).f.k();
            return arnb.a;
        }
        aozy aozyVar = (aozy) obj;
        aozyVar.getClass();
        apag apagVar = aozyVar.b;
        long j2 = ((aedx) apagVar).c + 1;
        if (!apagVar.isMutable()) {
            aozyVar.u();
        }
        apag apagVar2 = aozyVar.b;
        aedx aedxVar = (aedx) apagVar2;
        aedxVar.b |= 1;
        aedxVar.c = j2;
        Object obj2 = this.b;
        if (!apagVar2.isMutable()) {
            aozyVar.u();
        }
        apag apagVar3 = aozyVar.b;
        aedx aedxVar2 = (aedx) apagVar3;
        aedxVar2.b = 8 | aedxVar2.b;
        aedxVar2.f = (aozb) obj2;
        Object obj3 = this.c;
        if (obj3 != null) {
            if (!apagVar3.isMutable()) {
                aozyVar.u();
            }
            aedx aedxVar3 = (aedx) aozyVar.b;
            aedxVar3.b |= 16;
            aedxVar3.g = (aozb) obj3;
        }
        long j3 = this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apag apagVar4 = aozyVar.b;
        aedx aedxVar4 = (aedx) apagVar4;
        aedxVar4.b |= 64;
        aedxVar4.i = j3;
        if (!apagVar4.isMutable()) {
            aozyVar.u();
        }
        apag apagVar5 = aozyVar.b;
        aedx aedxVar5 = (aedx) apagVar5;
        aedxVar5.b |= 32;
        aedxVar5.h = 0L;
        if (!apagVar5.isMutable()) {
            aozyVar.u();
        }
        apag apagVar6 = aozyVar.b;
        aedx aedxVar6 = (aedx) apagVar6;
        aedxVar6.b |= 128;
        aedxVar6.j = false;
        if (!apagVar6.isMutable()) {
            aozyVar.u();
        }
        apag apagVar7 = aozyVar.b;
        aedx aedxVar7 = (aedx) apagVar7;
        aedxVar7.b &= -257;
        aedxVar7.k = aedx.a.k;
        if (!apagVar7.isMutable()) {
            aozyVar.u();
        }
        apag apagVar8 = aozyVar.b;
        aedx aedxVar8 = (aedx) apagVar8;
        aedxVar8.b |= 512;
        aedxVar8.l = false;
        if (!apagVar8.isMutable()) {
            aozyVar.u();
        }
        apag apagVar9 = aozyVar.b;
        aedx aedxVar9 = (aedx) apagVar9;
        aedxVar9.b &= -1025;
        aedxVar9.m = aedx.a.m;
        if (!apagVar9.isMutable()) {
            aozyVar.u();
        }
        aedx aedxVar10 = (aedx) aozyVar.b;
        aedxVar10.b &= -2049;
        aedxVar10.n = false;
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeen(yhp yhpVar, long j, wfh wfhVar, int i) {
        super(1);
        this.d = i;
        this.b = yhpVar;
        this.a = j;
        this.c = wfhVar;
    }
}
