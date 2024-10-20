package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class almb extends allf {
    final /* synthetic */ almd a;
    private final Object b;
    private int c;

    public almb(almd almdVar, int i) {
        this.a = almdVar;
        this.b = almdVar.e(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1 && i < this.a.size() && d.B(this.b, this.a.e(this.c))) {
            return;
        }
        this.c = this.a.d(this.b);
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object getValue() {
        Map j = this.a.j();
        if (j != null) {
            return j.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.h(i);
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map j = this.a.j();
        if (j != null) {
            return j.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            this.a.put(this.b, obj);
            return null;
        }
        almd almdVar = this.a;
        Object h = almdVar.h(i);
        almdVar.n(this.c, obj);
        return h;
    }
}
