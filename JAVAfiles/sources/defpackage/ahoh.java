package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahoh extends ahoo implements ahlj, ahmw {
    private final Context a;
    private final ahlp b;
    private final ahov c;
    private final ahoe d;
    private final ahog e;
    private final ArrayMap f;
    private final ahmu g;
    private final armf h;
    private final ahoq i;

    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    public ahoh(ahmv ahmvVar, Context context, ahlp ahlpVar, apwt<ahol> apwtVar, ahoe ahoeVar, armf<ahoi> armfVar, armf<asja> armfVar2, Executor executor, ahow ahowVar, armf<Boolean> armfVar3, ahop ahopVar, ahoq ahoqVar) {
        ArrayMap arrayMap = new ArrayMap();
        this.f = arrayMap;
        albo.T(true);
        this.g = ahmvVar.a(executor, apwtVar, armfVar2);
        this.a = context;
        this.b = ahlpVar;
        this.h = armfVar;
        this.d = ahoeVar;
        ahog ahogVar = new ahog(context, arrayMap, armfVar3);
        this.e = ahogVar;
        ?? b = ahowVar.a.b();
        b.getClass();
        aneo aneoVar = (aneo) ahowVar.b.b();
        aneoVar.getClass();
        this.c = new ahov(b, aneoVar, ahogVar);
        this.i = ahoqVar;
    }

    /* JADX WARN: Type inference failed for: r2v54, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [apwt, java.lang.Object] */
    private final ListenableFuture h(ahoj ahojVar) {
        ahoi ahoiVar;
        asjp asjpVar;
        boolean isEnabled;
        int i;
        if (!this.g.d()) {
            return aneh.a;
        }
        synchronized (this.f) {
            ahoiVar = (ahoi) this.f.remove(ahojVar.a);
            if (this.f.isEmpty()) {
                this.c.j();
            }
        }
        if (ahoiVar == null) {
            ((alvg) ((alvg) ahkh.a.g()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 199, "FrameMetricServiceImpl.java")).t("Measurement not found: %s", new ahlg(ahojVar.a.a));
            return aneh.a;
        }
        ahoq ahoqVar = this.i;
        String b = ahojVar.a.b();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            isEnabled = Trace.isEnabled();
            if (isEnabled) {
                Trace.endAsyncSection(String.format("J<%s>", b), 352691800);
                for (ahot ahotVar : ((ahou) ahoqVar.a.b()).c) {
                    int X = a.X(ahotVar.b);
                    if (X == 0) {
                        X = 1;
                    }
                    switch (X - 1) {
                        case 1:
                            i = 0;
                            break;
                        case 2:
                            i = ahoiVar.g;
                            break;
                        case 3:
                            i = ahoiVar.i;
                            break;
                        case 4:
                            i = ahoiVar.j;
                            break;
                        case 5:
                            i = ahoiVar.k;
                            break;
                        case 6:
                            i = ahoiVar.l;
                            break;
                        case 7:
                            i = ahoiVar.n;
                            break;
                        default:
                            ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/jank/JankPerfettoTrigger", "endTraceSectionAndEmitCounters", 149, "JankPerfettoTrigger.java")).t("UNKNOWN COUNTER with %s as the name", ahotVar.c);
                            continue;
                    }
                    Trace.setCounter(ahotVar.c.replace("%EVENT_NAME%", b), i);
                }
            }
        }
        if (ahoiVar.i == 0) {
            return aneh.a;
        }
        ahoq ahoqVar2 = this.i;
        if (((ahou) ahoqVar2.a.b()).d) {
            Long l = 9L;
            l.getClass();
            if (ahoiVar.n <= 9 && ahoiVar.g != 0) {
                ahna ahnaVar = (ahna) ahoqVar2.b.b();
                String replace = ((ahou) ahoqVar2.a.b()).b.replace("%PACKAGE_NAME%", ((Context) ahoqVar2.d).getPackageName());
                replace.getClass();
                ahnaVar.a(replace);
            }
        }
        long a = ahoiVar.c.a() - ahoiVar.d;
        aozy createBuilder = asjm.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        asjm asjmVar = (asjm) apagVar;
        asjmVar.b |= 16;
        asjmVar.g = ((int) a) + 1;
        int i2 = ahoiVar.g;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        asjm asjmVar2 = (asjm) apagVar2;
        asjmVar2.b |= 1;
        asjmVar2.c = i2;
        int i3 = ahoiVar.i;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        asjm asjmVar3 = (asjm) apagVar3;
        asjmVar3.b |= 2;
        asjmVar3.d = i3;
        int i4 = ahoiVar.j;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        asjm asjmVar4 = (asjm) apagVar4;
        asjmVar4.b |= 4;
        asjmVar4.e = i4;
        int i5 = ahoiVar.l;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apag apagVar5 = createBuilder.b;
        asjm asjmVar5 = (asjm) apagVar5;
        asjmVar5.b |= 32;
        asjmVar5.h = i5;
        int i6 = ahoiVar.n;
        if (!apagVar5.isMutable()) {
            createBuilder.u();
        }
        apag apagVar6 = createBuilder.b;
        asjm asjmVar6 = (asjm) apagVar6;
        asjmVar6.b |= 64;
        asjmVar6.i = i6;
        int i7 = ahoiVar.k;
        if (!apagVar6.isMutable()) {
            createBuilder.u();
        }
        asjm asjmVar7 = (asjm) createBuilder.b;
        asjmVar7.b |= 8;
        asjmVar7.f = i7;
        int i8 = ahoiVar.o;
        if (i8 != Integer.MIN_VALUE) {
            int[] iArr = ahoiVar.f;
            int[] iArr2 = ahoi.b;
            aozy createBuilder2 = asjp.a.createBuilder();
            int i9 = 0;
            while (true) {
                if (i9 < 52) {
                    if (iArr2[i9] > i8) {
                        createBuilder2.cr(0);
                        createBuilder2.cq(i8 + 1);
                        asjpVar = (asjp) createBuilder2.s();
                    } else {
                        int i10 = iArr[i9];
                        if (i10 > 0 || (i9 > 0 && iArr[i9 - 1] > 0)) {
                            createBuilder2.cr(i10);
                            createBuilder2.cq(iArr2[i9]);
                        }
                        i9++;
                    }
                } else {
                    if (iArr[51] > 0) {
                        createBuilder2.cq(i8 + 1);
                        createBuilder2.cr(0);
                    }
                    asjpVar = (asjp) createBuilder2.s();
                }
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar7 = createBuilder.b;
            asjm asjmVar8 = (asjm) apagVar7;
            asjpVar.getClass();
            asjmVar8.o = asjpVar;
            asjmVar8.b |= 2048;
            int i11 = ahoiVar.h;
            if (!apagVar7.isMutable()) {
                createBuilder.u();
            }
            apag apagVar8 = createBuilder.b;
            asjm asjmVar9 = (asjm) apagVar8;
            asjmVar9.b |= 512;
            asjmVar9.m = i11;
            int i12 = ahoiVar.m;
            if (!apagVar8.isMutable()) {
                createBuilder.u();
            }
            asjm asjmVar10 = (asjm) createBuilder.b;
            asjmVar10.b |= 1024;
            asjmVar10.n = i12;
        }
        int i13 = 0;
        while (i13 < 28) {
            int i14 = i13 + 1;
            if (ahoiVar.e[i13] > 0) {
                aozy createBuilder3 = asjl.a.createBuilder();
                int i15 = ahoiVar.e[i13];
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar9 = createBuilder3.b;
                asjl asjlVar = (asjl) apagVar9;
                asjlVar.b |= 1;
                asjlVar.c = i15;
                int i16 = ahoi.a[i13];
                if (!apagVar9.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar10 = createBuilder3.b;
                asjl asjlVar2 = (asjl) apagVar10;
                asjlVar2.b |= 2;
                asjlVar2.d = i16;
                if (i14 < 28) {
                    int i17 = ahoi.a[i14] - 1;
                    if (!apagVar10.isMutable()) {
                        createBuilder3.u();
                    }
                    asjl asjlVar3 = (asjl) createBuilder3.b;
                    asjlVar3.b |= 4;
                    asjlVar3.e = i17;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                asjm asjmVar11 = (asjm) createBuilder.b;
                asjl asjlVar4 = (asjl) createBuilder3.s();
                asjlVar4.getClass();
                apax apaxVar = asjmVar11.k;
                if (!apaxVar.c()) {
                    asjmVar11.k = apag.mutableCopy(apaxVar);
                }
                asjmVar11.k.add(asjlVar4);
            }
            i13 = i14;
        }
        asjm asjmVar12 = (asjm) createBuilder.s();
        algw a2 = ahof.a(this.a);
        if (a2.f()) {
            aozy builder = asjmVar12.toBuilder();
            int intValue = ((Float) a2.b()).intValue();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            asjm asjmVar13 = (asjm) builder.b;
            asjmVar13.b |= 256;
            asjmVar13.l = intValue;
            asjmVar12 = (asjm) builder.s();
        }
        aozy createBuilder4 = asjt.a.createBuilder();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        asjt asjtVar = (asjt) createBuilder4.b;
        asjmVar12.getClass();
        asjtVar.l = asjmVar12;
        asjtVar.b |= 1024;
        asjt asjtVar2 = (asjt) createBuilder4.s();
        ahmu ahmuVar = this.g;
        ahmq a3 = ahmr.a();
        a3.e(asjtVar2);
        String str = null;
        a3.b = null;
        ahos ahosVar = ahojVar.a;
        if (true == ahosVar.b) {
            str = "Activity";
        }
        a3.c = str;
        a3.a = ahosVar.b();
        if (ahojVar.a.a != null) {
            z = true;
        }
        a3.c(z);
        return ahmuVar.b(a3.a());
    }

    private final void k(ahos ahosVar) {
        boolean isEnabled;
        if (!this.g.c(ahosVar.b())) {
            return;
        }
        synchronized (this.f) {
            if (this.f.size() >= 25) {
                ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 149, "FrameMetricServiceImpl.java")).t("Too many concurrent measurements, ignoring %s", ahosVar);
                return;
            }
            ahoi ahoiVar = (ahoi) this.f.put(ahosVar, (ahoi) this.h.b());
            if (ahoiVar != null) {
                this.f.put(ahosVar, ahoiVar);
                ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 162, "FrameMetricServiceImpl.java")).t("measurement already started: %s", ahosVar);
                return;
            }
            if (this.f.size() == 1) {
                this.c.i();
            }
            String b = ahosVar.b();
            if (Build.VERSION.SDK_INT >= 29) {
                isEnabled = Trace.isEnabled();
                if (isEnabled) {
                    Trace.beginAsyncSection(String.format("J<%s>", b), 352691800);
                }
            }
        }
    }

    public ListenableFuture<Void> a(Activity activity) {
        ahos a = ahos.a(activity);
        alfd alfdVar = alfd.a;
        return h(new ahoj(a, alfdVar, alfdVar));
    }

    @Override // defpackage.ahmw
    public void as() {
        this.b.a(this.c);
        this.b.a(this.d);
    }

    @Override // defpackage.ahoo
    public ListenableFuture<Void> b(ahom ahomVar) {
        ahos ahosVar;
        ahka ahkaVar = ahomVar.b;
        if (ahkaVar != null) {
            albo.C(ahkaVar);
            ahosVar = new ahos(null, ahkaVar, false);
        } else {
            ahosVar = new ahos(ahomVar.a, null, false);
        }
        return h(new ahoj(ahosVar, ahomVar.c, ahomVar.d));
    }

    public void c(Activity activity) {
        k(ahos.a(activity));
    }

    @Override // defpackage.ahoo
    public void d(ahka ahkaVar) {
        k(new ahos(null, ahkaVar, false));
    }

    @Override // defpackage.ahlj
    public void i(ahka ahkaVar) {
        synchronized (this.f) {
            this.f.clear();
        }
    }

    @Override // defpackage.ahlj
    public /* synthetic */ void j(ahka ahkaVar) {
    }
}
