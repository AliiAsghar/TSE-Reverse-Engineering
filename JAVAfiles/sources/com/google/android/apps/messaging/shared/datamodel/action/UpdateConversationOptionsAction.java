package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.agnc;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.rfw;
import defpackage.rip;
import defpackage.rtz;
import defpackage.ruy;
import defpackage.sng;
import defpackage.tqh;
import defpackage.uhj;
import defpackage.ujv;
import defpackage.xyl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateConversationOptionsAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(14);
    private final armf a;
    private final ujv b;
    private final uhj c;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rip cL();
    }

    public UpdateConversationOptionsAction(armf armfVar, ujv ujvVar, uhj uhjVar, Parcel parcel) {
        super(parcel, amdy.UPDATE_CONVERSATION_OPTIONS_ACTION);
        this.a = armfVar;
        this.b = ujvVar;
        this.c = uhjVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("UpdateConversationOptionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        tqh tqhVar;
        ConversationIdType b = ruy.b(this.u.l("conversation_id"));
        rtz rtzVar = (rtz) this.a.b();
        sng sngVar = new sng();
        sngVar.aj("putOptionValues");
        if (this.u.x("enable_notification")) {
            sngVar.a.put("notification_enabled", Boolean.valueOf(this.u.y("enable_notification")));
        }
        if (this.u.x("ringtone_uri")) {
            agnc.r(sngVar.a, "notification_sound_uri", this.u.l("ringtone_uri"));
        }
        if (this.u.x("enable_vibration")) {
            sngVar.a.put("notification_vibration", Boolean.valueOf(this.u.y("enable_vibration")));
        }
        if (this.u.x("send_mode")) {
            sngVar.P(this.u.a("send_mode"));
        }
        if (this.u.x("conv_name")) {
            String l = this.u.l("conv_name");
            sngVar.x(l);
            if (TextUtils.isEmpty(l)) {
                tqhVar = tqh.NAME_IS_AUTOMATIC;
            } else {
                tqhVar = tqh.NAME_IS_MANUAL;
            }
            sngVar.y(tqhVar);
        }
        rtzVar.ah(b, sngVar);
        if (this.u.x("conv_name")) {
            this.b.c(b, this.u.l("conv_name"));
        }
        this.c.d(b);
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateConversationOptions.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UpdateConversationOptionsAction(armf armfVar, ujv ujvVar, uhj uhjVar, ConversationIdType conversationIdType, Boolean bool, String str, Boolean bool2, Integer num) {
        super(amdy.UPDATE_CONVERSATION_OPTIONS_ACTION);
        this.a = armfVar;
        this.b = ujvVar;
        this.c = uhjVar;
        xyl.l(conversationIdType);
        this.u.v("conversation_id", conversationIdType.a());
        if (bool != null) {
            this.u.p("enable_notification", bool.booleanValue());
        }
        if (str != null) {
            this.u.v("ringtone_uri", str);
        }
        if (bool2 != null) {
            this.u.p("enable_vibration", bool2.booleanValue());
        }
        if (num != null) {
            this.u.r("send_mode", num.intValue());
        }
    }
}
