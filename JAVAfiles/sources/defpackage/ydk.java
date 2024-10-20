package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.provider.Telephony;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import j$.util.Collection;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydk {
    private final Context g;
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/file/UriUtil");
    public static final Set b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("sms", "mms", "smsto", "mmsto")));
    private static final Set d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("android.resource", "content", "file", "bugle")));
    private static final Set e = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private static final alpt f = alpt.r("com.google.android.apps.messaging", "com.google.android.libraries.compose");
    public static final Uri c = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "directory_file_enterprise");

    public ydk(Context context) {
        this.g = context;
    }

    public static boolean A(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && scheme.toLowerCase(Locale.US).startsWith("http")) {
            return true;
        }
        return false;
    }

    public static boolean B(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (!e.contains(albo.ag(uri.getScheme()).toLowerCase(Locale.US)) || TextUtils.isEmpty(uri.getHost())) {
            return false;
        }
        return true;
    }

    public static boolean C(String str) {
        if (!TextUtils.isEmpty(str) && B(Uri.parse(str))) {
            return true;
        }
        return false;
    }

    private static Object D(Context context, Uri uri, String str, ydj ydjVar, String str2, String[] strArr) {
        int columnIndex;
        Cursor query = context.getContentResolver().query(uri, new String[]{str}, str2, strArr, null);
        if (query != null) {
            try {
                if (query.moveToFirst() && (columnIndex = query.getColumnIndex(str)) >= 0) {
                    Object a2 = ydjVar.a(query, columnIndex);
                    query.close();
                    return a2;
                }
            } catch (Throwable th) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
            return null;
        }
        return null;
    }

    public static long a(Context context, Uri uri) {
        try {
            Long l = (Long) l(context, uri, "_size", new ydi(1));
            if (l == null) {
                return 0L;
            }
            return l.longValue();
        } catch (SecurityException e2) {
            alvw h = a.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) h).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "extractFileSizeFromUri", 808, "UriUtil.java")).t("Unable to extract file size from uri: %s", yyb.bh(uri.toString()));
            return 0L;
        }
    }

    public static long c(Context context, Uri uri) {
        ygt ygtVar = new ygt(context);
        long j = 0;
        try {
            if (uri == null) {
                alvw g = a.g();
                g.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getMediaDurationMs", 396, "UriUtil.java")).q("Unable to extract duration from media file. Uri is null");
            } else {
                try {
                    ygtVar.c(uri);
                    j = ygtVar.d(0L);
                } catch (IOException | SecurityException e2) {
                    alvw i = a.i();
                    i.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getMediaDurationMs", 404, "UriUtil.java")).t("Unable to extract duration from media file: %s", yyb.bh(uri.toString()));
                }
            }
            return j;
        } finally {
            ygtVar.b();
        }
    }

    public static long d(Context context, String str, String... strArr) {
        Long l = (Long) D(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "date_modified", new ydi(1), str, strArr);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.net.Uri e(android.content.Context r9, java.io.InputStream r10, android.net.Uri r11) {
        /*
            java.lang.String r0 = "Bugle"
            defpackage.xyl.h()
            r1 = 0
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            java.io.OutputStream r9 = r9.openOutputStream(r11)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            if (r9 != 0) goto L11
            return r1
        L11:
            defpackage.amcp.a(r10, r9)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L80
            r9.flush()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
        L17:
            r9.close()     // Catch: java.io.IOException -> L39
            goto L39
        L1b:
            r10 = move-exception
            goto La9
        L1e:
            r6 = move-exception
            alvi r10 = defpackage.ydk.a     // Catch: java.lang.Throwable -> L1b
            alvw r10 = r10.h()     // Catch: java.lang.Throwable -> L1b
            alvz r1 = defpackage.alwp.a     // Catch: java.lang.Throwable -> L1b
            r10.X(r1, r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/file/UriUtil"
            java.lang.String r3 = "copyContent"
            java.lang.String r5 = "UriUtil.java"
            java.lang.String r1 = "error trying to flush the outputStream"
            r4 = 568(0x238, float:7.96E-43)
            r0 = r10
            defpackage.a.cj(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1b
            goto L17
        L39:
            return r11
        L3a:
            r10 = move-exception
            r8 = r10
            goto L44
        L3d:
            r9 = move-exception
            r10 = r9
            goto L82
        L40:
            r9 = move-exception
            r10 = r9
            r8 = r10
            r9 = r1
        L44:
            alvi r10 = defpackage.ydk.a     // Catch: java.lang.Throwable -> L80
            alvw r2 = r10.h()     // Catch: java.lang.Throwable -> L80
            alvz r10 = defpackage.alwp.a     // Catch: java.lang.Throwable -> L80
            r2.X(r10, r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = "com/google/android/apps/messaging/shared/util/file/UriUtil"
            java.lang.String r5 = "copyContent"
            java.lang.String r7 = "UriUtil.java"
            java.lang.String r3 = "Error while copying content "
            r6 = 561(0x231, float:7.86E-43)
            defpackage.a.cj(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L80
            if (r9 == 0) goto L7f
            r9.flush()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L65
        L61:
            r9.close()     // Catch: java.io.IOException -> L7f
            goto L7f
        L65:
            r8 = move-exception
            alvi r10 = defpackage.ydk.a     // Catch: java.lang.Throwable -> L1b
            alvw r2 = r10.h()     // Catch: java.lang.Throwable -> L1b
            alvz r10 = defpackage.alwp.a     // Catch: java.lang.Throwable -> L1b
            r2.X(r10, r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = "com/google/android/apps/messaging/shared/util/file/UriUtil"
            java.lang.String r5 = "copyContent"
            java.lang.String r7 = "UriUtil.java"
            java.lang.String r3 = "error trying to flush the outputStream"
            r6 = 568(0x238, float:7.96E-43)
            defpackage.a.cj(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1b
            goto L61
        L7f:
            return r1
        L80:
            r10 = move-exception
            r1 = r9
        L82:
            if (r1 == 0) goto Lad
            r1.flush()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8e
        L87:
            r1.close()     // Catch: java.io.IOException -> Lad
            goto Lad
        L8b:
            r9 = move-exception
            r10 = r9
            goto La8
        L8e:
            r8 = move-exception
            alvi r9 = defpackage.ydk.a     // Catch: java.lang.Throwable -> L8b
            alvw r2 = r9.h()     // Catch: java.lang.Throwable -> L8b
            alvz r9 = defpackage.alwp.a     // Catch: java.lang.Throwable -> L8b
            r2.X(r9, r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = "com/google/android/apps/messaging/shared/util/file/UriUtil"
            java.lang.String r5 = "copyContent"
            java.lang.String r7 = "UriUtil.java"
            java.lang.String r3 = "error trying to flush the outputStream"
            r6 = 568(0x238, float:7.96E-43)
            defpackage.a.cj(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8b
            goto L87
        La8:
            r9 = r1
        La9:
            r9.close()     // Catch: java.io.IOException -> Lac
        Lac:
            throw r10
        Lad:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydk.e(android.content.Context, java.io.InputStream, android.net.Uri):android.net.Uri");
    }

    public static Uri f(Context context, String str) {
        return g(context, "drawable", str);
    }

    public static Uri g(Context context, String str, String str2) {
        return new Uri.Builder().scheme("android.resource").authority(context.getPackageName()).appendPath(str).appendPath(str2).build();
    }

    public static Uri h(String str) {
        if (str == null) {
            return null;
        }
        return Uri.fromFile(new File(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.net.Uri i(android.content.Context r18, android.net.Uri r19, java.io.File r20, java.lang.String r21, java.lang.String r22, defpackage.ydh r23) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydk.i(android.content.Context, android.net.Uri, java.io.File, java.lang.String, java.lang.String, ydh):android.net.Uri");
    }

    public static Uri j(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static Object l(Context context, Uri uri, String str, ydj ydjVar) {
        return D(context, uri, str, ydjVar, null, null);
    }

    public static String m(Context context, Uri uri) {
        String n;
        try {
            String str = (String) l(context, uri, "_display_name", new ydi(0));
            if (str == null && (n = n(context, uri)) != null) {
                str = ydh.d(Uri.parse(a.cp(n, "file://")));
            }
            if (str == null) {
                return null;
            }
            return new File(str).getName();
        } catch (SecurityException e2) {
            alvw h = a.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) h).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "extractFileNameFromUri", 790, "UriUtil.java")).t("Unable to extract file name from uri: %s", yyb.bh(uri.toString()));
            return null;
        }
    }

    public static String n(Context context, Uri uri) {
        return (String) l(context, uri, "_data", new ydi(0));
    }

    static String o(Uri uri) {
        if (odt.a()) {
            if (uri.toString().contains("content://mms")) {
                return "com.android.providers.telephony";
            }
            if (uri.toString().contains("contacts")) {
                return "com.android.providers.contacts";
            }
            if (uri.toString().contains("content://com.google.android.gms.people.gal.provider/people_photo")) {
                return "com.google.android.gms";
            }
            return "com.android.providers.";
        }
        if (uri.toString().contains("content://mms")) {
            return "telephony";
        }
        if (uri.toString().contains("contacts")) {
            return "contacts";
        }
        return "";
    }

    public static String p(Context context, Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && !u(uri)) {
            if (!scheme.equals("content")) {
                return null;
            }
            return context.getContentResolver().getType(uri);
        }
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        try {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(path)).toString()));
        } catch (Exception unused) {
            alvw h = a.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getMimeTypeFromUri", 304, "UriUtil.java")).t("getMimeTypeFromUri failed on: %s", yyb.bh(uri.toString()));
            return null;
        }
    }

    public static void q(Context context, Uri uri, Uri uri2) {
        InputStream inputStream = null;
        try {
            try {
                if (v(uri)) {
                    inputStream = context.getContentResolver().openInputStream(uri);
                } else if (A(uri)) {
                    inputStream = new BufferedInputStream(new URL(uri.toString()).openConnection().getInputStream());
                }
                if (inputStream != null) {
                    e(context, inputStream, uri2);
                } else {
                    alvw i = a.i();
                    i.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", 452, "UriUtil.java")).q("Could not open sourceUri.");
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        alvw i2 = a.i();
                        i2.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) ((alvg) i2).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", (char) 461, "UriUtil.java")).q("Error trying to close the inputStream.");
                    }
                }
            } catch (Exception e3) {
                alvw i3 = a.i();
                i3.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i3).g(e3)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", (char) 455, "UriUtil.java")).q("Error while retrieving media.");
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        alvw i4 = a.i();
                        i4.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) ((alvg) i4).g(e4)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", (char) 461, "UriUtil.java")).q("Error trying to close the inputStream.");
                    }
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                    throw th;
                } catch (IOException e5) {
                    alvw i5 = a.i();
                    i5.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i5).g(e5)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", (char) 461, "UriUtil.java")).q("Error trying to close the inputStream.");
                    throw th;
                }
            }
            throw th;
        }
    }

    public static boolean s(Uri uri) {
        return TextUtils.equals(uri.getScheme(), "android.resource");
    }

    public static boolean t(Uri uri) {
        if ("content".equals(uri.getScheme())) {
            return Collection.EL.stream(f).noneMatch(new xdm(uri, 14));
        }
        return false;
    }

    public static boolean u(Uri uri) {
        String scheme;
        if (uri != null && (scheme = uri.getScheme()) != null) {
            return TextUtils.equals(scheme.trim().toLowerCase(Locale.US), "file");
        }
        return false;
    }

    public static boolean v(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.equals(scheme, "android.resource") && !TextUtils.equals(scheme, "content") && !u(uri)) {
            return false;
        }
        return true;
    }

    public static boolean w(Uri uri) {
        return d.contains(uri.getScheme());
    }

    public static boolean x(Uri uri, String str) {
        String authority = uri.getAuthority();
        if (TextUtils.equals("content", uri.getScheme()) && authority != null && authority.startsWith(str)) {
            return true;
        }
        return false;
    }

    public static boolean y(Uri uri) {
        return uri.toString().startsWith(Telephony.Mms.CONTENT_URI.toString());
    }

    public static boolean z(Uri uri) {
        return uri.toString().startsWith(Telephony.Sms.CONTENT_URI.toString());
    }

    public final long b(Uri uri) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                AssetFileDescriptor openAssetFileDescriptor = this.g.getContentResolver().openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor == null) {
                    alvw i = a.i();
                    i.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 632, "UriUtil.java")).t("Failed to open asset for length of %s", yyb.bh(uri.toString()));
                    return 0L;
                }
                long length = openAssetFileDescriptor.getLength();
                try {
                    openAssetFileDescriptor.close();
                } catch (IOException unused) {
                    alvw i2 = a.i();
                    i2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 646, "UriUtil.java")).t("Failed to close afd for %s", yyb.bh(uri.toString()));
                }
                return length;
            } catch (FileNotFoundException e2) {
                alvw i3 = a.i();
                i3.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i3).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 639, "UriUtil.java")).t("Failed to query length of %s", yyb.bh(uri.toString()));
                if (0 != 0) {
                    try {
                        assetFileDescriptor.close();
                        return 0L;
                    } catch (IOException unused2) {
                        alvw i4 = a.i();
                        i4.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 646, "UriUtil.java")).t("Failed to close afd for %s", yyb.bh(uri.toString()));
                        return 0L;
                    }
                }
                return 0L;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                    alvw i5 = a.i();
                    i5.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 646, "UriUtil.java")).t("Failed to close afd for %s", yyb.bh(uri.toString()));
                }
            }
            throw th;
        }
    }

    public final InputStream k(Uri uri) {
        String concat;
        InputStream b2;
        if (!t(uri)) {
            b2 = aipx.b(this.g, uri, aipw.b);
        } else {
            if (odt.a()) {
                concat = o(uri);
            } else {
                concat = "com.android.providers.".concat(o(uri));
            }
            b2 = aipx.b(this.g, uri, aipw.a(concat));
        }
        if (b2 != null) {
            return b2;
        }
        throw new FileNotFoundException("Could not open uri for upload: ".concat(String.valueOf(String.valueOf(uri))));
    }

    public final boolean r(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Iterator it = anna.e(',').a("video/3gpp,video/3gp,video/3g2,video/3gpp2").iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, (String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
