package defpackage;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amcu {
    public static final amat a = new amcs();

    public static void a(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
            } else {
                throw new IOException("Unable to create parent directories of ".concat(file.toString()));
            }
        }
    }

    public static byte[] b(File file) {
        file.getClass();
        return amct.a(file);
    }
}
