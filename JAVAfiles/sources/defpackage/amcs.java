package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amcs implements amat {
    @Override // defpackage.amat
    public final /* bridge */ /* synthetic */ Iterable b(Object obj) {
        File[] listFiles;
        File file = (File) obj;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            return DesugarCollections.unmodifiableList(Arrays.asList(listFiles));
        }
        int i = alog.d;
        return alsx.a;
    }
}
