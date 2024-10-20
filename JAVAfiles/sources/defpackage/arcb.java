package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arcb {
    public static final aqvo l;
    public static final aqrq m;
    public static final arhk n;
    public static final arhk o;
    public static final alhr p;
    private static final aqrx t;
    private static final Logger r = Logger.getLogger(arcb.class.getName());
    private static final Set s = DesugarCollections.unmodifiableSet(EnumSet.of(Status.Code.OK, Status.Code.INVALID_ARGUMENT, Status.Code.NOT_FOUND, Status.Code.ALREADY_EXISTS, Status.Code.FAILED_PRECONDITION, Status.Code.ABORTED, Status.Code.OUT_OF_RANGE, Status.Code.DATA_LOSS));
    public static final Charset a = Charset.forName("US-ASCII");
    public static final aquo b = new aquj("grpc-timeout", new arca(0));
    public static final aquo c = new aquj("grpc-encoding", aqut.c);
    public static final aquo d = aqth.a("grpc-accept-encoding", new arcd(1));
    public static final aquo e = new aquj("content-encoding", aqut.c);
    public static final aquo f = aqth.a("accept-encoding", new arcd(1));
    static final aquo g = new aquj("content-length", aqut.c);
    public static final aquo h = new aquj("content-type", aqut.c);
    public static final aquo i = new aquj("te", aqut.c);
    public static final aquo j = new aquj("user-agent", aqut.c);
    public static final anna q = anna.e(',').i();
    public static final long k = TimeUnit.SECONDS.toNanos(20);

    static {
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        l = new arfg();
        m = new aqrq("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        t = new aqrx();
        n = new arby();
        o = new ariu(1);
        p = new arff(1);
    }

    private arcb() {
    }

    public static Status a(int i2) {
        Status.Code code;
        if (i2 >= 100 && i2 < 200) {
            code = Status.Code.INTERNAL;
        } else {
            if (i2 != 400) {
                if (i2 != 401) {
                    if (i2 != 403) {
                        if (i2 != 404) {
                            if (i2 != 429) {
                                if (i2 != 431) {
                                    switch (i2) {
                                        case 502:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            code = Status.Code.UNKNOWN;
                                            break;
                                    }
                                }
                            }
                            code = Status.Code.UNAVAILABLE;
                        } else {
                            code = Status.Code.UNIMPLEMENTED;
                        }
                    } else {
                        code = Status.Code.PERMISSION_DENIED;
                    }
                } else {
                    code = Status.Code.UNAUTHENTICATED;
                }
            }
            code = Status.Code.INTERNAL;
        }
        return code.a().withDescription(a.bV(i2, "HTTP status code "));
    }

    public static Status b(Status status) {
        boolean z;
        if (status != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (s.contains(status.getCode())) {
            return Status.m.withDescription("Inappropriate status code from control plane: " + status.getCode().toString() + " " + status.getDescription()).d(status.r);
        }
        return status;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aram c(aqtt aqttVar, boolean z) {
        aram aramVar;
        aqtw aqtwVar = aqttVar.b;
        if (aqtwVar != null) {
            aqzj aqzjVar = (aqzj) aqtwVar;
            albo.U(aqzjVar.g, "Subchannel is not started");
            aramVar = aqzjVar.f.a();
        } else {
            aramVar = null;
        }
        if (aramVar == null) {
            Status status = aqttVar.c;
            if (!status.f()) {
                if (aqttVar.d) {
                    return new arbr(b(status), arak.DROPPED);
                }
                if (!z) {
                    return new arbr(b(status), arak.PROCESSED);
                }
            }
            return null;
        }
        return aramVar;
    }

    public static String d(String str, int i2) {
        try {
            return new URI(null, null, str, i2, null, null, null).getAuthority();
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException("Invalid host or port: " + str + " " + i2, e2);
        }
    }

    public static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append("/1.68.0-SNAPSHOT");
        return sb.toString();
    }

    public static URI f(String str) {
        str.getClass();
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException("Invalid authority: ".concat(str), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(arhp arhpVar) {
        while (true) {
            InputStream g2 = arhpVar.g();
            if (g2 != null) {
                h(g2);
            } else {
                return;
            }
        }
    }

    public static void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            r.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean i(aqrr aqrrVar) {
        if (!Boolean.TRUE.equals(aqrrVar.f(m))) {
            return true;
        }
        return false;
    }

    public static boolean j(String str) {
        String str2 = System.getenv(str);
        if (str2 == null) {
            str2 = System.getProperty(str);
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        if (!albo.ah(str2) && Boolean.parseBoolean(str2)) {
            return true;
        }
        return false;
    }

    public static ThreadFactory k(String str) {
        arbj arbjVar = new arbj((char[]) null, (byte[]) null);
        arbjVar.i();
        arbjVar.j(str);
        return arbj.t(arbjVar);
    }

    public static aqrx[] l(aqrr aqrrVar) {
        List list = aqrrVar.e;
        int size = list.size();
        aqrx[] aqrxVarArr = new aqrx[size + 1];
        aqrrVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            aqrxVarArr[i2] = ((apsd) list.get(i2)).b();
        }
        aqrxVarArr[size] = t;
        return aqrxVarArr;
    }
}
