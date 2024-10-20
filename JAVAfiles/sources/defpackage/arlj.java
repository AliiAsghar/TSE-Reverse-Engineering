package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arlj {
    public static final aqrq a;
    private static final Logger b = Logger.getLogger(arlj.class.getName());

    static {
        if (!albo.ah(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        a = new aqrq("internal-stub-type", null);
    }

    private arlj() {
    }

    public static ListenableFuture a(aqru aqruVar, Object obj) {
        arle arleVar = new arle(aqruVar);
        b(aqruVar, obj, new arli(arleVar));
        return arleVar;
    }

    public static void b(aqru aqruVar, Object obj, arlf arlfVar) {
        aqruVar.a(arlfVar, new aqut());
        arlfVar.f();
        try {
            aqruVar.f(obj);
            aqruVar.d();
        } catch (Error | RuntimeException e) {
            throw c(aqruVar, e);
        }
    }

    private static RuntimeException c(aqru aqruVar, Throwable th) {
        try {
            aqruVar.c(null, th);
        } catch (Error | RuntimeException e) {
            b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new AssertionError(th);
        }
        throw ((RuntimeException) th);
    }
}
