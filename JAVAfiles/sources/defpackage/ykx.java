package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykx implements ykz {
    final /* synthetic */ aegp a;
    final /* synthetic */ aegp b;
    final /* synthetic */ Collection c;

    public ykx(aegp aegpVar, aegp aegpVar2, Collection collection) {
        this.a = aegpVar;
        this.b = aegpVar2;
        this.c = collection;
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
        return this.a.b(str);
    }
}
