package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eys implements esj {
    public long a;
    final /* synthetic */ eyt b;

    public eys(eyt eytVar) {
        this.b = eytVar;
    }

    @Override // defpackage.esj
    public final void a() {
        eyt eytVar = this.b;
        if (eytVar.c) {
            b(new esh("onEnded() received multiple times"));
        } else {
            eytVar.c = true;
            eytVar.b.execute(new exl(this, 3));
        }
    }

    @Override // defpackage.esj
    public final void b(esh eshVar) {
        this.b.b.execute(new ewq(this, eshVar, 9, null));
    }

    @Override // defpackage.esj
    public final void c(long j) {
        eyt eytVar = this.b;
        if (eytVar.c) {
            b(new esh("onOutputFrameAvailableForRendering() received after onEnded()"));
            return;
        }
        if (j == 0) {
            eytVar.d = true;
            j = 0;
        }
        this.a = j;
        this.b.b.execute(new eyq(this, j, 0));
    }

    @Override // defpackage.esj
    public final void d(int i, int i2) {
        this.b.b.execute(new eyr(this, i, i2, 0));
    }

    @Override // defpackage.esj
    public final void e() {
    }
}
