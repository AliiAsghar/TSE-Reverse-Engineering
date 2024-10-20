package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class acqd extends TimerTask {
    protected final String a;

    public acqd(String str) {
        this.a = str;
    }

    protected abstract void a();

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        a();
    }
}
