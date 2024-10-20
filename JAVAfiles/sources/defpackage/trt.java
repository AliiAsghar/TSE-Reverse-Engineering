package defpackage;

import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class trt implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ trt(int i) {
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
                return ((trp) obj).a();
            case 1:
                return ((agnr) obj).b();
            case 2:
                qfe b = qfe.b(((qea) obj).e);
                if (b == null) {
                    b = qfe.UNKNOWN_STATE;
                }
                if (b.compareTo(qfe.JOINED) == 0) {
                    return true;
                }
                return false;
            case 3:
                return ((sec) obj).j();
            case 4:
                uco ucoVar = (uco) obj;
                if (ucoVar != null && ucoVar.n()) {
                    return true;
                }
                return false;
            case 5:
                alvi alviVar = uci.a;
                if (!((ueg) obj).d()) {
                    return true;
                }
                return false;
            case 6:
                alvi alviVar2 = uci.a;
                return ((ueg) obj).d();
            case 7:
                alvi alviVar3 = uci.a;
                if (((aiim) obj).c == agnt.NO_TXN_EXCLUDING_SCOPE) {
                    return true;
                }
                return false;
            case 8:
                alvi alviVar4 = ujv.a;
                if (((ParticipantsTable.BindData) obj).M() != null) {
                    return true;
                }
                return false;
            case 9:
                return Objects.nonNull((String) obj);
            case 10:
                Optional optional = (Optional) obj;
                if (optional.isPresent() && ((byte[]) optional.get()).length > 0) {
                    return true;
                }
                return false;
            case 11:
                if (((aqby) obj).b == 2) {
                    return true;
                }
                return false;
            case 12:
                if (!Objects.equals(((upu) obj).d(), "rawdata")) {
                    return true;
                }
                return false;
            case 13:
                return Objects.nonNull((String) obj);
            case 14:
                return Objects.nonNull((String) obj);
            case 15:
                uuf uufVar = uvq.a;
                if (!((akul) ((Pair) obj).second).isDone()) {
                    return true;
                }
                return false;
            case 16:
                uuf uufVar2 = uvq.a;
                return ((akul) obj).isDone();
            case 17:
                uuf uufVar3 = uvq.a;
                if (!((akul) ((Pair) obj).second).isDone()) {
                    return true;
                }
                return false;
            case 18:
                uuf uufVar4 = uvq.a;
                return ((akul) obj).isDone();
            case 19:
                isPresent = ((Optional) obj).isPresent();
                return isPresent;
            default:
                return Objects.nonNull((Map) obj);
        }
    }
}
