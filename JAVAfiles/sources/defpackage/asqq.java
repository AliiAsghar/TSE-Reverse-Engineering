package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asqq implements asro {
    final /* synthetic */ asqs a;
    final /* synthetic */ asro b;

    public asqq(asqs asqsVar, asro asroVar) {
        this.a = asqsVar;
        this.b = asroVar;
    }

    @Override // defpackage.asro
    public final /* synthetic */ asrs a() {
        return this.a;
    }

    @Override // defpackage.asro, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // defpackage.asro, java.io.Flushable
    public final void flush() {
        asqs asqsVar = this.a;
        asqsVar.e();
        try {
            this.b.flush();
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

    @Override // defpackage.asro
    public final void hq(asqu asquVar, long j) {
        aotl.T(asquVar.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                asrl asrlVar = asquVar.a;
                asrlVar.getClass();
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += asrlVar.c - asrlVar.b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        asrlVar = asrlVar.f;
                        asrlVar.getClass();
                    }
                }
                asqs asqsVar = this.a;
                asro asroVar = this.b;
                asqsVar.e();
                try {
                    asroVar.hq(asquVar, j2);
                    if (!asqsVar.f()) {
                        j -= j2;
                    } else {
                        throw asqsVar.d(null);
                    }
                } catch (IOException e) {
                    if (asqsVar.f()) {
                        throw asqsVar.d(e);
                    }
                    throw e;
                } finally {
                    asqsVar.f();
                }
            } else {
                return;
            }
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.b + ")";
    }
}
