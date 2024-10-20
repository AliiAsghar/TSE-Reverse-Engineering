package defpackage;

import defpackage.dtp;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aofr extends dtp implements ScheduledFuture {
    private final ScheduledFuture c;

    public aofr(aofq aofqVar) {
        this.c = aofqVar.a(new asqc(this, null));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.c.compareTo(delayed);
    }

    @Override // defpackage.dtp
    protected final void d() {
        Object obj = this.value;
        boolean z = false;
        if ((obj instanceof dtp.b) && ((dtp.b) obj).c) {
            z = true;
        }
        this.c.cancel(z);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.c.getDelay(timeUnit);
    }
}
