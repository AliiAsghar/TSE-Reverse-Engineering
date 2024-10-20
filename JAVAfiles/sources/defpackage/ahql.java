package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageStats;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahql extends ahnz implements ahlj, ahmw {
    public static final long b = TimeUnit.HOURS.toMillis(12);
    public final ahmu c;
    public final Context d;
    public final apwt e;
    public final ahrn f;
    private final ahlm g;
    private final Executor h;

    public ahql(ahmv ahmvVar, Context context, ahlm ahlmVar, Executor executor, apwt apwtVar, ahrn ahrnVar, armf armfVar) {
        super((byte[]) null);
        this.c = ahmvVar.a(executor, apwtVar, armfVar);
        this.h = executor;
        this.d = context;
        this.e = apwtVar;
        this.f = ahrnVar;
        this.g = ahlmVar;
    }

    @Override // defpackage.ahmw
    public final void as() {
        this.g.a(this);
    }

    @Override // defpackage.ahlj
    public final void i(ahka ahkaVar) {
        this.g.b(this);
        albo.bN(new ancr() { // from class: ahqk
            /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, aegu] */
            /* JADX WARN: Type inference failed for: r2v37, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v14, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Object, aegu] */
            /* JADX WARN: Type inference failed for: r8v40, types: [armf, java.lang.Object] */
            @Override // defpackage.ancr
            public final ListenableFuture a() {
                long j;
                ahql ahqlVar = ahql.this;
                if (!agqa.e(ahqlVar.d)) {
                    ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 109, "StorageMetricServiceImpl.java")).q("Device locked.");
                    return aneh.a;
                }
                aiut.b();
                ahrn ahrnVar = ahqlVar.f;
                long j2 = ahql.b;
                aiut.b();
                if (agqa.e((Context) ahrnVar.a)) {
                    long j3 = -1;
                    if (agqa.e((Context) ahrnVar.a)) {
                        j = ((SharedPreferences) ahrnVar.c.b()).getLong("primes.packageMetric.lastSendTime", -1L);
                    } else {
                        j = -1;
                    }
                    long a = ahrnVar.b.a();
                    if (a < j) {
                        if (!((SharedPreferences) ahrnVar.c.b()).edit().remove("primes.packageMetric.lastSendTime").commit()) {
                            ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/sampling/PersistentRateLimiting", "hasRecentTimeStamp", 51, "PersistentRateLimiting.java")).q("Failure storing timestamp to SharedPreferences");
                        }
                        j3 = -1;
                        j = -1;
                    }
                    if (j != j3 && a <= j + j2) {
                        ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 113, "StorageMetricServiceImpl.java")).q("Ignoring storage metric request, storage metric collection occurred too recently.");
                        return aneh.a;
                    }
                }
                if (!ahqlVar.c.c(null)) {
                    return aneh.a;
                }
                Context context = ahqlVar.d;
                aiut.b();
                PackageStats a2 = ahqi.a(context);
                if (a2 == null) {
                    return albo.bH(new IllegalStateException("PackageStats capture failed."));
                }
                aozy createBuilder = asjt.a.createBuilder();
                aozy createBuilder2 = asjo.a.createBuilder();
                long j4 = a2.cacheSize;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                asjo asjoVar = (asjo) createBuilder2.b;
                asjoVar.b |= 1;
                asjoVar.c = j4;
                long j5 = a2.codeSize;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                asjo asjoVar2 = (asjo) createBuilder2.b;
                asjoVar2.b |= 2;
                asjoVar2.d = j5;
                long j6 = a2.dataSize;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                asjo asjoVar3 = (asjo) createBuilder2.b;
                asjoVar3.b |= 4;
                asjoVar3.e = j6;
                long j7 = a2.externalCacheSize;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                asjo asjoVar4 = (asjo) createBuilder2.b;
                asjoVar4.b |= 8;
                asjoVar4.f = j7;
                long j8 = a2.externalCodeSize;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                asjo asjoVar5 = (asjo) createBuilder2.b;
                asjoVar5.b |= 16;
                asjoVar5.g = j8;
                long j9 = a2.externalDataSize;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                asjo asjoVar6 = (asjo) createBuilder2.b;
                asjoVar6.b |= 32;
                asjoVar6.h = j9;
                long j10 = a2.externalMediaSize;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                asjo asjoVar7 = (asjo) createBuilder2.b;
                asjoVar7.b |= 64;
                asjoVar7.i = j10;
                long j11 = a2.externalObbSize;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                asjo asjoVar8 = (asjo) createBuilder2.b;
                asjoVar8.b |= 128;
                asjoVar8.j = j11;
                aozy builder = ((asjo) createBuilder2.s()).toBuilder();
                algw algwVar = ((ahqj) ahqlVar.e.b()).a;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                asjt asjtVar = (asjt) createBuilder.b;
                asjo asjoVar9 = (asjo) builder.s();
                asjoVar9.getClass();
                asjtVar.j = asjoVar9;
                asjtVar.b |= 128;
                ahrn ahrnVar2 = ahqlVar.f;
                if (!agqa.e((Context) ahrnVar2.a) || !((SharedPreferences) ahrnVar2.c.b()).edit().putLong("primes.packageMetric.lastSendTime", ahrnVar2.b.a()).commit()) {
                    ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 146, "StorageMetricServiceImpl.java")).q("Failure storing timestamp persistently");
                }
                ahmu ahmuVar = ahqlVar.c;
                ahmq a3 = ahmr.a();
                a3.e((asjt) createBuilder.s());
                return ahmuVar.b(a3.a());
            }
        }, this.h);
    }

    @Override // defpackage.ahlj
    public final /* synthetic */ void j(ahka ahkaVar) {
    }
}
