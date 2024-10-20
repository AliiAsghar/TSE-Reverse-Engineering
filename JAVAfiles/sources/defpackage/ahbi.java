package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbi {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/utils/FileOperationUtils");
    public static final ahbi b = new ahbi();

    static {
        new BigDecimal(1024);
        new MathContext(2, RoundingMode.HALF_UP);
        new MathContext(4, RoundingMode.HALF_UP);
    }

    public final boolean a(File file) {
        if (!file.exists()) {
            if (file.mkdirs()) {
                if (!file.setWritable(true)) {
                    ((alvg) ((alvg) a.h()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "mkdirs", 255, "FileOperationUtils.java")).t("Cannot set writable %s", file);
                    return false;
                }
            } else if (!file.exists()) {
                ((alvg) ((alvg) a.h()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "mkdirs", 263, "FileOperationUtils.java")).t("Cannot create directory %s", file);
                return false;
            }
        }
        return true;
    }

    public final void b(File file) {
        c(file, null);
    }

    public final void c(File file, FileFilter fileFilter) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles(fileFilter);
                for (int i = 0; listFiles != null && i < listFiles.length; i++) {
                    b(listFiles[i]);
                }
            }
            ((alvg) ((alvg) a.f()).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "delete", 296, "FileOperationUtils.java")).t("Delete file: %s", file.getAbsoluteFile());
            file.delete();
        }
    }
}
