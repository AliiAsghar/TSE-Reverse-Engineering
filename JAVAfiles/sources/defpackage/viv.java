package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class viv extends vhr {
    public static final alwo a = alwo.o("BugleNotifications");
    public final via b;
    public final armf c;
    public final mbl d;
    public final viq e;
    public final armf h;
    public Optional i;
    public ConversationIdType j;
    ConversationId k;
    public int l;
    public int m;
    public boolean n;
    private final Context o;
    private final qoq p;
    private final armf q;
    private final armf r;

    public viv(Context context, vjs vjsVar, qoq qoqVar, armf armfVar, mbl mblVar, viq viqVar, via viaVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        super(vjsVar.n(vhu.RCS_STILL_SENDING));
        this.j = ruy.a;
        this.k = InvalidConversationId.a;
        this.o = context;
        this.b = viaVar;
        this.p = qoqVar;
        this.c = armfVar;
        this.d = mblVar;
        this.e = viqVar;
        this.h = armfVar2;
        this.q = armfVar3;
        this.r = armfVar4;
    }

    private final boolean f() {
        if (!((odk) this.q.b()).a() || ((vjs) this.r.b()).j() != wpn.b) {
            return false;
        }
        return true;
    }

    @Override // defpackage.vhr, defpackage.vhv
    public final Notification b() {
        String P;
        String quantityString;
        PendingIntent b;
        if (f()) {
            P = gvf.P(this.o, R.string.rcs_still_sending_notification_title_satellite, "count", Integer.valueOf(this.m));
        } else {
            P = gvf.P(this.o, R.string.rcs_still_sending_notification_title_v2, "count", Integer.valueOf(this.m));
        }
        if (f()) {
            quantityString = this.o.getString(R.string.stuck_in_sending_notification_text_satellite);
        } else if (this.l == 1) {
            quantityString = this.o.getResources().getString(R.string.rcs_still_sending_notification_text_singular, this.i.get());
        } else {
            Resources resources = this.o.getResources();
            int i = this.l;
            quantityString = resources.getQuantityString(R.plurals.rcs_still_sending_notification_text_plural, i, Integer.valueOf(i));
        }
        dyu dyuVar = new dyu(this.o, g());
        if (this.l == 1) {
            b = this.p.m(this.o, this.k, this.n);
        } else {
            b = this.p.b(this.o);
        }
        b.getClass();
        dyuVar.g = b;
        dyuVar.i(P);
        dyuVar.h(quantityString);
        dyuVar.v(P);
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
        return "rcs_still_sending_notification_tag";
    }
}
