package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahtk extends ahtp {
    final /* synthetic */ ahtm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahtk(ahtn ahtnVar, String str, Object obj, ahtm ahtmVar) {
        super(ahtnVar, str, obj, false);
        this.a = ahtmVar;
    }

    @Override // defpackage.ahtp
    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return this.a.a(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", ahtn.l(obj, this, "Invalid byte[] value for "));
        return null;
    }
}
