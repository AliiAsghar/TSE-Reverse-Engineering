package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkx implements kkt {
    static final uuf a = uuh.e(uuh.b, "donation_recent_collector_max_message_count", 50);
    static final uuf b = uuh.e(uuh.b, "donation_recent_collector_max_conversation_count", Integer.MAX_VALUE);
    static final uuf c = uuh.e(uuh.b, "donation_recent_collector_max_messages_per_conversation", 10);
    static final uuf d = uuh.i(uuh.b, "donation_recent_collector_include_sent_messages", false);
    static final uuf e = uuh.i(uuh.b, "donation_recent_collector_include_long_code_messages", true);
    static final uuf f = uuh.i(uuh.b, "donation_recent_collector_include_group_conversations", false);
    static final utz g = uuh.c(uuh.b, "donation_recent_collector_edit_distance_threshold", 0.0d);
    public static final /* synthetic */ int k = 0;
    public final armf h;
    public final armf i;
    public final armf j;
    private final anen l;

    public kkx(armf armfVar, armf armfVar2, armf armfVar3, anen anenVar) {
        this.h = armfVar;
        this.i = armfVar2;
        this.j = armfVar3;
        this.l = anenVar;
    }

    @Override // defpackage.kkt
    public final akul a(final Bundle bundle) {
        return aktp.ai(new Callable() { // from class: kkw
            /* JADX WARN: Removed duplicated region for block: B:31:0x01bf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0164 A[SYNTHETIC] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 711
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kkw.call():java.lang.Object");
            }
        }, this.l);
    }
}
