package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxx extends xcf {
    public static final uuf a = uuh.f(uuh.b, "janitor_job_min_interval_millis", TimeUnit.MILLISECONDS.convert(7, TimeUnit.DAYS));
    public final armf b;
    public final aegu c;
    public final rdc d;

    public qxx(armf armfVar, rdc rdcVar, aegu aeguVar) {
        this.b = armfVar;
        this.d = rdcVar;
        this.c = aeguVar;
    }

    @Override // defpackage.xny
    public final akrh a() {
        return aktp.e("JanitorJobStartupTask");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alhr, java.lang.Object] */
    @Override // defpackage.xcf
    public final akul b() {
        return ((wul) this.d.a.get()).h().h(new qda(20), andi.a).h(new qlf(this, 14), andi.a);
    }

    @Override // defpackage.xck
    public final boolean fI() {
        return true;
    }
}
