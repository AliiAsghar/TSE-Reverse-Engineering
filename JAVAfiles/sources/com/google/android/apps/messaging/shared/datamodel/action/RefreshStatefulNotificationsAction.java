package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.amdy;
import defpackage.mgv;
import defpackage.rdk;
import defpackage.rji;
import defpackage.ruy;
import defpackage.via;
import defpackage.vjh;
import defpackage.ydl;
import defpackage.yep;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RefreshStatefulNotificationsAction extends ThrottledAction {
    private final via b;
    private final mgv c;
    private final yep d;
    private static final alwo a = alwo.o("BugleNotifications");
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new rdk(12);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rji cZ();
    }

    public RefreshStatefulNotificationsAction(via viaVar, mgv mgvVar, yep yepVar, Parcel parcel) {
        super(parcel, amdy.REFRESH_STATEFUL_NOTIFICATIONS_ACTION);
        this.b = viaVar;
        this.c = mgvVar;
        this.d = yepVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("RefreshStatefulNotificationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RefreshNotificationsAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 108;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fA() {
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return this.d.c("bugle_refresh_notification_backoff_duration_in_millis", 100L);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "RefreshStatefulNotificationsAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void j(ThrottledAction throttledAction) {
        H(throttledAction, "silent");
        if (!TextUtils.equals(this.u.l("conv_id"), throttledAction.u.l("conv_id"))) {
            this.u.v("conv_id", null);
        }
        I(throttledAction, "refresh_incoming");
        I(throttledAction, "refresh_failure");
        I(throttledAction, "quick_reply");
        H(throttledAction, "smart_replies");
        I(throttledAction, "is_from_notification_action");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final akul k() {
        akul ag;
        akrh e = aktp.e("RefreshStatefulNotificationsAction.doThrottledWork");
        try {
            boolean y = this.u.y("refresh_incoming");
            boolean y2 = this.u.y("refresh_failure");
            boolean y3 = this.u.y("silent");
            boolean y4 = this.u.y("quick_reply");
            boolean y5 = this.u.y("smart_replies");
            this.u.y("is_from_notification_action");
            ConversationIdType b = ruy.b(this.u.l("conv_id"));
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(vjh.f, Boolean.valueOf(y));
            alwlVar.X(vjh.g, Boolean.valueOf(y2));
            alwlVar.X(vjh.h, Boolean.valueOf(y3));
            alwlVar.X(vjh.i, Boolean.valueOf(y4));
            alwlVar.X(vjh.j, Boolean.valueOf(y5));
            alwlVar.X(ydl.o, b.toString());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/action/RefreshStatefulNotificationsAction", "doThrottledWorkAsync", 147, "RefreshStatefulNotificationsAction.java")).q("Refreshing message notifications");
            if (y) {
                ag = this.b.G();
            } else if (y4) {
                ag = this.b.G();
            } else {
                ag = aktp.ag(null);
            }
            if (y2) {
                this.b.y();
            }
            this.c.f(mgv.o);
            e.close();
            return ag;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RefreshStatefulNotificationsAction(via viaVar, mgv mgvVar, yep yepVar, boolean z, boolean z2, boolean z3, ConversationIdType conversationIdType) {
        super(amdy.REFRESH_STATEFUL_NOTIFICATIONS_ACTION);
        this.b = viaVar;
        this.c = mgvVar;
        this.d = yepVar;
        this.u.p("refresh_incoming", z);
        this.u.p("refresh_failure", z2);
        this.u.p("quick_reply", false);
        this.u.p("silent", z3);
        this.u.p("smart_replies", false);
        this.u.v("conv_id", conversationIdType.toString());
        this.u.p("is_from_notification_action", false);
        this.u.p("is_background", false);
    }
}
