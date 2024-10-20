package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpa implements atoo {
    final Executor a;
    public final atoo b;

    public atpa(Executor executor, atoo atooVar) {
        this.a = executor;
        this.b = atooVar;
    }

    @Override // defpackage.atoo
    public final asmh a() {
        return this.b.a();
    }

    @Override // defpackage.atoo
    /* renamed from: b */
    public final atoo clone() {
        return new atpa(this.a, this.b.clone());
    }

    @Override // defpackage.atoo
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.atoo
    public final void d(ator atorVar) {
        this.b.d(new atoz(this, atorVar));
    }

    @Override // defpackage.atoo
    public final boolean e() {
        return this.b.e();
    }
}
