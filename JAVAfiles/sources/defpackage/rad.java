package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rad implements algk {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ rad(InsertNewMessageAction insertNewMessageAction, rat ratVar, amgj amgjVar, int i, boolean z, int i2) {
        this.f = i2;
        this.c = insertNewMessageAction;
        this.d = ratVar;
        this.e = amgjVar;
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        if (this.f != 0) {
            if (((xhv) this.e).c()) {
                final int i = this.a;
                final boolean z = this.b;
                Object obj2 = this.c;
                ((mmw) obj2).m.ifPresent(new Consumer() { // from class: mmr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void q(Object obj3) {
                        xbz xbzVar = (xbz) obj3;
                        alhr alhrVar = mmw.a;
                        if (z) {
                            xbzVar.e();
                        } else if (i > 1) {
                            xbzVar.b();
                        } else {
                            xbzVar.d();
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            return this.d;
        }
        Object obj3 = this.c;
        InsertNewMessageAction insertNewMessageAction = (InsertNewMessageAction) obj3;
        DeviceData deviceData = (DeviceData) insertNewMessageAction.u.h("secondary_device");
        MessageUsageStatisticsData messageUsageStatisticsData = (MessageUsageStatisticsData) insertNewMessageAction.u.h("message_usage_stats_data");
        rhl rhlVar = insertNewMessageAction.u;
        boolean z2 = this.b;
        long d = rhlVar.d("sent_realtime");
        int b = rhlVar.b("sub_id", -1);
        int i2 = this.a;
        Object obj4 = this.e;
        Action action = (Action) obj3;
        ((rat) this.d).f(new rag(action, (MessageCoreData) obj, deviceData, messageUsageStatisticsData, (amgj) obj4, d, b, i2, rhlVar.z("update_draft", true), rhlVar.l("archive"), rhlVar.z("should_refresh_notification", false), rhlVar.y("from_notification"), rhlVar.y("has_rbm_bot_recipient"), false, z2, null));
        return null;
    }

    public /* synthetic */ rad(mmw mmwVar, xhv xhvVar, boolean z, int i, ConversationIdType conversationIdType, int i2) {
        this.f = i2;
        this.c = mmwVar;
        this.e = xhvVar;
        this.b = z;
        this.a = i;
        this.d = conversationIdType;
    }
}
