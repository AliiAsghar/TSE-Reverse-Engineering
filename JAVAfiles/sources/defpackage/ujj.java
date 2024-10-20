package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ujj extends uhk {
    private static final xze a = xze.g("Bugle", "RichCardMediaFileProvider");

    @Override // defpackage.uhk
    protected final File a(String str, String str2) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        File cacheDir = context.getCacheDir();
        if (!TextUtils.isEmpty(str2)) {
            str = a.co(str2, str, ".");
        }
        File file = new File(cacheDir, str);
        try {
            if (!file.getCanonicalPath().startsWith(context.getCacheDir().getCanonicalPath())) {
                xyo b = a.b();
                b.H("getFile: path");
                b.H(file.getCanonicalPath());
                b.H("does not start with");
                b.H(context.getCacheDir().getCanonicalPath());
                b.q();
                return null;
            }
            return file;
        } catch (IOException e) {
            a.n("getCanonicalPath failed.", e);
            return null;
        }
    }
}
