package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aegq implements aegp {
    final /* synthetic */ Collection a;

    public aegq(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.aegp
    public final boolean b(String str) {
        return this.a.contains(str);
    }
}
