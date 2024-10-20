package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.mbl;
import defpackage.mlb;
import defpackage.qwq;
import defpackage.qyy;
import defpackage.qzj;
import defpackage.rbk;
import defpackage.uie;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FixupMessageStatusOnStartupAction extends Action<Void> implements Parcelable {
    public final armf b;
    public final uie c;
    public final agnq d;
    public final xnv e;
    public final armf f;
    private final armf g;
    public static final xze a = xze.g("BugleDataModel", "FixupMessageStatusOnStartupAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new qyy(11);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qzj Nj();
    }

    public FixupMessageStatusOnStartupAction(uie uieVar, agnq agnqVar, Parcel parcel, armf<mbl> armfVar, xnv xnvVar, armf<mlb> armfVar2, armf<Long> armfVar3) {
        super(parcel, amdy.FIXUP_MESSAGES_ON_STARTUP_ACTION);
        this.c = uieVar;
        this.d = agnqVar;
        this.g = armfVar;
        this.e = xnvVar;
        this.f = armfVar2;
        this.b = armfVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("FixupMessageStatusOnStartupAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        akrh e = aktp.e("FixupMessageStatusOnStartupAction#executeAction");
        try {
            int intValue = ((Integer) this.d.c("FixupMessageStatusOnStartupAction#executeAction", new qwq(this, 9))).intValue();
            if (intValue > 0) {
                xyo c = a.c();
                c.x("retryRcsMessageCnt", intValue);
                c.q();
                ((mbl) this.g.b()).d("Bugle.DataModel.Action.FixupMessageStatus.RcsMessages.Retry", intValue);
                rbk.d(10, this);
            } else {
                rbk.d(1, this);
            }
            e.close();
            return null;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.FixupMessageStatusOnStartup.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public FixupMessageStatusOnStartupAction(uie uieVar, agnq agnqVar, armf<mbl> armfVar, xnv xnvVar, armf<mlb> armfVar2, armf<Long> armfVar3) {
        super(amdy.FIXUP_MESSAGES_ON_STARTUP_ACTION);
        this.c = uieVar;
        this.d = agnqVar;
        this.g = armfVar;
        this.e = xnvVar;
        this.f = armfVar2;
        this.b = armfVar3;
    }
}
