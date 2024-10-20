package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rcz {
    public static final xze a = xze.g("BugleDataModel", "ProcessPendingMessagesTimers");
    public static final long b = TimeUnit.SECONDS.toMillis(5);
    public static final long c = TimeUnit.SECONDS.toMillis(3);
    public static long d = 0;
    public static final Random e = new Random();
    public static final long[] f = new long[8];
    public static final int[] g = new int[8];
    public static final long[] h = new long[8];
    public final yep i;
    public final rjp j;

    static {
        for (int i = 0; i < 8; i++) {
            f[i] = 0;
            g[i] = 0;
            h[i] = 0;
        }
    }

    public rcz(yep yepVar, rjp rjpVar) {
        this.i = yepVar;
        this.j = rjpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(int i) {
        if (rjp.f(i)) {
            long j = h[i];
            if (j > 0) {
                return j;
            }
            return f[i];
        }
        xyo b2 = a.b();
        b2.H("Invalid channel at getNextRetryTime:");
        b2.F(i);
        b2.q();
        return Long.MAX_VALUE;
    }

    public static void b(int i, boolean z) {
        String str;
        if (!rjp.f(i)) {
            xyo b2 = a.b();
            b2.H("Invalid channel at clearNextRetryTimestamp:");
            b2.F(i);
            b2.q();
            return;
        }
        f[i] = 0;
        if (z) {
            g[i] = 0;
        }
        xyo c2 = a.c();
        c2.H("cleared next retry time for channel");
        c2.H(uvl.v(i));
        if (true != z) {
            str = "";
        } else {
            str = "including counter";
        }
        c2.H(str);
        c2.q();
    }

    public static void c(MessageCoreData messageCoreData) {
        b(rjp.b(messageCoreData), true);
    }

    public final boolean d(int i, long j) {
        if (i != 1) {
            return false;
        }
        if (j - d > c) {
            return false;
        }
        return true;
    }
}
