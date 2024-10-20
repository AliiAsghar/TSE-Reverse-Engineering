package j$.io;

import j$.nio.file.Path;
import j$.nio.file.l;
import java.io.File;

/* loaded from: classes5.dex */
public final /* synthetic */ class FileRetargetClass {
    public static Path toPath(File file) {
        return l.j().o(file.getPath(), new String[0]);
    }
}
