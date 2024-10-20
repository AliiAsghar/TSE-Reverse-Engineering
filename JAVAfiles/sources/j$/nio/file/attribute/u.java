package j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* loaded from: classes5.dex */
public final /* synthetic */ class u implements w {
    public final /* synthetic */ FileOwnerAttributeView a;

    private /* synthetic */ u(FileOwnerAttributeView fileOwnerAttributeView) {
        this.a = fileOwnerAttributeView;
    }

    public static /* synthetic */ w c(FileOwnerAttributeView fileOwnerAttributeView) {
        if (fileOwnerAttributeView == null) {
            return null;
        }
        return fileOwnerAttributeView instanceof v ? ((v) fileOwnerAttributeView).a : t.s(fileOwnerAttributeView) ? C0051a.c(t.i(fileOwnerAttributeView)) : j$.nio.file.s.v(fileOwnerAttributeView) ? A.c(AbstractC0052b.p(fileOwnerAttributeView)) : new u(fileOwnerAttributeView);
    }

    @Override // j$.nio.file.attribute.w
    public final /* synthetic */ void b(G g) {
        this.a.setOwner(F.a(g));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
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
}
