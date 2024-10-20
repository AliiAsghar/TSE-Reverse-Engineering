package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahlk implements ahlj {
    final /* synthetic */ alhr a;
    final /* synthetic */ ahlm b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public ahlk(ahlm ahlmVar, alhr alhrVar, Object obj, int i) {
        this.d = i;
        this.a = alhrVar;
        this.c = obj;
        this.b = ahlmVar;
    }

    private final void a() {
        ahli ahliVar = this.b.b;
        if (ahliVar != null) {
            ((ahlt) this.c).g.remove(ahliVar);
            this.b.b = null;
        }
    }

    private final void b() {
        ahln ahlnVar = this.b.a;
        if (ahlnVar != null) {
            ((ahlp) this.c).b(ahlnVar);
            this.b.a = null;
        }
    }

    @Override // defpackage.ahlj
    public final void i(ahka ahkaVar) {
        if (this.d != 0) {
            if (((Boolean) this.a.get()).booleanValue()) {
                b();
                return;
            } else {
                this.b.c.k(ahkaVar);
                return;
            }
        }
        if (((Boolean) this.a.get()).booleanValue()) {
            this.b.c.k(ahkaVar);
        } else {
            a();
        }
    }

    @Override // defpackage.ahlj
    public final void j(ahka ahkaVar) {
        if (this.d != 0) {
            if (((Boolean) this.a.get()).booleanValue()) {
                b();
                return;
            } else {
                this.b.c.l(ahkaVar);
                return;
            }
        }
        if (((Boolean) this.a.get()).booleanValue()) {
            this.b.c.l(ahkaVar);
        } else {
            a();
        }
    }
}
