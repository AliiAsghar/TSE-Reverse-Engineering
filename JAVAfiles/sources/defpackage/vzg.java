package defpackage;

import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vzg implements vyz {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/rcs/messaging/SendMessageMethod");
    public final vyy a;
    public final vzh b;
    private final anen d;

    public vzg(vyy vyyVar, vzh vzhVar, anen anenVar) {
        this.a = vyyVar;
        this.b = vzhVar;
        this.d = anenVar;
    }

    @Override // defpackage.vyz
    public final akul a(Intent intent) {
        Predicate mo407negate;
        d.s("com.google.android.apps.messaging.messaging_service_send_message_response".equals(intent.getAction()));
        ((alvg) ((alvg) c.g()).h("com/google/android/apps/messaging/shared/rcs/messaging/SendMessageMethod", "processIntent", 107, "SendMessageMethod.java")).t("SendMessageMethod received intent: %s", intent.getAction());
        Optional ofNullable = Optional.ofNullable(intent.getStringExtra(RcsIntents.EXTRA_TRACE_ID));
        mo407negate = Predicate$CC.isEqual(qgr.a.c).mo407negate();
        String str = (String) ofNullable.filter(mo407negate).orElse(yyb.ba().b);
        intent.putExtra(RcsIntents.EXTRA_TRACE_ID, str);
        aozy createBuilder = qgr.a.createBuilder();
        Optional ofNullable2 = Optional.ofNullable(str);
        createBuilder.getClass();
        ofNullable2.ifPresent(new vwq(createBuilder, 5));
        return this.a.b(intent).h(new tul(this, createBuilder, intent, 19), this.d);
    }

    @Override // defpackage.vyz
    public final String b() {
        return "Bugle.MessagingService.SendMessageResponse.Latency";
    }
}
