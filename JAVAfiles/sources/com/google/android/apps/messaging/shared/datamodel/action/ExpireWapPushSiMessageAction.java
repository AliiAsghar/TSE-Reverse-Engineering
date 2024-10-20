package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.qyy;
import defpackage.riu;
import defpackage.usk;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;
import java.text.SimpleDateFormat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ExpireWapPushSiMessageAction extends Action<Void> {
    private final xnv b;
    private final riu c;
    private final usk d;
    public static final xze a = xze.g("BugleDataModel", "ExpireWapPushSiMessageAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new qyy(8);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        riu Pu();
    }

    public ExpireWapPushSiMessageAction(xnv xnvVar, riu riuVar, usk uskVar) {
        super(amdy.EXPIRE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.b = xnvVar;
        this.c = riuVar;
        this.d = uskVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ExpireWapPushSiMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        xze xzeVar = a;
        xzeVar.o("executeAction.");
        long f = this.d.f();
        long j = 0;
        if (f > 0) {
            riu riuVar = this.c;
            xnv xnvVar = this.b;
            Action a2 = riuVar.a();
            long epochMilli = f - xnvVar.f().toEpochMilli();
            if (epochMilli >= 0) {
                j = epochMilli;
            }
            a2.x(111, j);
            if (xzeVar.s(4)) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
                xyo c = xzeVar.c();
                c.H("scheduled next expiring action at");
                c.H(simpleDateFormat.format(Long.valueOf(f)));
                c.q();
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ExpireWapPushSiMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ExpireWapPushSiMessageAction(xnv xnvVar, riu riuVar, usk uskVar, Parcel parcel) {
        super(parcel, amdy.EXPIRE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.b = xnvVar;
        this.c = riuVar;
        this.d = uskVar;
    }
}
