package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqu extends ahqr implements ahmw, ahqm {
    private static final Callable a = new agug(5);
    private final ahqt b;
    private final ahri c;

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    public ahqu(ahqt ahqtVar, algw algwVar) {
        this.b = ahqtVar;
        this.c = (ahri) ((alha) algwVar).a.b();
    }

    private static ListenableFuture h(ListenableFuture... listenableFutureArr) {
        return albo.bY(listenableFutureArr).a(a, andi.a);
    }

    private final void i(ahqq ahqqVar, String str) {
        if (!ahqq.e(ahqqVar) && ((ahro) this.c.f.get()).a()) {
            int i = ahrj.a;
            str.getClass();
            if (ahrj.c.get() == null && a.bE(ahrj.c, new ahrd(str))) {
                ahrj.a = 5;
                ahrj.b = 1000;
                ahqqVar.d = true;
                return;
            }
            ((alvg) ((alvg) ahkh.a.f()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 66, "Tracer.java")).q("Ignore Tracer.start(), current active trace...");
        }
    }

    private final ListenableFuture j(ahqq ahqqVar, String str) {
        ahrd ahrdVar;
        String str2;
        if (ahqqVar != null && !ahqq.e(ahqqVar)) {
            if (ahqqVar.d) {
                final ahri ahriVar = this.c;
                if (true != TextUtils.isEmpty(null)) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                albo.T(true ^ TextUtils.isEmpty(str2));
                final ahrd ahrdVar2 = (ahrd) ahrj.c.getAndSet(null);
                if (ahrdVar2 != null) {
                    ahrdVar2.b.b = str2;
                }
                if (ahrdVar2 == null) {
                    return aneh.a;
                }
                return albo.bN(new ancr() { // from class: ahrg
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ancr
                    public final ListenableFuture a() {
                        List unmodifiableList;
                        ahri ahriVar2 = ahri.this;
                        if (!((ahrb) ahriVar2.d.b()).b()) {
                            return aneh.a;
                        }
                        if (((ahqz) ahriVar2.c.b()).b()) {
                            ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "endTracingIfStarted", 152, "TraceMetricServiceImpl.java")).q("Primes Tracing is not supported if TikTok tracing is enabled");
                            return aneh.a;
                        }
                        if (ahriVar2.e.c()) {
                            return aneh.a;
                        }
                        ahrd ahrdVar3 = ahrdVar2;
                        ahriVar2.e.b();
                        aiut.b();
                        String str3 = null;
                        if (ahrdVar3.a() != 0) {
                            zyv zyvVar = new zyv(9);
                            synchronized (ahrdVar3.d) {
                                Collections.sort(ahrdVar3.d, zyvVar);
                                ahrdVar3.b.b(ahrdVar3.d);
                            }
                            ArrayList arrayList = new ArrayList(ahrdVar3.c.keySet());
                            Collections.sort(arrayList, zyvVar);
                            ahrdVar3.b.b(arrayList);
                            ahqw ahqwVar = new ahqw(ahrdVar3.b);
                            ArrayList arrayList2 = new ArrayList();
                            ahqwVar.a(ahqwVar.a, 0L, arrayList2);
                            if (arrayList2.size() == 1) {
                                ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/trace/SpanProtoGenerator", "generate", 71, "SpanProtoGenerator.java")).q("No other span except for root span. Dropping trace...");
                            } else {
                                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
                                if (unmodifiableList == null && !unmodifiableList.isEmpty()) {
                                    aozy createBuilder = asii.a.createBuilder();
                                    long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    asii asiiVar = (asii) createBuilder.b;
                                    asiiVar.b = 1 | asiiVar.b;
                                    asiiVar.c = leastSignificantBits;
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    asii asiiVar2 = (asii) createBuilder.b;
                                    asiiVar2.a();
                                    aoyj.addAll(unmodifiableList, asiiVar2.e);
                                    asii asiiVar3 = (asii) createBuilder.s();
                                    if (asiiVar3.e.size() > 0) {
                                        str3 = ((asij) asiiVar3.e.get(0)).c;
                                    }
                                    long a2 = ahriVar2.a.a(str3);
                                    if (a2 == -1) {
                                        return aneh.a;
                                    }
                                    aozy createBuilder2 = asjt.a.createBuilder();
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    asjt asjtVar = (asjt) createBuilder2.b;
                                    asiiVar3.getClass();
                                    asjtVar.m = asiiVar3;
                                    asjtVar.b |= 2048;
                                    asjt asjtVar2 = (asjt) createBuilder2.s();
                                    ((alvg) ((alvg) ahkh.a.e()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "endTracingIfStarted", 185, "TraceMetricServiceImpl.java")).A("Recording trace %d: %s", asiiVar3.c, str3);
                                    ahmu ahmuVar = ahriVar2.a;
                                    ahmq a3 = ahmr.a();
                                    a3.e(asjtVar2);
                                    a3.d = Long.valueOf(a2);
                                    return ahmuVar.b(a3.a());
                                }
                                return aneh.a;
                            }
                        }
                        unmodifiableList = null;
                        if (unmodifiableList == null) {
                        }
                        return aneh.a;
                    }
                }, ahriVar.b);
            }
            ahmy ahmyVar = ahqqVar.b;
            long a2 = ahqqVar.a();
            if (!TextUtils.isEmpty(str) && a2 > 0 && (ahrdVar = (ahrd) ahrj.c.get()) != null) {
                ahmz ahmzVar = ahmyVar.a;
                long j = ahrdVar.b.c;
                long j2 = ahmzVar.a;
                if (j <= j2) {
                    ((alvg) ((alvg) ahkh.a.f()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceData", "sideLoadSpan", 115, "TraceData.java")).J("Sideload span: %s. startMs: %d, durationMs: %d", str, Long.valueOf(j2), Long.valueOf(a2));
                    ahqv ahqvVar = new ahqv(str, j2, j2 + a2, Thread.currentThread().getId(), 4);
                    synchronized (ahrdVar.d) {
                        ahrdVar.d.add(ahqvVar);
                    }
                    ahrdVar.b();
                }
            }
            return aneh.a;
        }
        return aneh.a;
    }

    @Override // defpackage.ahqm
    public final ListenableFuture a(ahka ahkaVar, long j, long j2, ashu ashuVar) {
        return this.b.a(ahkaVar, j, j2, ashuVar);
    }

    @Override // defpackage.ahqm
    public final ListenableFuture b(ahka ahkaVar, long j, long j2, ahqp ahqpVar) {
        return this.b.b(ahkaVar, j, j2, ahqpVar);
    }

    @Override // defpackage.ahqr
    public final synchronized ahqq c(ahka ahkaVar) {
        ahqq c;
        ahrd ahrdVar;
        c = this.b.c(ahkaVar);
        if (!ahqq.e(c) && c.d && (ahrdVar = (ahrd) ahrj.c.getAndSet(null)) != null) {
            ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "cancel", 97, "Tracer.java")).t("Cancel trace: %s", ahrdVar.b.b);
        }
        return c;
    }

    @Override // defpackage.ahqr
    public final synchronized ahqq d() {
        ahqq d;
        d = this.b.d();
        i(d, "");
        return d;
    }

    @Override // defpackage.ahqr
    public final ahqq e(ahka ahkaVar) {
        ahqq e = this.b.e(ahkaVar);
        i(e, ahkaVar.a);
        return e;
    }

    @Override // defpackage.ahqr
    public final ListenableFuture f(ahqq ahqqVar, ahka ahkaVar, ashu ashuVar, ahqp ahqpVar) {
        return h(this.b.f(ahqqVar, ahkaVar, ashuVar, ahqpVar), j(ahqqVar, ahkaVar.a));
    }

    @Override // defpackage.ahqr
    public final ListenableFuture g(ahka ahkaVar, ashu ashuVar, ahqp ahqpVar) {
        return h(this.b.g(ahkaVar, ashuVar, ahqpVar), j((ahqq) this.b.c.get(ahkaVar.a), ahkaVar.a));
    }

    @Override // defpackage.ahmw
    public final /* synthetic */ void as() {
    }
}
