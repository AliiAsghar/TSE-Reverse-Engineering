package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtv extends ajtb {
    static final algf a = new ajtc();
    static final algf b = new ajtq();
    static final algf c = new ajtr();
    static final algf d = new ajtk();
    static final algf e = new ajtj();
    private final Context f;

    public ajtv(Context context) {
        this.f = context;
    }

    @Override // defpackage.ajtb
    public final void b(wdr wdrVar, anzh anzhVar) {
        aoyo aoyoVar = wdrVar.c;
        if (aoyoVar == null) {
            aoyoVar = aoyo.a;
        }
        anzhVar.o(aoyoVar.b);
    }

    @Override // defpackage.ajtb
    public final void c(anzh anzhVar) {
        Intent intent = new Intent(this.f, getClass());
        ClipData clipData = aipr.a;
        PendingIntent e2 = aipr.e(this.f, intent);
        e2.getClass();
        anzhVar.k(e2);
    }
}
