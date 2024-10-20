package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.albo;
import defpackage.amdy;
import defpackage.rbs;
import defpackage.rfw;
import defpackage.rgk;
import defpackage.rjn;
import defpackage.sna;
import defpackage.snf;
import defpackage.sni;
import defpackage.xze;
import defpackage.yht;
import defpackage.yhu;
import defpackage.ykw;
import defpackage.znj;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SyncNotificationChannelAction extends Action<Void> {
    private final Context b;
    private final ykw c;
    private final yhu d;
    private final znj e;
    private static final xze a = xze.g("Bugle", "SyncNotificationChannelAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(7);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgk NY();
    }

    public SyncNotificationChannelAction(Context context, ykw ykwVar, znj znjVar, yhu yhuVar, Parcel parcel) {
        super(parcel, amdy.SYNC_NOTIFICATION_CHANNEL_ACTION);
        this.b = context;
        this.c = ykwVar;
        this.e = znjVar;
        this.d = yhuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("SyncNotificationChannelAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SyncNotificationChannel.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        a.p("Start syncing notification channels.");
        Context context = this.b;
        boolean q = this.c.q(context.getString(R.string.notifications_enabled_pref_key), context.getResources().getBoolean(R.bool.notifications_enabled_pref_default));
        Context context2 = this.b;
        ykw ykwVar = this.c;
        boolean n = this.e.n();
        String f = ykwVar.f(context2.getString(R.string.notification_sound_pref_key), null);
        if (q) {
            this.d.a(n, f);
            snf e = sni.e();
            e.w("getConversationsNotifications");
            e.h(new rbs(17));
            e.e(new rbs(18));
            sna snaVar = (sna) e.b().n();
            try {
                ArrayList<rjn> arrayList = new ArrayList();
                while (snaVar.moveToNext()) {
                    arrayList.add(new rjn(snaVar.C(), albo.ag(snaVar.W()), snaVar.au(), snaVar.av(), snaVar.aa()));
                }
                snaVar.close();
                for (rjn rjnVar : arrayList) {
                    boolean z = rjnVar.a;
                    boolean z2 = rjnVar.b;
                    String str = rjnVar.c;
                    if (z2 != n || (!TextUtils.isEmpty(str) && !str.equals(f))) {
                        if (z) {
                            this.d.c(((ConversationIdType) rjnVar.d).a(), (String) rjnVar.e, yht.CONVERSATIONS.e, z2, str);
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    snaVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
