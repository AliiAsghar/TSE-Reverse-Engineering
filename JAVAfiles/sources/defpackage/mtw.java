package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mtw implements nag {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ adlx c;
    private final /* synthetic */ int d;

    public mtw(long j, long j2, adlx adlxVar, int i) {
        this.d = i;
        this.b = j;
        this.a = j2;
        this.c = adlxVar;
    }

    @Override // defpackage.nag
    public final naf a(alog alogVar) {
        if (this.d != 0) {
            alogVar.getClass();
            alvw g = ((aluw) this.c.e).g();
            g.X(alwp.a, "BugleMapi");
            alvg alvgVar = (alvg) g.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderAppendPagingKeyQuery$1$1", "getPlaceholdersCount", 160, "BuglePlaceholdersCountQueries.kt");
            Long valueOf = Long.valueOf(this.a);
            Integer valueOf2 = Integer.valueOf(alogVar.size());
            long j = this.b;
            long j2 = j - this.a;
            alvgVar.K("Placeholder append key query: items after target key: %d, list size: %d, offset: %d, total: %d", valueOf, valueOf2, Long.valueOf(j2), Long.valueOf(j));
            return new naf(j2, this.a - alogVar.size());
        }
        alogVar.getClass();
        long size = alogVar.size();
        alvw g2 = ((aluw) this.c.e).g();
        g2.X(alwp.a, "BugleMapi");
        alvg alvgVar2 = (alvg) g2.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderPrependPagingKeyQuery$1$1", "getPlaceholdersCount", 129, "BuglePlaceholdersCountQueries.kt");
        Long valueOf3 = Long.valueOf(this.a);
        Integer valueOf4 = Integer.valueOf(alogVar.size());
        long j3 = this.b;
        long j4 = this.a - size;
        alvgVar2.K("Placeholder prepend key query: items before target key: %d, list size: %d, offset: %d, total: %d", valueOf3, valueOf4, Long.valueOf(j4), Long.valueOf(j3));
        return new naf(j4, this.b - this.a);
    }

    public mtw(long j, adlx adlxVar, long j2, int i) {
        this.d = i;
        this.a = j;
        this.c = adlxVar;
        this.b = j2;
    }
}
