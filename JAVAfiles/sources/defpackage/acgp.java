package defpackage;

import android.os.Looper;
import com.google.android.gms.phenotype.Configurations;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class acgp {
    protected final acgl a;
    protected final String b;
    protected final AtomicBoolean c = new AtomicBoolean(false);

    public acgp(acgl acglVar, String str) {
        this.a = acglVar;
        this.b = str;
    }

    @Deprecated
    protected void a(Configurations configurations) {
        throw new IllegalStateException("Requires implementation");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Configurations configurations) {
        a(configurations);
    }

    public final void c(Executor executor, acgo acgoVar) {
        d(executor, acgoVar, 3, 0L);
    }

    public final void d(Executor executor, acgo acgoVar, int i, long j) {
        this.a.y(this.b, "").n(executor, new acgm(this, i, executor, acgoVar, j, 1));
    }

    public final void e(final Executor executor, final acgo acgoVar, final int i, final long j) {
        if (j > 0) {
            new acda(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: acgn
                @Override // java.lang.Runnable
                public final void run() {
                    acgp.this.d(executor, acgoVar, i - 1, (float) j);
                }
            }, 0L);
        } else {
            d(executor, acgoVar, i - 1, 0L);
        }
    }
}
