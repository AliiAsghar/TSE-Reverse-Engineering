package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rzj implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rzj(int i) {
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
        smv smvVar;
        sxp sxpVar;
        sxp sxpVar2;
        String conversationParticipantsDeduplicationKey;
        smh conversationToParticipants;
        String a;
        String a2;
        switch (this.a) {
            case 0:
                syc sycVar = (syc) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion60370$0(sycVar);
                return sycVar;
            case 1:
                tlq tlqVar = (tlq) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion41040$0(tlqVar);
                return tlqVar;
            case 2:
                smvVar = ((smu) obj).b;
                return smvVar;
            case 3:
                snh snhVar = (snh) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion49000$0(snhVar);
                return snhVar;
            case 4:
                soq soqVar = (soq) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59600$0(soqVar);
                return soqVar;
            case 5:
                snh snhVar2 = (snh) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion10020$0(snhVar2);
                return snhVar2;
            case 6:
                sxpVar = ((sxo) obj).b;
                return sxpVar;
            case 7:
                syc sycVar2 = (syc) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion35070$1(sycVar2);
                return sycVar2;
            case 8:
                sxpVar2 = ((sxo) obj).g;
                return sxpVar2;
            case 9:
                syc sycVar3 = (syc) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion58020$1(sycVar3);
                return sycVar3;
            case 10:
                tkq tkqVar = (tkq) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion60270$0(tkqVar);
                return tkqVar;
            case 11:
                conversationParticipantsDeduplicationKey = CustomUpgradeSteps.toConversationParticipantsDeduplicationKey((sku) obj);
                return conversationParticipantsDeduplicationKey;
            case 12:
                conversationToParticipants = CustomUpgradeSteps.toConversationToParticipants((sku) obj);
                return conversationToParticipants;
            case 13:
                a = ((MessageIdType) obj).a();
                return a;
            case 14:
                a2 = ((MessageIdType) obj).a();
                return a2;
            case 15:
                soy soyVar = (soy) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion24050$0(soyVar);
                return soyVar;
            case 16:
                tbu tbuVar = (tbu) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$2(tbuVar);
                return tbuVar;
            case 17:
                tbu tbuVar2 = (tbu) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$3(tbuVar2);
                return tbuVar2;
            case 18:
                tbu tbuVar3 = (tbu) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$4(tbuVar3);
                return tbuVar3;
            case 19:
                tnk tnkVar = (tnk) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion58650$0(tnkVar);
                return tnkVar;
            default:
                snh snhVar3 = (snh) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion60450$0(snhVar3);
                return snhVar3;
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
