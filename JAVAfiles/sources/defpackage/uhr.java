package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uhr extends uhk {
    public static final xze a = xze.g("Bugle", "VerifiedSmsBrandLogoFileProvider");

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        xnv fN();
    }

    public static final File d(Context context) {
        File file = new File(context.getFilesDir(), "verified-sms");
        if (!file.exists()) {
            xze xzeVar = a;
            xzeVar.l("Verified SMS directory does not exist. Creating...");
            if (!file.mkdirs()) {
                xzeVar.m("Could not make Verified SMS file directory");
            }
        }
        return file;
    }

    @Override // defpackage.uhk
    protected final File a(String str, String str2) {
        Context context = getContext();
        if (context == null) {
            a.q("context was null");
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
            xyo b2 = a.b();
            b2.H("File#getCanonicalPath failed");
            b2.r(e);
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
