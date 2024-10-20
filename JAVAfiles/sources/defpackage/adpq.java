package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adpq implements Runnable {
    final /* synthetic */ adps a;
    private final String b;
    private final long c;

    public adpq(adps adpsVar, String str, long j) {
        this.a = adpsVar;
        this.b = str;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Objects.isNull(this.a.b)) {
            advr.q("Capability service not registered.", new Object[0]);
            return;
        }
        advr.o("Requesting capabilities for %s", advq.USER_ID.c(this.b));
        try {
            this.a.b.s("", this.c, this.b);
        } catch (aild e) {
            advr.q("Unable to send capabilities request to %s: %s", advq.USER_ID.c(this.b), e.getMessage());
        }
    }
}
