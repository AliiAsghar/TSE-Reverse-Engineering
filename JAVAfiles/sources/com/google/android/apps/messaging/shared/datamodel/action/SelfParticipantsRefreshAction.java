package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.rft;
import defpackage.rfw;
import defpackage.uhc;
import defpackage.yjy;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SelfParticipantsRefreshAction extends ThrottledAction {
    private final armf b;
    private final armf c;
    private static final long a = TimeUnit.MINUTES.toMillis(2);
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new rfw(1);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface SelfParticipantsRefreshActionInjector {
        rft NT();
    }

    public SelfParticipantsRefreshAction(armf armfVar, armf armfVar2) {
        super(amdy.SELF_PARTICIPANTS_REFRESH_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("SelfParticipantsRefreshAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SelfParticipantsRefresh.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 105;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "SelfParticipantsRefreshAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        ((yjy) this.c.b()).m();
        ((uhc) this.b.b()).b();
    }

    public SelfParticipantsRefreshAction(armf armfVar, armf armfVar2, Parcel parcel) {
        super(parcel, amdy.SELF_PARTICIPANTS_REFRESH_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
    }
}
