package defpackage;

import java.io.File;
import java.io.FileFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agss implements FileFilter {
    private final /* synthetic */ int a;

    public /* synthetic */ agss(int i) {
        this.a = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                alvi alviVar = agsv.a;
                if (!file.getName().startsWith("stylesheet_") || !file.isFile()) {
                    return false;
                }
                return true;
            }
            if (file.getName().equals("MultiDex.lock")) {
                return false;
            }
            return true;
        }
        alvi alviVar2 = agsv.a;
        if (!file.getName().startsWith("keyboardsnapshotcache_") || !file.isFile()) {
            return false;
        }
        return true;
    }
}
