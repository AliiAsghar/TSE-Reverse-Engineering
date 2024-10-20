package defpackage;

import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydh {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/util/file/FileUtil");
    public final xnv a;

    public ydh(xnv xnvVar) {
        this.a = xnvVar;
    }

    public static int a(String str) {
        if (TextUtils.equals(str, "r")) {
            return VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        return 603979776;
    }

    public static ContentType b(ContentType contentType) {
        if (ajru.e.e(contentType)) {
            aoad aoadVar = new aoad(ajru.j);
            aoadVar.A(contentType.a());
            return aoadVar.y();
        }
        return contentType;
    }

    public static synchronized File c(File file, String str, String str2, String str3, long j) {
        String str4;
        String concat;
        String concat2;
        synchronized (ydh.class) {
            String ag = albo.ag(str);
            if (str3 != null) {
                if (!ocm.a()) {
                    File file2 = new File(file, str3);
                    if (!file2.exists()) {
                        file2.createNewFile();
                        return file2;
                    }
                }
                int lastIndexOf = str3.lastIndexOf(46);
                if (lastIndexOf >= 0) {
                    ag = str3.substring(lastIndexOf + 1);
                    str3 = str3.substring(0, lastIndexOf);
                }
                if (ocm.a()) {
                    if (ag.length() == 0) {
                        concat2 = "";
                    } else {
                        concat2 = ".".concat(String.valueOf(ag));
                    }
                    File file3 = new File(file, String.valueOf(e(str3, concat2)).concat(concat2));
                    if (!file3.exists()) {
                        file3.createNewFile();
                        return file3;
                    }
                }
            }
            if (ocm.a()) {
                if (!albo.ah(ag)) {
                    str4 = ".".concat(String.valueOf(ag));
                } else {
                    str4 = "";
                }
                String uuid = UUID.randomUUID().toString();
                if (albo.ah(str3)) {
                    concat = String.valueOf(uuid).concat(str4);
                } else {
                    String str5 = "_" + uuid + str4;
                    concat = String.valueOf(e(str3, str5)).concat(str5);
                }
                File file4 = new File(file, concat);
                if (!file4.createNewFile()) {
                    alvw h = b.h();
                    h.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/util/file/FileUtil", "createNewFileUsingUuid", 144, "FileUtil.java")).D("Could not create a file for file name = %s because a file already exists with name = %s", str3, concat);
                    return null;
                }
                return file4;
            }
            Date date = new Date(j);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
            if (albo.ah(str3)) {
                str3 = simpleDateFormat.format(date);
            }
            String co = a.co(ag, str3, "_%02d.");
            for (int i = 1; i <= 99; i++) {
                File file5 = new File(file, String.format(Locale.US, co, Integer.valueOf(i)));
                if (!file5.exists()) {
                    file5.createNewFile();
                    return file5;
                }
            }
            alvw h2 = b.h();
            h2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) h2).h("com/google/android/apps/messaging/shared/util/file/FileUtil", "getNewFile", 128, "FileUtil.java")).t("Too many duplicate file names: %s", co);
            return null;
        }
    }

    public static String d(Uri uri) {
        String lastPathSegment;
        if (uri == null || !ydk.u(uri) || (lastPathSegment = uri.getLastPathSegment()) == null || lastPathSegment.lastIndexOf(46) < 0) {
            return null;
        }
        return lastPathSegment;
    }

    public static String e(String str, String str2) {
        if (str.length() + str2.length() > 127) {
            return str.substring(0, 127 - str2.length());
        }
        return str;
    }

    public static final boolean h(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            return false;
        }
        return true;
    }

    private static boolean j(File file, File file2) {
        try {
            File canonicalFile = file.getCanonicalFile();
            for (File canonicalFile2 = file2.getCanonicalFile(); canonicalFile2 != null; canonicalFile2 = canonicalFile2.getParentFile()) {
                if (canonicalFile.equals(canonicalFile2)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            alvw h = b.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/util/file/FileUtil", "isSameOrSubDirectory", (char) 332, "FileUtil.java")).q("Error while accessing file");
            return false;
        }
    }

    public final boolean f(File file) {
        return j(Environment.getDataDirectory(), file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (j(android.os.Environment.getDataDirectory(), r0.toFile()) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.content.Context r10, android.net.Uri r11) {
        /*
            r9 = this;
            java.lang.String r0 = "/proc/self/fd/"
            java.lang.String r1 = r11.getPath()
            r2 = 1
            java.lang.String r3 = "isPrivateFile"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/util/file/FileUtil"
            java.lang.String r5 = "FileUtil.java"
            java.lang.String r6 = "Bugle"
            if (r1 == 0) goto L3e
            boolean r7 = defpackage.ydk.u(r11)
            if (r7 == 0) goto L3e
            java.io.File r7 = new java.io.File
            r7.<init>(r1)
            boolean r1 = r9.f(r7)
            if (r1 != 0) goto L23
            goto L3e
        L23:
            alvi r10 = defpackage.ydh.b
            alvw r10 = r10.i()
            alvz r11 = defpackage.alwp.a
            r10.X(r11, r6)
            alvg r10 = (defpackage.alvg) r10
            r11 = 250(0xfa, float:3.5E-43)
            alvw r10 = r10.h(r4, r3, r11, r5)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r11 = "isPrivateFile because data dir file URI"
            r10.q(r11)
            return r2
        L3e:
            java.lang.String r1 = r11.getScheme()
            java.lang.String r7 = "content"
            boolean r1 = j$.util.Objects.equals(r1, r7)
            r7 = 0
            if (r1 != 0) goto L4c
            goto La4
        L4c:
            java.lang.String r1 = r11.getAuthority()
            if (r1 == 0) goto L70
            java.lang.String r8 = r10.getPackageName()
            boolean r8 = r1.contains(r8)
            if (r8 == 0) goto La4
            java.lang.String r8 = defpackage.uho.a(r10)
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto La4
            java.lang.String r8 = defpackage.uho.b(r10)
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto La4
        L70:
            android.content.res.AssetFileDescriptor r10 = defpackage.aipx.c(r10, r11)     // Catch: java.lang.Exception -> La4 java.io.FileNotFoundException -> Lc6
            android.os.ParcelFileDescriptor r1 = r10.getParcelFileDescriptor()     // Catch: java.lang.Exception -> La4
            int r1 = r1.getFd()     // Catch: java.lang.Exception -> La4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La4
            r8.<init>(r0)     // Catch: java.lang.Exception -> La4
            r8.append(r1)     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Exception -> La4
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch: java.lang.Exception -> La4
            j$.nio.file.Path r0 = j$.nio.file.Paths.get(r0, r1)     // Catch: java.lang.Exception -> La4
            j$.nio.file.Path r0 = j$.nio.file.Files.readSymbolicLink(r0)     // Catch: java.lang.Exception -> La4
            r10.close()     // Catch: java.lang.Exception -> La4
            java.io.File r10 = android.os.Environment.getDataDirectory()     // Catch: java.lang.Exception -> La4
            java.io.File r0 = r0.toFile()     // Catch: java.lang.Exception -> La4
            boolean r10 = j(r10, r0)     // Catch: java.lang.Exception -> La4
            if (r10 == 0) goto La4
            goto Lc6
        La4:
            boolean r10 = defpackage.ydk.y(r11)
            if (r10 == 0) goto Lc5
            alvi r10 = defpackage.ydh.b
            alvw r10 = r10.i()
            alvz r11 = defpackage.alwp.a
            r10.X(r11, r6)
            alvg r10 = (defpackage.alvg) r10
            r11 = 262(0x106, float:3.67E-43)
            alvw r10 = r10.h(r4, r3, r11, r5)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r11 = "isPrivateFile because Telephony MMS URI"
            r10.q(r11)
            return r2
        Lc5:
            return r7
        Lc6:
            alvi r10 = defpackage.ydh.b
            alvw r10 = r10.i()
            alvz r11 = defpackage.alwp.a
            r10.X(r11, r6)
            alvg r10 = (defpackage.alvg) r10
            r11 = 256(0x100, float:3.59E-43)
            alvw r10 = r10.h(r4, r3, r11, r5)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r11 = "isPrivateFile because private dir content URI"
            r10.q(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydh.g(android.content.Context, android.net.Uri):boolean");
    }

    public final void i(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        i(file2);
                    }
                }
                file.delete();
                return;
            }
            if (file.isFile()) {
                file.delete();
            }
        }
    }
}
