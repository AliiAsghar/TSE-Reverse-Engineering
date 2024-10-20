package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0054d implements BasicFileAttributeView {
    public final /* synthetic */ InterfaceC0055e a;

    private /* synthetic */ C0054d(InterfaceC0055e interfaceC0055e) {
        this.a = interfaceC0055e;
    }

    public static /* synthetic */ BasicFileAttributeView a(InterfaceC0055e interfaceC0055e) {
        if (interfaceC0055e == null) {
            return null;
        }
        if (interfaceC0055e instanceof C0053c) {
            return ((C0053c) interfaceC0055e).a;
        }
        if (interfaceC0055e instanceof C0059i) {
            return ((C0059i) interfaceC0055e).a;
        }
        if (interfaceC0055e instanceof A) {
            return ((A) interfaceC0055e).a;
        }
        return new C0054d(interfaceC0055e);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0055e interfaceC0055e = this.a;
        if (obj instanceof C0054d) {
            obj = ((C0054d) obj).a;
        }
        return interfaceC0055e.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0057g.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(p.b(fileTime), p.b(fileTime2), p.b(fileTime3));
    }
}
