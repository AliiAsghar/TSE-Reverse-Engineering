package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahmk extends ahmj {
    public static final ahmk a = new ahmk();

    private ahmk() {
    }

    @Override // defpackage.ahmj
    public final /* synthetic */ apbt a(String str, Object obj) {
        HealthStats m317m = d$$ExternalSyntheticApiModelOutline0.m317m(obj);
        aozy createBuilder = ashl.a.createBuilder();
        int k = (int) ahmc.k(m317m, 50001);
        if (k != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashl ashlVar = (ashl) createBuilder.b;
            ashlVar.b |= 1;
            ashlVar.c = k;
        }
        int k2 = (int) ahmc.k(m317m, 50002);
        if (k2 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashl ashlVar2 = (ashl) createBuilder.b;
            ashlVar2.b |= 2;
            ashlVar2.d = k2;
        }
        if (str != null) {
            ashh n = ahmc.n(str);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashl ashlVar3 = (ashl) createBuilder.b;
            n.getClass();
            ashlVar3.e = n;
            ashlVar3.b |= 4;
        }
        ashl ashlVar4 = (ashl) createBuilder.s();
        if (ahmc.u(ashlVar4)) {
            return null;
        }
        return ashlVar4;
    }

    @Override // defpackage.ahmj
    public final /* synthetic */ apbt b(apbt apbtVar, apbt apbtVar2) {
        int i;
        int i2;
        ashl ashlVar = (ashl) apbtVar;
        ashl ashlVar2 = (ashl) apbtVar2;
        if (ashlVar != null && ashlVar2 != null) {
            aozy createBuilder = ashl.a.createBuilder();
            if ((ashlVar.b & 1) != 0 && (i2 = ashlVar.c - ashlVar2.c) != 0) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashl ashlVar3 = (ashl) createBuilder.b;
                ashlVar3.b |= 1;
                ashlVar3.c = i2;
            }
            if ((ashlVar.b & 2) != 0 && (i = ashlVar.d - ashlVar2.d) != 0) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashl ashlVar4 = (ashl) createBuilder.b;
                ashlVar4.b |= 2;
                ashlVar4.d = i;
            }
            ashh ashhVar = ashlVar.e;
            if (ashhVar == null) {
                ashhVar = ashh.a;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashl ashlVar5 = (ashl) createBuilder.b;
            ashhVar.getClass();
            ashlVar5.e = ashhVar;
            ashlVar5.b |= 4;
            ashl ashlVar6 = (ashl) createBuilder.s();
            if (ahmc.u(ashlVar6)) {
                return null;
            }
            return ashlVar6;
        }
        return ashlVar;
    }

    @Override // defpackage.ahmj
    public final /* bridge */ /* synthetic */ String c(apbt apbtVar) {
        ashh ashhVar = ((ashl) apbtVar).e;
        if (ashhVar == null) {
            ashhVar = ashh.a;
        }
        return ashhVar.d;
    }
}
