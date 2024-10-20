package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uhm extends uhk {
    private static final xze a = xze.g("Bugle", "MmsFileProvider");

    public static Uri d(Context context) {
        String str;
        Uri a2 = c(context).a(String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.provider.MmsFileProvider"), null);
        a2.getClass();
        String path = a2.getPath();
        path.getClass();
        File g = g(context, path);
        if (!c(context).j(g)) {
            if (g != null) {
                str = g.getAbsolutePath();
            } else {
                str = "null file";
            }
            xyo b = a.b();
            b.H("Failed to create temp file");
            b.H(str);
            b.q();
        }
        return a2;
    }

    public static File e(Context context, Uri uri) {
        String path;
        if (uri != null && (path = uri.getPath()) != null) {
            return g(context, path);
        }
        return null;
    }

    private static File f(Context context) {
        return new File(context.getCacheDir(), "rawmms");
    }

    private static File g(Context context, String str) {
        File file = new File(f(context), String.valueOf(str).concat(".dat"));
        try {
            if (!file.getCanonicalPath().startsWith(f(context).getCanonicalPath())) {
                xyo b = a.b();
                b.H("getFile: path");
                b.H(file.getCanonicalPath());
                b.H("does not start with");
                b.H(f(context).getCanonicalPath());
                b.q();
                return null;
            }
            return file;
        } catch (IOException e) {
            a.n("getCanonicalPath failed.", e);
            return null;
        }
    }

    @Override // defpackage.uhk
    protected final File a(String str, String str2) {
        Context context = getContext();
        if (context == null) {
            a.m("getFile null context");
            return null;
        }
        return g(context, str);
    }
}
