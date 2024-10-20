package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqzt implements arge {
    public static final Logger a = Logger.getLogger(aqzt.class.getName());
    public final ScheduledExecutorService b;
    public final aqwe c;
    public arbp d;
    public asmb e;

    public aqzt(ScheduledExecutorService scheduledExecutorService, aqwe aqweVar) {
        this.b = scheduledExecutorService;
        this.c = aqweVar;
    }

    @Override // defpackage.arge
    public final void a() {
        this.c.c();
        this.c.execute(new aomp(this, 13));
    }
}
