package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class argu implements arhe {
    @Override // defpackage.arhq
    public final void d(arhp arhpVar) {
        while (true) {
            InputStream g = arhpVar.g();
            if (g != null) {
                try {
                    g.close();
                } catch (IOException e) {
                    while (true) {
                        InputStream g2 = arhpVar.g();
                        if (g2 == null) {
                            break;
                        }
                        try {
                            g2.close();
                        } catch (IOException e2) {
                            argz.b.logp(Level.WARNING, "io.grpc.internal.ServerImpl$NoopListener", "messagesAvailable", "Exception closing stream", (Throwable) e2);
                        }
                    }
                    throw new RuntimeException(e);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.arhe
    public final void b() {
    }

    @Override // defpackage.arhq
    public final void e() {
    }

    @Override // defpackage.arhe
    public final void a(Status status) {
    }
}
