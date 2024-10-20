package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aied implements aidl {
    private static final alvi a = alvi.m("com/google/android/libraries/privatetelemetry/mobalt/observations/AtLeastOnceObservationGenerator");
    private final aiel b;
    private final aiek c;
    private final SecureRandom d;
    private final int e;
    private final int f;
    private final alek g;
    private final ales h;
    private final agxw i;

    public aied(aiel aielVar, aiek aiekVar, agxw agxwVar, SecureRandom secureRandom, int i, int i2, alek alekVar, ales alesVar) {
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
    @Override // defpackage.aidl
    public final /* synthetic */ List a(int i, List list) {
        int i2;
        int aT;
        int i3;
        int i4;
        ((alvg) ((alvg) a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/observations/AtLeastOnceObservationGenerator", "generateObservations", 73, "AtLeastOnceObservationGenerator.java")).L("Mobalt: generating observations for day index %s for report: %s-%s-%s-%s", Integer.valueOf(i), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g.b), Integer.valueOf(this.h.f));
        alqf b = this.c.b();
        int f = aiep.f(this.g.d) - 1;
        alob alobVar = new alob();
        Iterator it = list.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            aidh aidhVar = (aidh) it.next();
            if (this.h.o.size() <= 0 || aidhVar.a.j.size() != 0) {
                aozy createBuilder = aiei.a.createBuilder();
                alen b2 = b(i, aidhVar.a);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aiei aieiVar = (aiei) createBuilder.b;
                b2.getClass();
                aieiVar.c = b2;
                aieiVar.b |= 1;
                alog alogVar = (alog) Collection.EL.stream(aidhVar.b).map(new aiec(i5)).collect(alls.a);
                if (this.h.m > 0) {
                    long size = alogVar.size();
                    i3 = i6;
                    long j = this.h.m;
                    if (size > j) {
                        i4 = 0;
                        alogVar = alogVar.subList(0, (int) j);
                    } else {
                        i4 = 0;
                    }
                } else {
                    i3 = i6;
                    i4 = i5;
                }
                int aT2 = a.aT(this.h.r);
                if (aT2 == 0) {
                    aT2 = 1;
                }
                if (aT2 - 2 != 1) {
                    alek alekVar = this.g;
                    alob alobVar2 = new alob();
                    int size2 = alogVar.size();
                    for (int i7 = i4; i7 < size2; i7++) {
                        alobVar2.h(Integer.valueOf(aiep.e((aidj) alogVar.get(i7), alekVar)));
                    }
                    createBuilder.av(c(this.i.f(alobVar2.g(), f, this.h)));
                    i6 = i3 + ((aiei) createBuilder.b).d.size();
                } else {
                    aozy createBuilder2 = alee.a.createBuilder();
                    Stream map = Collection.EL.stream(alogVar).map(new aiec(1));
                    createBuilder2.getClass();
                    map.forEach(new aidg(createBuilder2, 2));
                    aozy createBuilder3 = alel.a.createBuilder();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    alel alelVar = (alel) createBuilder3.b;
                    alee aleeVar = (alee) createBuilder2.s();
                    aleeVar.getClass();
                    alelVar.c = aleeVar;
                    alelVar.b = 10;
                    aozb i8 = aiep.i(this.d);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((alel) createBuilder3.b).d = i8;
                    alel alelVar2 = (alel) createBuilder3.s();
                    aozy createBuilder4 = aieh.a.createBuilder();
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    aieh aiehVar = (aieh) createBuilder4.b;
                    alelVar2.getClass();
                    aiehVar.d = alelVar2;
                    aiehVar.b |= 1;
                    aozb i9 = aiep.i(this.d);
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    ((aieh) createBuilder4.b).c = i9;
                    createBuilder.aw((aieh) createBuilder4.s());
                    i6 = i3 + 1;
                }
                alobVar.h((aiei) createBuilder.s());
                i5 = 0;
            }
        }
        int i10 = i6;
        if (list.isEmpty() && ((aT = a.aT(this.h.r)) == 0 || aT != 3)) {
            alex a2 = this.b.a(this.h, b);
            if (this.h.o.size() == 0 || a2.j.size() > 0) {
                alog f2 = this.i.f(alsx.a, f, this.h);
                aozy createBuilder5 = aiei.a.createBuilder();
                alen b3 = b(i, a2);
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                aiei aieiVar2 = (aiei) createBuilder5.b;
                b3.getClass();
                aieiVar2.c = b3;
                aieiVar2.b |= 1;
                createBuilder5.av(c(f2));
                aiei aieiVar3 = (aiei) createBuilder5.s();
                i2 = i10 + aieiVar3.d.size();
                alobVar.h(aieiVar3);
                ((alvg) ((alvg) a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/observations/AtLeastOnceObservationGenerator", "generateObservations", 141, "AtLeastOnceObservationGenerator.java")).N("Mobalt: generated %s observations in %s observation batches for day index %s for report: %s-%s-%s-%s", Integer.valueOf(i2), Integer.valueOf(((alsx) alobVar.g()).c), Integer.valueOf(i), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g.b), Integer.valueOf(this.h.f));
                return alobVar.g();
            }
        }
        i2 = i10;
        ((alvg) ((alvg) a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/observations/AtLeastOnceObservationGenerator", "generateObservations", 141, "AtLeastOnceObservationGenerator.java")).N("Mobalt: generated %s observations in %s observation batches for day index %s for report: %s-%s-%s-%s", Integer.valueOf(i2), Integer.valueOf(((alsx) alobVar.g()).c), Integer.valueOf(i), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g.b), Integer.valueOf(this.h.f));
        return alobVar.g();
    }
}
