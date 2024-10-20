package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mmv implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ mmv(int i) {
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
        Object e;
        Object obj2;
        Integer valueOf;
        switch (this.a) {
            case 0:
                e = ((msh) obj).e();
                return e;
            case 1:
                return ((nfw) obj).i();
            case 2:
                alhr alhrVar = mmw.a;
                return Optional.ofNullable(((GroupInfo) obj).c);
            case 3:
                alhr alhrVar2 = mmw.a;
                return Optional.ofNullable(((GroupInfo) obj).d);
            case 4:
                obj2 = ((qei) obj).d;
                return obj2;
            case 5:
                alhr alhrVar3 = mmw.a;
                String O = ((ParticipantsTable.BindData) obj).O();
                albo.C(O);
                return O;
            case 6:
                tar tarVar = (tar) obj;
                return new tas[]{tarVar.m, tarVar.n, tarVar.h};
            case 7:
                return new sxp[]{((sxo) obj).k};
            case 8:
                smu smuVar = (smu) obj;
                return new smv[]{smuVar.a, smuVar.c, smuVar.O, smuVar.g, smuVar.D, smuVar.t, smuVar.k, smuVar.l, smuVar.m, smuVar.n, smuVar.o, smuVar.j, smuVar.L, smuVar.r, smuVar.aq, smuVar.A, smuVar.R, smuVar.y};
            case 9:
                zai zaiVar = (zai) obj;
                return new tpv[]{(tpv) zaiVar.c, (tpv) zaiVar.e, (tpv) zaiVar.d};
            case 10:
                return new tbi[]{((tbh) obj).e};
            case 11:
                return ((smr) obj).C();
            case 12:
                snh snhVar = (snh) obj;
                snhVar.z(4);
                return snhVar;
            case 13:
                return ((uqu) obj).d;
            case 14:
                int i = mok.d;
                return ruy.b(((ConversationId) obj).b());
            case 15:
                int i2 = mok.d;
                return ((BugleConversationId) ((ConversationId) obj)).a;
            case 16:
                snh snhVar2 = (snh) obj;
                snhVar2.e(1);
                return snhVar2;
            case 17:
                snh snhVar3 = (snh) obj;
                Set set = moq.b;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 60050) {
                    agnc.t("mms_group_upgrade_status", intValue);
                }
                snhVar3.U(new agmf("conversations.mms_group_upgrade_status", 3, snh.X((Iterable) alzz.C(set).map(new sho(5)).collect(Collectors.toCollection(new sms(7)))), true));
                return snhVar3;
            case 18:
                return new PenpalBotConversationId(((BugleConversationId) ((ConversationId) obj)).a);
            case 19:
                ConversationId conversationId = (ConversationId) obj;
                d.s(conversationId instanceof PenpalBotConversationId);
                return ((PenpalBotConversationId) conversationId).b;
            default:
                return new PenpalBotConversationId(((BugleConversationId) ((ConversationId) obj)).a);
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
