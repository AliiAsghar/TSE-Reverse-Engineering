package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtx extends ajte {
    static final algf a = new ajtk();
    private final Context b;

    public ajtx(Context context) {
        this.b = context;
    }

    @Override // defpackage.ajte
    public final void b(web webVar, aoad aoadVar) {
        aoyo aoyoVar = webVar.c;
        if (aoyoVar == null) {
            aoyoVar = aoyo.a;
        }
        aoadVar.G(aoyoVar.b);
    }

    @Override // defpackage.ajte
    public final void c(aoad aoadVar) {
        Intent intent = new Intent(this.b, getClass());
        ClipData clipData = aipr.a;
        PendingIntent e = aipr.e(this.b, intent);
        e.getClass();
        aoadVar.F(e);
    }
}
