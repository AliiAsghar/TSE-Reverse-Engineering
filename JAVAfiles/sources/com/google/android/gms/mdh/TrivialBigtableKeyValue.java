package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acfe;
import defpackage.acff;
import defpackage.acfj;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TrivialBigtableKeyValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TrivialBigtableKeyValue> CREATOR = new acfj(new acfe(5));
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public TrivialBigtableKeyValue(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TrivialBigtableKeyValue trivialBigtableKeyValue = (TrivialBigtableKeyValue) obj;
            if (Arrays.equals(this.a, trivialBigtableKeyValue.a) && Arrays.equals(this.b, trivialBigtableKeyValue.b) && Arrays.equals(this.c, trivialBigtableKeyValue.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        acfj.a(this, parcel, new acff(1));
    }
}
