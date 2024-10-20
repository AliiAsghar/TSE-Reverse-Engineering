package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qxp implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qxp(Object obj, int i) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        agna a;
        switch (this.b) {
            case 0:
                String str = (String) obj;
                String str2 = qxq.a;
                if (this.a.contains(str) || str.equals("participant_id")) {
                    return true;
                }
                return false;
            case 1:
                String str3 = qxq.a;
                if (!((alog) this.a).contains((String) obj)) {
                    return true;
                }
                return false;
            case 2:
                return ((SelfIdentityIdImpl) ((nfw) obj).f()).a.equals(((SelfIdentityIdImpl) this.a).a);
            case 3:
                if (!Objects.equals(((ParticipantsTable.BindData) obj).O(), ((qei) this.a).d)) {
                    return true;
                }
                return false;
            case 4:
                if (!((xca) ((rsa) this.a).b.b()).l(((ParticipantsTable.BindData) obj).P())) {
                    return true;
                }
                return false;
            case 5:
                return this.a.bC((Uri) obj);
            case 6:
                xze xzeVar = rsr.a;
                return ((MessagePartCoreData) obj).bD(this.a);
            case 7:
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                Stream stream = Collection.EL.stream(this.a);
                messagePartCoreData.getClass();
                return stream.anyMatch(new qxp(messagePartCoreData, 5));
            case 8:
                return this.a.contains((MessagePartCoreData) obj);
            case 9:
                return this.a.bD((MessagePartCoreData) obj);
            case 10:
                MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) obj;
                Stream stream2 = Collection.EL.stream(this.a);
                messagePartCoreData2.getClass();
                return stream2.anyMatch(new qxp(messagePartCoreData2, 9));
            case 11:
                return d.B(((rti) obj).b, this.a);
            case 12:
                xze xzeVar2 = rul.a;
                return ((String) this.a).equals(((ParticipantsTable.BindData) obj).O());
            case 13:
                return ((apag) this.a).equals((qei) obj);
            case 14:
                xze xzeVar3 = rul.a;
                if (!((qei) this.a).d.equals(((ParticipantsTable.BindData) obj).O())) {
                    return true;
                }
                return false;
            case 15:
                return ((msh) ((Optional) obj).get()).equals(this.a);
            case 16:
                return OnDeviceDatabaseUpgradeHandler.lambda$filterUpgradesForDatabase$0((String) this.a, (Map.Entry) obj);
            case 17:
                xze xzeVar4 = trn.a;
                return ytd.g(((sog) obj).l(), (String) ((Optional) this.a).get());
            case 18:
                ueg uegVar = (ueg) obj;
                alvi alviVar = uci.a;
                if (uegVar == null || uegVar.d() || (a = uegVar.a()) == null) {
                    return false;
                }
                return a.b.equals(this.a);
            case 19:
                utz utzVar = udk.a;
                return ((Pattern) obj).matcher(this.a).matches();
            default:
                return ((String) this.a).contains((String) obj);
        }
    }
}
