package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ProcessSentMessageAction;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qdi extends unp {
    private static final xze h = xze.g("BugleDataModel", "SendChatMessageResponseHandler");
    private static final alvi i = alvi.m("com/google/android/apps/messaging/shared/chatapi/incoming/SendChatMessageResponseHandler");
    public final armf a;
    public final armf b;
    public final anen c;
    public final anen d;
    public final woa e;
    public final armf f;
    public final rdg g;
    private final uvi j;
    private final armf k;
    private final Map l;
    private final armf m;
    private final armf n;
    private final pst o;
    private final pvx p;

    public qdi(rdg rdgVar, uvi uviVar, armf armfVar, armf armfVar2, woa woaVar, pst pstVar, pvx pvxVar, armf armfVar3, armf armfVar4, Map map, anen anenVar, anen anenVar2, armf armfVar5, armf armfVar6) {
        this.g = rdgVar;
        this.j = uviVar;
        this.a = armfVar;
        this.b = armfVar2;
        this.e = woaVar;
        this.o = pstVar;
        this.p = pvxVar;
        this.m = armfVar3;
        this.k = armfVar4;
        this.l = map;
        this.c = anenVar;
        this.d = anenVar2;
        this.f = armfVar5;
        this.n = armfVar6;
    }

    private final akul l(final qgj qgjVar, final qeg qegVar, final apct apctVar, final boolean z, final amgu amguVar, final qga qgaVar, final amxb amxbVar) {
        return ((vyt) this.n.b()).a(vys.SENT).i(new ancs() { // from class: qdg
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                qgj qgjVar2 = qgjVar;
                final rve a = rve.a(qgjVar2.e);
                final qdi qdiVar = qdi.this;
                nej nejVar = (nej) qdiVar.f.b();
                qgr qgrVar = qgjVar2.g;
                if (qgrVar == null) {
                    qgrVar = qgr.a;
                }
                final amgu amguVar2 = amguVar;
                nejVar.b(qgrVar, a);
                amxo b = amxo.b(amguVar2.aa);
                if (b == null) {
                    b = amxo.UNKNOWN_RCS_TYPE;
                }
                final amxb amxbVar2 = amxbVar;
                final qga qgaVar2 = qgaVar;
                final boolean z2 = z;
                final apct apctVar2 = apctVar;
                return qdiVar.k(qegVar, qgjVar2, b).h(new algk() { // from class: qdf
                    @Override // defpackage.algk
                    public final Object apply(Object obj2) {
                        armf armfVar = qdi.this.g.a;
                        qeg qegVar2 = (qeg) obj2;
                        Instant l = aotl.l(apctVar2);
                        vid vidVar = (vid) armfVar.b();
                        vidVar.getClass();
                        qegVar2.getClass();
                        l.getClass();
                        amgu amguVar3 = amguVar2;
                        amguVar3.getClass();
                        qga qgaVar3 = qgaVar2;
                        qgaVar3.getClass();
                        return new ProcessSentMessageAction(vidVar, a, qegVar2, l, z2, amguVar3, qgaVar3, amxbVar2);
                    }
                }, qdiVar.c).i(new jab(12), qdiVar.c).h(new kxr(qdiVar, qgjVar2, a, 20, (byte[]) null), qdiVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("SendChatMessageResponseHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return j((qgg) apbtVar).h(new qda(4), andi.a);
    }

    @Override // defpackage.unx
    public final apca e() {
        return qgg.a.getParserForType();
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0372, code lost:
    
        if (r1 != 3) goto L152;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akul j(final defpackage.qgg r17) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdi.j(qgg):akul");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [qhs] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final akul k(qeg qegVar, qgj qgjVar, amxo amxoVar) {
        ?? r7;
        qef b = qef.b(qegVar.c);
        if (b == null) {
            b = qef.UNKNOWN_STATUS;
        }
        if (!b.equals(qef.OK)) {
            qfu b2 = qfu.b(qegVar.e);
            if (b2 == null) {
                b2 = qfu.RECOVERY_STRATEGY_UNSPECIFIED;
            }
            xyo a = h.a();
            a.H("Recovering for RecoveryStrategy: ".concat(String.valueOf(String.valueOf(b2))));
            a.q();
            albo.X(this.l.containsKey(b2), "No converter provided for recovery strategy %s", b2);
            pwe pweVar = (pwe) this.l.get(b2);
            pweVar.getClass();
            qhl a2 = pweVar.a(qgjVar);
            final qnu qnuVar = (qnu) this.k.b();
            amxoVar.getClass();
            if (amxoVar.ordinal() != 3) {
                r7 = new qhs() { // from class: qht
                    /* JADX WARN: Type inference failed for: r1v2, types: [qhj, java.lang.Object] */
                    @Override // defpackage.qhs
                    public final qhj a(qfu qfuVar) {
                        qfuVar.getClass();
                        return qnu.this.a;
                    }
                };
            } else {
                r7 = qnuVar.b;
            }
            return r7.a(b2).a(a2).h(new puy(qegVar, 8), this.c);
        }
        return aktp.ag(qegVar);
    }
}
