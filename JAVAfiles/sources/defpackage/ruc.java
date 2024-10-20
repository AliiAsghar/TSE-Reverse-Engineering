package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationInteractiveTimestampAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ruc implements alhr {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ruc(Object obj, Object obj2, long j, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [wxs, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        Integer valueOf;
        Integer valueOf2;
        agnw d;
        agnw d2;
        int i = this.d;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                Object obj = this.c;
                MessageIdType messageIdType = (MessageIdType) this.b;
                tqg tqgVar = (tqg) obj;
                if (!uwc.d(messageIdType, tqgVar)) {
                    long j = this.a;
                    String[] strArr = sqp.a;
                    int i2 = spk.a;
                    sqg sqgVar = new sqg();
                    sqgVar.b(messageIdType);
                    sqgVar.d(tqgVar);
                    sqgVar.c(j);
                    sqf a = sqgVar.a();
                    d = agnc.d("$primary");
                    d2 = agnc.d("$primary");
                    long a2 = agnc.a(d2, "flagged_messages", a, new spl(d, 3), new smq(a, 3));
                    Long.valueOf(a2).getClass();
                    if (a2 <= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                return false;
            }
            rtz rtzVar = (rtz) ((UpdateConversationInteractiveTimestampAction) this.b).a.b();
            sng sngVar = new sng();
            sngVar.aj("UpdateConversationInteractiveTimestampAction#executeAction)");
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            valueOf2 = Integer.valueOf(a.bp().c());
            int intValue2 = valueOf2.intValue();
            if (intValue2 < 15000) {
                agnc.t("last_interactive_event_timestamp", intValue2);
            }
            if (intValue >= 15000) {
                sngVar.a.put("last_interactive_event_timestamp", Long.valueOf(this.a));
            }
            return Boolean.valueOf(rtzVar.ah((ConversationIdType) this.c, sngVar));
        }
        return rut.a(((rul) this.b).n(this.c, this.a));
    }
}
