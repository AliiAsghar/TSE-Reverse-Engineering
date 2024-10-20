package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alnf extends alnl {
    final /* synthetic */ alnm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alnf(alnm alnmVar) {
        super(alnmVar);
        this.a = alnmVar;
    }

    @Override // defpackage.alnl
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new alnd(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = this.a.c(key);
            if (c != -1 && d.B(value, this.a.b[c])) {
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
            int d = this.a.d(key, bg);
            if (d != -1 && d.B(value, this.a.b[d])) {
                this.a.h(d, bg);
                return true;
            }
            return false;
        }
        return false;
    }
}
