package defpackage;

import j$.time.Duration;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class vjq extends unl {
    public final armf a;
    private final yep b;
    private final anen c;
    private final armf d;

    public vjq(armf armfVar, yep yepVar, anen anenVar, armf armfVar2) {
        this.a = armfVar;
        this.b = yepVar;
        this.c = anenVar;
        this.d = armfVar2;
    }

    @Override // defpackage.unl, defpackage.unx
    public final unf a() {
        une a = unf.a();
        a.c = amdy.REFRESH_STATEFUL_NOTIFICATIONS_ACTION;
        a.e(20);
        a.d = Duration.ofMillis(this.b.c("bugle_refresh_notification_backoff_duration_in_millis", 100L));
        return a.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RefreshIncomingMessageNotificationsHandler");
    }

    @Override // defpackage.unx
    public final apca e() {
        return vjr.a.getParserForType();
    }

    @Override // defpackage.unl
    public final akul j(alog alogVar) {
        if (!((yjf) this.d.b()).i()) {
            D.q("Cannot process pending work item, required phone permission is missing");
            return aktp.ag(upm.d());
        }
        return aktp.aj(new uvj(this, alogVar, 6), this.c).h(new vip(3), andi.a);
    }
}
