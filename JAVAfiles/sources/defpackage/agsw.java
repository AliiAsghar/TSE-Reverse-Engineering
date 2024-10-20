package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agsw {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/cache/FileCache");
    public final HashMap b = new HashMap();
    public final agsx c;
    private final Supplier d;
    private agsv e;

    public agsw(Supplier supplier, agsx agsxVar) {
        this.d = supplier;
        this.c = agsxVar;
    }

    private final void e(String str, ListenableFuture listenableFuture, Executor executor) {
        albo.bR(listenableFuture, new vdc(this, str, listenableFuture, 3), executor);
    }

    public final agsv a() {
        Object obj;
        if (this.e == null) {
            obj = this.d.get();
            this.e = (agsv) obj;
        }
        return this.e;
    }

    public final synchronized ListenableFuture b(String str, anen anenVar) {
        ListenableFuture listenableFuture = (ListenableFuture) this.b.get(str);
        if (listenableFuture != null) {
            return albo.bJ(listenableFuture);
        }
        ListenableFuture submit = anenVar.submit(new aakf(this, str, 19, null));
        this.b.put(str, submit);
        e(str, submit, anenVar);
        return albo.bJ(submit);
    }

    public final Object c(String str, Object obj) {
        File file = a().b;
        if (!file.exists() && !ahbi.b.a(file)) {
            alvi alviVar = a;
            ((alvg) ((alvg) alviVar.h()).h("com/google/android/libraries/inputmethod/cache/FileCache", "createFolderIfAbsent", 230, "FileCache.java")).t("Failed to create directory: %s", file);
            ((alvg) ((alvg) alviVar.h()).h("com/google/android/libraries/inputmethod/cache/FileCache", "putInternal", 163, "FileCache.java")).t("Failed to create folder for file: %s", str);
            return null;
        }
        File file2 = new File(a().b, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                this.c.b(fileOutputStream, obj);
                fileOutputStream.close();
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int length = (int) randomAccessFile.length();
                        randomAccessFile.seek(length);
                        randomAccessFile.writeInt(length);
                        randomAccessFile.close();
                        return obj;
                    } finally {
                    }
                } catch (IOException unused) {
                    return null;
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            ((alvg) ((alvg) a.d()).h("com/google/android/libraries/inputmethod/cache/FileCache", "putInternal", 170, "FileCache.java")).t("File not found: %s", file2);
            return null;
        } catch (IOException e) {
            ((alvg) ((alvg) ((alvg) a.h()).g(e)).h("com/google/android/libraries/inputmethod/cache/FileCache", "putInternal", 173, "FileCache.java")).t("Error writing file: %s", file2);
            return null;
        }
    }

    public final synchronized void d(String str, Object obj, anen anenVar) {
        ListenableFuture submit;
        ListenableFuture listenableFuture = (ListenableFuture) this.b.get(str);
        if (listenableFuture != null) {
            submit = ancj.f(listenableFuture, new yxu((Object) this, str, obj, 7), anenVar);
        } else {
            submit = anenVar.submit(new xqt((Object) this, str, obj, 18));
        }
        this.b.put(str, submit);
        e(str, submit, anenVar);
        albo.bJ(submit);
    }
}
