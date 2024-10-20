package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alpv extends alpt {
    private final transient alpx a;

    public alpv(alpx alpxVar) {
        this.a = alpxVar;
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.a.v(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // defpackage.alpt, defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final aluq listIterator() {
        return new alpa(this.a);
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.alpt, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
