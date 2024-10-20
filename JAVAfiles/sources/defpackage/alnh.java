package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alnh extends alnl {
    public alnh(alnm alnmVar) {
        super(alnmVar);
    }

    @Override // defpackage.alnl
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new alne(this.b, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int e = this.b.e(key);
            if (e != -1 && d.B(this.b.a[e], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int bg = alzz.bg(key);
            int f = this.b.f(key, bg);
            if (f != -1 && d.B(this.b.a[f], value)) {
                this.b.i(f, bg);
                return true;
            }
            return false;
        }
        return false;
    }
}
