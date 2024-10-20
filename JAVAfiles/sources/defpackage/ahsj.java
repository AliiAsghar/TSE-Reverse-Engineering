package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahsj implements ahsk {
    private final /* synthetic */ int a;

    public ahsj(int i) {
        this.a = i;
    }

    @Override // defpackage.ahsk
    public final /* synthetic */ String a(apbs apbsVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return ((asij) ((apaa) apbsVar).b).c;
            }
            return ((asjt) ((aozy) apbsVar).b).e;
        }
        return ((ashe) ((aozy) apbsVar).b).f;
    }

    @Override // defpackage.ahsk
    public final /* synthetic */ String b(apbs apbsVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return ((asij) ((apaa) apbsVar).b).e;
            }
            return ((asjt) ((aozy) apbsVar).b).d;
        }
        return ((ashe) ((aozy) apbsVar).b).e;
    }

    @Override // defpackage.ahsk
    public final /* synthetic */ void c(apbs apbsVar, Long l) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                apaa apaaVar = (apaa) apbsVar;
                if (l == null) {
                    if (!apaaVar.b.isMutable()) {
                        apaaVar.u();
                    }
                    asij asijVar = (asij) apaaVar.b;
                    asij asijVar2 = asij.a;
                    asijVar.b &= -3;
                    asijVar.d = 0L;
                    return;
                }
                long longValue = l.longValue();
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                asij asijVar3 = (asij) apaaVar.b;
                asij asijVar4 = asij.a;
                asijVar3.b |= 2;
                asijVar3.d = longValue;
                return;
            }
            if (l != null) {
                long longValue2 = l.longValue();
                aozy aozyVar = (aozy) apbsVar;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                asjt asjtVar = (asjt) aozyVar.b;
                asjt asjtVar2 = asjt.a;
                asjtVar.b |= 1;
                asjtVar.c = longValue2;
                return;
            }
            aozy aozyVar2 = (aozy) apbsVar;
            if (!aozyVar2.b.isMutable()) {
                aozyVar2.u();
            }
            asjt asjtVar3 = (asjt) aozyVar2.b;
            asjt asjtVar4 = asjt.a;
            asjtVar3.b &= -2;
            asjtVar3.c = 0L;
            return;
        }
        if (l != null) {
            long longValue3 = l.longValue();
            aozy aozyVar3 = (aozy) apbsVar;
            if (!aozyVar3.b.isMutable()) {
                aozyVar3.u();
            }
            ashe asheVar = (ashe) aozyVar3.b;
            ashe asheVar2 = ashe.a;
            asheVar.b |= 2;
            asheVar.d = longValue3;
            return;
        }
        aozy aozyVar4 = (aozy) apbsVar;
        if (!aozyVar4.b.isMutable()) {
            aozyVar4.u();
        }
        ashe asheVar3 = (ashe) aozyVar4.b;
        ashe asheVar4 = ashe.a;
        asheVar3.b &= -3;
        asheVar3.d = 0L;
    }

    @Override // defpackage.ahsk
    public final /* synthetic */ void d(apbs apbsVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                apaa apaaVar = (apaa) apbsVar;
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                asij asijVar = (asij) apaaVar.b;
                asij asijVar2 = asij.a;
                asijVar.b &= -5;
                asijVar.e = asij.a.e;
                return;
            }
            aozy aozyVar = (aozy) apbsVar;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            asjt asjtVar = (asjt) aozyVar.b;
            asjt asjtVar2 = asjt.a;
            asjtVar.b &= -3;
            asjtVar.d = asjt.a.d;
            return;
        }
        aozy aozyVar2 = (aozy) apbsVar;
        if (!aozyVar2.b.isMutable()) {
            aozyVar2.u();
        }
        ashe asheVar = (ashe) aozyVar2.b;
        ashe asheVar2 = ashe.a;
        asheVar.b &= -5;
        asheVar.e = ashe.a.e;
    }
}
