package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mtu implements nag {
    final /* synthetic */ mjb a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ adlx d;

    public mtu(mjb mjbVar, long j, adlx adlxVar, long j2) {
        this.a = mjbVar;
        this.b = j;
        this.d = adlxVar;
        this.c = j2;
    }

    @Override // defpackage.nag
    public final naf a(alog alogVar) {
        alogVar.getClass();
        int aA = lga.aA(alogVar, this.a, new lnn(this.d, 9));
        long max = Math.max(0L, (this.b - aA) - 1);
        alvw g = ((aluw) this.d.e).g();
        g.X(alwp.a, "BugleMapi");
        ((alvg) g.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderInitialPagingKeyQuery$1$1", "getPlaceholdersCount", 97, "BuglePlaceholdersCountQueries.kt")).L("Placeholder initial paging key query: items before target key: %d, list size: %d, index of target key in list: %d, offset: %d, total: %d", Long.valueOf(this.b), Integer.valueOf(alogVar.size()), Integer.valueOf(aA), Long.valueOf(max), Long.valueOf(this.c));
        return new naf(max, (this.c - max) - alogVar.size());
    }
}
