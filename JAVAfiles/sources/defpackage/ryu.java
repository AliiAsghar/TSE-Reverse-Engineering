package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ryu implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ryu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v34, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [agnw, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Optional otherConversationToParticipants;
        switch (this.b) {
            case 0:
                ssr ssrVar = (ssr) obj;
                ssrVar.b(((ssi) this.a).k());
                return ssrVar;
            case 1:
                ssg ssgVar = (ssg) obj;
                ssgVar.b(Long.parseLong((String) this.a));
                return ssgVar;
            case 2:
                ssr ssrVar2 = (ssr) obj;
                ssrVar2.b((MessageIdType) this.a);
                return ssrVar2;
            case 3:
                otherConversationToParticipants = ((CustomUpgradeSteps) this.a).toOtherConversationToParticipants((smr) obj);
                return otherConversationToParticipants;
            case 4:
                snh snhVar = (snh) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion42040$5((ArrayList) this.a, snhVar);
                return snhVar;
            case 5:
                snh snhVar2 = (snh) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion42040$6((ArrayList) this.a, snhVar2);
                return snhVar2;
            case 6:
                tol tolVar = (tol) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion53000$4((sxx) this.a, tolVar);
                return tolVar;
            case 7:
                tkq tkqVar = (tkq) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion60270$1((tkh) this.a, tkqVar);
                return tkqVar;
            case 8:
                slc slcVar = (slc) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59760$2((tdi) this.a, slcVar);
                return slcVar;
            case 9:
                snh snhVar3 = (snh) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59760$3((sku) this.a, snhVar3);
                return snhVar3;
            case 10:
                syc sycVar = (syc) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion30030$2((tbr) this.a, sycVar);
                return sycVar;
            case 11:
                tbd tbdVar = (tbd) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion42040$3((String) this.a, tbdVar);
                return tbdVar;
            case 12:
                sai saiVar = (sai) obj;
                saiVar.c((ConversationIdType) this.a);
                return saiVar;
            case 13:
                sau sauVar = (sau) obj;
                sauVar.c((ConversationIdType) this.a);
                return sauVar;
            case 14:
                wte wteVar = (wte) obj;
                wteVar.b(this.a);
                return wteVar;
            case 15:
                sua suaVar = (sua) obj;
                suaVar.U(new agme("message_classifications_table.message_id", 1, this.a));
                suaVar.b(aqaz.NUDGE_CLASSIFICATION);
                return suaVar;
            case 16:
                return Long.valueOf(this.a.O("add_contact_banner", (ContentValues) obj));
            case 17:
                return Long.valueOf(this.a.P("business_conversations_metadata", (ContentValues) obj));
            case 18:
                return Long.valueOf(this.a.Q("business_conversations_metadata", (ContentValues) obj, 4));
            case 19:
                return Long.valueOf(this.a.P("cms_deleted_messages_buffer", (ContentValues) obj));
            default:
                return Long.valueOf(this.a.Q("contacts", (ContentValues) obj, 5));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
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
