package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.d;
import defpackage.rfw;
import defpackage.rgp;
import defpackage.ruc;
import defpackage.ruy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateConversationInteractiveTimestampAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(13);
    public final armf a;
    private final agnq b;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgp Od();
    }

    public UpdateConversationInteractiveTimestampAction(armf armfVar, agnq agnqVar, Parcel parcel) {
        super(parcel, amdy.UPDATE_CONVERSATION_INTERACTIVE_TIMESTAMP_ACTION);
        this.a = armfVar;
        this.b = agnqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("UpdateConversationInteractiveTimestampAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        ConversationIdType b = ruy.b(this.u.l("conversation_id"));
        d.t(!b.b(), "Can't update the last interactive event timestamp without a conversation id");
        this.b.c("UpdateConversationInteractiveTimestampAction#executeAction", new ruc(this, b, this.u.d("interactive_timestamp_ms"), 1));
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateConversationInteractiveTimestamp.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UpdateConversationInteractiveTimestampAction(armf armfVar, agnq agnqVar, ConversationIdType conversationIdType, long j) {
        super(amdy.UPDATE_CONVERSATION_INTERACTIVE_TIMESTAMP_ACTION);
        this.a = armfVar;
        this.b = agnqVar;
        this.u.v("conversation_id", conversationIdType.a());
        this.u.s("interactive_timestamp_ms", j);
    }
}
