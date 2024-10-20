package defpackage;

import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rzi implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rzi(int i) {
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
        switch (this.a) {
            case 0:
                return CustomUpgradeSteps.lambda$upgradeToVersion53000$0((sxo) obj);
            case 1:
                return CustomUpgradeSteps.lambda$upgradeToVersion42040$4((tar) obj);
            case 2:
                syc sycVar = (syc) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion53000$1(sycVar);
                return sycVar;
            case 3:
                return CustomUpgradeSteps.lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$0((Long) obj);
            case 4:
                return CustomUpgradeSteps.lambda$getAllRcsThreadIdGroupNamePairs$0((smu) obj);
            case 5:
                return CustomUpgradeSteps.lambda$upgradeToVersion29050$0((tar) obj);
            case 6:
                tbd tbdVar = (tbd) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion29050$1(tbdVar);
                return tbdVar;
            case 7:
                tbd tbdVar2 = (tbd) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion2000$0(-1, tbdVar2);
                return tbdVar2;
            case 8:
                tbd tbdVar3 = (tbd) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion2000$1(-2, tbdVar3);
                return tbdVar3;
            case 9:
                return CustomUpgradeSteps.lambda$upgradeToVersion52020$0((tar) obj);
            case 10:
                tbd tbdVar4 = (tbd) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion52020$1(tbdVar4);
                return tbdVar4;
            case 11:
                snh snhVar = (snh) obj;
                CustomUpgradeSteps.lambda$invalidateRcsSessionIdsForOneToOne$0(snhVar);
                return snhVar;
            case 12:
                snh snhVar2 = (snh) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion10025$0(snhVar2);
                return snhVar2;
            case 13:
                return CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$0((tbh) obj);
            case 14:
                return (smh) ((Optional) obj).get();
            case 15:
                tbu tbuVar = (tbu) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInDrafts$1(tbuVar);
                return tbuVar;
            case 16:
                smvVar = ((smu) obj).w;
                return smvVar;
            case 17:
                snh snhVar3 = (snh) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion10015$1(snhVar3);
                return snhVar3;
            case 18:
                return CustomUpgradeSteps.lambda$fixLegacyResourceUrisInConversations$0((smu) obj);
            case 19:
                snh snhVar4 = (snh) obj;
                CustomUpgradeSteps.lambda$fixLegacyResourceUrisInConversations$1(snhVar4);
                return snhVar4;
            default:
                tbd tbdVar5 = (tbd) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion59840$0(tbdVar5);
                return tbdVar5;
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
