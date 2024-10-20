package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahtl extends ahtp {
    public ahtl(ahtn ahtnVar) {
        super(ahtnVar);
    }

    @Override // defpackage.ahtp
    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return (aplg) apag.parseFrom(aplg.a, Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", ahtn.l(obj, this, "Invalid byte[] value for "));
        return null;
    }
}
