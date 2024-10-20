package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apsw extends IOException {
    public apsw(String str) {
        super(str);
    }

    public apsw(Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }
}
