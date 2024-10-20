package defpackage;

import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrl extends TimerTask {
    public final adrc a;
    final /* synthetic */ adrm b;
    private final String c;

    public adrl(adrm adrmVar, adrc adrcVar, String str) {
        this.b = adrmVar;
        this.a = adrcVar;
        this.c = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        advr.c("Timer has expired: %s is now considered idle", this.c);
        ahjj ahjjVar = this.b.b;
        ahjjVar.getClass();
        ahjjVar.m(this.a, this.c, false);
        adrm.a.remove(adrm.c(this.a, this.c));
    }
}
