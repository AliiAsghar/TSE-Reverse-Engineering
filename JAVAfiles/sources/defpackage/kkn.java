package defpackage;

import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkn implements kkt {
    static final uuf a = uuh.e(uuh.b, "donation_max_conversation_count", Integer.MAX_VALUE);
    static final uuf b = uuh.e(uuh.b, "donation_max_messages_per_conversation", 10);
    static final uuf c = uuh.i(uuh.b, "donation_include_sent_messages", false);
    static final uuf d = uuh.i(uuh.b, "donation_include_personal_messages", false);
    static final uuf e = uuh.i(uuh.b, "donation_include_group_conversations", false);
    public static final utz f = uuh.c(uuh.b, "donation_edit_distance_threshold", 0.1d);
    public static final xze g = xze.g("Bugle", "AllMessagesDonationConversationCollector");
    public final armf h;
    public final kkq i;
    private final anen j;

    public kkn(armf armfVar, anen anenVar, kkq kkqVar) {
        this.h = armfVar;
        this.j = anenVar;
        this.i = kkqVar;
    }

    @Override // defpackage.kkt
    public final akul a(Bundle bundle) {
        kko kkoVar = new kko();
        kkoVar.c(((Boolean) d.e()).booleanValue());
        kkoVar.b();
        kkoVar.d(((Boolean) c.e()).booleanValue());
        kkoVar.e(((Double) f.e()).doubleValue());
        kkoVar.f(lga.aN());
        kkoVar.a = bundle;
        kkp a2 = kkoVar.a();
        aiut.b();
        int intValue = ((Integer) a.e()).intValue();
        snf e2 = sni.e();
        e2.w("+AllMessagesDonationConversationCollector#getConversationIds");
        e2.c(sni.c.a);
        if (!((Boolean) e.e()).booleanValue()) {
            e2.h(new ivk(17));
        }
        e2.q();
        alog f2 = e2.b().f();
        alsx alsxVar = (alsx) f2;
        int i = alsxVar.c;
        g.l("Found " + i + " conversationIds");
        int min = Math.min(intValue, alsxVar.c);
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap(min));
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < alsxVar.c && i2 < intValue; i2++) {
            arrayList.add(aktp.ah(new kkm(this, a2, f2, i2, newSetFromMap, 0), this.j));
        }
        return aktp.ao(arrayList).h(new gvk(newSetFromMap, 13), this.j);
    }
}
