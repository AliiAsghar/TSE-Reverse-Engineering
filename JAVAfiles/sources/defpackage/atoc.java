package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class atoc extends IOException {
    public atoc() {
    }

    public atoc(String str) {
        super(str);
    }

    public atoc(Throwable th) {
        super("invalid address");
        initCause(th);
    }
}
