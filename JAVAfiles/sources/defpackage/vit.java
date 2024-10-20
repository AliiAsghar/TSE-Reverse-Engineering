package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vit extends vhr {
    public static final /* synthetic */ int n = 0;
    public final via a;
    public final armf b;
    public final mbl c;
    public final viq d;
    public final armf e;
    public Optional h;
    public ConversationIdType i;
    ConversationId j;
    public int k;
    public int l;
    public boolean m;
    private final Context o;
    private final qoq p;

    public vit(Context context, vjs vjsVar, qoq qoqVar, armf armfVar, yhu yhuVar, mbl mblVar, viq viqVar, via viaVar, armf armfVar2) {
        super(vjsVar.o(vhu.RCS_NOT_DELIVERED, "RCS Not Delivered Notification", new vie(yhuVar, 3)));
        this.i = ruy.a;
        this.j = InvalidConversationId.a;
        this.m = false;
        this.o = context;
        this.a = viaVar;
        this.p = qoqVar;
        this.b = armfVar;
        this.c = mblVar;
        this.d = viqVar;
        this.e = armfVar2;
    }

    @Override // defpackage.vhr, defpackage.vhv
    public final Notification b() {
        String quantityString;
        PendingIntent a;
        String quantityString2 = this.o.getResources().getQuantityString(R.plurals.rcs_not_delivered_notification_title, this.l);
        if (this.k == 1) {
            quantityString = this.o.getResources().getQuantityString(R.plurals.rcs_not_delivered_notification_text, this.k, this.h.get());
        } else {
            quantityString = this.o.getResources().getQuantityString(R.plurals.rcs_not_delivered_notification_text, this.k);
        }
        dyu dyuVar = new dyu(this.o, g());
        if (this.k == 1) {
            Intent w = this.p.w(this.o, this.j, null, true, this.m);
            w.putExtra("via_notification", true);
            w.putExtra("via_rcs_not_delivered_notification", true);
            w.setData(upb.l(this.o, this.i));
            a = qop.a(this.o, w, 0);
            a.getClass();
        } else {
            Intent d = this.p.d(this.o);
            d.putExtra("via_notification", true);
            d.putExtra("via_rcs_not_delivered_notification", true);
            a = qop.a(this.o, d, 0);
            a.getClass();
        }
        dyuVar.g = a;
        dyuVar.i(quantityString2);
        dyuVar.h(quantityString);
        dyuVar.v(quantityString2);
        dyo dyoVar = new dyo();
        dyoVar.d(quantityString);
        dyuVar.t(dyoVar);
        dyuVar.q(R.drawable.notification_icon);
        dyuVar.C = this.o.getColor(R.color.primary_brand_non_icon_color);
        dyuVar.g(true);
        dyuVar.p(true);
        return dyuVar.a();
    }

    @Override // defpackage.vhr, defpackage.vhv
    public final String e() {
        return "rcs_not_delivered_notification_tag";
    }
}
