package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqr implements hqp {
    private final File a;
    private hlx b;
    private final ico d = new ico((byte[]) null, (byte[]) null);
    private final ico c = new ico((char[]) null);

    @Deprecated
    public hqr(File file) {
        this.a = file;
    }

    private final synchronized hlx d() {
        if (this.b == null) {
            File file = this.a;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    hlx.f(file2, file3, false);
                }
            }
            hlx hlxVar = new hlx(file);
            if (hlxVar.b.exists()) {
                try {
                    hlxVar.d();
                    hlx.c(hlxVar.c);
                    Iterator it = hlxVar.g.values().iterator();
                    while (it.hasNext()) {
                        hlw hlwVar = (hlw) it.next();
                        if (hlwVar.f == null) {
                            for (int i = 0; i < hlxVar.d; i = 1) {
                                hlxVar.e += hlwVar.b[0];
                            }
                        } else {
                            hlwVar.f = null;
                            for (int i2 = 0; i2 < hlxVar.d; i2 = 1) {
                                hlx.c(hlwVar.c());
                                hlx.c(hlwVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    hlxVar.b();
                }
                this.b = hlxVar;
            }
            file.mkdirs();
            hlxVar = new hlx(file);
            hlxVar.e();
            this.b = hlxVar;
        }
        return this.b;
    }

    private final synchronized void e() {
        this.b = null;
    }

    @Override // defpackage.hqp
    public final File a(hne hneVar) {
        String t = this.c.t(hneVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + t + " for for Key: " + String.valueOf(hneVar));
        }
        try {
            hmk k = d().k(t);
            if (k == null) {
                return null;
            }
            return ((File[]) k.a)[0];
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.hqp
    public final synchronized void b() {
        try {
            try {
                d().b();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
            }
        } finally {
            e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [hmx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.hqp
    public final void c(hne hneVar, kkc kkcVar) {
        aspp asppVar;
        File d;
        ico icoVar = this.d;
        String t = this.c.t(hneVar);
        synchronized (icoVar) {
            asppVar = (aspp) icoVar.a.get(t);
            if (asppVar == null) {
                Object obj = icoVar.b;
                synchronized (((hgi) obj).a) {
                    asppVar = (aspp) ((hgi) obj).a.poll();
                }
                if (asppVar == null) {
                    asppVar = new aspp(null, null);
                }
                icoVar.a.put(t, asppVar);
            }
            asppVar.a++;
        }
        asppVar.b.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + t + " for for Key: " + String.valueOf(hneVar));
            }
            try {
                hlx d2 = d();
                if (d2.k(t) == null) {
                    hlv i = d2.i(t);
                    if (i != null) {
                        try {
                            synchronized (i.d) {
                                hlw hlwVar = i.a;
                                if (hlwVar.f == i) {
                                    if (!hlwVar.e) {
                                        i.b[0] = true;
                                    }
                                    d = hlwVar.d();
                                    i.d.a.mkdirs();
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                            if (kkcVar.b.a(kkcVar.a, d, (hnj) kkcVar.c)) {
                                i.d.a(i, true);
                                i.c = true;
                            }
                        } finally {
                            i.b();
                        }
                    } else {
                        throw new IllegalStateException(a.cp(t, "Had two simultaneous puts for: "));
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.d.u(t);
        }
    }
}
