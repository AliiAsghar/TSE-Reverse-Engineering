package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqe implements Runnable {
    final /* synthetic */ adqf a;

    public adqe(adqf adqfVar) {
        this.a = adqfVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String e;
        adxr adxrVar;
        try {
            adqf adqfVar = this.a;
            String str = adqfVar.a.c().mPublicIdentity;
            advr.c("Publishing presence capabilities for %s", advq.USER_ID.c(str));
            adpo b = adqfVar.h.b();
            adqg adqgVar = adqfVar.m;
            adxr adxrVar2 = (adxr) adqgVar.a.b();
            adxrVar2.a = str;
            List b2 = adxrVar2.b();
            b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).k));
            if (b.y()) {
                b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).m));
            }
            if (b.C()) {
                b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).d));
            }
            if (b.H()) {
                b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).c));
            }
            if (b.A()) {
                b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).i));
            }
            if (b.B()) {
                b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).l));
            }
            if (b.D()) {
                b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).e));
            }
            if (b.E()) {
                b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).j));
            }
            if (b.x()) {
                b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).a));
            }
            if (b.J()) {
                adxrVar2.b().add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).g));
            }
            if (b.N()) {
                b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).b));
            }
            if (b.M()) {
                b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).n));
            }
            if (b.K()) {
                b2.add(adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).h));
            }
            if (b.G()) {
                adxu a = adqgVar.a(str, adxo.OPEN, (adxn) ((adaz) adqgVar.d).f);
                if (b.F()) {
                    a.g = alog.r(adxi.VIDEO);
                }
                b2.add(a);
            }
            adqg adqgVar2 = adqfVar.o;
            synchronized (adqgVar2.b) {
                e = ((aduu) adqgVar2.c).e();
            }
            adqg adqgVar3 = adqfVar.o;
            synchronized (adqgVar3.b) {
                try {
                    InputStream a2 = ((adih) adqgVar3.a).a("capabilities-pidf.xml");
                    if (a2 != null) {
                        try {
                            adxrVar = ((adxs) adqgVar3.d).a(a2);
                            a2.close();
                        } catch (Throwable th) {
                            try {
                                a2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    advr.i(e2, "Failed to load capabilities PIDF from disk", new Object[0]);
                }
                adxrVar = null;
            }
            if (adxrVar != null) {
                List<adxu> list = adxrVar.b;
                HashMap hashMap = new HashMap();
                if (list != null) {
                    for (adxu adxuVar : list) {
                        String str2 = adxuVar.c.b;
                        if (str2 != null) {
                            hashMap.put(str2, adxuVar);
                        }
                    }
                }
                List<adxu> list2 = adxrVar2.b;
                if (list2 != null) {
                    for (adxu adxuVar2 : list2) {
                        adxu adxuVar3 = (adxu) hashMap.get(adxuVar2.c.b);
                        if (adxuVar3 != null) {
                            adxuVar2.a = adxuVar3.a;
                        }
                    }
                }
            }
            adrx adrxVar = adqfVar.i;
            adrxVar.b();
            try {
                try {
                    adrxVar.k = adxrVar2;
                    adop adopVar = adrxVar.j;
                    if (adopVar == null) {
                        adopVar = new adop(adrxVar, adrxVar.h, adxrVar2.a, adrxVar.e);
                        adopVar.j = adrxVar.q;
                        adrxVar.j = adopVar;
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    adxs.b(adxrVar2, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (adopVar.i != 1) {
                        adopVar.i = 1;
                        adopVar.d.a();
                        adopVar.e = -1;
                        if (e != null) {
                            advr.c("Capabilities publication with existing etag. Performing modify. Etag %s", e);
                            adopVar.g = e;
                        }
                        try {
                            aikb aikbVar = ((aikc) adopVar.a).a;
                            aikbVar.d(adopVar.b.d(aikbVar, adopVar.d, adopVar.c, adopVar.e, adopVar.g, "application/pidf+xml", byteArray), adopVar.h);
                            return;
                        } catch (aild e3) {
                            advr.i(e3, "Error while creating sip request: %s", e3.getMessage());
                            adopVar.i = 3;
                            return;
                        }
                    }
                    throw new IllegalStateException("publish() cannot be called in the PENDING state!");
                } catch (IOException e4) {
                    e = e4;
                    throw new adry("Could not generate presence content: ".concat(String.valueOf(e.getMessage())), e);
                }
            } catch (aild e5) {
                e = e5;
                throw new adry("Could not generate presence content: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (adry e6) {
            advr.i(e6, "Can't send Publish for Presence", new Object[0]);
        }
    }
}
