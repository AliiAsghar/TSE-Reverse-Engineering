package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upz extends agps {
    public upz() {
        super("work_queue");
    }

    @Override // defpackage.agps
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void c(long j) {
        uqa uqaVar = new uqa();
        uqaVar.b(j);
        ae(new agpw(uqaVar), "work_queue-buildAndUpdateForId");
    }

    public final void d() {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 45030) {
            agnc.t("scheduled_in_workmanager", intValue2);
        }
        if (intValue >= 45030) {
            this.a.put("scheduled_in_workmanager", (Boolean) true);
        }
    }
}
