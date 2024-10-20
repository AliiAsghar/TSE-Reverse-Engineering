package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class evv extends evi {
    public final int b;

    public evv() {
        super(b(2008, 1));
        this.b = 1;
    }

    public static evv a(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && albo.ap(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new evu(iOException);
        }
        return new evv(iOException, i2, i);
    }

    private static int b(int i, int i2) {
        if (i == 2000) {
            if (i2 != 1) {
                return 2000;
            }
            return 2001;
        }
        return i;
    }

    public evv(IOException iOException, int i, int i2) {
        super(iOException, b(i, i2));
        this.b = i2;
    }

    public evv(String str, IOException iOException, int i) {
        super(str, iOException, b(i, 1));
        this.b = 1;
    }
}
