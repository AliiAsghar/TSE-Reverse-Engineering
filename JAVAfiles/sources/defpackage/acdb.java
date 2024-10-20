package defpackage;

import android.os.WorkSource;
import com.google.android.gms.location.CurrentLocationRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdb {
    public long a = 10000;
    public int b = 0;
    private int c = 102;
    private long d = Long.MAX_VALUE;

    public final CurrentLocationRequest a() {
        return new CurrentLocationRequest(this.a, this.b, this.c, this.d, false, 0, new WorkSource(null), null);
    }

    public final void b(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "durationMillis must be greater than 0");
        this.d = j;
    }

    public final void c(int i) {
        abgj.k(i);
        this.c = i;
    }
}
