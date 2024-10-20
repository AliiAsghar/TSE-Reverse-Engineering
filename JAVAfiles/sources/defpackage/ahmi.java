package defpackage;

import android.os.health.HealthStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahmi extends ahmj {
    public static final ahmi a = new ahmi();

    private ahmi() {
    }

    @Override // defpackage.ahmj
    public final /* synthetic */ apbt a(String str, Object obj) {
        HealthStats m317m = d$$ExternalSyntheticApiModelOutline0.m317m(obj);
        aozy createBuilder = ashk.a.createBuilder();
        long k = ahmc.k(m317m, 30001);
        if (k != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashk ashkVar = (ashk) createBuilder.b;
            ashkVar.b |= 1;
            ashkVar.c = k;
        }
        long k2 = ahmc.k(m317m, 30002);
        if (k2 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashk ashkVar2 = (ashk) createBuilder.b;
            ashkVar2.b |= 2;
            ashkVar2.d = k2;
        }
        long k3 = ahmc.k(m317m, 30003);
        if (k3 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashk ashkVar3 = (ashk) createBuilder.b;
            ashkVar3.b |= 4;
            ashkVar3.e = k3;
        }
        long k4 = ahmc.k(m317m, 30004);
        if (k4 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashk ashkVar4 = (ashk) createBuilder.b;
            ashkVar4.b |= 8;
            ashkVar4.f = k4;
        }
        long k5 = ahmc.k(m317m, 30005);
        if (k5 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashk ashkVar5 = (ashk) createBuilder.b;
            ashkVar5.b |= 16;
            ashkVar5.g = k5;
        }
        long k6 = ahmc.k(m317m, 30006);
        if (k6 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashk ashkVar6 = (ashk) createBuilder.b;
            ashkVar6.b |= 32;
            ashkVar6.h = k6;
        }
        if (str != null) {
            ashh n = ahmc.n(str);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashk ashkVar7 = (ashk) createBuilder.b;
            n.getClass();
            ashkVar7.i = n;
            ashkVar7.b |= 64;
        }
        ashk ashkVar8 = (ashk) createBuilder.s();
        if (ahmc.t(ashkVar8)) {
            return null;
        }
        return ashkVar8;
    }

    @Override // defpackage.ahmj
    public final /* synthetic */ apbt b(apbt apbtVar, apbt apbtVar2) {
        ashk ashkVar = (ashk) apbtVar;
        ashk ashkVar2 = (ashk) apbtVar2;
        if (ashkVar != null && ashkVar2 != null) {
            aozy createBuilder = ashk.a.createBuilder();
            if ((ashkVar.b & 1) != 0) {
                long j = ashkVar.c - ashkVar2.c;
                if (j != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashk ashkVar3 = (ashk) createBuilder.b;
                    ashkVar3.b |= 1;
                    ashkVar3.c = j;
                }
            }
            if ((ashkVar.b & 2) != 0) {
                long j2 = ashkVar.d - ashkVar2.d;
                if (j2 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashk ashkVar4 = (ashk) createBuilder.b;
                    ashkVar4.b |= 2;
                    ashkVar4.d = j2;
                }
            }
            if ((ashkVar.b & 4) != 0) {
                long j3 = ashkVar.e - ashkVar2.e;
                if (j3 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashk ashkVar5 = (ashk) createBuilder.b;
                    ashkVar5.b |= 4;
                    ashkVar5.e = j3;
                }
            }
            if ((ashkVar.b & 8) != 0) {
                long j4 = ashkVar.f - ashkVar2.f;
                if (j4 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashk ashkVar6 = (ashk) createBuilder.b;
                    ashkVar6.b |= 8;
                    ashkVar6.f = j4;
                }
            }
            if ((ashkVar.b & 16) != 0) {
                long j5 = ashkVar.g - ashkVar2.g;
                if (j5 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashk ashkVar7 = (ashk) createBuilder.b;
                    ashkVar7.b |= 16;
                    ashkVar7.g = j5;
                }
            }
            if ((ashkVar.b & 32) != 0) {
                long j6 = ashkVar.h - ashkVar2.h;
                if (j6 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashk ashkVar8 = (ashk) createBuilder.b;
                    ashkVar8.b |= 32;
                    ashkVar8.h = j6;
                }
            }
            ashh ashhVar = ashkVar.i;
            if (ashhVar == null) {
                ashhVar = ashh.a;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashk ashkVar9 = (ashk) createBuilder.b;
            ashhVar.getClass();
            ashkVar9.i = ashhVar;
            ashkVar9.b |= 64;
            ashk ashkVar10 = (ashk) createBuilder.s();
            if (ahmc.t(ashkVar10)) {
                return null;
            }
            return ashkVar10;
        }
        return ashkVar;
    }

    @Override // defpackage.ahmj
    public final /* bridge */ /* synthetic */ String c(apbt apbtVar) {
        ashh ashhVar = ((ashk) apbtVar).i;
        if (ashhVar == null) {
            ashhVar = ashh.a;
        }
        return ashhVar.d;
    }
}
