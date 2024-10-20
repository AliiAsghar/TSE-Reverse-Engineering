package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiem implements akoa {
    private static final alvi a = alvi.m("com/google/android/libraries/privatetelemetry/mobalt/workers/uploader/LogUploader");
    private final boolean b;
    private final aiea c;
    private final aidd d;
    private final aegu e;

    public aiem(boolean z, aiea aieaVar, aidd aiddVar, aegu aeguVar) {
        this.b = z;
        this.c = aieaVar;
        this.d = aiddVar;
        this.e = aeguVar;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [alhr, java.lang.Object] */
    @Override // defpackage.akoa
    public final ListenableFuture a() {
        akul akulVar;
        if (!this.b) {
            return this.d.a(this.e.f());
        }
        ((alvg) ((alvg) a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/workers/uploader/LogUploader", "sync", 41, "LogUploader.java")).q("Mobalt: enqueue sending logs to the Cobalt Server");
        final aiea aieaVar = this.c;
        if (!aieaVar.f) {
            akulVar = aieaVar.g.a(aieaVar.j.f());
        } else {
            ((alvg) ((alvg) aiea.a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl", "generateAggregatedObservations", 129, "MobaltPeriodicJobImpl.java")).q("Mobalt: start sending logs to the Cobalt Server");
            ((aixy) aieaVar.o.e.get()).b(Integer.valueOf(aieaVar.c), Integer.valueOf((int) aieaVar.d));
            final akul b = aieaVar.g.b(aieaVar.j.f());
            akul i = aktp.ap(b, aieaVar.k.a()).i(new ancr() { // from class: aidz
                /* JADX WARN: Removed duplicated region for block: B:67:0x01cd  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
                @Override // defpackage.ancr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        Method dump skipped, instructions count: 722
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.aidz.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, aieaVar.i);
            i.k(new adnx(aieaVar, 10), aieaVar.i);
            akulVar = i;
        }
        akat.c(akulVar, "Mobalt: failure in enqueued sending logs to the Cobalt server", new Object[0]);
        return aneh.a;
    }
}
