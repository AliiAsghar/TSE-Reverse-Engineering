package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class asre {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final asro a(Socket socket) {
        socket.getClass();
        asrp asrpVar = new asrp(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return new asqq(asrpVar, new asrg(outputStream, asrpVar));
    }

    public static final asrq b(InputStream inputStream) {
        inputStream.getClass();
        return new asrd(inputStream, new asrs());
    }

    public static final asrq c(Socket socket) {
        socket.getClass();
        asrp asrpVar = new asrp(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return new asqr(asrpVar, new asrd(inputStream, asrpVar));
    }

    public static final boolean d(AssertionError assertionError) {
        String message;
        if (assertionError.getCause() != null && (message = assertionError.getMessage()) != null && arsd.O(message, "getsockname failed")) {
            return true;
        }
        return false;
    }
}
