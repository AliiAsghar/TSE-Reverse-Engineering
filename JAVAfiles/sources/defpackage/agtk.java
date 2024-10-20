package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agtk extends Thread {
    final /* synthetic */ agtl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtk(agtl agtlVar, Runnable runnable, String str) {
        super(runnable, str);
        this.a = agtlVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.a.b.b();
        Process.setThreadPriority(this.a.a);
        try {
            super.run();
        } finally {
            this.a.b.c();
        }
    }
}
