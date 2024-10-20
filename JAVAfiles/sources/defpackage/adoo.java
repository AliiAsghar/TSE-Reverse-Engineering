package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adoo implements aikm {
    final /* synthetic */ adop a;

    public adoo(adop adopVar) {
        this.a = adopVar;
    }

    private final void d(int i, String str) {
        this.a.a();
        ahjj ahjjVar = this.a.j;
        ahjjVar.getClass();
        ahjjVar.k(i, str);
    }

    @Override // defpackage.aikm
    public final void a(aikh aikhVar) {
        this.a.a();
        ahjj ahjjVar = this.a.j;
        ahjjVar.getClass();
        ahjjVar.k(400, "Aborted");
    }

    @Override // defpackage.aikm
    public final void b(aikh aikhVar) {
        int i;
        String adxrVar;
        int i2;
        if (aikhVar.g()) {
            int a = aikhVar.a();
            aioo b = aikhVar.b();
            if (b == null) {
                advr.g("SIP response is null.", new Object[0]);
                return;
            }
            if (a == 200) {
                advr.k("PublicationImpl.methodDelivered(): publication to %s successful.", this.a.c);
                String j = b.j("SIP-ETag");
                if (j == null) {
                    advr.k("Getting 2xx PUBLISH response without SIP-ETag header!", new Object[0]);
                    this.a.g = null;
                } else {
                    this.a.g = j;
                }
                advr.k("etag value is %s", this.a.g);
                aime aimeVar = (aime) b.a.d("Expires");
                if (aimeVar != null) {
                    i = aimeVar.b();
                } else {
                    i = 0;
                }
                advr.k("Expires value is %s", Integer.valueOf(i));
                if (i > 0) {
                    adop adopVar = this.a;
                    adopVar.e = i;
                    adopVar.i = 2;
                    advr.k("publication state is active", new Object[0]);
                    ahjj ahjjVar = this.a.j;
                    if (ahjjVar != null) {
                        adrx adrxVar = (adrx) ahjjVar.a;
                        CopyOnWriteArrayList copyOnWriteArrayList = adrxVar.g;
                        adxr adxrVar2 = adrxVar.k;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            ahjj ahjjVar2 = (ahjj) it.next();
                            if (adxrVar2 == null) {
                                adxrVar = adxrVar2;
                            } else {
                                adxrVar = adxrVar2.toString();
                            }
                            advr.c("Presence information was successfully published: Presence %s", adxrVar);
                            ((adqf) ahjjVar2.a).v();
                            adqf adqfVar = (adqf) ahjjVar2.a;
                            adrx adrxVar2 = adqfVar.i;
                            adop adopVar2 = adrxVar2.j;
                            if (adopVar2 == null) {
                                i2 = (int) TimeUnit.MILLISECONDS.toSeconds(adrxVar2.m.a);
                                if (i2 <= 0) {
                                    i2 = 3600;
                                }
                            } else {
                                i2 = adopVar2.e;
                            }
                            adqfVar.w(Math.max((int) (i2 * 0.9d), 300));
                            if (j != null && adxrVar2 != null) {
                                adqg adqgVar = ((adqf) ahjjVar2.a).o;
                                synchronized (adqgVar.b) {
                                    String e = ((aduu) adqgVar.c).e();
                                    ((aduu) adqgVar.c).n(j);
                                    try {
                                        OutputStream c = ((adih) adqgVar.a).c("capabilities-pidf.xml");
                                        try {
                                            adxs.b(adxrVar2, c);
                                            if (c != null) {
                                                c.close();
                                            }
                                        } catch (Throwable th) {
                                            if (c != null) {
                                                try {
                                                    c.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                            break;
                                        }
                                    } catch (IOException e2) {
                                        if (Objects.isNull(e)) {
                                            ((aduu) adqgVar.c).m();
                                        } else {
                                            ((aduu) adqgVar.c).n(e);
                                        }
                                        advr.i(e2, "Failed to store capabilities PIDF on disk", new Object[0]);
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                this.a.a();
                advr.k("publication state is inactive", new Object[0]);
                ahjj ahjjVar3 = this.a.j;
                if (ahjjVar3 != null) {
                    adrx adrxVar3 = (adrx) ahjjVar3.a;
                    Iterator it2 = adrxVar3.g.iterator();
                    while (it2.hasNext()) {
                        ahjj ahjjVar4 = (ahjj) it2.next();
                        advr.c("Publication of presence information has terminated ", new Object[0]);
                        ((adqf) ahjjVar4.a).o.j();
                    }
                    adrxVar3.j = null;
                    return;
                }
                return;
            }
            if (a == 412) {
                String A = b.A();
                advr.g("Invalid entity-tag found in Publish request: %s", this.a.g);
                this.a.a();
                ahjj ahjjVar5 = this.a.j;
                ahjjVar5.getClass();
                ahjjVar5.k(412, A);
                return;
            }
            if (a == 423) {
                advr.c("Interval in Publish request is too small: %s", Integer.valueOf(this.a.e));
                aioo b2 = aikhVar.b();
                if (b2 == null) {
                    advr.g("SIP response is null.", new Object[0]);
                    return;
                }
                int a2 = adwf.a(b2);
                if (a2 >= 0) {
                    this.a.f = a2;
                    advr.c("Setting Publish min expires to %s.", Integer.valueOf(a2));
                } else {
                    this.a.f = 0;
                    advr.c("min expires value not set in headers.", new Object[0]);
                }
                this.a.a();
                String c2 = aikhVar.c();
                if (c2 != null) {
                    d(423, c2);
                    return;
                }
                return;
            }
            d(a, b.A());
        }
    }

    @Override // defpackage.aikm
    public final void c(aikh aikhVar) {
        advr.c("Capabilities publication timed out.", new Object[0]);
        this.a.i = 3;
    }
}
