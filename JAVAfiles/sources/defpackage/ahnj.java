package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahnj {
    public final File a;
    public int b = 0;
    public boolean c = false;
    private final String d;
    private File e;

    public ahnj(File file, String str) {
        this.a = file;
        this.d = str;
    }

    public final int a() {
        if (!c()) {
            return 0;
        }
        return this.b;
    }

    public final File b() {
        if (this.e == null) {
            this.e = new File(this.a, this.d.concat("_crash_counter_storage.pb"));
        }
        return this.e;
    }

    public final boolean c() {
        FileInputStream fileInputStream;
        if (this.c) {
            return true;
        }
        try {
            fileInputStream = new FileInputStream(b());
        } catch (FileNotFoundException unused) {
            this.b = 0;
        } catch (IOException e) {
            ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "maybeLoad", 'f', "CrashCounter.java")).q("failed to read counter from disk.");
            return false;
        }
        try {
            this.b = ((ahnm) apag.parseFrom(ahnm.a, fileInputStream, aozs.a())).c;
            fileInputStream.close();
            this.c = true;
            return true;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
