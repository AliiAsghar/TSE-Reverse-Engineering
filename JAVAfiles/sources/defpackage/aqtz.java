package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aqtz {
    public static final aqrl a = new aqrl("internal:health-checking-config");
    public static final aqtn b = new aqtn("internal:health-check-consumer-listener", null);
    public static final aqtn c = new aqtn("internal:disable-subchannel-reconnect", Boolean.FALSE);
    public static final aqrl d = new aqrl("internal:has-health-check-producer-listener");
    public static final aqrl e = new aqrl("io.grpc.IS_PETIOLE_POLICY");
    private int f;

    public Status a(aqtv aqtvVar) {
        throw null;
    }

    public abstract void b(Status status);

    public void c(aqtv aqtvVar) {
        int i = this.f;
        this.f = i + 1;
        if (i == 0) {
            a(aqtvVar);
        }
        this.f = 0;
    }

    public abstract void e();

    public void d() {
    }
}
