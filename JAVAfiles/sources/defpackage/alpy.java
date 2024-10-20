package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alpy extends alog {
    final /* synthetic */ alpz a;

    public alpy(alpz alpzVar) {
        this.a = alpzVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.a.a.c.d.get(i), this.a.a.d.get(i));
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }

    @Override // defpackage.alog, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
