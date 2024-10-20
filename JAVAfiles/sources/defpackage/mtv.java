package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mtv implements nag {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ adlx c;

    public mtv(long j, int i, adlx adlxVar) {
        this.a = j;
        this.b = i;
        this.c = adlxVar;
    }

    @Override // defpackage.nag
    public final naf a(alog alogVar) {
        alogVar.getClass();
        long min = Math.min(this.a, this.b);
        alvw g = ((aluw) this.c.e).g();
        g.X(alwp.a, "BugleMapi");
        ((alvg) g.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderOffsetCountQuery$1$1", "getPlaceholdersCount", 64, "BuglePlaceholdersCountQueries.kt")).J("Placeholder offset count query: list size: %d, offset: %d, total: %d", Integer.valueOf(alogVar.size()), Long.valueOf(min), Long.valueOf(this.a));
        return new naf(min, (this.a - min) - alogVar.size());
    }
}
