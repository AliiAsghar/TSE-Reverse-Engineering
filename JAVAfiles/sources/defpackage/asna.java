package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asna extends asqy {
    final /* synthetic */ asnc a;
    private final long c;
    private boolean d;
    private long e;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asna(asnc asncVar, asro asroVar, long j) {
        super(asroVar);
        asroVar.getClass();
        this.a = asncVar;
        this.c = j;
    }

    private final IOException c(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        return this.a.e(false, true, iOException);
    }

    @Override // defpackage.asqy, defpackage.asro, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        long j = this.c;
        if (j != -1 && this.e != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            this.b.close();
        } catch (IOException e) {
            throw c(e);
        }
    }

    @Override // defpackage.asqy, defpackage.asro, java.io.Flushable
    public final void flush() {
        try {
            this.b.flush();
        } catch (IOException e) {
            throw c(e);
        }
    }

    @Override // defpackage.asqy, defpackage.asro
    public final void hq(asqu asquVar, long j) {
        if (!this.f) {
            long j2 = this.c;
            if (j2 != -1 && this.e + j > j2) {
                throw new ProtocolException("expected " + j2 + " bytes but received " + (this.e + j));
            }
            try {
                this.b.hq(asquVar, j);
                this.e += j;
                return;
            } catch (IOException e) {
                throw c(e);
            }
        }
        throw new IllegalStateException("closed");
    }
}
