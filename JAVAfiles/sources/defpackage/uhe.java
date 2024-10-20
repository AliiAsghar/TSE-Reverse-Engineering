package defpackage;

import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uhe implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uhe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
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
        switch (this.b) {
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
        switch (this.b) {
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

    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Set, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean booleanValue;
        boolean booleanValue2;
        switch (this.b) {
            case 0:
                alvi alviVar = uhg.a;
                return ((Boolean) ((Optional) obj).map(new tyl(this.a, 13)).orElse(false)).booleanValue();
            case 1:
                alvi alviVar2 = uhg.a;
                return ((Boolean) ((Optional) obj).map(new tyl(this.a, 19)).orElse(false)).booleanValue();
            case 2:
                alvi alviVar3 = ujv.a;
                if (!this.a.contains(((ParticipantsTable.BindData) obj).M())) {
                    return true;
                }
                return false;
            case 3:
                if (!((uwc) this.a).k.l((sqf) obj)) {
                    return true;
                }
                return false;
            case 4:
                if (!((alpt) this.a).contains((String) obj)) {
                    return true;
                }
                return false;
            case 5:
                if (!((alpt) this.a).contains(((qei) obj).d)) {
                    return true;
                }
                return false;
            case 6:
                angp angpVar = ((ango) obj).c;
                if (angpVar == null) {
                    angpVar = angp.a;
                }
                if (!((alpt) this.a).contains(angpVar.d)) {
                    return true;
                }
                return false;
            case 7:
                if (!((alpt) this.a).contains(((ResolvedRecipient) obj).z().a)) {
                    return true;
                }
                return false;
            case 8:
                if (!((alpt) this.a).contains(((ResolvedRecipient) obj).f())) {
                    return true;
                }
                return false;
            case 9:
                if (!this.a.contains(obj)) {
                    return true;
                }
                return false;
            case 10:
                return TextUtils.equals(((StatusBarNotification) obj).getNotification().getGroup(), this.a);
            case 11:
                if (((StatusBarNotification) obj).getId() == ((vlm) this.a).i) {
                    return true;
                }
                return false;
            case 12:
                return ((vpu) ((Map.Entry) obj).getKey()).c.equals(this.a);
            case 13:
                booleanValue = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue;
            case 14:
                booleanValue2 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue2;
            case 15:
                return ((vtm) this.a).d((vtl) obj);
            case 16:
                alwo alwoVar = vxx.a;
                return ((String) this.a).equals(((ParticipantsTable.BindData) obj).O());
            case 17:
                Optional optional = (Optional) obj;
                alwo alwoVar2 = vxx.a;
                if (!optional.isPresent()) {
                    return false;
                }
                return ((msh) optional.get()).equals(this.a);
            case 18:
                return ((wff) this.a).k((qei) obj);
            case 19:
                alvi alviVar4 = wjm.b;
                return ((alpt) this.a).contains(((sqf) obj).h());
            default:
                xze xzeVar = wjn.a;
                if (!((alog) this.a).contains(((sqf) obj).h())) {
                    return true;
                }
                return false;
        }
    }
}
