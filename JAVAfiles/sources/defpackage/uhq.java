package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import j$.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uhq extends uhk {
    private static final xze a = xze.g("Bugle", "RbmBusinessInfoFileProvider");

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        xnv fN();
    }

    static final File d(Context context) {
        File file = new File(context.getFilesDir(), "rbm");
        if (!file.exists()) {
            xze xzeVar = a;
            xyo a2 = xzeVar.a();
            a2.H("RBM Business file directory does not exist. Creating...");
            a2.q();
            synchronized (uhq.class) {
                if (!file.exists() && !file.mkdirs()) {
                    xzeVar.m("Could not make RBM Business file directory");
                }
            }
        }
        return file;
    }

    public static final Optional e(Context context, String str, uhp uhpVar, Uri uri) {
        File file = new File(d(context), f(str, uhpVar));
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    FileInputStream fileInputStream = new FileInputStream(uhl.i(uri, context));
                    try {
                        xze xzeVar = a;
                        xyo c = xzeVar.c();
                        c.H("Copying RBM file");
                        c.z("file", file);
                        c.z("file name", str);
                        c.z("media type", uhpVar);
                        c.q();
                        amcp.a(fileInputStream, fileOutputStream);
                        Uri build = new Uri.Builder().authority("com.google.android.apps.messaging.shared.datamodel.provider.RbmBusinessInfoFileProvider").scheme("content").appendPath(f(str, uhpVar)).appendQueryParameter("t", String.valueOf(((a) akec.w(context, a.class)).fN().f().toEpochMilli())).build();
                        xyo a2 = xzeVar.a();
                        a2.L("built file uri for RBM Business", build.toString());
                        a2.q();
                        Optional of = Optional.of(build);
                        fileInputStream.close();
                        fileOutputStream.close();
                        xyo c2 = xzeVar.c();
                        c2.H("Deleting provided temporary file");
                        c2.z("media type", uhpVar);
                        c2.q();
                        uhl.j(context, uri);
                        return of;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                xze xzeVar2 = a;
                xyo e2 = xzeVar2.e();
                e2.H("Unable to copy RBM file");
                e2.z("name", str);
                e2.z("file type", uhpVar);
                e2.r(e);
                xyo c3 = xzeVar2.c();
                c3.H("Deleting provided temporary file");
                c3.z("media type", uhpVar);
                c3.q();
                uhl.j(context, uri);
                return Optional.empty();
            }
        } catch (Throwable th3) {
            xyo c4 = a.c();
            c4.H("Deleting provided temporary file");
            c4.z("media type", uhpVar);
            c4.q();
            uhl.j(context, uri);
            throw th3;
        }
    }

    private static String f(String str, uhp uhpVar) {
        return String.valueOf(uhpVar) + "_" + str;
    }

    @Override // defpackage.uhk
    protected final File a(String str, String str2) {
        Context context = getContext();
        if (context == null) {
            a.m("Context was null when retrieving file");
            return null;
        }
        File d = d(context);
        if (!TextUtils.isEmpty(str2)) {
            str = defpackage.a.co(str2, str, ".");
        }
        xze xzeVar = a;
        xyo a2 = xzeVar.a();
        a2.z("file name", str);
        a2.q();
        File file = new File(d, str);
        try {
            if (!file.getCanonicalPath().startsWith(d.getCanonicalPath())) {
                xyo b = xzeVar.b();
                b.H("getFile: path");
                b.H(file.getCanonicalPath());
                b.H("does not start with");
                b.H(d.getCanonicalPath());
                b.q();
                return null;
            }
            return file;
        } catch (IOException e) {
            a.n("File#getCanonicalPath failed", e);
            return null;
        }
    }

    @Override // defpackage.uhk, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        String path = uri.getPath();
        path.getClass();
        File a2 = a(path, "");
        if (a2 != null) {
            return ParcelFileDescriptor.open(a2, ydh.a(str));
        }
        throw new FileNotFoundException();
    }
}
