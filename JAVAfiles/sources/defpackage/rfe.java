package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RefreshNotificationIfOtpFoundAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rfe implements rhp {
    private final armf a;
    private final armf b;

    public rfe(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RefreshNotificationIfOtpFoundAction c(Parcel parcel) {
        vjs vjsVar = (vjs) this.a.b();
        vjsVar.getClass();
        parcel.getClass();
        return new RefreshNotificationIfOtpFoundAction(vjsVar, (armf<wpp>) this.b, parcel);
    }
}
