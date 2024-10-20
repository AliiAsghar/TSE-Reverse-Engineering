package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class asoa implements asrq {
    public boolean a;
    final /* synthetic */ asog b;
    private final asra c;

    public asoa(asog asogVar) {
        this.b = asogVar;
        this.c = new asra(asogVar.c.a());
    }

    @Override // defpackage.asrq
    public final asrs a() {
        return this.c;
    }

    @Override // defpackage.asrq
    public long b(asqu asquVar, long j) {
        try {
            return this.b.c.b(asquVar, j);
        } catch (IOException e) {
            this.b.b.e();
            c();
            throw e;
        }
    }

    public final void c() {
        int i = this.b.e;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            asog.l(this.c);
            this.b.e = 6;
            return;
        }
        throw new IllegalStateException(a.bV(i, "state: "));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        this.a = true;
    }
}
