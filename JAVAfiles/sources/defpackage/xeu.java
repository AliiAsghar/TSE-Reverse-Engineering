package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xeu implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xeu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [xed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, arqr] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                xew.c((qeg) obj, (String) this.a);
                return null;
            case 1:
                alwo alwoVar = xew.a;
                return this.a;
            case 2:
                alvw g = xfa.a.g();
                g.X(alwp.a, "BugleTachygram");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.e, ((aqds) this.a).c);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 96, "TachygramOneToManyInboxMessageHandlerAdapter.java")).q("Incoming InboxMessage has been processed.");
                return true;
            case 3:
                alvw i = xfa.a.i();
                i.X(alwp.a, "BugleTachygram");
                alvg alvgVar2 = (alvg) ((alvg) i).g((aniv) obj);
                aqds aqdsVar = (aqds) this.a;
                alvgVar2.X(ydl.e, aqdsVar.c);
                alvg alvgVar3 = (alvg) alvgVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 134, "TachygramOneToManyInboxMessageHandlerAdapter.java");
                aqdr b = aqdr.b(aqdsVar.d);
                if (b == null) {
                    b = aqdr.UNRECOGNIZED;
                }
                alvgVar3.t("Tachygram could not process incoming InboxMessage. Permanently failing message due to TachygramException. messageType: %s.", new ahlg(b));
                return true;
            case 4:
                alvw i2 = xfa.a.i();
                i2.X(alwp.a, "BugleTachygram");
                alvg alvgVar4 = (alvg) ((alvg) i2).g((Throwable) obj);
                aqds aqdsVar2 = (aqds) this.a;
                alvgVar4.X(ydl.e, aqdsVar2.c);
                alvg alvgVar5 = (alvg) alvgVar4.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 148, "TachygramOneToManyInboxMessageHandlerAdapter.java");
                aqdr b2 = aqdr.b(aqdsVar2.d);
                if (b2 == null) {
                    b2 = aqdr.UNRECOGNIZED;
                }
                alvgVar5.t("Tachygram could not process incoming InboxMessage. Permanently failing message. messageType %s.", new ahlg(b2));
                return true;
            case 5:
                alwl alwlVar = (alwl) xfc.b.i();
                alwlVar.X(ydl.a, ((qgf) this.a).f);
                ((alwl) ((alwl) alwlVar.g((Throwable) obj)).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 298, "TachygramOutgoingChatApi.java")).q("Attempt to send chat message directly failed(or) timed-out so enqueueing it to pwq.");
                return pwh.FAIL_RETRY;
            case 6:
                return ((xff) this.a).g(2, (qeg) obj);
            case 7:
                return ((xff) this.a).g(1, (qeg) obj);
            case 8:
                Object obj2 = this.a;
                anjv ay = albo.ay();
                qgb qgbVar = (qgb) obj2;
                ay.d(qgbVar.d);
                ay.e((aqfn) obj);
                qei qeiVar = qgbVar.g;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                ay.f(yyb.cI(qeiVar));
                return ay.a();
            case 9:
                Object obj3 = this.a;
                ((anjv) obj3).c((aqfn) obj);
                return obj3;
            case 10:
                Object obj4 = this.a;
                ((anjv) obj4).e((aqfn) obj);
                return obj4;
            case 11:
                return this.a.a((aogy) obj);
            case 12:
                return ((Optional) obj).map(new xeo(this.a, 14));
            case 13:
                Optional optional = (Optional) obj;
                aozy cJ = yyb.cJ();
                asku askuVar = asku.GROUP_ID;
                if (!cJ.b.isMutable()) {
                    cJ.u();
                }
                aqfn aqfnVar = (aqfn) cJ.b;
                aqfn aqfnVar2 = aqfn.a;
                aqfnVar.b = askuVar.a();
                if (!cJ.b.isMutable()) {
                    cJ.u();
                }
                Object obj5 = this.a;
                aqfn aqfnVar3 = (aqfn) cJ.b;
                obj5.getClass();
                aqfnVar3.c = (String) obj5;
                optional.ifPresent(new wqw(cJ, 15));
                return (aqfn) cJ.s();
            case 14:
                xgy xgyVar = (xgy) obj;
                aozy builder = xgyVar.toBuilder();
                if (xgyVar.d.size() >= Math.max(((Integer) xgw.b.e()).intValue(), ((Integer) xgz.a.e()).intValue())) {
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    xgy xgyVar2 = (xgy) builder.b;
                    xgyVar2.a();
                    xgyVar2.d.remove(0);
                }
                apct b3 = apds.b(((xgw) this.a).c.f().toEpochMilli());
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                xgy xgyVar3 = (xgy) builder.b;
                b3.getClass();
                xgyVar3.a();
                xgyVar3.d.add(b3);
                aozy createBuilder = xgx.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                ((xgx) apagVar).b = true;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((xgx) createBuilder.b).c = 0;
                xgx xgxVar = (xgx) createBuilder.s();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                xgy xgyVar4 = (xgy) builder.b;
                xgxVar.getClass();
                xgyVar4.c = xgxVar;
                xgyVar4.b |= 1;
                return (xgy) builder.s();
            case 15:
                return (xhp) ((aozy) this.a).s();
            case 16:
                xju xjuVar = (xju) obj;
                Object obj6 = this.a;
                utz utzVar = xjw.a;
                aozy builder2 = xjuVar.toBuilder();
                Instant instant = (Instant) obj6;
                apct j = aotl.j(instant);
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                xju xjuVar2 = (xju) builder2.b;
                j.getClass();
                xjuVar2.d = j;
                xjuVar2.b = 2 | xjuVar2.b;
                if ((xjuVar.b & 8) == 0) {
                    apct j2 = aotl.j(instant);
                    if (!builder2.b.isMutable()) {
                        builder2.u();
                    }
                    xju xjuVar3 = (xju) builder2.b;
                    j2.getClass();
                    xjuVar3.f = j2;
                    xjuVar3.b |= 8;
                }
                return (xju) builder2.s();
            case 17:
                Object obj7 = this.a;
                utz utzVar2 = xjw.a;
                aozy builder3 = ((xju) obj).toBuilder();
                apct j3 = aotl.j((Instant) obj7);
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                xju xjuVar4 = (xju) builder3.b;
                j3.getClass();
                xjuVar4.e = j3;
                xjuVar4.b |= 4;
                return (xju) builder3.s();
            case 18:
                return this.a.a(obj);
            case 19:
                int i3 = xnc.b;
                return ((Optional) this.a).get();
            default:
                alwo alwoVar2 = xoa.a;
                return ((xow) this.a).m();
        }
    }
}
