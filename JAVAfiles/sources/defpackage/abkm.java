package defpackage;

import android.content.Context;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkm extends abrc {
    private static final abqt a;
    private static final aaoc b;
    private static final abmt m;

    static {
        abmt abmtVar = new abmt();
        m = abmtVar;
        abkh abkhVar = new abkh();
        a = abkhVar;
        b = new aaoc("Asterism.API", abkhVar, abmtVar);
    }

    public abkm(Context context) {
        super(context, b, abqy.q, abrb.a);
    }

    public final acir a(SetAsterismConsentRequest setAsterismConsentRequest) {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new abkk(setAsterismConsentRequest, 0);
        ajxpVar.d = new Feature[]{abvu.a};
        ajxpVar.b = 11302;
        return g(ajxpVar.b());
    }
}
