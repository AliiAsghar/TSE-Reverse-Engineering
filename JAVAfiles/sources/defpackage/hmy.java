package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmy extends IOException {
    private static final long serialVersionUID = 1;

    public hmy(String str, int i) {
        this(str, i, null);
    }

    public hmy(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
    }
}
