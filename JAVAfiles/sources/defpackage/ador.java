package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ador {
    public final adwe b;
    public final aijw c;
    public final armf d;
    public String[] e;
    public String[] f;
    public String g;
    public String h;
    public String i;
    private final adou k;
    private boolean l;
    private boolean m;
    private final boolean n;
    private final boolean o;
    private final alog p;
    private final adsj q;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final String j = "false";

    public ador(adou adouVar, armf armfVar, String str, alog alogVar, aijw aijwVar, adwe adweVar, boolean z, boolean z2) {
        this.k = adouVar;
        this.d = armfVar;
        this.q = new adsj(adouVar.a.c());
        this.p = alogVar;
        this.b = adweVar;
        if (aijwVar != null) {
            this.c = aijwVar;
        } else {
            adew adewVar = adouVar.a;
            if (!Objects.isNull(adewVar.c())) {
                String e = adewVar.e();
                if (!Objects.isNull(e)) {
                    if (!Objects.isNull(str)) {
                        aikb aikbVar = ((aikc) armfVar).a;
                        if (!aikbVar.u()) {
                            this.c = new aijw(aikb.v(), 1, str, e, str, aikbVar.p());
                        } else {
                            throw new aild("Null SipStack. Can't create dialog path.");
                        }
                    } else {
                        throw new aild("Null remote Uri. Can't create dialog path.");
                    }
                } else {
                    throw new aild("Null Public Identity in ImsModule.");
                }
            } else {
                throw new aild("Null ImsConfiguration,");
            }
        }
        this.n = z;
        this.o = z2;
    }

    private final void h(aioo aiooVar) {
        d(aiooVar.y(), aiooVar.A());
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r11 != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c A[Catch: Exception -> 0x0244, TRY_LEAVE, TryCatch #0 {Exception -> 0x0244, blocks: (B:11:0x0042, B:13:0x0085, B:14:0x0088, B:19:0x00c8, B:20:0x00d5, B:23:0x00e0, B:27:0x00f5, B:28:0x0109, B:29:0x0114, B:31:0x011c, B:74:0x00fd, B:78:0x00d0), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aion a() {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ador.a():aion");
    }

    public final void b(adot adotVar) {
        this.a.add(adotVar);
    }

    public final void c(ados adosVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((adot) it.next()).b(this, adosVar);
        }
    }

    protected final void d(int i, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((adot) it.next()).d(this, i, str);
        }
    }

    public final void e(adot adotVar) {
        this.a.remove(adotVar);
    }

    public final void f(aion aionVar) {
        try {
            aikh e = ((aikc) this.d).a.e(aionVar);
            e.h(15);
            if (e.g()) {
                int a = e.a();
                aioo b = e.b();
                if (b != null) {
                    if (a != 200 && a != 202) {
                        if (a == 403) {
                            if (this.l) {
                                h(b);
                                return;
                            } else {
                                this.l = true;
                                return;
                            }
                        }
                        if (a == 407) {
                            if (this.m) {
                                h(b);
                                return;
                            }
                            this.m = true;
                            try {
                                advr.k("407 response received", new Object[0]);
                                String l = b.l();
                                if (l == null) {
                                    l = "";
                                }
                                this.c.e = adwf.i(l);
                                this.q.c(b);
                                this.c.a();
                                advr.k("Send second REFER", new Object[0]);
                                aion a2 = a();
                                this.q.d(a2);
                                aimy aimyVar = a2.y().f;
                                if (aimyVar != null) {
                                    aimyVar.e();
                                    f(a2);
                                    return;
                                }
                                throw new IllegalStateException("To header is null.");
                            } catch (Exception e2) {
                                advr.i(e2, "Reference failed", new Object[0]);
                                c(new ados(e2));
                                return;
                            }
                        }
                        h(b);
                        return;
                    }
                    adou adouVar = this.k;
                    advr.c("Add reference %s", this);
                    adouVar.b.add(this);
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((adot) it.next()).a(this);
                    }
                    return;
                }
                advr.g("SIP response is null.", new Object[0]);
                throw new aild("SIP response is null.");
            }
            d(408, "timeout");
        } catch (Exception e3) {
            advr.i(e3, "Error while referring: %s", e3.getMessage());
            c(new ados("Error while rejecting refer: ".concat(String.valueOf(e3.getMessage())), e3));
        }
    }

    public final void g() {
        ((adoq) acrk.a(adoq.class)).u().submit(new adhp(this, 12, null));
    }
}
