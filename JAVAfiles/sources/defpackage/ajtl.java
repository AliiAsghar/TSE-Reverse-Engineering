package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtl extends ajsr {
    static final algf a = new ajts();
    private final Context b;

    public ajtl(Context context) {
        this.b = context;
    }

    @Override // defpackage.ajsr
    public final void b(wbn wbnVar, asmg asmgVar) {
        wcy wcyVar = wbnVar.d;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        asmgVar.B(wcyVar.c);
    }

    @Override // defpackage.ajsr
    public final void c(wbn wbnVar, asmg asmgVar) {
        aoyo aoyoVar = wbnVar.c;
        if (aoyoVar == null) {
            aoyoVar = aoyo.a;
        }
        asmgVar.E(aoyoVar.b);
    }

    @Override // defpackage.ajsr
    public final void d(asmg asmgVar) {
        Intent intent = new Intent(this.b, getClass());
        ClipData clipData = aipr.a;
        PendingIntent e = aipr.e(this.b, intent);
        e.getClass();
        asmgVar.C(e);
    }
}
