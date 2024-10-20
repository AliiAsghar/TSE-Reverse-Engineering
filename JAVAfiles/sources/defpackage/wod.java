package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.events.Event;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wod implements ajoe {
    public static final xze a = xze.g("BugleAction", "IncomingRcsEventProcessor");
    private static final xyw d = new xyw(TimeUnit.SECONDS.toMillis(3));
    private static final xyw e = new xyw(TimeUnit.SECONDS.toMillis(30));
    private static final alpt f = alpt.r(50050, 0);
    private static final alwo g = alwo.o("BugleAction");
    private final psw A;
    private final psq B;
    private final qzg C;
    private final rbb D;
    private final rdg E;
    private final qyu F;
    private final rcw G;
    private final rdd H;
    private final qzk I;
    private final rde J;
    private final qsa K;
    private final qsa L;
    private final wfh M;
    private final vyv N;
    private final vyv O;
    private final vyv P;
    private final hgj Q;
    public final armf b;
    public final armf c;
    private final mbl h;
    private final apwt i;
    private final vqu j;
    private final ykw k;
    private final apwt l;
    private final xnv m;
    private final wny n;
    private final woa o;
    private final mek p;
    private final anen q;
    private final rjf r;
    private final ytw s;
    private final mgv t;
    private final vwr u;
    private final wfe v;
    private final xoh w;
    private final armf x;
    private final armf y;
    private final ptb z;

    public wod(qzg qzgVar, rbb rbbVar, rdg rdgVar, qyu qyuVar, mbl mblVar, apwt apwtVar, vqu vquVar, ykw ykwVar, apwt apwtVar2, xnv xnvVar, wny wnyVar, woa woaVar, mek mekVar, rcw rcwVar, anen anenVar, rdd rddVar, qzk qzkVar, rjf rjfVar, rde rdeVar, ytw ytwVar, armf armfVar, mgv mgvVar, vyv vyvVar, wfh wfhVar, vwr vwrVar, wfe wfeVar, vyv vyvVar2, xoh xohVar, vyv vyvVar3, armf armfVar2, armf armfVar3, armf armfVar4, hgj hgjVar, ptb ptbVar, psw pswVar, qsa qsaVar, qsa qsaVar2, psq psqVar) {
        this.C = qzgVar;
        this.D = rbbVar;
        this.E = rdgVar;
        this.F = qyuVar;
        this.h = mblVar;
        this.i = apwtVar;
        this.j = vquVar;
        this.k = ykwVar;
        this.l = apwtVar2;
        this.m = xnvVar;
        this.n = wnyVar;
        this.o = woaVar;
        this.p = mekVar;
        this.G = rcwVar;
        this.q = anenVar;
        this.I = qzkVar;
        this.H = rddVar;
        this.r = rjfVar;
        this.J = rdeVar;
        this.s = ytwVar;
        this.b = armfVar;
        this.t = mgvVar;
        this.M = wfhVar;
        this.N = vyvVar;
        this.u = vwrVar;
        this.v = wfeVar;
        this.O = vyvVar2;
        this.w = xohVar;
        this.P = vyvVar3;
        this.x = armfVar2;
        this.y = armfVar3;
        this.c = armfVar4;
        this.Q = hgjVar;
        this.z = ptbVar;
        this.A = pswVar;
        this.K = qsaVar;
        this.L = qsaVar2;
        this.B = psqVar;
    }

    private final void e(Action action, wng wngVar) {
        this.v.o(wngVar);
        action.r(wngVar);
    }

    @Override // defpackage.ajoe
    public final String a() {
        return "IncomingRcsEventProcessor";
    }

    @Override // defpackage.ajoe
    public final void b(Event event) {
        c(event, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:238:0x07a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0093. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0099. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x009c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0ad6  */
    /* JADX WARN: Type inference failed for: r2v75, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v84, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v127, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.ims.rcsservice.events.Event r23, defpackage.wng r24) {
        /*
            Method dump skipped, instructions count: 3126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wod.c(com.google.android.ims.rcsservice.events.Event, wng):void");
    }

    protected final void d(ChatSessionMessageEvent chatSessionMessageEvent, int i, wng wngVar) {
        rve a2 = rve.a(chatSessionMessageEvent.c);
        if (rve.l(a2) && riw.d(i)) {
            e(this.C.a(a2, i, amxo.RCS_LEGACY), wngVar);
            qiu.h(this.q.submit(akto.j(new wnc(this, a2, 4))));
        }
    }
}
