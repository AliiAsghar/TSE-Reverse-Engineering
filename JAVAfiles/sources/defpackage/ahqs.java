package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahqs implements ancr {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ ahqs(ahqt ahqtVar, String str, long j, ahqq ahqqVar, ashu ashuVar, int i) {
        this.f = i;
        this.b = ahqtVar;
        this.c = str;
        this.a = j;
        this.d = ahqqVar;
        this.e = ashuVar;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        long a;
        int i = 1;
        if (this.f != 0) {
            xaa xaaVar = (xaa) albo.bQ(this.b);
            UUID uuid = (UUID) albo.bQ(this.c);
            UUID randomUUID = UUID.randomUUID();
            boolean equals = xaaVar.equals(xaa.FIRST_FULL_SYNC);
            alob alobVar = new alob();
            if (xaa.FAILED_TO_UPDATE_TIMESTAMP.equals(xaaVar)) {
                alobVar.h(amvl.FAILED_TO_UPDATE_FIRST_FULL_SYNC_TIMESTAMP);
            }
            long j = this.a;
            Object obj = this.e;
            xac xacVar = (xac) this.d;
            vyv vyvVar = (vyv) xacVar.g.b();
            amvm amvmVar = (amvm) obj;
            ((xjc) vyvVar.a).b(uuid, alobVar.g(), vyv.L(amvmVar, true, equals, randomUUID));
            return ((xil) xacVar.i.b()).a(Instant.ofEpochMilli(-1L), Instant.ofEpochMilli(j), Instant.ofEpochMilli(j), amvmVar, uuid, randomUUID);
        }
        ahqt ahqtVar = (ahqt) this.b;
        if (!((ahro) ahqtVar.f.get()).a()) {
            ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "recordSystemHealthMetricInBackground", 435, "TimerMetricServiceImpl.java")).q("TimerMetric not recorded, metric was rejected by sampling configuration.");
            return aneh.a;
        }
        Object obj2 = this.d;
        long j2 = this.a;
        algw algwVar = ((ahqo) ahqtVar.d.b()).c;
        ahmu ahmuVar = ahqtVar.b;
        ahmq a2 = ahmr.a();
        a2.c(true);
        a2.d = Long.valueOf(j2);
        algw algwVar2 = (algw) ahqtVar.e.b();
        aozy createBuilder = asjt.a.createBuilder();
        boolean booleanValue = ((Boolean) algwVar2.a(new ahnx(4)).d(false)).booleanValue();
        aozy createBuilder2 = asju.a.createBuilder();
        if (booleanValue) {
            a = ((ahqq) obj2).b();
        } else {
            a = ((ahqq) obj2).a();
        }
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        asju asjuVar = (asju) createBuilder2.b;
        asjuVar.b |= 1;
        asjuVar.c = a;
        int ordinal = ((ahqq) obj2).c.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i = 4;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
        }
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        asju asjuVar2 = (asju) createBuilder2.b;
        asjuVar2.d = i - 1;
        asjuVar2.b |= 2;
        asju asjuVar3 = (asju) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        Object obj3 = this.e;
        Object obj4 = this.c;
        asjt asjtVar = (asjt) createBuilder.b;
        asjuVar3.getClass();
        asjtVar.g = asjuVar3;
        asjtVar.b |= 16;
        a2.e((asjt) createBuilder.s());
        a2.a = (String) obj4;
        a2.b = (ashu) obj3;
        return ahmuVar.b(a2.a());
    }

    public /* synthetic */ ahqs(xac xacVar, akul akulVar, akul akulVar2, amvm amvmVar, long j, int i) {
        this.f = i;
        this.d = xacVar;
        this.b = akulVar;
        this.c = akulVar2;
        this.e = amvmVar;
        this.a = j;
    }
}
