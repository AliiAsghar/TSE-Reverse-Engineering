package defpackage;

import android.os.Trace;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbe implements AutoCloseable {
    private static final ThreadLocal a = new ahbd();
    private final String b;

    public ahbe(String str) {
        this.b = str;
        gvf.bd(str);
        ((ArrayDeque) a.get()).push(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Trace.endSection();
        String str = (String) ((ArrayDeque) a.get()).poll();
        String str2 = this.b;
        if (str2.equals(str)) {
        } else {
            throw new IllegalStateException(String.format("Expect Tracer.endSection(\"%s\") but get Tracer.endSection(\"%s\")", str, str2));
        }
    }
}
