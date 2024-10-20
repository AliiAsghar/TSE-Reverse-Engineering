package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arfv extends aqrx {
    long a;
    final /* synthetic */ argc b;
    private final arga c;

    public arfv(argc argcVar, arga argaVar) {
        this.b = argcVar;
        this.c = argaVar;
    }

    @Override // defpackage.aqae
    public final void c(long j) {
        Runnable runnable;
        if (this.b.q.f == null) {
            synchronized (this.b.l) {
                if (this.b.q.f == null) {
                    arga argaVar = this.c;
                    if (!argaVar.b) {
                        long j2 = this.a + j;
                        this.a = j2;
                        argc argcVar = this.b;
                        long j3 = argcVar.u;
                        if (j2 <= j3) {
                            return;
                        }
                        if (j2 > argcVar.m) {
                            argaVar.c = true;
                        } else {
                            long c = argcVar.F.c(j2 - j3);
                            argc argcVar2 = this.b;
                            argcVar2.u = this.a;
                            if (c > argcVar2.n) {
                                this.c.c = true;
                            }
                        }
                        arga argaVar2 = this.c;
                        if (argaVar2.c) {
                            runnable = this.b.q(argaVar2);
                        } else {
                            runnable = null;
                        }
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
            }
        }
    }
}
