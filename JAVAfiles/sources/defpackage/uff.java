package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uff {
    public static final xze a = xze.g("Bugle", "ScratchUtil");
    private static final Object c = new Object();
    public final Context b;
    private final armf d;
    private final uli e;

    public uff(Context context, uli uliVar, armf armfVar) {
        this.b = context;
        this.e = uliVar;
        this.d = armfVar;
    }

    public final Uri a(String str, String str2) {
        long abs = Math.abs(((Random) this.e.a).nextLong());
        Uri.Builder scheme = new Uri.Builder().authority(str).scheme("content");
        scheme.appendPath(String.valueOf(abs));
        if (!TextUtils.isEmpty(str2)) {
            scheme.appendQueryParameter("ext", str2);
        }
        return scheme.build();
    }

    public final Uri b(String str) {
        Uri a2 = a(uho.b(this.b), str);
        String path = a2.getPath();
        if (path != null && j(g(path, str))) {
            return a2;
        }
        xyo b = a.b();
        b.H("Failed to create temp file");
        b.H(path);
        b.q();
        return null;
    }

    public final Uri c(Uri uri) {
        return d(uri, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri d(android.net.Uri r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "error trying to close the inputStream."
            r1 = 0
            boolean r2 = defpackage.ydk.v(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            if (r2 == 0) goto L14
            android.content.Context r2 = r4.b     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.InputStream r5 = r2.openInputStream(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            goto L30
        L14:
            r2 = 8962(0x2302, float:1.2558E-41)
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.net.URLConnection r5 = r2.openConnection()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r5 = r2
        L30:
            if (r5 == 0) goto L59
            android.net.Uri r1 = r4.e(r5, r6)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L5d
            r5.close()     // Catch: java.io.IOException -> L3a
            goto L59
        L3a:
            r5 = move-exception
            xze r6 = defpackage.uff.a
            goto L56
        L3e:
            r6 = move-exception
            goto L46
        L40:
            r5 = move-exception
            r6 = r5
            goto L5f
        L43:
            r5 = move-exception
            r6 = r5
            r5 = r1
        L46:
            xze r2 = defpackage.uff.a     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "Error while retrieving media."
            r2.r(r3, r6)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L59
            r5.close()     // Catch: java.io.IOException -> L53
            goto L59
        L53:
            r5 = move-exception
            xze r6 = defpackage.uff.a
        L56:
            r6.n(r0, r5)
        L59:
            android.net.TrafficStats.clearThreadStatsTag()
            return r1
        L5d:
            r6 = move-exception
            r1 = r5
        L5f:
            if (r1 == 0) goto L6b
            r1.close()     // Catch: java.io.IOException -> L65
            goto L6b
        L65:
            r5 = move-exception
            xze r1 = defpackage.uff.a
            r1.n(r0, r5)
        L6b:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uff.d(android.net.Uri, java.lang.String):android.net.Uri");
    }

    public final Uri e(InputStream inputStream, String str) {
        Uri b = b(str);
        if (b == null) {
            return null;
        }
        return ydk.e(this.b, inputStream, b);
    }

    public final File f(Uri uri) {
        String path;
        if (uri != null) {
            if (!k(uri)) {
                path = null;
            } else {
                path = uri.getPath();
            }
            if (path != null) {
                return g(path, h(uri));
            }
        }
        return null;
    }

    public final File g(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            str = a.co(str2, str, ".");
        }
        File file = new File(this.b.getCacheDir(), "mediascratchspace");
        File file2 = new File(file, str);
        try {
            if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                xyo b = a.b();
                b.H("getFileWithExtension: path");
                b.H(file2.getCanonicalPath());
                b.H("does not start with");
                b.H(file.getCanonicalPath());
                b.q();
                return null;
            }
            return file2;
        } catch (IOException e) {
            a.n("getCanonicalPath failed.", e);
            return null;
        }
    }

    public final String h(Uri uri) {
        return uri.getQueryParameter("ext");
    }

    public final void i(Context context, Uri uri) {
        if (((pki) this.d.b()).a()) {
            alvg h = a.h();
            h.Z(alwk.LARGE);
            ((alvg) h.h("com/google/android/apps/messaging/shared/datamodel/media/cache/ScratchUtil", "deleteContent", 424, "ScratchUtil.java")).t("Deleting content from scratch directory: %s", uri);
        }
        if (uri != null && k(uri)) {
            context.getContentResolver().delete(uri, null, null);
        }
    }

    public final boolean j(File file) {
        File parentFile;
        if (file == null) {
            return false;
        }
        boolean z = true;
        if (file.exists()) {
            return true;
        }
        try {
            parentFile = file.getParentFile();
        } catch (IOException unused) {
        }
        if (parentFile != null && !parentFile.exists()) {
            synchronized (c) {
                if (!parentFile.exists() && !parentFile.mkdirs()) {
                    z = false;
                }
            }
            if (z) {
                return file.createNewFile();
            }
            return false;
        }
        return file.createNewFile();
    }

    public final boolean k(Uri uri) {
        if (uri == null) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (TextUtils.equals(uri.getScheme(), "content")) {
            Context context = this.b;
            if ((TextUtils.equals(uri.getAuthority(), uho.c(context)) || TextUtils.equals(uri.getAuthority(), uho.b(context))) && pathSegments.size() == 1 && l(pathSegments.get(0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(String str) {
        for (int i = str.startsWith("/"); i < str.length(); i++) {
            char charAt = str.charAt(i);
            Character valueOf = Character.valueOf(charAt);
            valueOf.getClass();
            if (charAt != '-') {
                valueOf.getClass();
                if (Character.isDigit(charAt)) {
                    continue;
                } else {
                    valueOf.getClass();
                    if (!Character.isAlphabetic(charAt)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
