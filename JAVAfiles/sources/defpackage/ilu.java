package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ilu implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ ilu(int i) {
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
        Object obj2;
        boolean isPresent2;
        switch (this.a) {
            case 0:
                return ((nfw) obj).o();
            case 1:
                utz utzVar = ihr.a;
                return ((Boolean) obj).booleanValue();
            case 2:
                return d.L((ParticipantsTable.BindData) obj);
            case 3:
                Parcelable.Creator<Action<Uri>> creator = DumpDatabaseAction.CREATOR;
                agmk agmkVar = ((agmh) obj).a;
                if (agmkVar.e || agmkVar.b) {
                    return false;
                }
                return true;
            case 4:
                Parcelable.Creator<Action<Uri>> creator2 = DumpDatabaseAction.CREATOR;
                if (((agmh) obj).d() == null) {
                    return false;
                }
                return true;
            case 5:
                qei qeiVar = (qei) obj;
                xze xzeVar = kpa.a;
                qeh b = qeh.b(qeiVar.c);
                if (b == null) {
                    b = qeh.UNKNOWN_TYPE;
                }
                if (b.equals(qeh.PHONE)) {
                    return true;
                }
                alvw g = kpa.b.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "bindAllIdentitiesForTachygramIfNeeded", 245, "TachyonBindApplicationStateManager.java")).t("Not a phone identity, skipping TG channel binding for id=%s.", qeiVar.d);
                return false;
            case 6:
                return Objects.nonNull((akul) obj);
            case 7:
                isPresent = ((Optional) obj).isPresent();
                return isPresent;
            case 8:
                return lga.P(obj);
            case 9:
                return lga.P(obj);
            case 10:
                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
                if (!advancedFeedbackDataView.f().isPresent() || !advancedFeedbackDataView.g() || !(advancedFeedbackDataView.f().get() instanceof ksr)) {
                    return false;
                }
                return true;
            case 11:
                AdvancedFeedbackDataView advancedFeedbackDataView2 = (AdvancedFeedbackDataView) obj;
                if (!advancedFeedbackDataView2.f().isPresent() || !advancedFeedbackDataView2.g()) {
                    return false;
                }
                return true;
            case 12:
                AdvancedFeedbackDataView advancedFeedbackDataView3 = (AdvancedFeedbackDataView) obj;
                if (!advancedFeedbackDataView3.f().isPresent() || !advancedFeedbackDataView3.g()) {
                    return false;
                }
                return true;
            case 13:
                return ((kuf) obj).a();
            case 14:
                return ((kuf) obj).a();
            case 15:
                obj2 = ((lzk) obj).c.get();
                return ((Boolean) obj2).booleanValue();
            case 16:
                if (((mcc) obj).b != 2) {
                    return false;
                }
                return true;
            case 17:
                if (((mcc) obj).b != 1) {
                    return false;
                }
                return true;
            case 18:
                return d.an((String) obj);
            case 19:
                if (((ncw) obj) != null) {
                    return false;
                }
                return true;
            default:
                isPresent2 = ((Optional) obj).isPresent();
                return isPresent2;
        }
    }
}
