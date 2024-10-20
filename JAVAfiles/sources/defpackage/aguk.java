package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aguk implements agvc {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider");
    public static final ahbi b = ahbi.b;
    public final agur d;
    private final Context f;
    public final Object e = new Object();
    private File g = null;
    public final Executor c = agtj.a().e;

    public aguk(Context context) {
        this.f = context.getApplicationContext();
        this.d = new agur(context);
    }

    public final File a() {
        if (this.g == null) {
            File file = new File(this.f.getFilesDir(), "emoji");
            String absolutePath = file.getAbsolutePath();
            File file2 = new File(absolutePath);
            if (!file2.exists() && !file2.mkdirs()) {
                ((alvg) ((alvg) ahbi.a.h()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createDirIfNotExists", 739, "FileOperationUtils.java")).t("Could not create the directory %s", absolutePath);
            }
            String absolutePath2 = file.getAbsolutePath();
            File file3 = new File(absolutePath2, "sticky_variant_prefs");
            if (!file3.exists()) {
                try {
                    if (!file3.createNewFile()) {
                        ((alvg) ((alvg) ahbi.a.h()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createFileIfNotExists", 751, "FileOperationUtils.java")).D("Could not create the file: %s/%s", absolutePath2, "sticky_variant_prefs");
                    }
                } catch (IOException e) {
                    ((alvg) ((alvg) ((alvg) ahbi.a.h()).g(e)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createFileIfNotExists", 755, "FileOperationUtils.java")).D("Could not create the file: %s/%s", absolutePath2, "sticky_variant_prefs");
                }
            }
            this.g = new File(file, "sticky_variant_prefs");
        }
        return this.g;
    }

    public final void b(agut agutVar) {
        albo.bR(albo.bM(new aakf(this, agutVar, 20, null), this.c), new vbr(this, agutVar, 11), this.c);
    }
}
