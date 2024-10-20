package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC0050a;
import j$.nio.file.Path;
import j$.nio.file.attribute.InterfaceC0055e;
import j$.nio.file.attribute.InterfaceC0058h;
import j$.nio.file.attribute.y;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class b implements InterfaceC0055e {
    static final HashSet b;
    private final Path a;

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        int i = q.b;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < 9; i2++) {
            hashSet.add(strArr[i2]);
        }
        b = hashSet;
    }

    public b(Path path) {
        this.a = path;
    }

    @Override // j$.nio.file.attribute.InterfaceC0055e
    public final void a(y yVar, y yVar2, y yVar3) {
        if (yVar == null && yVar2 == null) {
            return;
        }
        Path path = this.a;
        path.getFileSystem().D().a(path, EnumC0050a.WRITE);
        if (path.toFile().setLastModified(yVar.G(TimeUnit.MILLISECONDS))) {
        } else {
            throw new IOException("File.setLastModified did not succeed on ".concat(String.valueOf(path)));
        }
    }

    @Override // j$.nio.file.attribute.s
    public final String name() {
        return "basic";
    }

    @Override // j$.nio.file.attribute.InterfaceC0055e
    public final InterfaceC0058h readAttributes() {
        boolean z;
        boolean z2;
        File file;
        Path path = this.a;
        path.getFileSystem().D().a(path, new EnumC0050a[0]);
        File file2 = path.toFile();
        y u = y.u(file2.lastModified(), TimeUnit.MILLISECONDS);
        boolean isFile = file2.isFile();
        boolean isDirectory = file2.isDirectory();
        try {
            if (file2.getParent() == null) {
                file = file2;
            } else {
                file = new File(file2.getParentFile().getCanonicalFile(), file2.getName());
            }
            z = !file.getCanonicalFile().equals(file.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        if (!isFile && !isDirectory && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new c(u, u, u, isFile, isDirectory, z, z2, file2.length(), Integer.valueOf(file2.hashCode()));
    }
}
