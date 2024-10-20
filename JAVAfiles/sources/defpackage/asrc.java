package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrc implements asrq {
    private final asqw a;
    private final Inflater b;
    private int c;
    private boolean d;

    public asrc(asqw asqwVar, Inflater inflater) {
        this.a = asqwVar;
        this.b = inflater;
    }

    @Override // defpackage.asrq
    public final asrs a() {
        return this.a.a();
    }

    @Override // defpackage.asrq
    public final long b(asqu asquVar, long j) {
        do {
            long c = c(asquVar);
            if (c > 0) {
                return c;
            }
            if (this.b.finished() || this.b.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.C());
        throw new EOFException("source exhausted prematurely");
    }

    public final long c(asqu asquVar) {
        if (!this.d) {
            try {
                asrl w = asquVar.w(1);
                int min = (int) Math.min(8192L, 8192 - w.c);
                if (this.b.needsInput() && !this.a.C()) {
                    asrl asrlVar = ((asrk) this.a).b.a;
                    asrlVar.getClass();
                    int i = asrlVar.c;
                    int i2 = asrlVar.b;
                    int i3 = i - i2;
                    this.c = i3;
                    this.b.setInput(asrlVar.a, i2, i3);
                }
                int inflate = this.b.inflate(w.a, w.c, min);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - this.b.getRemaining();
                    this.c -= remaining;
                    this.a.B(remaining);
                }
                if (inflate > 0) {
                    w.c += inflate;
                    long j = inflate;
                    asquVar.b += j;
                    return j;
                }
                if (w.b == w.c) {
                    asquVar.a = w.a();
                    asrm.b(w);
                    return 0L;
                }
                return 0L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asrq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
