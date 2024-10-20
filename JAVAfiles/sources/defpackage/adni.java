package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adni extends Thread {
    final /* synthetic */ Runnable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adni(String str, Runnable runnable) {
        super(str);
        this.a = runnable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
