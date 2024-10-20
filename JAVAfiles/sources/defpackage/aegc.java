package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aegc extends aefp {
    public aegc() {
        super(abjr.FILE_DELETION, 10L);
    }

    private static void c(File file, FilenameFilter filenameFilter) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    c(file2, filenameFilter);
                } else if (filenameFilter.accept(file, file2.getName()) && !file2.delete()) {
                    Log.w("FILE_DELETION", "Unable to delete file: ".concat(String.valueOf(String.valueOf(file2))));
                }
            }
        }
    }

    @Override // defpackage.aefp
    public final aefu a(aefu aefuVar, algw algwVar) {
        abjw abjwVar;
        File dataDir;
        Context createDeviceProtectedStorageContext;
        File dataDir2;
        if (algwVar.f() && ((abke) algwVar.b()).b == 1) {
            Context context = aefuVar.b;
            abke abkeVar = (abke) algwVar.b();
            if (abkeVar.b == 1) {
                abjwVar = (abjw) abkeVar.c;
            } else {
                abjwVar = abjw.a;
            }
            int Z = a.Z(abjwVar.b);
            if (Z == 0) {
                Z = 1;
            }
            int i = Z - 2;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        apax apaxVar = abjwVar.c;
                        File externalFilesDir = context.getExternalFilesDir(null);
                        c(externalFilesDir, new aegb(externalFilesDir, apaxVar));
                    } else {
                        throw new UnsupportedOperationException("This storage type does not supported");
                    }
                } else {
                    apax apaxVar2 = abjwVar.c;
                    createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                    dataDir2 = createDeviceProtectedStorageContext.getDataDir();
                    if (dataDir2 != null) {
                        c(dataDir2, new aegb(dataDir2, apaxVar2));
                    } else {
                        throw new IllegalStateException("Context missing dataDir");
                    }
                }
            } else {
                apax apaxVar3 = abjwVar.c;
                dataDir = context.getDataDir();
                if (dataDir != null) {
                    c(dataDir, new aegb(dataDir, apaxVar3));
                } else {
                    throw new IllegalStateException("Context missing dataDir");
                }
            }
            return aefuVar;
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.aefp
    public final String b() {
        return "FILE_DELETION";
    }
}
