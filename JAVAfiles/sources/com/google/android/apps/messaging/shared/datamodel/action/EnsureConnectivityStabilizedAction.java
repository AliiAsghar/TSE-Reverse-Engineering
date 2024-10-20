package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.mbl;
import defpackage.qyy;
import defpackage.qze;
import defpackage.utz;
import defpackage.uuh;
import defpackage.xyo;
import defpackage.xyt;
import defpackage.xze;
import defpackage.yaq;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EnsureConnectivityStabilizedAction extends ThrottledAction {
    private final xyt c;
    private final mbl d;
    public static final utz a = uuh.f(uuh.b, "ensure_connectivity_stabilized_backoff_duration_in_millis", TimeUnit.SECONDS.toMillis(5));
    private static final xze b = xze.g("Bugle", "EnsureConnectivityStabilizedAction");
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new qyy(7);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qze Ng();
    }

    public EnsureConnectivityStabilizedAction(xyt<yaq> xytVar, mbl mblVar) {
        super(amdy.ENSURE_CONNECTIVITY_STABILIZED_ACTION);
        this.c = xytVar;
        this.d = mblVar;
        this.u.p("key_is_stable", false);
        this.u.r("key_retry_count", -1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("EnsureConnectivityStabilizedAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.EnsureConnectivityStabilized.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 114;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return ((Long) a.e()).longValue();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "EnsureConnectivityStabilizedAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        boolean y = this.u.y("key_is_stable");
        xyo a2 = b.a();
        a2.A("isStable", y);
        a2.q();
        int a3 = this.u.a("key_retry_count");
        if (y) {
            this.d.e("Bugle.Connectivity.Stabilized", a3);
            ((yaq) this.c.a()).h();
        } else {
            this.u.p("key_is_stable", true);
            this.u.r("key_retry_count", a3 + 1);
            F(g());
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void j(ThrottledAction throttledAction) {
        this.u.p("key_is_stable", false);
    }

    public EnsureConnectivityStabilizedAction(xyt xytVar, mbl mblVar, Parcel parcel) {
        super(parcel, amdy.ENSURE_CONNECTIVITY_STABILIZED_ACTION);
        this.c = xytVar;
        this.d = mblVar;
    }
}
