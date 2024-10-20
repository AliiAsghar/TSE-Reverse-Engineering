package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahwj {
    private static final Logger a = Logger.getLogger(ahwj.class.getName());

    public static final void a(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
            a.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e);
        }
    }
}
