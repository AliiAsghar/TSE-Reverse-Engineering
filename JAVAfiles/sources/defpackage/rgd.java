package defpackage;

import android.os.PersistableBundle;
import com.google.android.apps.messaging.shared.datamodel.action.SyncTelephonyThreadsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rgd implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rgd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                int i = rgf.g;
                ((zey) obj).b((MessageIdType) this.a);
                return;
            case 1:
                this.a.a(obj);
                return;
            case 2:
                this.a.bD((msh) obj);
                return;
            case 3:
                amgn amgnVar = (amgn) obj;
                Object obj2 = this.a;
                aozy aozyVar = (aozy) obj2;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amgu amguVar = (amgu) ((amgl) obj2).b;
                amgu amguVar2 = amgu.a;
                amguVar.ak = amgnVar.d;
                amguVar.c |= Integer.MIN_VALUE;
                return;
            case 4:
                int i2 = rgf.g;
                ((mag) obj).b(this.a);
                return;
            case 5:
                int i3 = rgf.g;
                this.a.aE();
                ((xbz) obj).c();
                return;
            case 6:
                amvm amvmVar = (amvm) obj;
                xyo c = SyncTelephonyThreadsAction.a.c();
                c.H("force full sync");
                c.z("sync reason", amvmVar);
                c.q();
                ((wzp) ((SyncTelephonyThreadsAction) this.a).d.b()).k(amvmVar);
                return;
            case 7:
                ((hgi) this.a).m("persistable_bundle_action_params_serialized", (byte[]) obj);
                return;
            case 8:
                ((PersistableBundle) this.a).putPersistableBundle("persistable_bundle_action_params", (PersistableBundle) obj);
                return;
            case 9:
                ((Action) this.a).v.add((Action) obj);
                return;
            case 10:
                smr smrVar = (smr) obj;
                rjq.a((Action) this.a, smrVar.s(), Optional.ofNullable(smrVar.Z()), tvu.e(smrVar.h()), smrVar.ac());
                return;
            case 11:
                ?? r0 = this.a;
                r0.aE();
                r0.j();
                ((vae) obj).b();
                return;
            case 12:
                ((AtomicBoolean) this.a).set(((msh) obj).z());
                return;
            case 13:
                ((AtomicBoolean) this.a).set(((msh) obj).B());
                return;
            case 14:
                ((AtomicBoolean) this.a).set(((msh) obj).z());
                return;
            case 15:
                ((MessageData) this.a).j.E(((qei) obj).d);
                return;
            case 16:
                ((MessageUsageStatisticsDataImpl) this.a).l = Optional.of((Long) obj);
                return;
            case 17:
                ((MessageUsageStatisticsDataImpl) this.a).m = Optional.of((Boolean) obj);
                return;
            case 18:
                String str = (String) obj;
                if (!albo.ah(str)) {
                    ((smt) this.a).af(str);
                    return;
                }
                return;
            case 19:
                String str2 = (String) obj;
                if (!albo.ah(str2)) {
                    ((smt) this.a).aj(str2);
                    return;
                }
                return;
            default:
                sbo sboVar = (sbo) obj;
                xze xzeVar = rul.a;
                if (sboVar.g() != null) {
                    ((alpr) this.a).c(sboVar.g());
                    return;
                }
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
