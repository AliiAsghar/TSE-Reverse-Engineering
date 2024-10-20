package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alpf extends alnu {
    private static final long serialVersionUID = 0;
    private final transient alpg a;

    public alpf(alpg alpgVar) {
        this.a = alpgVar;
    }

    @Override // defpackage.alnu
    public final int c(Object[] objArr, int i) {
        aluq listIterator = this.a.map.values().listIterator();
        while (listIterator.hasNext()) {
            i = ((alnu) listIterator.next()).c(objArr, i);
        }
        return i;
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.w(obj);
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final aluq listIterator() {
        return new alpb(this.a);
    }

    @Override // defpackage.alnu
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
