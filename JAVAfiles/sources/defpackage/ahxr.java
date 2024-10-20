package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahxr implements acig {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ahxr(ahxl ahxlVar, aibs aibsVar, long j, int i) {
        this.d = i;
        this.b = ahxlVar;
        this.c = aibsVar;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, aegu] */
    @Override // defpackage.acig
    public final Object a(acir acirVar) {
        int i;
        int i2;
        int i3 = this.d;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (!((aciv) acirVar).c) {
                        Object obj = this.c;
                        atsg atsgVar = (atsg) this.b;
                        long a = atsgVar.f.a();
                        aozy createBuilder = anac.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        anac anacVar = (anac) createBuilder.b;
                        anacVar.c = 14;
                        anacVar.b = 1 | anacVar.b;
                        int i5 = ahiy.i(acirVar);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        long j = this.a;
                        apag apagVar = createBuilder.b;
                        anac anacVar2 = (anac) apagVar;
                        anacVar2.d = i5 - 1;
                        anacVar2.b |= 2;
                        long j2 = a - j;
                        if (!apagVar.isMutable()) {
                            createBuilder.u();
                        }
                        Object obj2 = atsgVar.c;
                        anac anacVar3 = (anac) createBuilder.b;
                        anacVar3.b |= 4;
                        anacVar3.e = (int) j2;
                        ((ahiy) obj2).m((anac) createBuilder.s(), 3, 3);
                    }
                    return acirVar;
                }
                if (!((aciv) acirVar).c) {
                    Object obj3 = this.c;
                    atsg atsgVar2 = (atsg) this.b;
                    long a2 = atsgVar2.f.a();
                    if (acirVar.l()) {
                        i2 = ((aibz) acirVar.h()).a.size();
                    } else {
                        i2 = 0;
                    }
                    aozy createBuilder2 = anar.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar2 = createBuilder2.b;
                    anar anarVar = (anar) apagVar2;
                    anarVar.b |= 1;
                    anarVar.c = 0;
                    if (!apagVar2.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar3 = createBuilder2.b;
                    anar anarVar2 = (anar) apagVar3;
                    anarVar2.b |= 2;
                    anarVar2.d = i2;
                    if (!apagVar3.isMutable()) {
                        createBuilder2.u();
                    }
                    anar anarVar3 = (anar) createBuilder2.b;
                    anarVar3.b |= 4;
                    anarVar3.e = 0;
                    anar anarVar4 = (anar) createBuilder2.s();
                    aozy createBuilder3 = anac.a.createBuilder();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    apag apagVar4 = createBuilder3.b;
                    anac anacVar4 = (anac) apagVar4;
                    anacVar4.c = 9;
                    anacVar4.b |= 1;
                    if (!apagVar4.isMutable()) {
                        createBuilder3.u();
                    }
                    anac anacVar5 = (anac) createBuilder3.b;
                    anarVar4.getClass();
                    anacVar5.h = anarVar4;
                    anacVar5.b |= 4096;
                    int i6 = ahiy.i(acirVar);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    long j3 = this.a;
                    apag apagVar5 = createBuilder3.b;
                    anac anacVar6 = (anac) apagVar5;
                    anacVar6.d = i6 - 1;
                    anacVar6.b |= 2;
                    long j4 = a2 - j3;
                    if (!apagVar5.isMutable()) {
                        createBuilder3.u();
                    }
                    Object obj4 = atsgVar2.c;
                    anac anacVar7 = (anac) createBuilder3.b;
                    anacVar7.b |= 4;
                    anacVar7.e = (int) j4;
                    ((ahiy) obj4).m((anac) createBuilder3.s(), 3, 3);
                }
                return acirVar;
            }
            ahxl ahxlVar = (ahxl) this.b;
            long a3 = ahxlVar.b.a();
            if (true == acirVar.l()) {
                i4 = 2;
            }
            aozy createBuilder4 = anak.a.createBuilder();
            aozy createBuilder5 = anam.a.createBuilder();
            createBuilder5.aO(ahyo.b(((aibs) this.c).a));
            anam anamVar = (anam) createBuilder5.s();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            long j5 = this.a;
            apag apagVar6 = createBuilder4.b;
            anak anakVar = (anak) apagVar6;
            anamVar.getClass();
            anakVar.e = anamVar;
            anakVar.b |= 8;
            long j6 = a3 - j5;
            if (!apagVar6.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar7 = createBuilder4.b;
            anak anakVar2 = (anak) apagVar7;
            anakVar2.b |= 4;
            anakVar2.d = (int) j6;
            if (!apagVar7.isMutable()) {
                createBuilder4.u();
            }
            ahiy ahiyVar = ahxlVar.c;
            anak anakVar3 = (anak) createBuilder4.b;
            anakVar3.c = i4 - 1;
            anakVar3.b |= 2;
            anak anakVar4 = (anak) createBuilder4.s();
            aozy c = ahop.c((aicm) ahiyVar.a, 3);
            if (!c.b.isMutable()) {
                c.u();
            }
            anah anahVar = (anah) c.b;
            anah anahVar2 = anah.a;
            anahVar.d = 6;
            anahVar.b |= 2;
            if (!c.b.isMutable()) {
                c.u();
            }
            anah anahVar3 = (anah) c.b;
            anakVar4.getClass();
            anahVar3.h = anakVar4;
            anahVar3.b |= 1024;
            String a4 = ((ahyr) ahiyVar.c).a();
            if (!c.b.isMutable()) {
                c.u();
            }
            anah anahVar4 = (anah) c.b;
            a4.getClass();
            anahVar4.b |= 1073741824;
            anahVar4.m = a4;
            ahiyVar.e((anah) c.s());
            ahxl.j(new ahka("FindCurrentPlace"));
            return (aibt) acirVar.h();
        }
        if (!((aciv) acirVar).c) {
            Object obj5 = this.c;
            atsg atsgVar3 = (atsg) this.b;
            long a5 = atsgVar3.f.a();
            if (acirVar.l()) {
                i = ((aicc) acirVar.h()).a.size();
            } else {
                i = 0;
            }
            aozy createBuilder6 = anar.a.createBuilder();
            if (!createBuilder6.b.isMutable()) {
                createBuilder6.u();
            }
            apag apagVar8 = createBuilder6.b;
            anar anarVar5 = (anar) apagVar8;
            anarVar5.b |= 1;
            anarVar5.c = 0;
            if (!apagVar8.isMutable()) {
                createBuilder6.u();
            }
            apag apagVar9 = createBuilder6.b;
            anar anarVar6 = (anar) apagVar9;
            anarVar6.b |= 2;
            anarVar6.d = i;
            if (!apagVar9.isMutable()) {
                createBuilder6.u();
            }
            anar anarVar7 = (anar) createBuilder6.b;
            anarVar7.b |= 4;
            anarVar7.e = 0;
            anar anarVar8 = (anar) createBuilder6.s();
            aozy createBuilder7 = anac.a.createBuilder();
            if (!createBuilder7.b.isMutable()) {
                createBuilder7.u();
            }
            apag apagVar10 = createBuilder7.b;
            anac anacVar8 = (anac) apagVar10;
            anacVar8.c = 9;
            anacVar8.b |= 1;
            if (!apagVar10.isMutable()) {
                createBuilder7.u();
            }
            anac anacVar9 = (anac) createBuilder7.b;
            anarVar8.getClass();
            anacVar9.h = anarVar8;
            anacVar9.b |= 4096;
            int i7 = ahiy.i(acirVar);
            if (!createBuilder7.b.isMutable()) {
                createBuilder7.u();
            }
            long j7 = this.a;
            apag apagVar11 = createBuilder7.b;
            anac anacVar10 = (anac) apagVar11;
            anacVar10.d = i7 - 1;
            anacVar10.b |= 2;
            long j8 = a5 - j7;
            if (!apagVar11.isMutable()) {
                createBuilder7.u();
            }
            Object obj6 = atsgVar3.c;
            anac anacVar11 = (anac) createBuilder7.b;
            anacVar11.b |= 4;
            anacVar11.e = (int) j8;
            ((ahiy) obj6).m((anac) createBuilder7.s(), 3, 3);
        }
        return acirVar;
    }

    public /* synthetic */ ahxr(atsg atsgVar, long j, ListenableFuture listenableFuture, int i) {
        this.d = i;
        this.b = atsgVar;
        this.a = j;
        this.c = listenableFuture;
    }
}
