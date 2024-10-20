package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.net.SocketAddress;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atoh {
    public SocketAddress a;
    public SocketAddress b;
    public long c = 900000;
    public atof d;
    public atkj e;
    private atmk f;
    private int g;
    private int h;
    private int i;
    private long j;
    private long k;
    private atmx l;

    private atoh() {
    }

    public static long a(atmx atmxVar) {
        return ((atne) atmxVar).a;
    }

    private final void d() {
        g("server doesn't support IXFR");
        e("falling back to AXFR");
        this.g = 252;
        this.i = 0;
    }

    private final void e(String str) {
        if (atmp.a("verbose")) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f);
            stringBuffer.append(": ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    private final void f(atmx atmxVar) {
        int i = atmxVar.g;
        switch (this.i) {
            case 0:
                if (i != 6) {
                    g("missing initial SOA");
                }
                this.l = atmxVar;
                long a = a(atmxVar);
                this.j = a;
                if (this.g == 251) {
                    if (a >= 4294967295L) {
                        a = -1;
                    }
                    if (((int) a) <= 0) {
                        e("up to date");
                        this.i = 7;
                        return;
                    }
                }
                this.i = 1;
                return;
            case 1:
                if (this.g == 251 && i == 6 && a(atmxVar) == 0) {
                    this.d.b = new ArrayList();
                    e("got incremental response");
                    this.i = 2;
                } else {
                    this.d.a = new ArrayList();
                    this.d.a(this.l);
                    e("got nonincremental response");
                    this.i = 6;
                }
                f(atmxVar);
                return;
            case 2:
                atof atofVar = this.d;
                atog atogVar = new atog();
                atogVar.c.add(atmxVar);
                a(atmxVar);
                atofVar.b.add(atogVar);
                this.i = 3;
                return;
            case 3:
                if (i == 6) {
                    this.k = a(atmxVar);
                    this.i = 4;
                    f(atmxVar);
                    return;
                }
                this.d.a(atmxVar);
                return;
            case 4:
                atog atogVar2 = (atog) this.d.b.get(r0.size() - 1);
                atogVar2.b.add(atmxVar);
                atogVar2.a = a(atmxVar);
                this.i = 5;
                return;
            case 5:
                if (i == 6) {
                    long a2 = a(atmxVar);
                    if (a2 == this.j) {
                        this.i = 7;
                        return;
                    }
                    if (a2 != this.k) {
                        StringBuffer stringBuffer = new StringBuffer("IXFR out of sync: expected serial ");
                        stringBuffer.append(this.k);
                        stringBuffer.append(" , got ");
                        stringBuffer.append(a2);
                        g(stringBuffer.toString());
                    } else {
                        this.i = 2;
                        f(atmxVar);
                        return;
                    }
                }
                this.d.a(atmxVar);
                return;
            case 6:
                if (i == 1) {
                    if (atmxVar.h == this.h) {
                        i = 1;
                    } else {
                        return;
                    }
                }
                this.d.a(atmxVar);
                if (i == 6) {
                    this.i = 7;
                    return;
                }
                return;
            default:
                g("extra data");
                return;
        }
    }

    private static final void g(String str) {
        throw new atoe(str);
    }

    public final void b() {
        try {
            atkj atkjVar = this.e;
            if (atkjVar != null) {
                atkjVar.b();
            }
        } catch (IOException unused) {
        }
    }

    public final void c() {
        atmx l = atmx.l(this.f, this.g, this.h);
        atlz atlzVar = new atlz();
        atlzVar.a.i();
        atlzVar.d(l, 0);
        if (this.g == 251) {
            atlzVar.d(new atne(this.f, this.h, atmk.a, atmk.a), 2);
        }
        this.e.e(atlzVar.g());
        while (this.i != 7) {
            try {
                atlz atlzVar2 = new atlz(this.e.f());
                atlzVar2.a.d();
                atmx[] f = atlzVar2.f(1);
                if (this.i == 0) {
                    int a = atlzVar2.a();
                    if (a != 0) {
                        if (this.g == 251 && a == 4) {
                            d();
                            c();
                            return;
                        }
                        g(atmw.b(a));
                    }
                    atmx c = atlzVar2.c();
                    if (c != null && c.g != this.g) {
                        g("invalid question section");
                    }
                    if (f.length == 0 && this.g == 251) {
                        d();
                        c();
                        return;
                    }
                }
                for (atmx atmxVar : f) {
                    f(atmxVar);
                }
            } catch (IOException e) {
                if (e instanceof atoc) {
                    throw ((atoc) e);
                }
                throw new atoc("Error parsing message");
            }
        }
    }

    public atoh(atmk atmkVar, SocketAddress socketAddress) {
        this.b = socketAddress;
        if (atmkVar.j()) {
            this.f = atmkVar;
        } else {
            try {
                this.f = atmk.c(atmkVar, atmk.a);
            } catch (atml unused) {
                throw new IllegalArgumentException("ZoneTransferIn: name too long");
            }
        }
        this.g = 252;
        this.h = 1;
        this.i = 0;
    }
}
