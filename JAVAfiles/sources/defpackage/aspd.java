package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspd implements asnt {
    public static final List a = asmt.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List b = asmt.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final asnj c;
    private final aspc d;
    private volatile aspj e;
    private final asmf f;
    private volatile boolean g;

    public aspd(asme asmeVar, asnj asnjVar, aspc aspcVar) {
        asmf asmfVar;
        this.c = asnjVar;
        this.d = aspcVar;
        if (asmeVar.m.contains(asmf.e)) {
            asmfVar = asmf.e;
        } else {
            asmfVar = asmf.d;
        }
        this.f = asmfVar;
    }

    @Override // defpackage.asnt
    public final long a(asmm asmmVar) {
        if (!asnu.b(asmmVar)) {
            return 0L;
        }
        return asmt.i(asmmVar);
    }

    @Override // defpackage.asnt
    public final asml b(boolean z) {
        aspj aspjVar = this.e;
        if (aspjVar != null) {
            asmf asmfVar = this.f;
            aslv a2 = aspjVar.a();
            asmfVar.getClass();
            asuo asuoVar = new asuo((char[]) null);
            int a3 = a2.a();
            asny asnyVar = null;
            for (int i = 0; i < a3; i++) {
                String c = a2.c(i);
                String d = a2.d(i);
                if (d.F(c, ":status")) {
                    asnyVar = aotl.ae("HTTP/1.1 ".concat(String.valueOf(d)));
                } else if (!b.contains(c)) {
                    asuoVar.j(c, d);
                }
            }
            if (asnyVar != null) {
                asml asmlVar = new asml();
                asmlVar.d(asmfVar);
                asmlVar.b = asnyVar.b;
                asmlVar.c = asnyVar.c;
                asmlVar.c(asuoVar.h());
                if (z && asmlVar.b == 100) {
                    return null;
                }
                return asmlVar;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    @Override // defpackage.asnt
    public final asnj c() {
        return this.c;
    }

    @Override // defpackage.asnt
    public final asro d(asmh asmhVar, long j) {
        aspj aspjVar = this.e;
        aspjVar.getClass();
        return aspjVar.b();
    }

    @Override // defpackage.asnt
    public final asrq e(asmm asmmVar) {
        aspj aspjVar = this.e;
        aspjVar.getClass();
        return aspjVar.g;
    }

    @Override // defpackage.asnt
    public final void f() {
        this.g = true;
        aspj aspjVar = this.e;
        if (aspjVar != null) {
            aspjVar.l(9);
        }
    }

    @Override // defpackage.asnt
    public final void g() {
        aspj aspjVar = this.e;
        aspjVar.getClass();
        aspjVar.b().close();
    }

    @Override // defpackage.asnt
    public final void h() {
        this.d.d();
    }

    @Override // defpackage.asnt
    public final void i(asmh asmhVar) {
        boolean z;
        int i;
        aspj aspjVar;
        if (this.e == null) {
            boolean z2 = false;
            if (asmhVar.d != null) {
                z = true;
            } else {
                z = false;
            }
            aslv aslvVar = asmhVar.c;
            ArrayList arrayList = new ArrayList(aslvVar.a() + 4);
            arrayList.add(new asoi(asoi.c, asmhVar.b));
            arrayList.add(new asoi(asoi.d, aotl.af(asmhVar.a)));
            String a2 = asmhVar.a("Host");
            if (a2 != null) {
                arrayList.add(new asoi(asoi.f, a2));
            }
            arrayList.add(new asoi(asoi.e, asmhVar.a.b));
            int a3 = aslvVar.a();
            for (int i2 = 0; i2 < a3; i2++) {
                String c = aslvVar.c(i2);
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = c.toLowerCase(locale);
                lowerCase.getClass();
                if (!a.contains(lowerCase) || (d.F(lowerCase, "te") && d.F(aslvVar.d(i2), "trailers"))) {
                    arrayList.add(new asoi(lowerCase, aslvVar.d(i2)));
                }
            }
            aspc aspcVar = this.d;
            boolean z3 = !z;
            synchronized (aspcVar.u) {
                synchronized (aspcVar) {
                    if (aspcVar.f > 1073741823) {
                        aspcVar.l(8);
                    }
                    if (!aspcVar.g) {
                        i = aspcVar.f;
                        aspcVar.f = i + 2;
                        aspjVar = new aspj(i, aspcVar, z3, false, null);
                        if (!z || aspcVar.s >= aspcVar.t || aspjVar.e >= aspjVar.f) {
                            z2 = true;
                        }
                        if (aspjVar.i()) {
                            aspcVar.c.put(Integer.valueOf(i), aspjVar);
                        }
                    } else {
                        throw new asoh();
                    }
                }
                aspcVar.u.f(z3, i, arrayList);
            }
            if (z2) {
                aspcVar.u.d();
            }
            this.e = aspjVar;
            if (!this.g) {
                aspj aspjVar2 = this.e;
                aspjVar2.getClass();
                aspjVar2.i.k(10000L, TimeUnit.MILLISECONDS);
                aspj aspjVar3 = this.e;
                aspjVar3.getClass();
                aspjVar3.j.k(10000L, TimeUnit.MILLISECONDS);
                return;
            }
            aspj aspjVar4 = this.e;
            aspjVar4.getClass();
            aspjVar4.l(9);
            throw new IOException("Canceled");
        }
    }
}
