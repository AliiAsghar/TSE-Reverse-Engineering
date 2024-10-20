package defpackage;

import io.grpc.Status;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arac implements Runnable, aqsg {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ arai f;

    public arac(arai araiVar, aqsn aqsnVar, boolean z) {
        long b;
        this.f = araiVar;
        this.a = z;
        if (aqsnVar == null) {
            this.b = false;
            b = 0;
        } else {
            this.b = true;
            b = aqsnVar.b(TimeUnit.NANOSECONDS);
        }
        this.c = b;
    }

    @Override // defpackage.aqsg
    public final void a(aqsm aqsmVar) {
        if (this.b && this.a && (aqsmVar.c() instanceof TimeoutException)) {
            this.f.h.c(b());
        } else {
            this.f.h.c(arrj.E(aqsmVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Status b() {
        String str;
        double longValue;
        long abs = Math.abs(this.c) / TimeUnit.SECONDS.toNanos(1L);
        long abs2 = Math.abs(this.c) % TimeUnit.SECONDS.toNanos(1L);
        StringBuilder sb = new StringBuilder();
        if (true != this.a) {
            str = "CallOptions";
        } else {
            str = "Context";
        }
        sb.append(str);
        sb.append(" deadline exceeded after ");
        if (this.c < 0) {
            sb.append('-');
        }
        sb.append(abs);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb.append("s. ");
        Long l = (Long) this.f.g.f(aqrx.k);
        Locale locale = Locale.US;
        if (l == null) {
            longValue = 0.0d;
        } else {
            longValue = l.longValue() / arai.a;
        }
        sb.append(String.format(locale, "Name resolution delay %.9f seconds.", Double.valueOf(longValue)));
        if (this.f.h != null) {
            arch archVar = new arch();
            this.f.h.b(archVar);
            sb.append(" ");
            sb.append(archVar);
        }
        return Status.f.withDescription(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f.e.g(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.h.c(b());
    }
}
