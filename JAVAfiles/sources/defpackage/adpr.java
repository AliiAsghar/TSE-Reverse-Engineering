package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adpr {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public final long b;
    public final long c = SystemClock.elapsedRealtime();

    public adpr(long j) {
        this.b = j;
    }
}
