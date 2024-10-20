package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtt extends ajsz {
    static final algf a = new ajtk();
    static final algf b = new ajts();
    private final Context c;

    public ajtt(Context context) {
        this.c = context;
    }

    @Override // defpackage.ajsz
    public final void b(wdd wddVar, aoad aoadVar) {
        aoyo aoyoVar = wddVar.c;
        if (aoyoVar == null) {
            aoyoVar = aoyo.a;
        }
        aoadVar.R(aoyoVar.b);
    }

    @Override // defpackage.ajsz
    public final void c(wdd wddVar, aoad aoadVar) {
        if (!wddVar.e.isEmpty()) {
            aoadVar.S((RcsDestinationId) b.fu((wcz) wddVar.e.get(0)));
            return;
        }
        throw new IllegalArgumentException("user required in request");
    }

    @Override // defpackage.ajsz
    public final void d(aoad aoadVar) {
        Intent intent = new Intent(this.c, getClass());
        ClipData clipData = aipr.a;
        PendingIntent e = aipr.e(this.c, intent);
        e.getClass();
        aoadVar.Q(e);
    }
}
