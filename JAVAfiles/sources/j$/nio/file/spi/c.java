package j$.nio.file.spi;

import j$.nio.file.AbstractC0063e;
import j$.nio.file.C0060b;
import j$.nio.file.C0062d;
import j$.nio.file.C0066h;
import j$.nio.file.EnumC0050a;
import j$.nio.file.attribute.C0057g;
import j$.nio.file.attribute.r;
import j$.nio.file.l;
import j$.nio.file.n;
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
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final /* synthetic */ class c extends FileSystemProvider {
    public final /* synthetic */ d a;

    private /* synthetic */ c(d dVar) {
        this.a = dVar;
    }

    public static /* synthetic */ FileSystemProvider a(d dVar) {
        if (dVar == null) {
            return null;
        }
        return dVar instanceof b ? ((b) dVar).b : new c(dVar);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        AccessMode accessMode;
        AccessMode accessMode2;
        EnumC0050a enumC0050a;
        d dVar = this.a;
        j$.nio.file.Path n = t.n(path);
        EnumC0050a[] enumC0050aArr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC0050a[] enumC0050aArr2 = new EnumC0050a[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode3 = accessModeArr[i];
                if (accessMode3 != null) {
                    accessMode = AccessMode.READ;
                    if (accessMode3 != accessMode) {
                        accessMode2 = AccessMode.WRITE;
                        if (accessMode3 == accessMode2) {
                            enumC0050a = EnumC0050a.WRITE;
                        } else {
                            enumC0050a = EnumC0050a.EXECUTE;
                        }
                    } else {
                        enumC0050a = EnumC0050a.READ;
                    }
                } else {
                    enumC0050a = null;
                }
                enumC0050aArr2[i] = enumC0050a;
            }
            enumC0050aArr = enumC0050aArr2;
        }
        dVar.a(n, enumC0050aArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        d dVar = this.a;
        j$.nio.file.Path n = t.n(path);
        j$.nio.file.Path n2 = t.n(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0060b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        dVar.b(n, n2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(t.n(path), j$.nio.channels.c.h(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(t.n(path), t.n(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(t.n(path), t.n(path2), j$.nio.channels.c.h(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(t.n(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(t.n(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        d dVar = this.a;
        if (obj instanceof c) {
            obj = ((c) obj).a;
        }
        return dVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        return r.a(this.a.h(t.n(path), l.d(cls), l.k(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        C0062d i = this.a.i(t.n(path));
        int i2 = AbstractC0063e.a;
        if (i == null) {
            return null;
        }
        return i.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C0066h.i(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return u.n(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(t.n(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(t.n(path), t.n(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        d dVar = this.a;
        j$.nio.file.Path n = t.n(path);
        j$.nio.file.Path n2 = t.n(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0060b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        dVar.o(n, n2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.a p = this.a.p(t.n(path), l.h(set), executorService, j$.nio.channels.c.h(fileAttributeArr));
        int i = j$.nio.channels.b.a;
        if (p == null) {
            return null;
        }
        return p.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(t.n(path), l.h(set), j$.nio.channels.c.h(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new x(this.a.r(t.n(path), new v(filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(t.n(path), l.h(set), j$.nio.channels.c.h(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C0066h.i(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        p[] pVarArr;
        d dVar = this.a;
        j$.nio.file.Path n = t.n(path);
        if (openOptionArr == null) {
            pVarArr = null;
        } else {
            int length = openOptionArr.length;
            p[] pVarArr2 = new p[length];
            for (int i = 0; i < length; i++) {
                pVarArr2[i] = n.a(openOptionArr[i]);
            }
            pVarArr = pVarArr2;
        }
        return dVar.v(n, pVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        p[] pVarArr;
        d dVar = this.a;
        j$.nio.file.Path n = t.n(path);
        if (openOptionArr == null) {
            pVarArr = null;
        } else {
            int length = openOptionArr.length;
            p[] pVarArr2 = new p[length];
            for (int i = 0; i < length; i++) {
                pVarArr2[i] = n.a(openOptionArr[i]);
            }
            pVarArr = pVarArr2;
        }
        return dVar.w(n, pVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0057g.a(this.a.x(t.n(path), l.e(cls), l.k(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return u.n(this.a.z(t.n(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(t.n(path), str, l.g(obj), l.k(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C0066h.i(this.a.t(t.n(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return l.f(this.a.y(t.n(path), str, l.k(linkOptionArr)));
    }
}
