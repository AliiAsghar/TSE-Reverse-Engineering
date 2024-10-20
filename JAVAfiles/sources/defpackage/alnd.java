package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alnd extends allf {
    final Object a;
    int b;
    final /* synthetic */ alnm c;

    public alnd(alnm alnmVar, int i) {
        this.c = alnmVar;
        this.a = alnmVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            alnm alnmVar = this.c;
            if (i <= alnmVar.c && d.B(alnmVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.c(this.a);
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        if (i == -1) {
            this.c.put(this.a, obj);
            return null;
        }
        Object obj2 = this.c.b[i];
        if (d.B(obj2, obj)) {
            return obj;
        }
        this.c.m(this.b, obj);
        return obj2;
    }
}
