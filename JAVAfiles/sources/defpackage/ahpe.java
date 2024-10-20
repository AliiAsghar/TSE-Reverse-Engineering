package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpe {
    private static final ahpd g = new ahpd() { // from class: ahpb
        @Override // defpackage.ahpd
        public final void a(int i, String str) {
        }
    };
    public final apwt a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile ahpd d = g;
    public ScheduledFuture e;
    public ScheduledFuture f;

    public ahpe(ahlm ahlmVar, aneo aneoVar, Executor executor, apwt apwtVar) {
        this.a = apwtVar;
        this.b = executor;
        ahlmVar.a(new ahpc(this, aneoVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
        ScheduledFuture scheduledFuture2 = this.f;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f = null;
        }
    }
}
