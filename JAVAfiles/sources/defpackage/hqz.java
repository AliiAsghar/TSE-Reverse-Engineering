package defpackage;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqz {
    public String a;
    private final boolean b;
    private int c;
    private int d;

    public hqz(boolean z) {
        this.b = z;
    }

    public final hrc a() {
        if (!TextUtils.isEmpty(this.a)) {
            return new hrc(new ThreadPoolExecutor(this.c, this.d, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new hrb(this.a, this.b)));
        }
        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: ".concat(String.valueOf(this.a)));
    }

    public final void b(int i) {
        this.c = i;
        this.d = i;
    }
}
