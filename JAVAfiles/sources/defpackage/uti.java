package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.diagnostics.DiagnosticsFileProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uti extends uhk {
    private static final xze a = xze.f("BugleDiagnostics", DiagnosticsFileProvider.class);

    public static Uri d(Context context, String str) {
        return new Uri.Builder().authority(String.valueOf(context.getApplicationContext().getPackageName()).concat(".diagnostics.DiagnosticsFileProvider")).scheme("content").appendPath(str).build();
    }

    public static File e(Context context, String str) {
        return new File(f(context), str);
    }

    private static File f(Context context) {
        File file = new File(context.getCacheDir(), "diagnostics_files");
        file.mkdir();
        return file;
    }

    @Override // defpackage.uhk
    protected final File a(String str, String str2) {
        Context context = getContext();
        File file = new File(f(context), str);
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
