package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessTelephonyChangeAction;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationEncryptionStatusAction;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qxi implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ qxi(int i) {
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
        switch (this.a) {
            case 0:
                AtomicBoolean atomicBoolean = qxn.a;
                if (!((String) obj).isEmpty()) {
                    return true;
                }
                return false;
            case 1:
                alwo alwoVar = qxb.a;
                if (((ParticipantsTable.BindData) obj).y() != null) {
                    return true;
                }
                return false;
            case 2:
                return ((msh) obj).e().isPresent();
            case 3:
                alwo alwoVar2 = InsertNewMessageAction.a;
                if (!((String) obj).isEmpty()) {
                    return true;
                }
                return false;
            case 4:
                if (ProcessTelephonyChangeAction.l((Uri) obj) == null) {
                    return true;
                }
                return false;
            case 5:
                return Objects.nonNull((aouy) obj);
            case 6:
                aova aovaVar = (aova) obj;
                xze xzeVar = SetupExpressiveStickersAction.a;
                if (aovaVar != null && aovaVar.h.size() > 0) {
                    return true;
                }
                return false;
            case 7:
                xze xzeVar2 = UpdateConversationEncryptionStatusAction.a;
                if (!((qwm) obj).j()) {
                    return true;
                }
                return false;
            case 8:
                isPresent = ((Optional) obj).isPresent();
                return isPresent;
            case 9:
                if (((Integer) obj).intValue() == -1) {
                    return true;
                }
                return false;
            case 10:
                if (((Integer) obj).intValue() >= 0) {
                    return true;
                }
                return false;
            case 11:
                return ((MessagePartCoreData) obj).ba();
            case 12:
                if (((MessagePartCoreData) obj).U() != null) {
                    return true;
                }
                return false;
            case 13:
                return Objects.nonNull((String) obj);
            case 14:
                return d.L((ParticipantsTable.BindData) obj);
            case 15:
                return ((ParticipantsTable.BindData) obj).A().a();
            case 16:
                if (!ryg.l((ParticipantsTable.BindData) obj)) {
                    return true;
                }
                return false;
            case 17:
                if (!ryg.l((ParticipantsTable.BindData) obj)) {
                    return true;
                }
                return false;
            case 18:
                xze xzeVar3 = rsr.a;
                if (!((MessagePartCoreData) obj).bi()) {
                    return true;
                }
                return false;
            case 19:
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                xze xzeVar4 = rsr.a;
                if (!messagePartCoreData.bi() && messagePartCoreData.bz()) {
                    return true;
                }
                return false;
            default:
                return ((MessagePartCoreData) obj).bz();
        }
    }
}
