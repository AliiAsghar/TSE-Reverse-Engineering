package defpackage;

import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mlo implements IntFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ mlo(int i) {
        this.a = i;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new smv[i];
            case 1:
                return amgg.b(i);
            case 2:
                return new String[i];
            case 3:
                return new String[i];
            case 4:
                return new String[i];
            case 5:
                return CustomUpgradeSteps.lambda$rebuildConversationToParticipantsTable$0(i);
            case 6:
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$3(i);
            case 7:
                utz utzVar = udk.a;
                return new String[i];
            case 8:
                xze xzeVar = ukq.a;
                return new String[i];
            case 9:
                xze xzeVar2 = ukq.a;
                return new String[i];
            case 10:
                uuf uufVar = uot.a;
                return new Long[i];
            case 11:
                uuf uufVar2 = uot.a;
                return new Long[i];
            case 12:
                return new upu[i];
            case 13:
                return new String[i];
            case 14:
                return new gi[i];
            case 15:
                xxw xxwVar = xxw.UNKNOWN;
                return new Integer[i];
            case 16:
                xxw xxwVar2 = xxw.UNKNOWN;
                return new Integer[i];
            case 17:
                xxw xxwVar3 = xxw.UNKNOWN;
                return new Integer[i];
            case 18:
                xxw xxwVar4 = xxw.UNKNOWN;
                return new Integer[i];
            case 19:
                xxw xxwVar5 = xxw.UNKNOWN;
                return new Integer[i];
            default:
                int i2 = yft.a;
                return new String[i];
        }
    }
}
