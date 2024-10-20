package j$.nio.file.attribute;

import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;

/* loaded from: classes5.dex */
public final /* synthetic */ class B implements InterfaceC0058h {
    public final /* synthetic */ PosixFileAttributes a;

    private /* synthetic */ B(PosixFileAttributes posixFileAttributes) {
        this.a = posixFileAttributes;
    }

    public static /* synthetic */ B a(PosixFileAttributes posixFileAttributes) {
        if (posixFileAttributes == null) {
            return null;
        }
        return new B(posixFileAttributes);
    }

    @Override // j$.nio.file.attribute.InterfaceC0058h
    public final /* synthetic */ y creationTime() {
        FileTime creationTime;
        creationTime = this.a.creationTime();
        return p.b(creationTime);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.InterfaceC0058h
    public final /* synthetic */ Object fileKey() {
        Object fileKey;
        fileKey = this.a.fileKey();
        return fileKey;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0058h
    public final /* synthetic */ boolean isDirectory() {
        boolean isDirectory;
        isDirectory = this.a.isDirectory();
        return isDirectory;
    }

    @Override // j$.nio.file.attribute.InterfaceC0058h
    public final /* synthetic */ boolean isOther() {
        boolean isOther;
        isOther = this.a.isOther();
        return isOther;
    }

    @Override // j$.nio.file.attribute.InterfaceC0058h
    public final /* synthetic */ boolean isRegularFile() {
        boolean isRegularFile;
        isRegularFile = this.a.isRegularFile();
        return isRegularFile;
    }

    @Override // j$.nio.file.attribute.InterfaceC0058h
    public final /* synthetic */ boolean isSymbolicLink() {
        boolean isSymbolicLink;
        isSymbolicLink = this.a.isSymbolicLink();
        return isSymbolicLink;
    }

    @Override // j$.nio.file.attribute.InterfaceC0058h
    public final /* synthetic */ y lastAccessTime() {
        FileTime lastAccessTime;
        lastAccessTime = this.a.lastAccessTime();
        return p.b(lastAccessTime);
    }

    @Override // j$.nio.file.attribute.InterfaceC0058h
    public final /* synthetic */ y lastModifiedTime() {
        FileTime lastModifiedTime;
        lastModifiedTime = this.a.lastModifiedTime();
        return p.b(lastModifiedTime);
    }

    @Override // j$.nio.file.attribute.InterfaceC0058h
    public final /* synthetic */ long size() {
        long size;
        size = this.a.size();
        return size;
    }
}
