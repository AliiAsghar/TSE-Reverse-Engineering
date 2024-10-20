package j$.desugar.sun.nio.fs;

import j$.nio.channels.DesugarChannels;
import j$.nio.file.AbstractC0067i;
import j$.nio.file.C0062d;
import j$.nio.file.CopyOption;
import j$.nio.file.D;
import j$.nio.file.EnumC0050a;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.InterfaceC0055e;
import j$.nio.file.attribute.InterfaceC0058h;
import j$.nio.file.attribute.s;
import j$.nio.file.attribute.y;
import j$.nio.file.v;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class m extends j$.nio.file.spi.d {
    private final String b;
    private final String c = "/";
    private volatile i d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(String str) {
        this.b = str;
    }

    private static void E(URI uri) {
        if (uri.getScheme().equalsIgnoreCase("file")) {
            if (uri.getRawAuthority() == null) {
                String path = uri.getPath();
                if (path != null) {
                    if (path.equals("/")) {
                        if (uri.getRawQuery() == null) {
                            if (uri.getRawFragment() == null) {
                                return;
                            } else {
                                throw new IllegalArgumentException("Fragment component present");
                            }
                        }
                        throw new IllegalArgumentException("Query component present");
                    }
                    throw new IllegalArgumentException("Path component should be '/'");
                }
                throw new IllegalArgumentException("Path component is undefined");
            }
            throw new IllegalArgumentException("Authority component present");
        }
        throw new IllegalArgumentException("URI does not match this provider");
    }

    private static boolean F(CopyOption[] copyOptionArr, StandardCopyOption standardCopyOption) {
        for (CopyOption copyOption : copyOptionArr) {
            if (copyOption == standardCopyOption) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.nio.file.spi.d
    public final void A(Path path, String str, Object obj, j$.nio.file.m... mVarArr) {
        int indexOf = str.indexOf(":");
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            if ("basic".equals(substring)) {
                str = str.substring(indexOf + 1);
            } else {
                throw new UnsupportedOperationException("Requested attribute type for: " + substring + " is not available.");
            }
        }
        b bVar = new b(path);
        if (str.equals("lastModifiedTime")) {
            bVar.a((y) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            bVar.a(null, (y) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    @Override // j$.nio.file.spi.d
    public final void a(Path path, EnumC0050a... enumC0050aArr) {
        boolean canRead;
        File file = path.toFile();
        if (file.exists()) {
            boolean z = true;
            for (EnumC0050a enumC0050a : enumC0050aArr) {
                int i = j.a[enumC0050a.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            canRead = file.canExecute();
                        }
                    } else {
                        canRead = file.canWrite();
                    }
                } else {
                    canRead = file.canRead();
                }
                z &= canRead;
            }
            if (z) {
                return;
            } else {
                throw new IOException(String.format("Unable to access file %s", path));
            }
        }
        throw new NoSuchFileException(path.toString());
    }

    @Override // j$.nio.file.spi.d
    public final void b(Path path, Path path2, CopyOption... copyOptionArr) {
        if (!F(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.b(path2, new j$.nio.file.m[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (!F(copyOptionArr, StandardCopyOption.ATOMIC_MOVE)) {
            FileInputStream fileInputStream = new FileInputStream(path.toFile());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 8192);
                        if (read >= 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.close();
                            fileInputStream.close();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } else {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
    }

    @Override // j$.nio.file.spi.d
    public final void c(Path path, j$.nio.file.attribute.m... mVarArr) {
        if (path.getParent() != null && !Files.b(path.getParent(), new j$.nio.file.m[0])) {
            throw new NoSuchFileException(path.toString());
        }
        if (path.toFile().mkdirs()) {
        } else {
            throw new FileAlreadyExistsException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.d
    public final void d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final void e(Path path, Path path2, j$.nio.file.attribute.m... mVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final void f(Path path) {
        try {
            a(path, new EnumC0050a[0]);
            path.toFile().delete();
        } catch (IOException unused) {
            throw new NoSuchFileException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.d
    public final boolean g(Path path) {
        return path.toFile().delete();
    }

    @Override // j$.nio.file.spi.d
    public final s h(Path path, Class cls, j$.nio.file.m... mVarArr) {
        cls.getClass();
        if (cls == InterfaceC0055e.class) {
            return (s) cls.cast(new b(path));
        }
        return null;
    }

    @Override // j$.nio.file.spi.d
    public final C0062d i(Path path) {
        throw new SecurityException("getFileStore");
    }

    @Override // j$.nio.file.spi.d
    public final AbstractC0067i j(URI uri) {
        E(uri);
        i iVar = this.d;
        if (iVar == null) {
            synchronized (this) {
                try {
                    iVar = this.d;
                    if (iVar == null) {
                        iVar = new i(this, this.b, this.c);
                        this.d = iVar;
                    }
                } finally {
                }
            }
        }
        return iVar;
    }

    @Override // j$.nio.file.spi.d
    public final Path k(URI uri) {
        return p.b(this.d, uri, this.b, this.c);
    }

    @Override // j$.nio.file.spi.d
    public final String l() {
        return "file";
    }

    @Override // j$.nio.file.spi.d
    public final boolean m(Path path) {
        return path.toFile().isHidden();
    }

    @Override // j$.nio.file.spi.d
    public final boolean n(Path path, Path path2) {
        if (path.equals(path2)) {
            return true;
        }
        a(path, new EnumC0050a[0]);
        a(path2, new EnumC0050a[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // j$.nio.file.spi.d
    public final void o(Path path, Path path2, CopyOption... copyOptionArr) {
        if (!F(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.b(path2, new j$.nio.file.m[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (!F(copyOptionArr, StandardCopyOption.COPY_ATTRIBUTES)) {
            path.toFile().renameTo(path2.toFile());
            return;
        }
        throw new UnsupportedOperationException("Unsupported copy option");
    }

    @Override // j$.nio.file.spi.d
    public final j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, j$.nio.file.attribute.m... mVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final SeekableByteChannel q(Path path, Set set, j$.nio.file.attribute.m... mVarArr) {
        return s(path, set, mVarArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.nio.file.DirectoryStream, j$.desugar.sun.nio.fs.k, java.lang.Object] */
    @Override // j$.nio.file.spi.d
    public final DirectoryStream r(Path path, v vVar) {
        ?? obj = new Object();
        obj.a = new l(this, path, vVar);
        return obj;
    }

    @Override // j$.nio.file.spi.d
    public final FileChannel s(Path path, Set set, j$.nio.file.attribute.m... mVarArr) {
        String str;
        if (!path.toFile().isDirectory()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((j$.nio.file.p) it.next()).getClass();
            }
            if (path.toFile().exists()) {
                if (set.contains(D.CREATE_NEW) && set.contains(D.WRITE)) {
                    throw new FileAlreadyExistsException(path.toString());
                }
            } else if (!set.contains(D.CREATE) && !set.contains(D.CREATE_NEW)) {
                throw new NoSuchFileException(path.toString());
            }
            if (set.contains(D.READ) && set.contains(D.APPEND)) {
                throw new IllegalArgumentException("READ + APPEND not allowed");
            }
            D d = D.APPEND;
            if (set.contains(d) && set.contains(D.TRUNCATE_EXISTING)) {
                throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
            }
            File file = path.toFile();
            D d2 = D.WRITE;
            if (!set.contains(d2) && !set.contains(d)) {
                str = "r";
            } else if (set.contains(D.SYNC)) {
                str = "rws";
            } else if (set.contains(D.DSYNC)) {
                str = "rwd";
            } else {
                str = "rw";
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
            if (set.contains(D.TRUNCATE_EXISTING) && set.contains(d2)) {
                randomAccessFile.setLength(0L);
            }
            if (!set.contains(d) && !set.contains(D.DELETE_ON_CLOSE)) {
                return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
            }
            return e.i(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()), set, path);
        }
        throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: ".concat(String.valueOf(path)));
    }

    @Override // j$.nio.file.spi.d
    public final AbstractC0067i u(URI uri, Map map) {
        E(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // j$.nio.file.spi.d
    public final InterfaceC0058h x(Path path, Class cls, j$.nio.file.m... mVarArr) {
        if (cls == InterfaceC0058h.class) {
            return (InterfaceC0058h) cls.cast(((InterfaceC0055e) h(path, InterfaceC0055e.class, mVarArr)).readAttributes());
        }
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final Map y(Path path, String str, j$.nio.file.m... mVarArr) {
        String[] split;
        int indexOf = str.indexOf(":");
        if (indexOf == -1) {
            split = str.split(",");
        } else {
            String substring = str.substring(0, indexOf);
            if ("basic".equals(substring)) {
                split = str.substring(indexOf + 1).split(",");
            } else {
                throw new UnsupportedOperationException("Requested attribute type for: " + substring + " is not available.");
            }
        }
        b bVar = new b(path);
        a b = a.b(b.b, split);
        InterfaceC0058h readAttributes = bVar.readAttributes();
        if (b.c("size")) {
            b.a(Long.valueOf(((c) readAttributes).size()), "size");
        }
        if (b.c("creationTime")) {
            b.a(((c) readAttributes).creationTime(), "creationTime");
        }
        if (b.c("lastAccessTime")) {
            b.a(((c) readAttributes).lastAccessTime(), "lastAccessTime");
        }
        if (b.c("lastModifiedTime")) {
            b.a(((c) readAttributes).lastModifiedTime(), "lastModifiedTime");
        }
        if (b.c("fileKey")) {
            b.a(((c) readAttributes).fileKey(), "fileKey");
        }
        if (b.c("isDirectory")) {
            b.a(Boolean.valueOf(((c) readAttributes).isDirectory()), "isDirectory");
        }
        if (b.c("isRegularFile")) {
            b.a(Boolean.valueOf(((c) readAttributes).isRegularFile()), "isRegularFile");
        }
        if (b.c("isSymbolicLink")) {
            b.a(Boolean.valueOf(((c) readAttributes).isSymbolicLink()), "isSymbolicLink");
        }
        if (b.c("isOther")) {
            b.a(Boolean.valueOf(((c) readAttributes).isOther()), "isOther");
        }
        return b.d();
    }

    @Override // j$.nio.file.spi.d
    public final Path z(Path path) {
        return new o(this.d, path.toFile().getCanonicalPath(), this.b, this.c);
    }
}
