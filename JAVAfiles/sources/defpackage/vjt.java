package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjt extends unl {
    public final armf a;
    private final yep b;
    private final anen c;

    public vjt(armf armfVar, yep yepVar, anen anenVar) {
        this.a = armfVar;
        this.b = yepVar;
        this.c = anenVar;
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
        return aktp.e("RefreshMessageFailureNotificationHandler");
    }

    @Override // defpackage.unx
    public final apca e() {
        return und.a.getParserForType();
    }

    @Override // defpackage.unl
    public final akul j(alog alogVar) {
        return aktp.ah(new uql(this, 9), this.c).h(new vip(4), andi.a);
    }
}
