package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessRcsDeliveryReportAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdd implements rhp {
    public final armf a;

    public rdd(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessRcsDeliveryReportAction c(Parcel parcel) {
        rdc rdcVar = (rdc) this.a.b();
        rdcVar.getClass();
        parcel.getClass();
        return new ProcessRcsDeliveryReportAction(rdcVar, parcel);
    }
}
