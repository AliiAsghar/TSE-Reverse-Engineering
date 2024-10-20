package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acfe;
import defpackage.acfg;
import defpackage.acfj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TeleportingSyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TeleportingSyncRequest> CREATOR = new acfj(new acfe(12));
    public final SyncRequest a;

    public TeleportingSyncRequest(SyncRequest syncRequest) {
        this.a = syncRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        acfj.a(this, parcel, new acfg(i, 0));
    }
}
