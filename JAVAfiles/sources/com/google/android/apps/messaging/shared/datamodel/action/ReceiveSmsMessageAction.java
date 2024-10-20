package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.ahka;
import defpackage.ahqq;
import defpackage.ahqr;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.amdy;
import defpackage.andi;
import defpackage.anen;
import defpackage.lqn;
import defpackage.qyv;
import defpackage.rau;
import defpackage.rdk;
import defpackage.rei;
import defpackage.rev;
import defpackage.rfa;
import defpackage.tqr;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReceiveSmsMessageAction extends Action<Void> implements Parcelable {
    public final rfa b;
    private final anen c;
    private final ahqr d;
    private final lqn e;
    public static final xze a = xze.g("BugleDataModel", "ReceiveSmsMessageAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rdk(7);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rei NN();
    }

    public ReceiveSmsMessageAction(ContentValues contentValues, rfa rfaVar, anen anenVar, ahqr ahqrVar, lqn lqnVar) {
        super(amdy.RECEIVE_SMS_MESSAGE_ACTION);
        this.u.t("message_values", contentValues);
        this.b = rfaVar;
        this.c = anenVar;
        this.d = ahqrVar;
        this.e = lqnVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ReceiveSmsMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveSmsMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        ContentValues contentValues = (ContentValues) this.u.h("message_values");
        long e = this.u.e("message_logging_id", 0L);
        Integer asInteger = contentValues.getAsInteger("sub_id");
        if (asInteger == null) {
            asInteger = -1;
        }
        ahqq d = this.d.d();
        String asString = contentValues.getAsString("address");
        return this.e.h(d, this.b.g(asInteger.intValue(), contentValues, tqr.VERIFICATION_NA, e, new rev(albo.ag(asString), albo.ag(asString), false)).h(new rau(this.b, 10), this.c).h(new rau(this, 11), this.c).e(Exception.class, new qyv(13), andi.a).h(new qyv(14), andi.a), new ahka("ReceiveSmsMessageAction#executeActionAsync"));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fA() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReceiveSmsMessageAction(Parcel parcel, rfa rfaVar, anen anenVar, ahqr ahqrVar, lqn lqnVar) {
        super(parcel, amdy.RECEIVE_SMS_MESSAGE_ACTION);
        this.b = rfaVar;
        this.c = anenVar;
        this.d = ahqrVar;
        this.e = lqnVar;
    }
}
