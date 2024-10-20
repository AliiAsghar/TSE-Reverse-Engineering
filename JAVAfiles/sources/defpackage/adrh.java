package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrh extends adou {
    public final armf h;
    public final yjr i;
    public final Context j;
    public final aiim k;
    public final adpu l;
    public final acqj m;
    public final aduo n;
    public adri o;
    public final CopyOnWriteArrayList p;
    public final LinkedBlockingQueue q;
    public volatile boolean r;
    public final InstantMessageConfiguration s;
    public final adqw t;
    public final acof u;
    public final armf v;
    public final adsj w;
    private Thread y;
    private final Runnable z;
    private static final acyz x = aczd.a(181136833);
    public static final advp g = new advp("InstantMessagingService");

    public adrh(Context context, adew adewVar, adqg adqgVar, armf armfVar, yjr yjrVar, aiim aiimVar, adpu adpuVar, acqj acqjVar, adwe adweVar, aduo aduoVar, adqw adqwVar, acof acofVar, armf armfVar2) {
        super(adewVar, adqgVar, adweVar);
        this.p = new CopyOnWriteArrayList();
        this.q = new LinkedBlockingQueue();
        this.z = new adhp(this, 14, null);
        this.j = context;
        this.h = armfVar;
        this.i = yjrVar;
        this.w = new adsj(adewVar.c());
        this.k = aiimVar;
        this.l = adpuVar;
        this.m = acqjVar;
        this.s = adewVar.d();
        this.n = aduoVar;
        this.t = adqwVar;
        this.u = acofVar;
        this.v = armfVar2;
    }

    public static int p(int i) {
        if (i != 403) {
            if (i != 404) {
                if (i != 406) {
                    if (i != 410) {
                        if (i != 486 && i != 488 && i != 500 && i != 600 && i != 603) {
                            if (i != 604) {
                                return i;
                            }
                            return 1;
                        }
                        return 11;
                    }
                    return 1;
                }
                return 11;
            }
            return 1;
        }
        return 9;
    }

    public static final byte[] y(adqu adquVar) {
        advr.l(g, "Reading byte content from MessageContent stream", new Object[0]);
        aifc aifcVar = adquVar.g;
        if (aifcVar != null) {
            return amcp.b(aifcVar.b());
        }
        throw new aild("MessageContent is null");
    }

    @Override // defpackage.adou
    protected final void f() {
        this.r = false;
        Thread thread = new Thread(this.z, "PM MSG Sender");
        this.y = thread;
        thread.start();
    }

    @Override // defpackage.adou
    protected final void g(acok acokVar) {
        this.r = true;
        Thread thread = this.y;
        if (thread != null) {
            thread.interrupt();
            this.y = null;
        }
        while (!this.q.isEmpty()) {
            u((adqu) this.q.poll(), 8);
        }
        this.q.clear();
    }

    @Override // defpackage.adou
    protected final void o(adoz adozVar, acok acokVar) {
        if ((adozVar instanceof adrc) && ((adrc) adozVar).F) {
            advr.d(g, "Chat conference found - disconnecting instead of stopping.", new Object[0]);
            adozVar.E(acokVar);
            return;
        }
        int ordinal = acokVar.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            adozVar.l();
        } else {
            adozVar.n(2, 4);
        }
    }

    public final aikb q() {
        aikb aikbVar = ((aikc) this.h).a;
        if (!aikbVar.u()) {
            return aikbVar;
        }
        throw new aild("SIP stack not initialized");
    }

    public final String r() {
        return this.a.e();
    }

    public final String s(String str) {
        String str2;
        ImsConfiguration c = this.a.c();
        if (((Boolean) x.a()).booleanValue()) {
            boolean y = adwf.y(c);
            try {
                str2 = q().j();
            } catch (aild e) {
                advr.n(3, g, e, "SipStack is not initialized", new Object[0]);
                str2 = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = this.a.c().mDomain;
            }
            aiks d = adwf.d(str, str2, this.i, y);
            d.getClass();
            return d.toString();
        }
        aiks c2 = adwf.c(str, c, this.i);
        c2.getClass();
        return c2.toString();
    }

    public final void t(adqy adqyVar) {
        this.p.add(adqyVar);
    }

    public final void u(adqu adquVar, int i) {
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((adqy) it.next()).a(adquVar, i);
        }
    }

    public final void v(adrc adrcVar) {
        boolean d = aczn.d();
        if (this.o != null) {
            if (adrcVar.K) {
                if (!d) {
                    advr.d(g, "Discarding incoming RBM bot chat session, feature disabled.", new Object[0]);
                    return;
                }
                advr.d(g, "1-1 chat session: RBM bot chat session.", new Object[0]);
                if (adrcVar instanceof adrt) {
                    this.o.d(adrcVar);
                    return;
                } else {
                    this.o.e(adrcVar);
                    return;
                }
            }
            if (adrcVar.F) {
                advr.d(g, "Group chat session", new Object[0]);
            } else {
                advr.d(g, "1:1 chat session", new Object[0]);
            }
            if (adrcVar instanceof adrt) {
                this.o.c(adrcVar);
                return;
            } else {
                this.o.b(adrcVar);
                return;
            }
        }
        advr.d(g, "Not notifying, no listener registered", new Object[0]);
    }

    public final void w(adqy adqyVar) {
        this.p.remove(adqyVar);
    }

    public final boolean x() {
        advp advpVar = adwf.a;
        return this.s.a();
    }

    @Override // defpackage.adou
    public final void m() {
    }

    @Override // defpackage.adou
    public final void n() {
    }
}
