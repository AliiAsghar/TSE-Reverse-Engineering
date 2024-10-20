package j$.nio.file;

import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.g */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0065g extends AbstractC0067i {
    public final /* synthetic */ FileSystem a;

    private C0065g(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ AbstractC0067i F(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C0066h ? ((C0066h) fileSystem).a : new C0065g(fileSystem);
    }

    @Override // j$.nio.file.AbstractC0067i
    public final /* synthetic */ boolean B() {
        boolean isReadOnly;
        isReadOnly = this.a.isReadOnly();
        return isReadOnly;
    }

    @Override // j$.nio.file.AbstractC0067i
    public final /* synthetic */ K C() {
        WatchService newWatchService;
        newWatchService = this.a.newWatchService();
        return K.i(newWatchService);
    }

    @Override // j$.nio.file.AbstractC0067i
    public final /* synthetic */ j$.nio.file.spi.d D() {
        FileSystemProvider provider;
        provider = this.a.provider();
        return j$.nio.file.spi.b.B(provider);
    }

    @Override // j$.nio.file.AbstractC0067i
    public final /* synthetic */ Set E() {
        Set supportedFileAttributeViews;
        supportedFileAttributeViews = this.a.supportedFileAttributeViews();
        return supportedFileAttributeViews;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof C0065g) {
            obj = ((C0065g) obj).a;
        }
        return fileSystem.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.AbstractC0067i
    public final /* synthetic */ Iterable i() {
        Iterable fileStores;
        fileStores = this.a.getFileStores();
        return fileStores;
    }

    @Override // j$.nio.file.AbstractC0067i
    public final /* synthetic */ boolean isOpen() {
        boolean isOpen;
        isOpen = this.a.isOpen();
        return isOpen;
    }

    @Override // j$.nio.file.AbstractC0067i
    public final /* synthetic */ Path o(String str, String[] strArr) {
        java.nio.file.Path path;
        path = this.a.getPath(str, strArr);
        return t.n(path);
    }

    @Override // j$.nio.file.AbstractC0067i
    public final /* synthetic */ C r(String str) {
        PathMatcher pathMatcher;
        pathMatcher = this.a.getPathMatcher(str);
        return A.b(pathMatcher);
    }

    @Override // j$.nio.file.AbstractC0067i
    public final Iterable s() {
        Iterable rootDirectories;
        rootDirectories = this.a.getRootDirectories();
        return new y(rootDirectories);
    }

    @Override // j$.nio.file.AbstractC0067i
    public final /* synthetic */ String v() {
        String separator;
        separator = this.a.getSeparator();
        return separator;
    }

    @Override // j$.nio.file.AbstractC0067i
    public final /* synthetic */ j$.nio.file.attribute.H z() {
        UserPrincipalLookupService userPrincipalLookupService;
        userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        return j$.nio.file.attribute.H.a(userPrincipalLookupService);
    }
}
