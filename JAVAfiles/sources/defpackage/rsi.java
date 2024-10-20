package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.lang.reflect.Method;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rsi implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ rsi(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$and(this, predicate);
            case 1:
                return Predicate$CC.$default$and(this, predicate);
            case 2:
                return Predicate$CC.$default$and(this, predicate);
            case 3:
                return Predicate$CC.$default$and(this, predicate);
            case 4:
                return Predicate$CC.$default$and(this, predicate);
            case 5:
                return Predicate$CC.$default$and(this, predicate);
            case 6:
                return Predicate$CC.$default$and(this, predicate);
            case 7:
                return Predicate$CC.$default$and(this, predicate);
            case 8:
                return Predicate$CC.$default$and(this, predicate);
            case 9:
                return Predicate$CC.$default$and(this, predicate);
            case 10:
                return Predicate$CC.$default$and(this, predicate);
            case 11:
                return Predicate$CC.$default$and(this, predicate);
            case 12:
                return Predicate$CC.$default$and(this, predicate);
            case 13:
                return Predicate$CC.$default$and(this, predicate);
            case 14:
                return Predicate$CC.$default$and(this, predicate);
            case 15:
                return Predicate$CC.$default$and(this, predicate);
            case 16:
                return Predicate$CC.$default$and(this, predicate);
            case 17:
                return Predicate$CC.$default$and(this, predicate);
            case 18:
                return Predicate$CC.$default$and(this, predicate);
            case 19:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo407negate() {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            case 3:
                return Predicate$CC.$default$negate(this);
            case 4:
                return Predicate$CC.$default$negate(this);
            case 5:
                return Predicate$CC.$default$negate(this);
            case 6:
                return Predicate$CC.$default$negate(this);
            case 7:
                return Predicate$CC.$default$negate(this);
            case 8:
                return Predicate$CC.$default$negate(this);
            case 9:
                return Predicate$CC.$default$negate(this);
            case 10:
                return Predicate$CC.$default$negate(this);
            case 11:
                return Predicate$CC.$default$negate(this);
            case 12:
                return Predicate$CC.$default$negate(this);
            case 13:
                return Predicate$CC.$default$negate(this);
            case 14:
                return Predicate$CC.$default$negate(this);
            case 15:
                return Predicate$CC.$default$negate(this);
            case 16:
                return Predicate$CC.$default$negate(this);
            case 17:
                return Predicate$CC.$default$negate(this);
            case 18:
                return Predicate$CC.$default$negate(this);
            case 19:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$or(this, predicate);
            case 1:
                return Predicate$CC.$default$or(this, predicate);
            case 2:
                return Predicate$CC.$default$or(this, predicate);
            case 3:
                return Predicate$CC.$default$or(this, predicate);
            case 4:
                return Predicate$CC.$default$or(this, predicate);
            case 5:
                return Predicate$CC.$default$or(this, predicate);
            case 6:
                return Predicate$CC.$default$or(this, predicate);
            case 7:
                return Predicate$CC.$default$or(this, predicate);
            case 8:
                return Predicate$CC.$default$or(this, predicate);
            case 9:
                return Predicate$CC.$default$or(this, predicate);
            case 10:
                return Predicate$CC.$default$or(this, predicate);
            case 11:
                return Predicate$CC.$default$or(this, predicate);
            case 12:
                return Predicate$CC.$default$or(this, predicate);
            case 13:
                return Predicate$CC.$default$or(this, predicate);
            case 14:
                return Predicate$CC.$default$or(this, predicate);
            case 15:
                return Predicate$CC.$default$or(this, predicate);
            case 16:
                return Predicate$CC.$default$or(this, predicate);
            case 17:
                return Predicate$CC.$default$or(this, predicate);
            case 18:
                return Predicate$CC.$default$or(this, predicate);
            case 19:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean isPresent;
        boolean isPresent2;
        switch (this.a) {
            case 0:
                return ((MessagePartCoreData) obj).bl();
            case 1:
                xze xzeVar = rsr.a;
                if (((MessagePartCoreData) obj).H() == tqj.GOOGLE_PHOTOS_LINK) {
                    return false;
                }
                return true;
            case 2:
                return ((MessagePartCoreData) obj).bi();
            case 3:
                int i = rsj.b;
                if (((MessagePartCoreData) obj).bi()) {
                    return false;
                }
                return true;
            case 4:
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                if (messagePartCoreData.bw() || messagePartCoreData.H() == tqj.GOOGLE_PHOTOS_LINK) {
                    return false;
                }
                return true;
            case 5:
                return ((MessagePartCoreData) obj).be();
            case 6:
                alwo alwoVar = MessageData.a;
                qeh b = qeh.b(((qei) obj).c);
                if (b == null) {
                    b = qeh.UNKNOWN_TYPE;
                }
                return b.equals(qeh.PHONE);
            case 7:
                return ((MessagePartCoreData) obj).bi();
            case 8:
                xze xzeVar2 = rul.a;
                if (((ParticipantsTable.BindData) obj).P() == null) {
                    return false;
                }
                return true;
            case 9:
                String str = (String) obj;
                xze xzeVar3 = rul.a;
                if (str.isEmpty() || d.am(str)) {
                    return false;
                }
                return true;
            case 10:
                return ((MessagePartCoreData) obj).bc();
            case 11:
                return Objects.nonNull((MessagesTable.BindData) obj);
            case 12:
                uuf uufVar = rxn.a;
                if (TextUtils.isEmpty(((msh) obj).o(((Boolean) new mss(1).get()).booleanValue()))) {
                    return false;
                }
                return true;
            case 13:
                isPresent = ((Optional) obj).isPresent();
                return isPresent;
            case 14:
                if (((aqby) obj).d != 1) {
                    return false;
                }
                return true;
            case 15:
                isPresent2 = ((Optional) obj).isPresent();
                return isPresent2;
            case 16:
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$0((sku) obj);
            case 17:
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$1((sku) obj);
            case 18:
                return OnDeviceDatabaseUpgradeHandler.lambda$new$0((agns) obj);
            case 19:
                return OnDeviceDatabaseUpgradeHandler.lambda$getAfterGeneratedUpgradeMethods$0((Method) obj);
            default:
                return OnDeviceDatabaseUpgradeHandler.lambda$getUpgradeMethods$0((Method) obj);
        }
    }
}
