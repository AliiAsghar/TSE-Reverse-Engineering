package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asqr implements asrq {
    final /* synthetic */ asqs a;
    final /* synthetic */ asrq b;

    public asqr(asqs asqsVar, asrq asrqVar) {
        this.a = asqsVar;
        this.b = asrqVar;
    }

    @Override // defpackage.asrq
    public final /* synthetic */ asrs a() {
        return this.a;
    }

    @Override // defpackage.asrq
    public final long b(asqu asquVar, long j) {
        asqs asqsVar = this.a;
        asqsVar.e();
        try {
            long b = this.b.b(asquVar, j);
            if (!asqsVar.f()) {
                return b;
            }
            throw asqsVar.d(null);
        } catch (IOException e) {
            if (asqsVar.f()) {
                throw asqsVar.d(e);
            }
            throw e;
        } finally {
            asqsVar.f();
        }
    }

    @Override // defpackage.asrq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        asqs asqsVar = this.a;
        asqsVar.e();
        try {
            this.b.close();
            if (!asqsVar.f()) {
            } else {
                throw asqsVar.d(null);
            }
        } catch (IOException e) {
            if (asqsVar.f()) {
                throw asqsVar.d(e);
            }
        } finally {
            asqsVar.f();
        }
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.b + ")";
    }
}
