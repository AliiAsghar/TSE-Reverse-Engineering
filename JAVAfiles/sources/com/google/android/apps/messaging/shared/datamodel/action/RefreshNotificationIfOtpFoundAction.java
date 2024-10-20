package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akrh;
import defpackage.akto;
import defpackage.aktp;
import defpackage.albo;
import defpackage.alvi;
import defpackage.amdy;
import defpackage.andi;
import defpackage.anee;
import defpackage.armf;
import defpackage.ijt;
import defpackage.isn;
import defpackage.prf;
import defpackage.qjc;
import defpackage.qzm;
import defpackage.rah;
import defpackage.rdk;
import defpackage.rfe;
import defpackage.rvc;
import defpackage.vjs;
import defpackage.wpp;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yyb;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RefreshNotificationIfOtpFoundAction extends Action<Void> {
    public final armf c;
    private final qzm d;
    public static final xze a = xze.g("BugleAnnotation", "RefreshNotificationIfOtpFoundAction");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/RefreshNotificationIfOtpFoundAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rdk(11);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rfe NP();

        qzm Nl();
    }

    public RefreshNotificationIfOtpFoundAction(vjs vjsVar, armf<wpp> armfVar, Parcel parcel) {
        super(parcel, amdy.REFRESH_NOTIFICATION_IF_OTP_FOUND_ACTION);
        this.c = armfVar;
        this.d = ((a) yyb.aL(a.class)).Nl();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("RefreshNotificationIfOtpFoundAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        ListenableFuture listenableFuture;
        MessageIdType b2 = rvc.b(this.u.l("message_id"));
        if (b2.b()) {
            xyo e = a.e();
            e.H("empty or null message ID.");
            e.c(b2);
            e.q();
            return null;
        }
        Runnable j = akto.j(new rah(this, b2, 2));
        qzm qzmVar = this.d;
        long j2 = b2.a;
        ThrottledAction b3 = qzmVar.b();
        int i = (int) j2;
        int i2 = 3;
        String format = String.format(Locale.US, "%d-%d-%d", 1, Integer.valueOf(i), 3);
        synchronized (GenericWorkerQueueAction.a) {
            listenableFuture = (ListenableFuture) GenericWorkerQueueAction.c.get(format);
            if (listenableFuture == null) {
                listenableFuture = aktp.ai(new ijt(b3, i, i2), ((GenericWorkerQueueAction) b3).m()).i(new prf(b3, 13), ((GenericWorkerQueueAction) b3).m());
                GenericWorkerQueueAction.c.put(format, listenableFuture);
                aktp.aa(listenableFuture, new isn(format, 5), andi.a);
            }
        }
        albo.bR(anee.o(listenableFuture), qjc.a(new isn(j, 6)), andi.a);
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RefreshNotificationIfOtpFoundAction.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RefreshNotificationIfOtpFoundAction(vjs vjsVar, armf<wpp> armfVar, MessageIdType messageIdType) {
        super(amdy.REFRESH_NOTIFICATION_IF_OTP_FOUND_ACTION);
        this.c = armfVar;
        this.u.v("message_id", messageIdType.a());
        this.d = ((a) yyb.aL(a.class)).Nl();
    }
}
