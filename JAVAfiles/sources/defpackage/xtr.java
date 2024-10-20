package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtr {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/transport/SimChatTransportManager");
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final AtomicBoolean g;
    private final AtomicReference h;

    public xtr(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        new ahlp(null, null, null, null);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicReference(altc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a7, code lost:
    
        if ((r3 instanceof defpackage.xtn) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01a9, code lost:
    
        r0 = defpackage.xtp.a.i();
        r0.X(defpackage.alwp.a, "BugleTransport");
        r0 = (defpackage.alvg) r0;
        r3 = (defpackage.xtn) r3;
        r0.X(defpackage.ydl.T, r3.a);
        ((defpackage.alvg) r0.h("com/google/android/apps/messaging/shared/transport/ChatTransportSelector", "selectEligibleSimFallback", 71, "ChatTransportSelector.kt")).q("Fallback to selecting single NON-Tachygram SIM as eligible for registration, despite multiple sims available.");
        r0 = defpackage.aqjn.j(new defpackage.armo(r3.a, r3.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01dc, code lost:
    
        if ((r3 instanceof defpackage.xtm) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01de, code lost:
    
        r0 = defpackage.xtp.a.g();
        r0.X(defpackage.alwp.a, "BugleTransport");
        ((defpackage.alvg) r0.h("com/google/android/apps/messaging/shared/transport/ChatTransportSelector", "selectEligibleSimFallback", 77, "ChatTransportSelector.kt")).q("No sims are eligible for registration, should never happen.");
        r0 = defpackage.arnw.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0202, code lost:
    
        throw new defpackage.armm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        if ((r3 instanceof defpackage.xto) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:
    
        r0 = defpackage.xtp.a.i();
        r0.X(defpackage.alwp.a, "BugleTransport");
        r0 = (defpackage.alvg) r0;
        r3 = (defpackage.xto) r3;
        r0.X(defpackage.ydl.T, r3.a);
        ((defpackage.alvg) r0.h("com/google/android/apps/messaging/shared/transport/ChatTransportSelector", "selectEligibleSimFallback", 62, "ChatTransportSelector.kt")).q("Fallback to selecting single Tachygram SIM as eligible for registration, despite multiple sims available.");
        r0 = defpackage.aqjn.j(new defpackage.armo(r3.a, defpackage.xtg.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f8, code lost:
    
        r6 = r0;
        defpackage.armd.i(r5, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtr.c(java.util.Map):void");
    }

    private final synchronized void d(Map map) {
        c(map);
    }

    public final alor a() {
        akrh e = aktp.e("SimChatTransportManager#simIdToChatTransport");
        try {
            if (!this.g.get()) {
                b(((xts) this.d.b()).a());
            }
            Object obj = this.h.get();
            obj.getClass();
            alor alorVar = (alor) obj;
            armd.i(e, null);
            return alorVar;
        } finally {
        }
    }

    public final void b(Map map) {
        akrh e = aktp.e("SimChatTransportManager#populateTransportRegistrationState");
        try {
            if (((pcr) this.f.b()).a()) {
                d(map);
            } else {
                c(map);
            }
            armd.i(e, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }
}
