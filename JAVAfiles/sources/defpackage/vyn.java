package defpackage;

import android.content.Intent;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyn implements vyz {
    private final armf c;
    private final armf d;
    private final vzh e;
    private final pvw f;
    private static final xze b = xze.g("BugleRcs", "GetMessagesMethod");
    public static final uuf a = uuh.i(uuh.b, "enable_get_single_message_strategy", true);

    public vyn(armf armfVar, armf armfVar2, pvw pvwVar, vzh vzhVar) {
        this.c = armfVar;
        this.d = armfVar2;
        this.f = pvwVar;
        this.e = vzhVar;
    }

    @Override // defpackage.vyz
    public final akul a(Intent intent) {
        qgr qgrVar;
        d.s("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action".equals(intent.getAction()));
        String stringExtra = intent.getStringExtra(RcsIntents.EXTRA_TRACE_ID);
        if (albo.ah(stringExtra)) {
            qgrVar = (qgr) this.f.fu(yyb.ba());
        } else {
            aozy createBuilder = qgr.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qgr qgrVar2 = (qgr) createBuilder.b;
            stringExtra.getClass();
            qgrVar2.b |= 1;
            qgrVar2.c = stringExtra;
            qgrVar = (qgr) createBuilder.s();
        }
        if (((Boolean) ((utz) vzh.e.get()).e()).booleanValue()) {
            this.e.g(qgrVar, rve.a(intent.getStringExtra(RcsIntents.EXTRA_MESSAGE_ID)), 5, 18);
        }
        xyo a2 = b.a();
        a2.H("GetMessagesMethod.processIntent");
        a2.z(GroupManagementRequest.ACTION_TAG, intent.getAction());
        a2.q();
        return c().a(qgrVar);
    }

    @Override // defpackage.vyz
    public final String b() {
        return "Bugle.MessagingService.Intent.IncomingChatMessage.Latency";
    }

    public final vyo c() {
        if (((Boolean) a.e()).booleanValue()) {
            return (vyo) this.d.b();
        }
        return (vyo) this.c.b();
    }
}
