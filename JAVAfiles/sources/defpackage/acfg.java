package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdh.MdhFootprintsReadResult;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acfg implements acfi {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ acfg(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.acfi
    public final void a(SafeParcelable safeParcelable, Parcel parcel) {
        if (this.b != 0) {
            MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) safeParcelable;
            List list = mdhFootprintsReadResult.a;
            int e = abhi.e(parcel);
            abhi.r(parcel, 1, list, false);
            abhi.o(parcel, 2, mdhFootprintsReadResult.b, this.a, false);
            abhi.g(parcel, e);
            return;
        }
        SyncRequest syncRequest = ((TeleportingSyncRequest) safeParcelable).a;
        int e2 = abhi.e(parcel);
        abhi.o(parcel, 1, syncRequest, this.a, false);
        abhi.g(parcel, e2);
    }
}
