package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiee implements aidl {
    private static final alvi a = alvi.m("com/google/android/libraries/privatetelemetry/mobalt/observations/CountObservationGenerator");
    private final aiel b;
    private final aiek c;
    private final SecureRandom d;
    private final int e;
    private final int f;
    private final alek g;
    private final ales h;
    private final agxw i;

    public aiee(aiel aielVar, aiek aiekVar, agxw agxwVar, SecureRandom secureRandom, int i, int i2, alek alekVar, ales alesVar) {
        this.b = aielVar;
        this.c = aiekVar;
        this.i = agxwVar;
        this.d = secureRandom;
        this.e = i;
        this.f = i2;
        this.g = alekVar;
        this.h = alesVar;
    }

    private final alen b(int i, alex alexVar) {
        aozy createBuilder = alen.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        int i2 = this.e;
        apag apagVar = createBuilder.b;
        ((alen) apagVar).c = i2;
        int i3 = this.f;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ((alen) apagVar2).d = i3;
        int i4 = this.g.b;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        ((alen) apagVar3).e = i4;
        int i5 = this.h.f;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        ((alen) apagVar4).f = i5;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apag apagVar5 = createBuilder.b;
        ((alen) apagVar5).g = i;
        if (!apagVar5.isMutable()) {
            createBuilder.u();
        }
        alen alenVar = (alen) createBuilder.b;
        alexVar.getClass();
        alenVar.h = alexVar;
        alenVar.b |= 1;
        return (alen) createBuilder.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final alog c(alog alogVar) {
        alob alobVar = new alob();
        alob alobVar2 = new alob();
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            int intValue = ((Integer) alogVar.get(i)).intValue();
            aozy createBuilder = alel.a.createBuilder();
            aozy createBuilder2 = aleo.a.createBuilder();
            long j = intValue;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((aleo) createBuilder2.b).b = j;
            aleo aleoVar = (aleo) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            alel alelVar = (alel) createBuilder.b;
            aleoVar.getClass();
            alelVar.c = aleoVar;
            alelVar.b = 13;
            aozb i2 = aiep.i(this.d);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((alel) createBuilder.b).d = i2;
            alobVar2.h((alel) createBuilder.s());
        }
        aozy createBuilder3 = alel.a.createBuilder();
        alet aletVar = alet.a;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        alel alelVar2 = (alel) createBuilder3.b;
        aletVar.getClass();
        alelVar2.c = aletVar;
        alelVar2.b = 10000;
        aozb i3 = aiep.i(this.d);
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        ((alel) createBuilder3.b).d = i3;
        alobVar2.h((alel) createBuilder3.s());
        alog g = alobVar2.g();
        int i4 = ((alsx) g).c;
        int i5 = 0;
        boolean z = true;
        while (i5 < i4) {
            alel alelVar3 = (alel) g.get(i5);
            aozy createBuilder4 = aieh.a.createBuilder();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            aieh aiehVar = (aieh) createBuilder4.b;
            alelVar3.getClass();
            aiehVar.d = alelVar3;
            aiehVar.b |= 1;
            if (z) {
                aozb i6 = aiep.i(this.d);
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ((aieh) createBuilder4.b).c = i6;
            }
            alobVar.h((aieh) createBuilder4.s());
            i5++;
            z = false;
        }
        return alobVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a7  */
    @Override // defpackage.aidl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.util.List a(int r29, java.util.List r30) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiee.a(int, java.util.List):java.util.List");
    }
}
