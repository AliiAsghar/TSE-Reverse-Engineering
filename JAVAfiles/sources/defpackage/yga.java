package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface yga extends Closeable {
    public static final yga d = new yga() { // from class: yfz
        @Override // defpackage.yga, java.io.Closeable, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            yyb.aJ(this);
        }

        @Override // defpackage.yga
        public final void a() {
        }
    };

    void a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
