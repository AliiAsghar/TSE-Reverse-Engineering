package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdh.TrivialBigtableKeyValue;
import com.google.android.gms.mdh.internal.ByteArraySafeParcelable;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acff implements acfi {
    private final /* synthetic */ int a;

    @Override // defpackage.acfi
    public final void a(SafeParcelable safeParcelable, Parcel parcel) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                List list = ((MdhFootprintListSafeParcelable) safeParcelable).a;
                int e = abhi.e(parcel);
                abhi.r(parcel, 1, list, false);
                abhi.g(parcel, e);
                return;
            }
            TrivialBigtableKeyValue trivialBigtableKeyValue = (TrivialBigtableKeyValue) safeParcelable;
            byte[] bArr = trivialBigtableKeyValue.a;
            int e2 = abhi.e(parcel);
            abhi.j(parcel, 1, bArr, false);
            abhi.j(parcel, 2, trivialBigtableKeyValue.b, false);
            abhi.j(parcel, 3, trivialBigtableKeyValue.c, false);
            abhi.g(parcel, e2);
            return;
        }
        byte[] bArr2 = ((ByteArraySafeParcelable) safeParcelable).a;
        int e3 = abhi.e(parcel);
        abhi.j(parcel, 1, bArr2, false);
        abhi.g(parcel, e3);
    }
}
