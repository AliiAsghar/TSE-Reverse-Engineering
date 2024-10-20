package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.amdy;
import defpackage.anen;
import defpackage.armf;
import defpackage.lga;
import defpackage.mmx;
import defpackage.nfw;
import defpackage.nfx;
import defpackage.prf;
import defpackage.qdm;
import defpackage.qgr;
import defpackage.qyy;
import defpackage.qza;
import defpackage.rio;
import defpackage.xnv;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetOrCreateConversationAction extends Action<ConversationIdType> implements Parcelable {
    public static final Parcelable.Creator<Action<ConversationIdType>> CREATOR = new qyy(15);
    public final xnv a;
    public final armf b;
    private final armf c;
    private final anen d;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rio cK();
    }

    public GetOrCreateConversationAction(xnv xnvVar, armf armfVar, armf armfVar2, anen anenVar, Parcel parcel) {
        super(parcel, amdy.GET_OR_CREATE_CONVERSATION_ACTION);
        this.a = xnvVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = anenVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("GetOrCreateConversationAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.GetOrCreateConversation.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        akul c;
        SelfIdentityId W = lga.W(this.u.l("self_identity"));
        if (albo.ah(lga.Y(W))) {
            c = aktp.ag(Optional.empty());
        } else {
            nfx nfxVar = (nfx) this.c.b();
            W.getClass();
            c = nfxVar.c(W);
        }
        return c.i(new prf(this, 15), this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public GetOrCreateConversationAction(xnv xnvVar, armf<mmx> armfVar, armf<nfx> armfVar2, anen anenVar, Optional<nfw> optional, List<ParticipantsTable.BindData> list, boolean z, String str, qgr qgrVar) {
        super(amdy.GET_OR_CREATE_CONVERSATION_ACTION);
        ArrayList arrayList;
        this.a = xnvVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = anenVar;
        if (list != null) {
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = new ArrayList(list);
            }
            this.u.u("participants_list", arrayList);
        }
        this.u.p("is_rcs_group_conversation", z);
        if (str != null) {
            this.u.v("conversation_name", str);
        }
        if (qgrVar != null) {
            this.u.v("trace_id", qgrVar.c);
        }
        optional.map(new qza(8)).ifPresent(new qdm(this, 12));
    }
}
