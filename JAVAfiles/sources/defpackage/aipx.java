package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aipx {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    private static final String[] c;
    private static final String[] d;

    static {
        String str;
        if (!Build.HARDWARE.equals("goldfish") && !Build.HARDWARE.equals("ranchu")) {
            str = "";
        } else {
            str = "androidx.test.services.storage.runfiles";
        }
        c = new String[]{"media", str};
        d = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static AssetFileDescriptor a(Context context, Uri uri, String str, aipw aipwVar) {
        char c2;
        ContentResolver contentResolver = context.getContentResolver();
        Uri d2 = d(uri);
        String scheme = d2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(d2, str);
        }
        if ("content".equals(scheme)) {
            int hashCode = str.hashCode();
            int i = 2;
            if (hashCode != 114) {
                if (hashCode != 119) {
                    if (hashCode != 3653) {
                        if (hashCode != 3786) {
                            if (hashCode != 3805) {
                                if (hashCode == 113359 && str.equals("rwt")) {
                                    c2 = 5;
                                }
                                c2 = 65535;
                            } else {
                                if (str.equals("wt")) {
                                    c2 = 2;
                                }
                                c2 = 65535;
                            }
                        } else {
                            if (str.equals("wa")) {
                                c2 = 3;
                            }
                            c2 = 65535;
                        }
                    } else {
                        if (str.equals("rw")) {
                            c2 = 4;
                        }
                        c2 = 65535;
                    }
                } else {
                    if (str.equals("w")) {
                        c2 = 1;
                    }
                    c2 = 65535;
                }
            } else {
                if (str.equals("r")) {
                    c2 = 0;
                }
                c2 = 65535;
            }
            if (c2 != 0) {
                if (c2 != 1 && c2 != 2 && c2 != 3 && c2 != 4 && c2 != 5) {
                    throw new IllegalArgumentException();
                }
            } else {
                i = 1;
            }
            if (j(context, d2, i, aipwVar)) {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(d2, str);
                l(openAssetFileDescriptor);
                return openAssetFileDescriptor;
            }
            throw new FileNotFoundException("Can't open content uri.");
        }
        if ("file".equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(d2, str);
            l(openAssetFileDescriptor2);
            try {
                i(context, openAssetFileDescriptor2.getParcelFileDescriptor(), d2, aipwVar);
                return openAssetFileDescriptor2;
            } catch (FileNotFoundException e) {
                g(openAssetFileDescriptor2, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                g(openAssetFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        }
        throw new FileNotFoundException("Unsupported scheme");
    }

    public static InputStream b(Context context, Uri uri, aipw aipwVar) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri d2 = d(uri);
        String scheme = d2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(d2);
        }
        if ("content".equals(scheme)) {
            if (j(context, d2, 1, aipwVar)) {
                InputStream openInputStream = contentResolver.openInputStream(d2);
                l(openInputStream);
                return openInputStream;
            }
            throw new FileNotFoundException("Can't open content uri.");
        }
        if ("file".equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(d2.getPath()).getCanonicalFile()), "r");
                try {
                    i(context, openFileDescriptor, d2, aipwVar);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e) {
                    h(openFileDescriptor, e);
                    throw e;
                } catch (IOException e2) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e2);
                    h(openFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e3);
                throw fileNotFoundException2;
            }
        }
        throw new FileNotFoundException("Unsupported scheme");
    }

    public static AssetFileDescriptor c(Context context, Uri uri) {
        return a(context, uri, "r", aipw.a);
    }

    private static Uri d(Uri uri) {
        if (Build.VERSION.SDK_INT < 30) {
            return Uri.parse(uri.toString());
        }
        return uri;
    }

    private static String e(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith("/")) {
            return String.valueOf(canonicalPath).concat("/");
        }
        return canonicalPath;
    }

    private static void f(ParcelFileDescriptor parcelFileDescriptor, String str) {
        try {
            StructStat fstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat lstat = Os.lstat(str);
                if (!OsConstants.S_ISLNK(lstat.st_mode)) {
                    if (fstat.st_dev == lstat.st_dev && fstat.st_ino == lstat.st_ino) {
                        return;
                    } else {
                        throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                    }
                }
                throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    private static void g(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static void h(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(android.content.Context r8, android.os.ParcelFileDescriptor r9, android.net.Uri r10, defpackage.aipw r11) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aipx.i(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, aipw):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean j(Context context, Uri uri, int i, aipw aipwVar) {
        int i2;
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                aipw aipwVar2 = aipw.a;
                if (aipwVar.c) {
                    return false;
                }
                return true;
            }
        }
        agrk agrkVar = new agrk(uri, resolveContentProvider);
        aipw aipwVar3 = aipw.a;
        alog alogVar = aipwVar.e;
        int i3 = ((alsx) alogVar).c;
        int i4 = 0;
        while (true) {
            if (i4 < i3) {
                int a2 = ((aiqa) alogVar.get(i4)).a(context, agrkVar, aipwVar.c) - 1;
                i4++;
                if (a2 != 0) {
                    if (a2 == 1) {
                        i2 = 2;
                        break;
                    }
                } else {
                    i2 = 1;
                    break;
                }
            } else {
                i2 = 3;
                break;
            }
        }
        int i5 = i2 - 1;
        if (i5 == 0) {
            return true;
        }
        if (i5 == 1) {
            return false;
        }
        if (!context.getPackageName().equals(resolveContentProvider.packageName)) {
            if (aipwVar.c) {
                return false;
            }
            if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i) != 0 && resolveContentProvider.exported) {
                String[] strArr = c;
                int length = strArr.length;
                for (int i6 = 0; i6 < 2; i6++) {
                    if (strArr[i6].equals(authority)) {
                        return true;
                    }
                }
                String[] strArr2 = d;
                int length2 = strArr2.length;
                for (int i7 = 0; i7 < 3; i7++) {
                    if (strArr2[i7].equals(authority)) {
                        return true;
                    }
                }
                String[] strArr3 = b;
                for (int i8 = 0; i8 < 7; i8++) {
                    String str = strArr3[i8];
                    if (str.charAt(str.length() - 1) == '.') {
                        if (resolveContentProvider.packageName.startsWith(str)) {
                            return false;
                        }
                    } else if (resolveContentProvider.packageName.equals(str)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return aipwVar.c;
    }

    private static File[] k(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void l(Object obj) {
        if (obj != null) {
        } else {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }
}
