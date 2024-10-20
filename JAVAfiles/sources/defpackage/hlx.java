package defpackage;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlx implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public Writer f;
    public int h;
    private final File j;
    public long e = 0;
    public final LinkedHashMap g = new LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hlu());
    private final Callable n = new alca(this, 1);
    private final int k = 1;
    public final int d = 1;
    private final long l = 262144000;

    public hlx(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
    }

    public static void c(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void f(File file, File file2, boolean z) {
        if (z) {
            c(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    private final void l() {
        if (this.f != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void m(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void n(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized void a(hlv hlvVar, boolean z) {
        hlw hlwVar = hlvVar.a;
        if (hlwVar.f == hlvVar) {
            if (z && !hlwVar.e) {
                for (int i = 0; i < this.d; i = 1) {
                    if (hlvVar.b[0]) {
                        if (!hlwVar.d().exists()) {
                            hlvVar.a();
                            return;
                        }
                    } else {
                        hlvVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index 0");
                    }
                }
            }
            for (int i2 = 0; i2 < this.d; i2 = 1) {
                File d = hlwVar.d();
                if (z) {
                    if (d.exists()) {
                        File c = hlwVar.c();
                        d.renameTo(c);
                        long j = hlwVar.b[0];
                        long length = c.length();
                        hlwVar.b[0] = length;
                        this.e = (this.e - j) + length;
                    }
                } else {
                    c(d);
                }
            }
            this.h++;
            hlwVar.f = null;
            if (hlwVar.e | z) {
                hlwVar.e = true;
                this.f.append((CharSequence) "CLEAN");
                this.f.append(' ');
                this.f.append((CharSequence) hlwVar.a);
                this.f.append((CharSequence) hlwVar.a());
                this.f.append('\n');
                if (z) {
                    this.m++;
                }
            } else {
                this.g.remove(hlwVar.a);
                this.f.append((CharSequence) "REMOVE");
                this.f.append(' ');
                this.f.append((CharSequence) hlwVar.a);
                this.f.append('\n');
            }
            n(this.f);
            if (this.e <= this.l && !h()) {
                return;
            }
            this.i.submit(this.n);
            return;
        }
        throw new IllegalStateException();
    }

    public final void b() {
        close();
        hma.b(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.g.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hlv hlvVar = ((hlw) arrayList.get(i)).f;
            if (hlvVar != null) {
                hlvVar.a();
            }
        }
        g();
        m(this.f);
        this.f = null;
    }

    public final void d() {
        String a;
        String substring;
        hlz hlzVar = new hlz(new FileInputStream(this.b), hma.a);
        try {
            String a2 = hlzVar.a();
            String a3 = hlzVar.a();
            String a4 = hlzVar.a();
            String a5 = hlzVar.a();
            String a6 = hlzVar.a();
            if ("libcore.io.DiskLruCache".equals(a2) && "1".equals(a3) && Integer.toString(this.k).equals(a4) && Integer.toString(this.d).equals(a5) && "".equals(a6)) {
                int i = 0;
                while (true) {
                    try {
                        a = hlzVar.a();
                        int indexOf = a.indexOf(32);
                        if (indexOf != -1) {
                            int i2 = indexOf + 1;
                            int indexOf2 = a.indexOf(32, i2);
                            if (indexOf2 == -1) {
                                substring = a.substring(i2);
                                if (indexOf == 6) {
                                    if (a.startsWith("REMOVE")) {
                                        this.g.remove(substring);
                                        i++;
                                    } else {
                                        indexOf = 6;
                                    }
                                }
                            } else {
                                substring = a.substring(i2, indexOf2);
                            }
                            hlw hlwVar = (hlw) this.g.get(substring);
                            if (hlwVar == null) {
                                hlwVar = new hlw(this, substring);
                                this.g.put(substring, hlwVar);
                            }
                            if (indexOf2 != -1 && indexOf == 5) {
                                if (a.startsWith("CLEAN")) {
                                    String[] split = a.substring(indexOf2 + 1).split(" ");
                                    hlwVar.e = true;
                                    hlwVar.f = null;
                                    if (split.length == hlwVar.g.d) {
                                        for (int i3 = 0; i3 < split.length; i3++) {
                                            try {
                                                hlwVar.b[i3] = Long.parseLong(split[i3]);
                                            } catch (NumberFormatException unused) {
                                                throw hlw.e(split);
                                            }
                                        }
                                        i++;
                                    } else {
                                        throw hlw.e(split);
                                    }
                                } else {
                                    indexOf = 5;
                                }
                            }
                            if (indexOf2 == -1 && indexOf == 5 && a.startsWith("DIRTY")) {
                                hlwVar.f = new hlv(this, hlwVar);
                            } else if (indexOf2 != -1 || indexOf != 4 || !a.startsWith("READ")) {
                                break;
                            }
                            i++;
                        } else {
                            throw new IOException("unexpected journal line: ".concat(String.valueOf(a)));
                        }
                    } catch (EOFException unused2) {
                        this.h = i - this.g.size();
                        if (hlzVar.b == -1) {
                            e();
                        } else {
                            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), hma.a));
                        }
                        hma.a(hlzVar);
                        return;
                    }
                }
                throw new IOException("unexpected journal line: ".concat(String.valueOf(a)));
            }
            throw new IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + "]");
        } catch (Throwable th) {
            hma.a(hlzVar);
            throw th;
        }
    }

    public final synchronized void e() {
        Writer writer = this.f;
        if (writer != null) {
            m(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), hma.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (hlw hlwVar : this.g.values()) {
                if (hlwVar.f != null) {
                    bufferedWriter.write(a.bW(hlwVar.a, "DIRTY ", "\n"));
                } else {
                    bufferedWriter.write("CLEAN " + hlwVar.a + hlwVar.a() + "\n");
                }
            }
            m(bufferedWriter);
            if (this.b.exists()) {
                f(this.b, this.j, true);
            }
            f(this.c, this.b, false);
            this.j.delete();
            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), hma.a));
        } catch (Throwable th) {
            m(bufferedWriter);
            throw th;
        }
    }

    public final void g() {
        while (this.e > this.l) {
            j((String) ((Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean h() {
        int i = this.h;
        if (i >= 2000 && i >= this.g.size()) {
            return true;
        }
        return false;
    }

    public final synchronized hlv i(String str) {
        l();
        hlw hlwVar = (hlw) this.g.get(str);
        if (hlwVar == null) {
            hlwVar = new hlw(this, str);
            this.g.put(str, hlwVar);
        } else if (hlwVar.f != null) {
            return null;
        }
        hlv hlvVar = new hlv(this, hlwVar);
        hlwVar.f = hlvVar;
        this.f.append((CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        n(this.f);
        return hlvVar;
    }

    public final synchronized void j(String str) {
        l();
        hlw hlwVar = (hlw) this.g.get(str);
        if (hlwVar != null && hlwVar.f == null) {
            for (int i = 0; i < this.d; i = 1) {
                File c = hlwVar.c();
                if (c.exists() && !c.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(c))));
                }
                long j = this.e;
                long[] jArr = hlwVar.b;
                this.e = j - jArr[0];
                jArr[0] = 0;
            }
            this.h++;
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
            this.g.remove(str);
            if (h()) {
                this.i.submit(this.n);
            }
        }
    }

    public final synchronized hmk k(String str) {
        l();
        hlw hlwVar = (hlw) this.g.get(str);
        if (hlwVar != null && hlwVar.e) {
            File[] fileArr = hlwVar.c;
            int length = fileArr.length;
            for (int i = 0; i < length; i = 1) {
                if (fileArr[0].exists()) {
                }
            }
            this.h++;
            this.f.append((CharSequence) "READ");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
            if (h()) {
                this.i.submit(this.n);
            }
            return new hmk(hlwVar.c);
        }
        return null;
    }
}
