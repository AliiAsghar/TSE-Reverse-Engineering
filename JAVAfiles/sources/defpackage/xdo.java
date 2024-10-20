package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xdo implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ xdo(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        int i = 0;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                alwo alwoVar = xdq.a;
                aozy createBuilder = pua.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                pua puaVar = (pua) createBuilder.b;
                str.getClass();
                puaVar.b |= 1;
                puaVar.c = str;
                return (pua) createBuilder.s();
            case 1:
                String str2 = (String) obj;
                alwo alwoVar2 = xdn.a;
                aozy createBuilder2 = pua.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                pua puaVar2 = (pua) createBuilder2.b;
                str2.getClass();
                puaVar2.b |= 1;
                puaVar2.c = str2;
                return (pua) createBuilder2.s();
            case 2:
                return ((anjl) obj).a;
            case 3:
                qei qeiVar = (qei) obj;
                aozy createBuilder3 = qff.a.createBuilder();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar = createBuilder3.b;
                qff qffVar = (qff) apagVar;
                qeiVar.getClass();
                qffVar.c = qeiVar;
                qffVar.b |= 1;
                qfe qfeVar = qfe.JOINED;
                if (!apagVar.isMutable()) {
                    createBuilder3.u();
                }
                qff qffVar2 = (qff) createBuilder3.b;
                qffVar2.d = qfeVar.e;
                qffVar2.b |= 2;
                return (qff) createBuilder3.s();
            case 4:
                smo smoVar = (smo) obj;
                alwo alwoVar3 = xep.a;
                qfe qfeVar2 = qfe.JOINED;
                if (qfeVar2 != null) {
                    i = qfeVar2.e;
                }
                smoVar.U(new agoi("conversation_to_participants.rcs_group_join_status", 1, Integer.valueOf(i)));
                return smoVar;
            case 5:
                slc slcVar = (slc) obj;
                alwo alwoVar4 = xep.a;
                qfe qfeVar3 = qfe.JOINED;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 58570) {
                    agnc.t("rcs_group_join_status", intValue);
                }
                if (qfeVar3 != null) {
                    i = qfeVar3.e;
                }
                slcVar.U(new agoi("conversation_participants.rcs_group_join_status", 1, Integer.valueOf(i)));
                return slcVar;
            case 6:
                alwo alwoVar5 = xep.a;
                byte[] ak = ((smr) obj).ak();
                if (ak != null && ak.length != 0) {
                    return Optional.of(aozb.w(ak));
                }
                ((alwl) ((alwl) xep.a.i()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getGroupRoutingTokenFromConversationBindData", 299, "TachygramDatabaseOperations.java")).q("No routing token stored in conversation for tachygram group.");
                return Optional.empty();
            case 7:
                smr smrVar = (smr) obj;
                alwo alwoVar6 = xep.a;
                return smrVar;
            case 8:
                return ((anjl) obj).a;
            case 9:
                return Integer.valueOf(((xgx) obj).h);
            case 10:
                return Integer.valueOf(((xgx) obj).d);
            case 11:
                syc sycVar = (syc) obj;
                alvi alviVar = xgw.a;
                sycVar.c();
                return sycVar;
            case 12:
                snh snhVar = (snh) obj;
                snhVar.y(new xhv());
                return snhVar;
            case 13:
                return Integer.valueOf(((xgx) obj).f);
            case 14:
                snh snhVar2 = (snh) obj;
                alvi alviVar2 = xgw.a;
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 49060) {
                    agnc.t("awaiting_reverse_sync", intValue2);
                }
                snhVar2.U(new agoi("conversations.awaiting_reverse_sync", 1, 1));
                return snhVar2;
            case 15:
                syc sycVar2 = (syc) obj;
                alvi alviVar3 = xgw.a;
                sycVar2.L();
                return sycVar2;
            case 16:
                return Integer.valueOf(((xgx) obj).i);
            case 17:
                snh snhVar3 = (snh) obj;
                snhVar3.U(new agmd("conversations.sms_thread_id", 2, Long.valueOf(yyb.cE(new xhv()))));
                return snhVar3;
            case 18:
                syc sycVar3 = (syc) obj;
                alvi alviVar4 = xgw.a;
                sycVar3.K();
                return sycVar3;
            case 19:
                tbu tbuVar = (tbu) obj;
                alvi alviVar5 = xgw.a;
                valueOf3 = Integer.valueOf(a.bp().c());
                int intValue3 = valueOf3.intValue();
                if (intValue3 < 52030) {
                    agnc.t("missing_entry_in_telephony", intValue3);
                }
                tbuVar.U(new agoi("parts.missing_entry_in_telephony", 1, 0));
                return tbuVar;
            default:
                return Integer.valueOf(((xgx) obj).g);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
