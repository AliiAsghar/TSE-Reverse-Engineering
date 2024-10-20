package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alpd extends alnu {
    private static final long serialVersionUID = 0;
    final alpg a;

    public alpd(alpg alpgVar) {
        this.a = alpgVar;
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.a.v(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final aluq listIterator() {
        return new alpa(this.a);
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
