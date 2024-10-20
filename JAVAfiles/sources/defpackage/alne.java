package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alne extends allf {
    final alnm a;
    final Object b;
    int c;

    public alne(alnm alnmVar, int i) {
        this.a = alnmVar;
        this.b = alnmVar.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            alnm alnmVar = this.a;
            if (i <= alnmVar.c && d.B(this.b, alnmVar.b[i])) {
                return;
            }
        }
        this.c = this.a.e(this.b);
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.a[i];
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            this.a.k(this.b, obj);
            return null;
        }
        Object obj2 = this.a.a[i];
        if (d.B(obj2, obj)) {
            return obj;
        }
        this.a.l(this.c, obj);
        return obj2;
    }
}
