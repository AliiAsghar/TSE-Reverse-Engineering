package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.rfw;
import defpackage.rgr;
import defpackage.rgs;
import defpackage.rhl;
import defpackage.rtz;
import defpackage.rxq;
import defpackage.uhj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateRbmBotParticipantAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(19);
    public final armf a;
    public final agnq b;
    private final armf c;
    private final uhj d;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgs Of();
    }

    public UpdateRbmBotParticipantAction(armf armfVar, armf armfVar2, uhj uhjVar, agnq agnqVar, Parcel parcel) {
        super(parcel, amdy.UPDATE_RBM_BOT_PARTICIPANT_ACTION);
        this.a = armfVar;
        this.c = armfVar2;
        this.d = uhjVar;
        this.b = agnqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("UpdateRbmBotParticipantAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        rhl rhlVar = this.u;
        String l = rhlVar.l("rbmBotId");
        String l2 = rhlVar.l("updatedName");
        ParticipantColor b = ParticipantColor.b(rhlVar.l("updatedColor"));
        ParticipantsTable.BindData c = ((rxq) this.a.b()).c(l);
        c.getClass();
        String M = c.M();
        if (!TextUtils.equals(c.J(), l2) || c.l() != b.c) {
            this.b.d(new rgr(this, c, l2, M, b, 0));
            ((rtz) this.c.b()).P(M);
            this.d.b();
            return null;
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateRbmBotParticipant.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
