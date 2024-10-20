package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alov extends alqh {
    private final alor a;

    public alov(alor alorVar) {
        this.a = alorVar;
    }

    @Override // defpackage.alqh
    public final Object a(int i) {
        return ((Map.Entry) this.a.entrySet().g().get(i)).getKey();
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.alqh, defpackage.alpt, defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* bridge */ /* synthetic */ Iterator listIterator() {
        return listIterator();
    }

    @Override // defpackage.alqh, defpackage.alpt, defpackage.alnu
    /* renamed from: k */
    public final aluq listIterator() {
        return this.a.gX();
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.alqh, defpackage.alpt, defpackage.alnu
    public Object writeReplace() {
        return new alou(this.a);
    }
}
