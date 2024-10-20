package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import j$.util.g0;
import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class t implements Path, j$.lang.a {
    public final /* synthetic */ java.nio.file.Path a;

    private /* synthetic */ t(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path n(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof u ? ((u) path).a : new t(path);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean E(Path path) {
        boolean endsWith;
        endsWith = this.a.endsWith(u.n(path));
        return endsWith;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path I(Path path) {
        java.nio.file.Path resolveSibling;
        resolveSibling = this.a.resolveSibling(u.n(path));
        return n(resolveSibling);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ J J(K k, H[] hArr) {
        WatchService watchService;
        WatchKey register;
        java.nio.file.Path path = this.a;
        if (k == null) {
            watchService = null;
        } else {
            watchService = k.a;
        }
        register = path.register(watchService, l.n(hArr));
        return J.a(register);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path Y(Path path) {
        java.nio.file.Path relativize;
        relativize = this.a.relativize(u.n(path));
        return n(relativize);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        int compareTo;
        compareTo = this.a.compareTo((java.nio.file.Path) l.c(path));
        return compareTo;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        boolean endsWith;
        endsWith = this.a.endsWith(str);
        return endsWith;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof t) {
            obj = ((t) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        java.nio.file.Path fileName;
        fileName = this.a.getFileName();
        return n(fileName);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ AbstractC0067i getFileSystem() {
        FileSystem fileSystem;
        fileSystem = this.a.getFileSystem();
        return C0065g.F(fileSystem);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        java.nio.file.Path name;
        name = this.a.getName(i);
        return n(name);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        int nameCount;
        nameCount = this.a.getNameCount();
        return nameCount;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        java.nio.file.Path parent;
        parent = this.a.getParent();
        return n(parent);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        java.nio.file.Path root;
        root = this.a.getRoot();
        return n(root);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        boolean isAbsolute;
        isAbsolute = this.a.isAbsolute();
        return isAbsolute;
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        it = this.a.iterator();
        return new z(it);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        java.nio.file.Path normalize;
        normalize = this.a.normalize();
        return n(normalize);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ J o(K k, H[] hArr, I[] iArr) {
        WatchService watchService;
        WatchKey register;
        WatchEvent.Modifier modifier;
        java.nio.file.Path path = this.a;
        WatchEvent.Modifier[] modifierArr = null;
        if (k == null) {
            watchService = null;
        } else {
            watchService = k.a;
        }
        WatchEvent.Kind[] n = l.n(hArr);
        if (iArr != null) {
            int length = iArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i = 0; i < length; i++) {
                I i2 = iArr[i];
                if (i2 == null) {
                    modifier = null;
                } else {
                    modifier = i2.a;
                }
                modifierArr2[i] = modifier;
            }
            modifierArr = modifierArr2;
        }
        register = path.register(watchService, n, modifierArr);
        return J.a(register);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path r(Path path) {
        java.nio.file.Path resolve;
        resolve = this.a.resolve(u.n(path));
        return n(resolve);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        java.nio.file.Path resolve;
        resolve = this.a.resolve(str);
        return n(resolve);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        java.nio.file.Path resolveSibling;
        resolveSibling = this.a.resolveSibling(str);
        return n(resolveSibling);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path s(m[] mVarArr) {
        java.nio.file.Path realPath;
        realPath = this.a.toRealPath(l.m(mVarArr));
        return n(realPath);
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        java.util.Spliterator spliterator;
        spliterator = this.a.spliterator();
        return g0.a(spliterator);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        boolean startsWith;
        startsWith = this.a.startsWith(str);
        return startsWith;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        java.nio.file.Path subpath;
        subpath = this.a.subpath(i, i2);
        return n(subpath);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        java.nio.file.Path absolutePath;
        absolutePath = this.a.toAbsolutePath();
        return n(absolutePath);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        File file;
        file = this.a.toFile();
        return file;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        String path;
        path = this.a.toString();
        return path;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        URI uri;
        uri = this.a.toUri();
        return uri;
    }

    @Override // j$.nio.file.Path
    /* renamed from: v */
    public final /* synthetic */ int compareTo(Path path) {
        int compareTo;
        compareTo = this.a.compareTo(u.n(path));
        return compareTo;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean z(Path path) {
        boolean startsWith;
        startsWith = this.a.startsWith(u.n(path));
        return startsWith;
    }
}
