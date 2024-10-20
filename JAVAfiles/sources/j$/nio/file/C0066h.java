package j$.nio.file;

import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.h */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0066h extends FileSystem {
    public final /* synthetic */ AbstractC0067i a;

    private /* synthetic */ C0066h(AbstractC0067i abstractC0067i) {
        this.a = abstractC0067i;
    }

    public static /* synthetic */ FileSystem i(AbstractC0067i abstractC0067i) {
        if (abstractC0067i == null) {
            return null;
        }
        return abstractC0067i instanceof C0065g ? ((C0065g) abstractC0067i).a : new C0066h(abstractC0067i);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0067i abstractC0067i = this.a;
        if (obj instanceof C0066h) {
            obj = ((C0066h) obj).a;
        }
        return abstractC0067i.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.i();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return u.n(this.a.o(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        return B.a(this.a.r(str));
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new y(this.a.s());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.v();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.nio.file.attribute.H z = this.a.z();
        int i = j$.nio.file.attribute.I.a;
        if (z == null) {
            return null;
        }
        return z.a;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.B();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        K C = this.a.C();
        if (C == null) {
            return null;
        }
        return C.a;
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        return j$.nio.file.spi.c.a(this.a.D());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.E();
    }
}
