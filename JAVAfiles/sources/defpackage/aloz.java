package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aloz extends alnu {
    public final alor a;

    public aloz(alor alorVar) {
        this.a = alorVar;
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null && alzz.aF(new alow(this), obj)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.alnu
    public final alog g() {
        return new alox(this.a.entrySet().g());
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator listIterator() {
        return new alow(this);
    }

    @Override // defpackage.alnu
    /* renamed from: k */
    public final aluq listIterator() {
        return new alow(this);
    }

    @Override // defpackage.alnu
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.alnu
    public Object writeReplace() {
        return new aloy(this.a);
    }
}
