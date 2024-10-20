package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyk implements Executor {
    private final /* synthetic */ int a;
    private final Object b;

    public qyk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ((Handler) this.b).post(runnable);
                        return;
                    }
                    atfg atfgVar = new atfg(runnable, Thread.currentThread());
                    this.b.execute(atfgVar);
                    InlineExecutionProhibitedException inlineExecutionProhibitedException = atfgVar.b;
                    if (inlineExecutionProhibitedException == null) {
                        atfgVar.a = null;
                        return;
                    }
                    throw inlineExecutionProhibitedException;
                }
                ((Handler) this.b).post(runnable);
                return;
            }
            ((qxz) this.b).execute(runnable);
            return;
        }
        ((qxz) this.b).execute(runnable);
    }

    public qyk(int i) {
        this.a = i;
        this.b = new Handler(Looper.getMainLooper());
    }

    public qyk(uac uacVar, int i, byte[] bArr) {
        this.a = i;
        this.b = uacVar.y(4);
    }

    public qyk(uac uacVar, int i) {
        this.a = i;
        this.b = uacVar.y(2);
    }
}
