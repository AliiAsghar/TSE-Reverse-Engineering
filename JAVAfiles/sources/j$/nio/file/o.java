package j$.nio.file;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* loaded from: classes5.dex */
public final /* synthetic */ class o implements OpenOption {
    public final /* synthetic */ p a;

    private /* synthetic */ o(p pVar) {
        this.a = pVar;
    }

    public static /* synthetic */ OpenOption a(p pVar) {
        LinkOption linkOption;
        if (pVar == null) {
            return null;
        }
        if (pVar instanceof n) {
            return ((n) pVar).a;
        }
        if (pVar instanceof m) {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            return linkOption;
        }
        if (pVar instanceof D) {
            return l.b((D) pVar);
        }
        return new o(pVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        p pVar = this.a;
        if (obj instanceof o) {
            obj = ((o) obj).a;
        }
        return pVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
