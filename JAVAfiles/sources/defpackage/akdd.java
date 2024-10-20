package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akdd implements gth {
    final Handler a;
    private final /* synthetic */ int b;

    public akdd(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    @Override // defpackage.gth
    public final void a(Runnable runnable) {
        if (this.b != 0) {
            this.a.removeCallbacks(runnable);
        } else {
            this.a.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.gth
    public final void b(long j, Runnable runnable) {
        if (this.b != 0) {
            this.a.postDelayed(runnable, j);
        } else {
            this.a.postDelayed(runnable, j);
        }
    }

    public akdd(int i) {
        this.b = i;
        this.a = dzg.c(Looper.getMainLooper());
    }
}
