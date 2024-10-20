package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikj extends TimerTask {
    final /* synthetic */ aikl a;
    private final String b;
    private final advp c;

    public aikj(aikl aiklVar, String str, advp advpVar) {
        this.a = aiklVar;
        this.b = str;
        this.c = advpVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        synchronized (this.a.e) {
            advr.d(this.c, "Removed context id: %s", this.b);
            this.a.e.remove(this.b);
        }
    }
}
