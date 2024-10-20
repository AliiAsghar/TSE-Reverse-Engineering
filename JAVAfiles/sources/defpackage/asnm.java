package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnm extends RuntimeException {
    public final IOException a;
    public IOException b;

    public asnm(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }
}
