package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtw extends ajtd {
    static final algf a = new ajtk();
    private final Context b;

    public ajtw(Context context) {
        this.b = context;
    }

    @Override // defpackage.ajtd
    public final void b(wdx wdxVar, arbj arbjVar) {
        aoyo aoyoVar = wdxVar.c;
        if (aoyoVar == null) {
            aoyoVar = aoyo.a;
        }
        arbjVar.N(aoyoVar.b);
    }

    @Override // defpackage.ajtd
    public final void c(arbj arbjVar) {
        Intent intent = new Intent(this.b, getClass());
        ClipData clipData = aipr.a;
        PendingIntent e = aipr.e(this.b, intent);
        e.getClass();
        arbjVar.M(e);
    }
}
