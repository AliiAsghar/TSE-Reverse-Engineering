package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* loaded from: classes5.dex */
public final /* synthetic */ class A implements InterfaceC0055e, w {
    public final /* synthetic */ PosixFileAttributeView a;

    private /* synthetic */ A(PosixFileAttributeView posixFileAttributeView) {
        this.a = posixFileAttributeView;
    }

    public static /* synthetic */ A c(PosixFileAttributeView posixFileAttributeView) {
        if (posixFileAttributeView == null) {
            return null;
        }
        return new A(posixFileAttributeView);
    }

    @Override // j$.nio.file.attribute.InterfaceC0055e
    public final /* synthetic */ void a(y yVar, y yVar2, y yVar3) {
        this.a.setTimes(p.d(yVar), p.d(yVar2), p.d(yVar3));
    }

    @Override // j$.nio.file.attribute.w
    public final /* synthetic */ void b(G g) {
        this.a.setOwner(F.a(g));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof A) {
            obj = ((A) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.w
    public final /* synthetic */ G getOwner() {
        UserPrincipal owner;
        owner = this.a.getOwner();
        return E.a(owner);
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
