package j$.nio.file.spi;

import j$.nio.file.AbstractC0067i;
import j$.nio.file.C0061c;
import j$.nio.file.C0062d;
import j$.nio.file.C0065g;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0050a;
import j$.nio.file.Path;
import j$.nio.file.attribute.C0056f;
import j$.nio.file.attribute.InterfaceC0058h;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.s;
import j$.nio.file.l;
import j$.nio.file.m;
import j$.nio.file.o;
import j$.nio.file.p;
import j$.nio.file.t;
import j$.nio.file.u;
import j$.nio.file.v;
import j$.nio.file.x;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.OpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final /* synthetic */ class b extends d {
    public final /* synthetic */ FileSystemProvider b;

    private /* synthetic */ b(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    public static /* synthetic */ d B(FileSystemProvider fileSystemProvider) {
        if (fileSystemProvider == null) {
            return null;
        }
        return fileSystemProvider instanceof c ? ((c) fileSystemProvider).a : new b(fileSystemProvider);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void A(Path path, String str, Object obj, m[] mVarArr) {
        this.b.setAttribute(u.n(path), str, l.g(obj), l.m(mVarArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void a(Path path, EnumC0050a[] enumC0050aArr) {
        AccessMode accessMode;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path n = u.n(path);
        AccessMode[] accessModeArr = null;
        if (enumC0050aArr != null) {
            int length = enumC0050aArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC0050a enumC0050a = enumC0050aArr[i];
                if (enumC0050a == null) {
                    accessMode = null;
                } else if (enumC0050a == EnumC0050a.READ) {
                    accessMode = AccessMode.READ;
                } else {
                    accessMode = enumC0050a == EnumC0050a.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
                }
                accessModeArr2[i] = accessMode;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(n, accessModeArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) {
        java.nio.file.CopyOption[] copyOptionArr2;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path n = u.n(path);
        java.nio.file.Path n2 = u.n(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            java.nio.file.CopyOption[] copyOptionArr3 = new java.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0061c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        fileSystemProvider.copy(n, n2, copyOptionArr2);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void c(Path path, j$.nio.file.attribute.m[] mVarArr) {
        this.b.createDirectory(u.n(path), j$.nio.channels.c.i(mVarArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void d(Path path, Path path2) {
        this.b.createLink(u.n(path), u.n(path2));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void e(Path path, Path path2, j$.nio.file.attribute.m[] mVarArr) {
        this.b.createSymbolicLink(u.n(path), u.n(path2), j$.nio.channels.c.i(mVarArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof b) {
            obj = ((b) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void f(Path path) {
        this.b.delete(u.n(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean g(Path path) {
        boolean deleteIfExists;
        deleteIfExists = this.b.deleteIfExists(u.n(path));
        return deleteIfExists;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ s h(Path path, Class cls, m[] mVarArr) {
        FileAttributeView fileAttributeView;
        fileAttributeView = this.b.getFileAttributeView(u.n(path), l.d(cls), l.m(mVarArr));
        return q.c(fileAttributeView);
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ C0062d i(Path path) {
        FileStore fileStore;
        fileStore = this.b.getFileStore(u.n(path));
        return C0062d.a(fileStore);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0067i j(URI uri) {
        FileSystem fileSystem;
        fileSystem = this.b.getFileSystem(uri);
        return C0065g.F(fileSystem);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path k(URI uri) {
        java.nio.file.Path path;
        path = this.b.getPath(uri);
        return t.n(path);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ String l() {
        String scheme;
        scheme = this.b.getScheme();
        return scheme;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean m(Path path) {
        boolean isHidden;
        isHidden = this.b.isHidden(u.n(path));
        return isHidden;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean n(Path path, Path path2) {
        boolean isSameFile;
        isSameFile = this.b.isSameFile(u.n(path), u.n(path2));
        return isSameFile;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) {
        java.nio.file.CopyOption[] copyOptionArr2;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path n = u.n(path);
        java.nio.file.Path n2 = u.n(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            java.nio.file.CopyOption[] copyOptionArr3 = new java.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0061c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        fileSystemProvider.move(n, n2, copyOptionArr2);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, j$.nio.file.attribute.m[] mVarArr) {
        AsynchronousFileChannel newAsynchronousFileChannel;
        newAsynchronousFileChannel = this.b.newAsynchronousFileChannel(u.n(path), l.h(set), executorService, j$.nio.channels.c.i(mVarArr));
        return j$.nio.channels.a.i(newAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, j$.nio.file.attribute.m[] mVarArr) {
        SeekableByteChannel newByteChannel;
        newByteChannel = this.b.newByteChannel(u.n(path), l.h(set), j$.nio.channels.c.i(mVarArr));
        return newByteChannel;
    }

    @Override // j$.nio.file.spi.d
    public final DirectoryStream r(Path path, v vVar) {
        DirectoryStream newDirectoryStream;
        newDirectoryStream = this.b.newDirectoryStream(u.n(path), new v(vVar));
        return new x(newDirectoryStream);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileChannel s(Path path, Set set, j$.nio.file.attribute.m[] mVarArr) {
        FileChannel newFileChannel;
        newFileChannel = this.b.newFileChannel(u.n(path), l.h(set), j$.nio.channels.c.i(mVarArr));
        return newFileChannel;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0067i t(Path path, Map map) {
        FileSystem newFileSystem;
        newFileSystem = this.b.newFileSystem(u.n(path), (Map<String, ?>) map);
        return C0065g.F(newFileSystem);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0067i u(URI uri, Map map) {
        FileSystem newFileSystem;
        newFileSystem = this.b.newFileSystem(uri, (Map<String, ?>) map);
        return C0065g.F(newFileSystem);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ InputStream v(Path path, p[] pVarArr) {
        OpenOption[] openOptionArr;
        InputStream newInputStream;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path n = u.n(path);
        if (pVarArr == null) {
            openOptionArr = null;
        } else {
            int length = pVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = o.a(pVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        newInputStream = fileSystemProvider.newInputStream(n, openOptionArr);
        return newInputStream;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ OutputStream w(Path path, p[] pVarArr) {
        OpenOption[] openOptionArr;
        OutputStream newOutputStream;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path n = u.n(path);
        if (pVarArr == null) {
            openOptionArr = null;
        } else {
            int length = pVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = o.a(pVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        newOutputStream = fileSystemProvider.newOutputStream(n, openOptionArr);
        return newOutputStream;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ InterfaceC0058h x(Path path, Class cls, m[] mVarArr) {
        BasicFileAttributes readAttributes;
        readAttributes = this.b.readAttributes(u.n(path), (Class<BasicFileAttributes>) l.e(cls), l.m(mVarArr));
        return C0056f.a(readAttributes);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Map y(Path path, String str, m[] mVarArr) {
        Map readAttributes;
        readAttributes = this.b.readAttributes(u.n(path), str, l.m(mVarArr));
        return l.f(readAttributes);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path z(Path path) {
        java.nio.file.Path readSymbolicLink;
        readSymbolicLink = this.b.readSymbolicLink(u.n(path));
        return t.n(readSymbolicLink);
    }
}
