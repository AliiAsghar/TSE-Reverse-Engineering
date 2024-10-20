package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: j$.nio.file.attribute.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0053c implements InterfaceC0055e {
    public final /* synthetic */ BasicFileAttributeView a;

    private /* synthetic */ C0053c(BasicFileAttributeView basicFileAttributeView) {
        this.a = basicFileAttributeView;
    }

    public static /* synthetic */ InterfaceC0055e c(BasicFileAttributeView basicFileAttributeView) {
        if (basicFileAttributeView == null) {
            return null;
        }
        return basicFileAttributeView instanceof C0054d ? ((C0054d) basicFileAttributeView).a : j$.nio.file.s.r(basicFileAttributeView) ? C0059i.c(j$.nio.file.s.i(basicFileAttributeView)) : j$.nio.file.s.v(basicFileAttributeView) ? A.c(AbstractC0052b.p(basicFileAttributeView)) : new C0053c(basicFileAttributeView);
    }

    @Override // j$.nio.file.attribute.InterfaceC0055e
    public final /* synthetic */ void a(y yVar, y yVar2, y yVar3) {
        this.a.setTimes(p.d(yVar), p.d(yVar2), p.d(yVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C0053c) {
            obj = ((C0053c) obj).a;
        }
        return basicFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ String name() {
        String name;
        name = this.a.name();
        return name;
    }

    @Override // j$.nio.file.attribute.InterfaceC0055e
    public final /* synthetic */ InterfaceC0058h readAttributes() {
        BasicFileAttributes readAttributes;
        readAttributes = this.a.readAttributes();
        return C0056f.a(readAttributes);
    }
}
