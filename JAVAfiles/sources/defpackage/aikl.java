package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikl extends aiki {
    public final advp a;
    public final ailf b;
    public final aior c;
    public final Set d = new HashSet();
    public final Set e = new HashSet();
    public final Timer f = new Timer();
    public final acqj g;
    public asqc h;
    private final alpt i;
    private final Map j;
    private final asqc k;

    public aikl(aior aiorVar, advp advpVar, acqj acqjVar, ailf ailfVar, Collection collection) {
        asqc asqcVar = new asqc(this, null);
        this.k = asqcVar;
        this.c = aiorVar;
        this.a = advpVar;
        this.b = ailfVar;
        this.g = acqjVar;
        aiorVar.o(asqcVar);
        this.j = DesugarCollections.synchronizedMap(new HashMap());
        this.i = alpt.o(collection);
    }

    @Override // defpackage.aiki
    public final aikh a(aiom aiomVar, aikm aikmVar) {
        String j;
        aikh aikhVar;
        ainh ainhVar = aiomVar.a;
        ailt ailtVar = ainhVar.g;
        if (ailtVar == null) {
            j = null;
        } else if (ainhVar.t() && "INVITE".equals(ailtVar.e())) {
            j = ainhVar.v("ACK", 2);
        } else {
            j = aikh.j(ainhVar);
        }
        advr.d(this.a, "Created a transaction context for transaction id: %s", j);
        if (j == null) {
            advr.q("Transaction id is null.", new Object[0]);
            aikhVar = null;
        } else {
            aikhVar = new aikh(j, aiomVar, aikmVar);
        }
        if (aikhVar == null) {
            return null;
        }
        this.j.put(aikhVar.c, aikhVar);
        return aikhVar;
    }

    @Override // defpackage.aiki
    public final aior b() {
        return this.c;
    }

    @Override // defpackage.aiki
    public final void c() {
        try {
            aior aiorVar = this.c;
            if (aiorVar != null) {
                aiorVar.k();
                advr.d(this.a, "SIP transport was terminated", new Object[0]);
            }
        } catch (RuntimeException e) {
            advr.j(e, this.a, "Can't close SIP transport properly", new Object[0]);
        }
    }

    @Override // defpackage.aiki
    public final void d(ainh ainhVar) {
        Optional empty;
        try {
            aior aiorVar = this.c;
            if (aiorVar != null) {
                aiorVar.i(ainhVar);
                acqj acqjVar = this.g;
                aior aiorVar2 = this.c;
                if (ainhVar.s()) {
                    acqjVar.c(new aion((aini) ainhVar), Optional.empty(), 1, 4, aiorVar2);
                    return;
                }
                if (ainhVar.t()) {
                    aioo aiooVar = new aioo((ainj) ainhVar);
                    String d = aiooVar.d();
                    if (d == null) {
                        empty = Optional.empty();
                    } else {
                        synchronized (acqjVar.b) {
                            Iterator it = acqjVar.b.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    aiom aiomVar = (aiom) it.next();
                                    if (d.equals(aiomVar.d()) && aiomVar.a() == aiooVar.a()) {
                                        empty = Optional.of(aiomVar);
                                        break;
                                    }
                                } else {
                                    empty = Optional.empty();
                                    break;
                                }
                            }
                        }
                    }
                    acqjVar.c(aiooVar, empty, 1, 4, aiorVar2);
                    return;
                }
                return;
            }
            throw new aild("SipTransport is null");
        } catch (aild e) {
            advr.g("Can't send message: %s", e.getMessage());
            throw e;
        }
    }

    @Override // defpackage.aiki
    public final void e(asqc asqcVar) {
        this.h = asqcVar;
    }

    public final aikh f(String str) {
        return (aikh) this.j.get(str);
    }

    public final void g(ainh ainhVar) {
        aiks j;
        String j2 = aikh.j(ainhVar);
        advr.c("Getting transaction context for transaction id: %s", j2);
        if (j2 == null) {
            advr.g("Transaction id is null.", new Object[0]);
            return;
        }
        aikh f = f(j2);
        if (f != null) {
            advr.c("Transaction context found for transaction id: %s", j2);
            if (ainhVar.t()) {
                ailt ailtVar = ainhVar.g;
                if (ailtVar == null) {
                    advr.g("CSeqHeader is null.", new Object[0]);
                } else {
                    aioo aiooVar = new aioo((ainj) ainhVar);
                    if (aiooVar.y() < 200) {
                        advr.k("Provisional response received - resetting transaction timer", new Object[0]);
                        int y = aiooVar.y();
                        if (y == 100 || y == 180 || y == 183) {
                            f.e = System.currentTimeMillis();
                        }
                    } else if (f.b == null) {
                        advr.k("First response received", new Object[0]);
                        f.e(aiooVar);
                    } else if (ailtVar.e().equals("INVITE")) {
                        advr.k("Second response received - sending ACK again", new Object[0]);
                        aiom aiomVar = f.a;
                        if (aiomVar == null) {
                            advr.g("Not sending SIP message as it's null.", new Object[0]);
                        } else {
                            try {
                                aini ainiVar = (aini) aiomVar.a;
                                ainj z = aiooVar.z();
                                ailx ailxVar = (ailx) z.c().f();
                                if (z.w() < 300 && ailxVar != null) {
                                    j = ahji.j(ailxVar.a.b.c());
                                } else {
                                    j = ahji.j(ainiVar.w().c());
                                }
                                aiks aiksVar = j;
                                String h = z.h();
                                if (h != null) {
                                    ailu S = ahmc.S(h);
                                    ailt ailtVar2 = z.g;
                                    if (ailtVar2 != null) {
                                        ailt R = ahmc.R(ailtVar2.b(), "ACK");
                                        aimg aimgVar = z.e;
                                        aimy aimyVar = z.f;
                                        if (aimgVar != null && aimyVar != null) {
                                            aini f2 = ahji.f(aiksVar, "ACK", S, R, aimgVar, aimyVar, ainiVar.g().a, ahmc.Y(75));
                                            alob alobVar = new alob();
                                            Iterator it = z.j("Record-Route").iterator();
                                            while (it.hasNext()) {
                                                aimq aimqVar = (aimq) ((aimh) it.next());
                                                aimt aimtVar = new aimt(aimqVar.a);
                                                if (aimqVar.m()) {
                                                    Iterator<aikz> it2 = aimqVar.e.iterator();
                                                    while (it2.hasNext()) {
                                                        aimtVar.e.e((aikz) it2.next().clone());
                                                    }
                                                }
                                                alobVar.h(aimtVar);
                                            }
                                            Iterator<E> it3 = alobVar.g().a().iterator();
                                            while (it3.hasNext()) {
                                                f2.k((aimt) it3.next());
                                            }
                                            d(new aion(f2).a);
                                        } else {
                                            throw new ailb("From or To headers are null.");
                                        }
                                    } else {
                                        throw new ailb("Response CSeqHeader is null.");
                                    }
                                } else {
                                    throw new ailb("Response Call Identifier is null.");
                                }
                            } catch (Exception e) {
                                advr.g("Can't send message: %s", e.getMessage());
                            }
                        }
                    }
                }
            } else if ("ACK".equals(ainhVar.i())) {
                f.e(new aion((aini) ainhVar));
            }
        }
        synchronized (this.j) {
            advr.c("Checking %d transactions for expiry", Integer.valueOf(this.j.size()));
            Iterator it4 = this.j.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                aikh aikhVar = (aikh) entry.getValue();
                if (System.currentTimeMillis() - aikhVar.e >= aikhVar.f) {
                    advr.c("Transaction: %s expired. Removing transaction...", entry.getKey());
                    it4.remove();
                }
            }
            advr.c("Transactions after cleanup: %d", Integer.valueOf(this.j.size()));
        }
    }

    public final boolean h(ainh ainhVar) {
        if (this.e.contains(ainhVar.u(1))) {
            if (ainhVar.t()) {
                ainj ainjVar = (ainj) ainhVar;
                ailt ailtVar = ainjVar.g;
                if (ainjVar.z() && ailtVar != null && "INVITE".equals(ailtVar.e())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean i(ainh ainhVar) {
        if (ainhVar.u(1) == null) {
            advr.d(this.a, "Not checking duplicate for msgs with null context id", new Object[0]);
            return false;
        }
        if (ainhVar.r()) {
            advr.d(this.a, "Not checking duplicate for keep alive msgs", new Object[0]);
            return false;
        }
        if (ainhVar.s()) {
            aini ainiVar = (aini) ainhVar;
            if (this.i.contains(ainiVar.i())) {
                advr.d(this.a, "Not checking duplicate for %s", ainiVar.i());
                return false;
            }
        }
        if (ainhVar.t()) {
            aioo aiooVar = new aioo((ainj) ainhVar);
            if (aiooVar.y() >= 100 && aiooVar.y() <= 199) {
                return false;
            }
        }
        return true;
    }
}
