package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alob;
import defpackage.alog;
import defpackage.alsx;
import defpackage.amdy;
import defpackage.armf;
import defpackage.rah;
import defpackage.rdk;
import defpackage.rjl;
import defpackage.rxq;
import defpackage.rxs;
import defpackage.ryg;
import defpackage.tap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SanitizeParticipantsAction extends Action<alog<ParticipantsTable.BindData>> implements Parcelable {
    public static final Parcelable.Creator<Action<alog<ParticipantsTable.BindData>>> CREATOR = new rdk(20);
    public final armf a;
    public final armf b;
    public final armf c;
    public final agnq d;
    private final Context e;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rjl dc();
    }

    public SanitizeParticipantsAction(Context context, armf<rxq> armfVar, armf<rxs> armfVar2, armf<Boolean> armfVar3, agnq agnqVar) {
        super(amdy.SANITIZE_PARTICIPANTS_ACTION);
        this.e = context;
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = agnqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("SanitizeParticipantsAction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        alob alobVar = new alob();
        alog e = ((rxq) this.a.b()).e();
        int i = ((alsx) e).c;
        for (int i2 = 0; i2 < i; i2++) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) e.get(i2);
            if (!ryg.l(bindData) && !PhoneNumberUtils.compare(this.e, bindData.O(), bindData.P())) {
                alobVar.h(bindData);
            } else if (!bindData.O().startsWith("+") && bindData.P().startsWith("+")) {
                tap z = bindData.z();
                z.H(bindData.P());
                alobVar.h(z.a());
            }
        }
        alog g = alobVar.g();
        if (!g.isEmpty()) {
            this.d.e("SanitizeParticipantsAction#sanitizeParticipants", new rah(this, g, 4));
        }
        return g;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SanitizeParticipants.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SanitizeParticipantsAction(Context context, armf<rxq> armfVar, armf<rxs> armfVar2, armf<Boolean> armfVar3, agnq agnqVar, Parcel parcel) {
        super(parcel, amdy.SANITIZE_PARTICIPANTS_ACTION);
        this.e = context;
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = agnqVar;
    }
}
