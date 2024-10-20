package defpackage;

import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rug implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rug(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                xze xzeVar = rul.a;
                if (bindData.O() != null) {
                    ((alpr) this.a).c(bindData.O());
                    return;
                }
                return;
            case 1:
                ((smt) this.a).ag((vtm) obj);
                return;
            case 2:
                ((vsi) this.a).k((String) obj);
                return;
            case 3:
                ((vsi) this.a).o((String) obj);
                return;
            case 4:
                ((vsi) this.a).j((String) obj);
                return;
            case 5:
                ((vsi) this.a).e((String) obj);
                return;
            case 6:
                String str = (String) obj;
                if (!albo.ah(str)) {
                    ((smt) this.a).ah(str);
                    return;
                }
                return;
            case 7:
                ((xhc) obj).c(this.a);
                return;
            case 8:
                ((xhc) obj).c(this.a);
                return;
            case 9:
                ((xhc) obj).d((String) this.a);
                return;
            case 10:
                alwo alwoVar = rxq.a;
                ((yve) ((armf) obj).b()).c(alog.r(this.a));
                return;
            case 11:
                alwo alwoVar2 = rxq.a;
                ((yvs) ((armf) obj).b()).d(alog.r(this.a));
                return;
            case 12:
                ((OnDeviceDatabaseUpgradeHandler) this.a).m200x77575b3d((agns) obj);
                return;
            case 13:
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    Object obj2 = this.a;
                    ((sff) obj2).a = l.longValue();
                    ((aglz) obj2).fE(0);
                    return;
                }
                return;
            case 14:
                Long l2 = (Long) obj;
                if (l2.longValue() >= 0) {
                    Object obj3 = this.a;
                    ((sga) obj3).a = l2.longValue();
                    ((aglz) obj3).fE(0);
                    return;
                }
                return;
            case 15:
                Long l3 = (Long) obj;
                if (l3.longValue() >= 0) {
                    Object obj4 = this.a;
                    ((sga) obj4).a = l3.longValue();
                    ((aglz) obj4).fE(0);
                    return;
                }
                return;
            case 16:
                Long l4 = (Long) obj;
                if (l4.longValue() >= 0) {
                    Object obj5 = this.a;
                    ((shh) obj5).a = l4.longValue();
                    ((aglz) obj5).fE(0);
                    return;
                }
                return;
            case 17:
                Long l5 = (Long) obj;
                if (l5.longValue() >= 0) {
                    Object obj6 = this.a;
                    ((sjn) obj6).a = l5.longValue();
                    ((aglz) obj6).fE(0);
                    return;
                }
                return;
            case 18:
                Long l6 = (Long) obj;
                if (l6.longValue() >= 0) {
                    Object obj7 = this.a;
                    ((sku) obj7).a = String.valueOf(l6);
                    ((aglz) obj7).fE(0);
                    return;
                }
                return;
            case 19:
                Long l7 = (Long) obj;
                if (l7.longValue() >= 0) {
                    Object obj8 = this.a;
                    ((sku) obj8).a = String.valueOf(l7);
                    ((aglz) obj8).fE(0);
                    return;
                }
                return;
            default:
                Long l8 = (Long) obj;
                if (l8.longValue() >= 0) {
                    Object obj9 = this.a;
                    ((sln) obj9).a = l8.longValue();
                    ((aglz) obj9).fE(0);
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
