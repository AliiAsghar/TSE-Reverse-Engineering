package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anbv implements Closeable, Flushable {
    public final Writer a;
    public final String b = "\n";
    public final ahmn c;

    public anbv(Writer writer, ahmn ahmnVar) {
        this.a = writer;
        this.c = ahmnVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }
}
