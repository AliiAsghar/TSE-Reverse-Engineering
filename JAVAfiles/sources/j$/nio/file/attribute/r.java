package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* loaded from: classes5.dex */
public final /* synthetic */ class r implements FileAttributeView {
    public final /* synthetic */ s a;

    private /* synthetic */ r(s sVar) {
        this.a = sVar;
    }

    public static /* synthetic */ FileAttributeView a(s sVar) {
        if (sVar == null) {
            return null;
        }
        if (sVar instanceof q) {
            return ((q) sVar).a;
        }
        if (sVar instanceof InterfaceC0055e) {
            return C0054d.a((InterfaceC0055e) sVar);
        }
        if (sVar instanceof w) {
            return v.a((w) sVar);
        }
        if (sVar instanceof D) {
            return ((D) sVar).a;
        }
        return new r(sVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        s sVar = this.a;
        if (obj instanceof r) {
            obj = ((r) obj).a;
        }
        return sVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
