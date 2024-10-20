package j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* loaded from: classes5.dex */
public final /* synthetic */ class v implements FileOwnerAttributeView {
    public final /* synthetic */ w a;

    private /* synthetic */ v(w wVar) {
        this.a = wVar;
    }

    public static /* synthetic */ FileOwnerAttributeView a(w wVar) {
        if (wVar == null) {
            return null;
        }
        if (wVar instanceof u) {
            return ((u) wVar).a;
        }
        if (wVar instanceof C0051a) {
            return ((C0051a) wVar).a;
        }
        if (wVar instanceof A) {
            return ((A) wVar).a;
        }
        return new v(wVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        w wVar = this.a;
        if (obj instanceof v) {
            obj = ((v) obj).a;
        }
        return wVar.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return F.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.a.b(E.a(userPrincipal));
    }
}
