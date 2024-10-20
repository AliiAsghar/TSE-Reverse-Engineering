package defpackage;

import android.util.Base64;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahtj extends ahtp {
    public ahtj(ahtn ahtnVar, String str, byte[] bArr) {
        super(ahtnVar, str, bArr, false);
    }

    @Override // defpackage.ahtp
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return Base64.decode((String) obj, 3);
            } catch (IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", ahtn.l(obj, this, "Invalid byte[] value for "));
        return null;
    }
}
