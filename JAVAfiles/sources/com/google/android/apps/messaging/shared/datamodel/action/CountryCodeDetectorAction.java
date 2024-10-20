package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.qyy;
import defpackage.qzb;
import defpackage.yju;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CountryCodeDetectorAction extends ThrottledAction {
    private final yju b;
    private static final long a = TimeUnit.MINUTES.toMillis(2);
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new qyy(3);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface CountryCodeDetectorActionInjector {
        qzb Nf();
    }

    public CountryCodeDetectorAction(yju yjuVar) {
        super(amdy.COUNTRY_CODE_DETECTOR_ACTION);
        this.b = yjuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("CountryCodeDetectorAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.CountryCodeDetector.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 102;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "CountryCodeDetectorAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        this.b.e();
    }

    public CountryCodeDetectorAction(yju yjuVar, Parcel parcel) {
        super(parcel, amdy.COUNTRY_CODE_DETECTOR_ACTION);
        this.b = yjuVar;
    }
}
