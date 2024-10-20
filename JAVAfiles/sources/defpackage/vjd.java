package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjd extends vhr {
    public static final /* synthetic */ int q = 0;
    public final armf a;
    public final armf b;
    public final armf c;
    public final via d;
    public final armf e;
    public ConversationIdType h;
    public ConversationId i;
    public int j;
    public int k;
    public String l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    private final Context r;
    private final yhu s;
    private final armf t;
    private final armf u;
    private final luj v;
    private final wpp w;

    public vjd(Context context, vjs vjsVar, armf armfVar, armf armfVar2, wpp wppVar, armf armfVar3, luj lujVar, yhu yhuVar, armf armfVar4, via viaVar, armf armfVar5, armf armfVar6) {
        super(vjsVar.n(vhu.STUCK_MESSAGES));
        this.h = ruy.a;
        this.i = InvalidConversationId.a;
        this.l = "";
        this.r = context;
        this.a = armfVar;
        this.b = armfVar2;
        this.w = wppVar;
        this.c = armfVar3;
        this.v = lujVar;
        this.s = yhuVar;
        this.t = armfVar4;
        this.d = viaVar;
        this.e = armfVar5;
        this.u = armfVar6;
    }

    private static String f(long j) {
        if (j <= 0) {
            return "zero";
        }
        if (j == 1) {
            return "one";
        }
        return "multiple";
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [qoq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [qoq, java.lang.Object] */
    @Override // defpackage.vhr, defpackage.vhv
    public final Notification b() {
        boolean z;
        String string;
        String id;
        PendingIntent c;
        Resources resources = this.r.getResources();
        int i = this.j;
        int i2 = this.k;
        armf armfVar = this.t;
        String str = this.l;
        if (!((odk) armfVar.b()).a() || ((vjs) this.u.b()).j() != wpn.b) {
            z = false;
        } else {
            z = true;
        }
        String quantityString = resources.getQuantityString(R.plurals.stuck_in_sending_notification_title, i);
        if (z) {
            string = resources.getString(R.string.stuck_in_sending_notification_text_satellite);
        } else if (i2 == 1) {
            str.getClass();
            string = resources.getQuantityString(R.plurals.stuck_in_sending_notification_text_beta, i, Integer.valueOf(i), str);
        } else {
            string = resources.getString(R.string.stuck_in_sending_notification_text_multiple_conversations_beta, String.valueOf(i));
        }
        vjc vjcVar = new vjc(quantityString, string);
        Context context = this.r;
        id = this.s.d().getId();
        dyu dyuVar = new dyu(context, id);
        dyuVar.i(vjcVar.a);
        dyuVar.h(vjcVar.b);
        dyo dyoVar = new dyo();
        dyoVar.d(vjcVar.b);
        dyuVar.t(dyoVar);
        dyuVar.v(vjcVar.a);
        dyuVar.q(R.drawable.notification_icon);
        wpp wppVar = this.w;
        int i3 = this.j;
        ConversationIdType conversationIdType = this.h;
        ConversationId conversationId = this.i;
        boolean z2 = this.p;
        aozy createBuilder = ammf.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ammf ammfVar = (ammf) apagVar;
        ammfVar.c = 3;
        ammfVar.b |= 1;
        amme ammeVar = amme.MESSAGE_STUCK_IN_SENDING;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ammf ammfVar2 = (ammf) createBuilder.b;
        ammfVar2.d = ammeVar.o;
        ammfVar2.b |= 2;
        ammf ammfVar3 = (ammf) createBuilder.s();
        if (!conversationIdType.b()) {
            c = wppVar.b.l((Context) wppVar.c, conversationId, ammfVar3, z2);
        } else {
            c = wppVar.b.c((Context) wppVar.c, ammfVar3);
        }
        String quantityString2 = ((Context) wppVar.c).getResources().getQuantityString(R.plurals.stuck_in_sending_notification_view_message_action_button, i3);
        c.getClass();
        dyj dyjVar = new dyj(R.drawable.ic_warning_light, quantityString2, c);
        dyjVar.d = true;
        dyuVar.e(dyjVar.a());
        dyuVar.e(this.w.M(amme.MESSAGE_STUCK_IN_SENDING));
        dyuVar.l = 2;
        dyuVar.k(this.v.a(amme.MESSAGE_STUCK_IN_SENDING));
        dyuVar.p(true);
        dyuVar.C = this.r.getColor(R.color.primary_brand_non_icon_color);
        dyuVar.g = this.v.d("com.google.android.apps.messaging.shared.reportissue.LAUNCH_FEEDBACK_FROM_NOTIFICATION", 2, amme.MESSAGE_STUCK_IN_SENDING, null, alor.n("stuckSms", f(this.m), "stuckMms", f(this.n), "stuckRcs", f(this.o)));
        return dyuVar.a();
    }

    @Override // defpackage.vhr, defpackage.vhv
    public final String e() {
        return "stuck_messages_notification_tag";
    }
}
