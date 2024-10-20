package defpackage;

import java.io.Writer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akmp extends Writer {
    public long a = 0;
    private final Writer b;

    public akmp(Writer writer) {
        this.b = writer;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        this.b.flush();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        this.b.write(cArr, i, i2);
        this.a += i2;
    }
}
