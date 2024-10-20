package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbo implements xbm {
    private final armf a;
    private final /* synthetic */ int b;

    public xbo(armf armfVar, int i, byte[] bArr) {
        this.b = i;
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.xbm
    public final Bundle a(int i) {
        if (this.b != 0) {
            Bundle bundle = new Bundle();
            int cR = yyb.cR();
            if (cR != Integer.MIN_VALUE) {
                bundle.putAll(((wyj) this.a.b()).c(i, cR));
            }
            return bundle;
        }
        return ((wyj) this.a.b()).c(i, R.xml.mms_config);
    }

    public xbo(armf armfVar, int i) {
        this.b = i;
        armfVar.getClass();
        this.a = armfVar;
    }
}
