package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yky implements ykz {
    final /* synthetic */ aegp a;
    final /* synthetic */ aegp b;
    final /* synthetic */ Collection c;
    final /* synthetic */ Collection d;

    public yky(aegp aegpVar, aegp aegpVar2, Collection collection, Collection collection2) {
        this.a = aegpVar;
        this.b = aegpVar2;
        this.c = collection;
        this.d = collection2;
    }

    @Override // defpackage.ykz
    public final boolean a(String str) {
        if (!this.a.b(str) && !this.b.b(str) && !this.c.contains(str)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.aegp
    public final boolean b(String str) {
        if (!this.a.b(str)) {
            return false;
        }
        aluq listIterator = ((altx) this.d).listIterator();
        while (listIterator.hasNext()) {
            ykz ykzVar = (ykz) listIterator.next();
            if (ykzVar.a(str)) {
                return ykzVar.b(str);
            }
        }
        return true;
    }
}
