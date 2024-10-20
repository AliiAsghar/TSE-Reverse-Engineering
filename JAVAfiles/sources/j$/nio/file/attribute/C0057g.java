package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0057g implements BasicFileAttributes {
    public final /* synthetic */ InterfaceC0058h a;

    private /* synthetic */ C0057g(InterfaceC0058h interfaceC0058h) {
        this.a = interfaceC0058h;
    }

    public static /* synthetic */ BasicFileAttributes a(InterfaceC0058h interfaceC0058h) {
        if (interfaceC0058h == null) {
            return null;
        }
        if (interfaceC0058h instanceof C0056f) {
            return ((C0056f) interfaceC0058h).a;
        }
        if (interfaceC0058h instanceof j) {
            return ((j) interfaceC0058h).a;
        }
        if (interfaceC0058h instanceof B) {
            return ((B) interfaceC0058h).a;
        }
        return new C0057g(interfaceC0058h);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return p.d(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0058h interfaceC0058h = this.a;
        if (obj instanceof C0057g) {
            obj = ((C0057g) obj).a;
        }
        return interfaceC0058h.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return p.d(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return p.d(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
