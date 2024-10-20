package defpackage;

import android.os.Process;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class advu extends advv {
    private final Object a;

    public advu() {
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        int i = 500;
        if (Integer.bitCount(500) != 1) {
            int highestOneBit = Integer.highestOneBit(499);
            i = highestOneBit + highestOneBit;
        }
        Object[] objArr = new Object[i];
        this.a = new Object();
    }

    @Override // defpackage.advv
    public final void a(PrintWriter printWriter) {
        Process.myPid();
        synchronized (this.a) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
