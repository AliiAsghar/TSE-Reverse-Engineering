package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bb implements Closeable {
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;

    public bb(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.a = file;
        this.c = file2;
        this.b = c(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                f(this.e);
                throw e;
            } catch (Error e2) {
                e = e2;
                f(this.e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                f(this.e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            f(this.d);
            throw e4;
        }
    }

    private static long b(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return -2L;
        }
        return lastModified;
    }

    private static long c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length();
            long j = (-22) + length;
            if (j >= 0) {
                long j2 = length - 65558;
                if (j2 < 0) {
                    j2 = 0;
                }
                int reverseBytes = Integer.reverseBytes(101010256);
                do {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == reverseBytes) {
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        long reverseBytes2 = Integer.reverseBytes(randomAccessFile.readInt());
                        CRC32 crc32 = new CRC32();
                        randomAccessFile.seek(Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L);
                        long j3 = reverseBytes2 & 4294967295L;
                        byte[] bArr = new byte[16384];
                        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j3));
                        while (read != -1) {
                            crc32.update(bArr, 0, read);
                            j3 -= read;
                            if (j3 == 0) {
                                break;
                            }
                            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j3));
                        }
                        long value = crc32.getValue();
                        randomAccessFile.close();
                        if (value == -1) {
                            return -2L;
                        }
                        return value;
                    }
                    j--;
                } while (j >= j2);
                throw new ZipException("End Of Central Directory signature not found");
            }
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    private static SharedPreferences d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0277, code lost:
    
        r12 = r12 + 1;
        r13 = r11.getEntry(defpackage.a.cb(r12, "classes", ".dex"));
        r1 = r18;
        r8 = r2;
        r2 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List e() {
        /*
            Method dump skipped, instructions count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.e():java.util.List");
    }

    private static void f(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    private static void g(Context context, long j, long j2, List list) {
        SharedPreferences.Editor edit = d(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            ba baVar = (ba) it.next();
            edit.putLong(a.bV(i, "dex.crc."), baVar.a);
            edit.putLong(a.bV(i, "dex.time."), baVar.lastModified());
            i++;
        }
        edit.commit();
    }

    public final List a(Context context, boolean z) {
        List e;
        List list;
        bb bbVar = this;
        Log.i("MultiDex", "MultiDexExtractor.load(" + bbVar.a.getPath() + ", " + z + ", )");
        if (bbVar.f.isValid()) {
            if (!z) {
                File file = bbVar.a;
                long j = bbVar.b;
                SharedPreferences d = d(context);
                long j2 = -1;
                if (d.getLong("timestamp", -1L) == b(file) && d.getLong("crc", -1L) == j) {
                    try {
                        Log.i("MultiDex", "loading existing secondary dex files");
                        String concat = String.valueOf(bbVar.a.getName()).concat(".classes");
                        SharedPreferences d2 = d(context);
                        int i = d2.getInt("dex.number", 1);
                        list = new ArrayList(i - 1);
                        int i2 = 2;
                        while (i2 <= i) {
                            ba baVar = new ba(bbVar.c, concat + i2 + ".zip");
                            if (baVar.isFile()) {
                                baVar.a = c(baVar);
                                long j3 = d2.getLong("dex.crc." + i2, j2);
                                long j4 = d2.getLong("dex.time." + i2, j2);
                                long lastModified = baVar.lastModified();
                                if (j4 == lastModified) {
                                    String str = concat;
                                    if (j3 == baVar.a) {
                                        list.add(baVar);
                                        i2++;
                                        j2 = -1;
                                        bbVar = this;
                                        concat = str;
                                    }
                                }
                                throw new IOException("Invalid extracted dex: " + baVar + " (key \"\"), expected modification time: " + j4 + ", modification time: " + lastModified + ", expected crc: " + j3 + ", file crc: " + baVar.a);
                            }
                            throw new IOException("Missing extracted secondary dex file '" + baVar.getPath() + "'");
                        }
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e2);
                        e = e();
                        g(context, b(this.a), this.b, e);
                    }
                    Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                    return list;
                }
                Log.i("MultiDex", "Detected that extraction must be performed.");
            } else {
                Log.i("MultiDex", "Forced extraction must be performed.");
            }
            e = e();
            g(context, b(bbVar.a), bbVar.b, e);
            list = e;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.release();
        this.e.close();
        this.d.close();
    }
}
