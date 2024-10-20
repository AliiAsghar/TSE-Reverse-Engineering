package defpackage;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arce extends aqzh {
    private static final aqtg a;
    private static final aquo b;
    private Status c;
    private aqut d;
    private Charset e;
    private boolean f;

    static {
        arcd arcdVar = new arcd(0);
        a = arcdVar;
        b = aqth.a(":status", arcdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public arce(int i, arhn arhnVar, arhu arhuVar) {
        super(i, arhnVar, arhuVar);
        this.e = StandardCharsets.UTF_8;
    }

    private static Charset f(aqut aqutVar) {
        String str = (String) aqutVar.b(arcb.h);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    private static void q(aqut aqutVar) {
        aqutVar.e(b);
        aqutVar.e(aqtj.b);
        aqutVar.e(aqtj.a);
    }

    private static final Status r(aqut aqutVar) {
        char charAt;
        Integer num = (Integer) aqutVar.b(b);
        if (num == null) {
            return Status.m.withDescription("Missing HTTP status code");
        }
        String str = (String) aqutVar.b(arcb.h);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                return null;
            }
        }
        return arcb.a(num.intValue()).b("invalid content-type: ".concat(String.valueOf(str)));
    }

    protected abstract void c(Status status, boolean z, aqut aqutVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(arfh arfhVar, boolean z) {
        Status status = this.c;
        boolean z2 = false;
        if (status != null) {
            Charset charset = this.e;
            arfh arfhVar2 = arfl.a;
            charset.getClass();
            int f = arfhVar.f();
            byte[] bArr = new byte[f];
            arfhVar.k(bArr, 0, f);
            this.c = status.b("DATA-----------------------------\n".concat(new String(bArr, charset)));
            arfhVar.close();
            if (this.c.getDescription().length() > 1000 || z) {
                c(this.c, false, this.d);
                return;
            }
            return;
        }
        if (!this.f) {
            c(Status.m.withDescription("headers not received before payload"), false, new aqut());
            return;
        }
        int f2 = arfhVar.f();
        boolean z3 = true;
        try {
            if (this.t) {
                aqzf.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                arfhVar.close();
            } else {
                try {
                    arax araxVar = this.j;
                    try {
                        if (!((arej) araxVar).b() && !((arej) araxVar).f) {
                            ((arej) araxVar).d.h(arfhVar);
                            try {
                                ((arej) araxVar).a();
                            } catch (Throwable th) {
                                th = th;
                                z3 = false;
                                if (z3) {
                                    arfhVar.close();
                                }
                                throw th;
                            }
                        }
                        arfhVar.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        b(th3);
                    } catch (Throwable th4) {
                        th = th4;
                        if (z2) {
                            arfhVar.close();
                        }
                        throw th;
                    }
                }
            }
            if (z) {
                if (f2 > 0) {
                    this.c = Status.m.withDescription("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.c = Status.m.withDescription("Received unexpected EOS on empty DATA frame from server");
                }
                aqut aqutVar = new aqut();
                this.d = aqutVar;
                l(this.c, false, aqutVar);
            }
        } catch (Throwable th5) {
            th = th5;
            z2 = true;
        }
    }

    public final void o(aqut aqutVar) {
        Status status = this.c;
        if (status != null) {
            this.c = status.b("headers: ".concat(aqutVar.toString()));
            return;
        }
        try {
            if (this.f) {
                this.c = Status.m.withDescription("Received headers twice");
            } else {
                Integer num = (Integer) aqutVar.b(b);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.f = true;
                    Status r = r(aqutVar);
                    this.c = r;
                    if (r != null) {
                        this.c = r.b("headers: ".concat(aqutVar.toString()));
                        this.d = aqutVar;
                        this.e = f(aqutVar);
                        return;
                    }
                    q(aqutVar);
                    albo.U(!this.t, "Received headers on closed stream");
                    this.p.d();
                    String str = (String) aqutVar.b(arcb.c);
                    if (str != null) {
                        aqso a2 = this.r.a(str);
                        if (a2 == null) {
                            b(new aqwb(Status.m.withDescription(String.format("Can't find decompressor for %s", str))));
                        } else if (a2 != aqry.a) {
                            arax araxVar = this.j;
                            albo.U(true, "Already set full stream decompressor");
                            ((arej) araxVar).c = a2;
                        }
                    }
                    this.q.c(aqutVar);
                }
            }
            Status status2 = this.c;
            if (status2 != null) {
                this.c = status2.b("headers: ".concat(aqutVar.toString()));
                this.d = aqutVar;
                this.e = f(aqutVar);
            }
        } catch (Throwable th) {
            Status status3 = this.c;
            if (status3 != null) {
                this.c = status3.b("headers: ".concat(aqutVar.toString()));
                this.d = aqutVar;
                this.e = f(aqutVar);
            }
            throw th;
        }
    }

    public final void p(aqut aqutVar) {
        Status withDescription;
        Status b2;
        Status status = this.c;
        if (status == null && !this.f) {
            status = r(aqutVar);
            this.c = status;
            if (status != null) {
                this.d = aqutVar;
            }
        }
        if (status == null) {
            Status status2 = (Status) aqutVar.b(aqtj.b);
            if (status2 != null) {
                b2 = status2.withDescription((String) aqutVar.b(aqtj.a));
            } else if (this.f) {
                b2 = Status.d.withDescription("missing GRPC status in response");
            } else {
                Integer num = (Integer) aqutVar.b(b);
                if (num != null) {
                    withDescription = arcb.a(num.intValue());
                } else {
                    withDescription = Status.m.withDescription("missing HTTP status code");
                }
                b2 = withDescription.b("missing GRPC status, inferred error from HTTP status code");
            }
            q(aqutVar);
            if (this.t) {
                aqzf.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{b2, aqutVar});
                return;
            } else {
                this.p.e();
                l(b2, false, aqutVar);
                return;
            }
        }
        Status b3 = status.b("trailers: ".concat(aqutVar.toString()));
        this.c = b3;
        c(b3, false, this.d);
    }
}
