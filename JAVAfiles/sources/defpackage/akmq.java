package defpackage;

import android.os.Looper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akmq {
    public static final String a = "akmq";
    static final byte[] b;
    public static final InputStream c;
    public final alhr d;
    public final Executor e;
    public final long f;
    public final int g;
    public PrintWriter h;
    public akmp i;

    static {
        byte[] bytes = "\nGap in log files detected, log data may be out of order or corrupted.\n".getBytes();
        b = bytes;
        c = aozb.w(bytes).m();
    }

    public akmq(alhr alhrVar, long j, int i, Executor executor) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "The max total log size must be greater than 0 bytes");
        d.t(i > 0, "There must be at least one log file");
        this.d = albo.D(alhrVar);
        this.g = i - 1;
        this.f = j / i;
        this.e = executor;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Looper.getMainLooper().getThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new AssertionError("This method should not be called on main thread."));
        }
    }

    public final File a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return new File(((File) this.d.get()).getAbsolutePath() + "." + i);
    }

    public final void c() {
        b();
        File file = (File) this.d.get();
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        this.i = new akmp(new BufferedWriter(new FileWriter(file, true)));
        this.h = new PrintWriter(this.i);
    }

    public final void d() {
        int i;
        b();
        if (this.g != 0) {
            b();
            int i2 = 0;
            int i3 = 1;
            int i4 = 1;
            while (true) {
                i = this.g;
                if (i3 > i) {
                    break;
                }
                File a2 = a(i3);
                if (a2.exists()) {
                    i2++;
                    if (i4 != i3) {
                        a2.renameTo(a(i4));
                    }
                    i4++;
                }
                i3++;
            }
            if (i2 == i) {
                a(1).delete();
                for (int i5 = 2; i5 <= this.g; i5++) {
                    a(i5).renameTo(a(i5 - 1));
                }
                i2--;
            }
            ((File) this.d.get()).renameTo(a(i2 + 1));
            return;
        }
        File file = (File) this.d.get();
        file.delete();
        file.createNewFile();
    }
}
