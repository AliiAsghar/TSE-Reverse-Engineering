package defpackage;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arai extends aqru {
    public static final double a;
    private static final Logger l = Logger.getLogger(arai.class.getName());
    public final aqux b;
    public final Executor c;
    public final aqzx d;
    public final aqsm e;
    public arac f;
    public aqrr g;
    public araj h;
    public final ScheduledExecutorService i;
    public aqsp j = aqsp.b;
    public aqsb k = aqsb.a;
    private final boolean m;
    private final boolean n;
    private boolean o;
    private boolean p;
    private final ardc q;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        a = TimeUnit.SECONDS.toNanos(1L);
    }

    public arai(aqux aquxVar, Executor executor, aqrr aqrrVar, ardc ardcVar, ScheduledExecutorService scheduledExecutorService, aqzx aqzxVar) {
        this.b = aquxVar;
        String str = aquxVar.b;
        System.identityHashCode(this);
        int i = armc.a;
        if (executor == andi.a) {
            this.c = new argh();
            this.m = true;
        } else {
            this.c = new argl(executor);
            this.m = false;
        }
        this.d = aqzxVar;
        this.e = aqsm.k();
        aquw aquwVar = aquxVar.a;
        this.n = aquwVar == aquw.UNARY || aquwVar == aquw.SERVER_STREAMING;
        this.g = aqrrVar;
        this.q = ardcVar;
        this.i = scheduledExecutorService;
    }

    private final void g(Object obj) {
        boolean z;
        if (this.h != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Not started");
        albo.U(!this.o, "call was cancelled");
        albo.U(!this.p, "call was half-closed");
        try {
            araj arajVar = this.h;
            if (arajVar instanceof argc) {
                argc argcVar = (argc) arajVar;
                arfy arfyVar = argcVar.q;
                if (arfyVar.a) {
                    arfyVar.f.a.n(argcVar.e.b(obj));
                } else {
                    argcVar.s(new arfs(argcVar, obj));
                }
            } else {
                arajVar.n(this.b.b(obj));
            }
            if (!this.n) {
                this.h.d();
            }
        } catch (Error e) {
            this.h.c(Status.c.withDescription("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.h.c(Status.c.d(e2).withDescription("Failed to stream message"));
        }
    }

    @Override // defpackage.aqru
    public final void a(apsd apsdVar, aqut aqutVar) {
        boolean z;
        aqsa aqsaVar;
        boolean z2;
        argd argdVar;
        arcc arccVar;
        araj argcVar;
        ScheduledExecutorService scheduledExecutorService;
        double longValue;
        aqrr aqrrVar;
        int i = armc.a;
        if (this.h == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Already started");
        albo.U(!this.o, "call was cancelled");
        apsdVar.getClass();
        aqutVar.getClass();
        if (!this.e.i()) {
            areb arebVar = (areb) this.g.f(areb.a);
            if (arebVar != null) {
                Long l2 = arebVar.b;
                if (l2 != null) {
                    aqsn c = aqsn.c(l2.longValue(), TimeUnit.NANOSECONDS);
                    aqsn aqsnVar = this.g.b;
                    if (aqsnVar == null || c.compareTo(aqsnVar) < 0) {
                        this.g = this.g.b(c);
                    }
                }
                Boolean bool = arebVar.c;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        aqrp a2 = aqrr.a(this.g);
                        a2.f = Boolean.TRUE;
                        aqrrVar = new aqrr(a2);
                    } else {
                        aqrp a3 = aqrr.a(this.g);
                        a3.f = Boolean.FALSE;
                        aqrrVar = new aqrr(a3);
                    }
                    this.g = aqrrVar;
                }
                Integer num = arebVar.d;
                if (num != null) {
                    aqrr aqrrVar2 = this.g;
                    Integer num2 = aqrrVar2.f;
                    if (num2 != null) {
                        this.g = aqrrVar2.c(Math.min(num2.intValue(), arebVar.d.intValue()));
                    } else {
                        this.g = aqrrVar2.c(num.intValue());
                    }
                }
                Integer num3 = arebVar.e;
                if (num3 != null) {
                    aqrr aqrrVar3 = this.g;
                    Integer num4 = aqrrVar3.g;
                    if (num4 != null) {
                        this.g = aqrrVar3.d(Math.min(num4.intValue(), arebVar.e.intValue()));
                    } else {
                        this.g = aqrrVar3.d(num3.intValue());
                    }
                }
            }
            String str = this.g.d;
            if (str != null) {
                aqsaVar = (aqsa) this.k.b.get(str);
                if (aqsaVar == null) {
                    this.h = areo.a;
                    this.c.execute(new arab(this, apsdVar, str));
                    return;
                }
            } else {
                aqsaVar = aqry.a;
            }
            aqsp aqspVar = this.j;
            aqutVar.e(arcb.g);
            aqutVar.e(arcb.c);
            if (aqsaVar != aqry.a) {
                aqutVar.h(arcb.c, aqsaVar.c());
            }
            aqutVar.e(arcb.d);
            byte[] bArr = aqspVar.c;
            if (bArr.length != 0) {
                aqutVar.h(arcb.d, bArr);
            }
            aqutVar.e(arcb.e);
            aqutVar.e(arcb.f);
            aqsn b = b();
            if (b != null && b.equals(this.e.b())) {
                z2 = true;
            } else {
                z2 = false;
            }
            arac aracVar = new arac(this, b, z2);
            this.f = aracVar;
            if (b != null && aracVar.c <= 0) {
                aqrx[] l3 = arcb.l(this.g);
                String str2 = "Context";
                if (true != z2) {
                    str2 = "CallOptions";
                }
                Long l4 = (Long) this.g.f(aqrx.k);
                double d = this.f.c;
                double d2 = a;
                Double valueOf = Double.valueOf(d / d2);
                if (l4 == null) {
                    longValue = 0.0d;
                } else {
                    longValue = l4.longValue() / d2;
                }
                this.h = new arbq(Status.f.withDescription(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str2, valueOf, Double.valueOf(longValue))), l3);
            } else {
                ardc ardcVar = this.q;
                aqux aquxVar = this.b;
                aqrr aqrrVar4 = this.g;
                aqsm aqsmVar = this.e;
                if (!ardcVar.b.Q) {
                    aqrx[] l5 = arcb.l(aqrrVar4);
                    aqsm a4 = aqsmVar.a();
                    try {
                        argcVar = ardcVar.b.z.b(aquxVar, aqutVar, aqrrVar4, l5);
                    } finally {
                        aqsmVar.f(a4);
                    }
                } else {
                    areb arebVar2 = (areb) aqrrVar4.f(areb.a);
                    if (arebVar2 == null) {
                        argdVar = null;
                    } else {
                        argdVar = arebVar2.f;
                    }
                    if (arebVar2 == null) {
                        arccVar = null;
                    } else {
                        arccVar = arebVar2.g;
                    }
                    argcVar = new argc(ardcVar, aquxVar, aqutVar, aqrrVar4, argdVar, arccVar, aqsmVar);
                }
                this.h = argcVar;
            }
            if (this.m) {
                this.h.f();
            }
            Integer num5 = this.g.f;
            if (num5 != null) {
                this.h.k(num5.intValue());
            }
            Integer num6 = this.g.g;
            if (num6 != null) {
                this.h.l(num6.intValue());
            }
            if (b != null) {
                this.h.i(b);
            }
            this.h.h(aqsaVar);
            this.h.j(this.j);
            this.d.b();
            this.h.m(new arah(this, apsdVar));
            arac aracVar2 = this.f;
            if (!aracVar2.e) {
                if (aracVar2.b && !aracVar2.a && (scheduledExecutorService = aracVar2.f.i) != null) {
                    aracVar2.d = scheduledExecutorService.schedule(new arcv(aracVar2), aracVar2.c, TimeUnit.NANOSECONDS);
                }
                aracVar2.f.e.d(aracVar2, andi.a);
                if (aracVar2.e) {
                    aracVar2.c();
                    return;
                }
                return;
            }
            return;
        }
        this.h = areo.a;
        this.c.execute(new araa(this, apsdVar));
    }

    public final aqsn b() {
        aqsn aqsnVar = this.g.b;
        aqsn b = this.e.b();
        if (aqsnVar == null) {
            return b;
        }
        if (b == null) {
            return aqsnVar;
        }
        aqsnVar.d(b);
        if (true != aqsnVar.e(b)) {
            return b;
        }
        return aqsnVar;
    }

    @Override // defpackage.aqru
    public final void c(String str, Throwable th) {
        Status withDescription;
        int i = armc.a;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            l.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
        }
        if (!this.o) {
            this.o = true;
            try {
                if (this.h != null) {
                    Status status = Status.c;
                    if (str != null) {
                        withDescription = status.withDescription(str);
                    } else {
                        withDescription = status.withDescription("Call cancelled without message");
                    }
                    if (th != null) {
                        withDescription = withDescription.d(th);
                    }
                    this.h.c(withDescription);
                }
                arac aracVar = this.f;
                if (aracVar != null) {
                    aracVar.c();
                }
            } catch (Throwable th2) {
                arac aracVar2 = this.f;
                if (aracVar2 != null) {
                    aracVar2.c();
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.aqru
    public final void d() {
        boolean z;
        int i = armc.a;
        if (this.h != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Not started");
        albo.U(!this.o, "call was cancelled");
        albo.U(!this.p, "call already half-closed");
        this.p = true;
        this.h.e();
    }

    @Override // defpackage.aqru
    public final void e(int i) {
        boolean z;
        int i2 = armc.a;
        boolean z2 = true;
        if (this.h != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Not started");
        if (i < 0) {
            z2 = false;
        }
        d.t(z2, "Number requested must be non-negative");
        this.h.g(i);
    }

    @Override // defpackage.aqru
    public final void f(Object obj) {
        int i = armc.a;
        g(obj);
    }

    @Override // defpackage.aqru
    public final boolean k() {
        if (this.p) {
            return false;
        }
        return this.h.o();
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("method", this.b);
        return aj.toString();
    }
}
