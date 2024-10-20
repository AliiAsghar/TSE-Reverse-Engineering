package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mif {
    private static final xze a = xze.g("BugleUsageStatistics", "UsageStatisticsStatus");
    private final armf b;

    public mif(armf armfVar) {
        this.b = armfVar;
    }

    public final void a() {
        a.l("Clearcut loggings are disabled.");
    }

    public final boolean b() {
        return ((yep) this.b.b()).i("bugle_enable_analytics", true);
    }
}
