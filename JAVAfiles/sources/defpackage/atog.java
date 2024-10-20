package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atog {
    public long a;
    public final Object b;
    public final Object c;

    public atog(esp espVar, esu esuVar, long j) {
        this.c = espVar;
        this.a = j;
        this.b = esuVar;
    }

    public static int a(InputStream inputStream) {
        return (o(inputStream) << 24) | o(inputStream) | (o(inputStream) << 8) | (o(inputStream) << 16);
    }

    public static long b(InputStream inputStream) {
        return (o(inputStream) & 255) | ((o(inputStream) & 255) << 8) | ((o(inputStream) & 255) << 16) | ((o(inputStream) & 255) << 24) | ((o(inputStream) & 255) << 32) | ((o(inputStream) & 255) << 40) | ((o(inputStream) & 255) << 48) | ((o(inputStream) & 255) << 56);
    }

    public static String e(hkq hkqVar) {
        return new String(l(hkqVar, b(hkqVar)), "UTF-8");
    }

    static void i(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void j(OutputStream outputStream, long j) {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void k(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        j(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] l(hkq hkqVar, long j) {
        long a = hkqVar.a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(hkqVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException(a.cs(a, j, "streamToBytes length=", ", maxLength="));
    }

    private static int o(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    private final void p(String str, hkp hkpVar) {
        if (!this.b.containsKey(str)) {
            this.a += hkpVar.a;
        } else {
            this.a += hkpVar.a - ((hkp) this.b.get(str)).a;
        }
        this.b.put(str, hkpVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    private final void q(String str) {
        hkp hkpVar = (hkp) this.b.remove(str);
        if (hkpVar != null) {
            this.a -= hkpVar.a;
        }
    }

    private static final String r(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final synchronized hjs c(String str) {
        hkp hkpVar = (hkp) this.b.get(str);
        if (hkpVar == null) {
            return null;
        }
        File d = d(str);
        try {
            hkq hkqVar = new hkq(new BufferedInputStream(new FileInputStream(d)), d.length());
            try {
                hkp a = hkp.a(hkqVar);
                if (!TextUtils.equals(str, a.b)) {
                    hkn.a("%s: key=%s, found=%s", d.getAbsolutePath(), str, a.b);
                    q(str);
                    return null;
                }
                byte[] l = l(hkqVar, hkqVar.a());
                hjs hjsVar = new hjs();
                hjsVar.a = l;
                hjsVar.b = hkpVar.c;
                hjsVar.c = hkpVar.d;
                hjsVar.d = hkpVar.e;
                hjsVar.e = hkpVar.f;
                hjsVar.f = hkpVar.g;
                List<hjx> list = hkpVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (hjx hjxVar : list) {
                    treeMap.put(hjxVar.a, hjxVar.b);
                }
                hjsVar.g = treeMap;
                hjsVar.h = DesugarCollections.unmodifiableList(hkpVar.h);
                return hjsVar;
            } finally {
                hkqVar.close();
            }
        } catch (IOException e) {
            hkn.a("%s: %s", d.getAbsolutePath(), e.toString());
            h(str);
            return null;
        }
    }

    public final File d(String str) {
        return new File(((hkw) this.c).a(), r(str));
    }

    public final synchronized void f() {
        long length;
        hkq hkqVar;
        File a = ((hkw) this.c).a();
        if (!a.exists()) {
            if (!a.mkdirs()) {
                hkn.b("Unable to create cache dir %s", a.getAbsolutePath());
            }
        } else {
            File[] listFiles = a.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        length = file.length();
                        hkqVar = new hkq(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        hkp a2 = hkp.a(hkqVar);
                        a2.a = length;
                        p(a2.b, a2);
                        hkqVar.close();
                    } catch (Throwable th) {
                        hkqVar.close();
                        throw th;
                        break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map, java.lang.Object] */
    public final synchronized void g(String str, hjs hjsVar) {
        List list;
        long j;
        long j2 = this.a;
        int length = hjsVar.a.length;
        if (j2 + length <= 5242880 || length <= 4718592.0f) {
            File d = d(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d));
                String str2 = hjsVar.b;
                long j3 = hjsVar.c;
                long j4 = hjsVar.d;
                long j5 = hjsVar.e;
                long j6 = hjsVar.f;
                List list2 = hjsVar.h;
                if (list2 == null) {
                    Map map = hjsVar.g;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Iterator it = map.entrySet().iterator(); it.hasNext(); it = it) {
                        Map.Entry entry = (Map.Entry) it.next();
                        arrayList.add(new hjx((String) entry.getKey(), (String) entry.getValue()));
                    }
                    list = arrayList;
                    j = j4;
                } else {
                    list = list2;
                    j = j4;
                }
                hkp hkpVar = new hkp(str, str2, j3, j, j5, j6, list);
                try {
                    i(bufferedOutputStream, 538247942);
                    k(bufferedOutputStream, hkpVar.b);
                    String str3 = hkpVar.c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    k(bufferedOutputStream, str3);
                    j(bufferedOutputStream, hkpVar.d);
                    j(bufferedOutputStream, hkpVar.e);
                    j(bufferedOutputStream, hkpVar.f);
                    j(bufferedOutputStream, hkpVar.g);
                    List<hjx> list3 = hkpVar.h;
                    if (list3 != null) {
                        i(bufferedOutputStream, list3.size());
                        for (hjx hjxVar : list3) {
                            k(bufferedOutputStream, hjxVar.a);
                            k(bufferedOutputStream, hjxVar.b);
                        }
                    } else {
                        i(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(hjsVar.a);
                    bufferedOutputStream.close();
                    hkpVar.a = d.length();
                    p(str, hkpVar);
                    if (this.a >= 5242880) {
                        if (hkn.b) {
                            hkn.d("Pruning old cache entries.", new Object[0]);
                        }
                        long j7 = this.a;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it2 = this.b.entrySet().iterator();
                        int i = 0;
                        while (it2.hasNext()) {
                            hkp hkpVar2 = (hkp) ((Map.Entry) it2.next()).getValue();
                            if (d(hkpVar2.b).delete()) {
                                this.a -= hkpVar2.a;
                            } else {
                                String str4 = hkpVar2.b;
                                hkn.a("Could not delete cache entry for key=%s, filename=%s", str4, r(str4));
                            }
                            it2.remove();
                            i++;
                            if (((float) this.a) < 4718592.0f) {
                                break;
                            }
                        }
                        if (hkn.b) {
                            hkn.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.a - j7), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                    }
                } catch (IOException e) {
                    hkn.a("%s", e.toString());
                    bufferedOutputStream.close();
                    hkn.a("Failed to write header for %s", d.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!d.delete()) {
                    hkn.a("Could not clean up file %s", d.getAbsolutePath());
                }
                if (!((hkw) this.c).a().exists()) {
                    hkn.a("Re-initializing cache after external clearing.", new Object[0]);
                    this.b.clear();
                    this.a = 0L;
                    f();
                }
            }
        }
    }

    public final synchronized void h(String str) {
        boolean delete = d(str).delete();
        q(str);
        if (!delete) {
            hkn.a("Could not delete cache entry for key=%s, filename=%s", str, r(str));
        }
    }

    public final synchronized void m(String str) {
        hjs c = c(str);
        if (c != null) {
            c.f = 0L;
            c.e = 0L;
            g(str, c);
        }
    }

    public final void n(ByteBuffer byteBuffer, long j) {
        boolean z;
        if (j >= this.a) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        byteBuffer.position(byteBuffer.position() + (((int) (j - this.a)) * ((esp) this.c).e));
        this.a = j;
    }

    public atog(koj kojVar, koj kojVar2) {
        this.c = kojVar;
        this.b = kojVar2;
        this.a = 0L;
    }

    public atog() {
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public atog(hkw hkwVar) {
        this.b = new LinkedHashMap(16, 0.75f, true);
        this.a = 0L;
        this.c = hkwVar;
    }
}
