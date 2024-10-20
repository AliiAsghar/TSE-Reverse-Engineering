package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajso extends ajsp {
    static final algf a = new ajtk();
    static final algf b = new ajts();
    private final Context c;

    public ajso(Context context) {
        this.c = context;
    }

    @Override // defpackage.ajsp
    public final void a(wbg wbgVar, aoad aoadVar) {
        aoyo aoyoVar = wbgVar.c;
        if (aoyoVar == null) {
            aoyoVar = aoyo.a;
        }
        aoadVar.aa(aoyoVar.b);
    }

    @Override // defpackage.ajsp
    public final void b(wbg wbgVar, aoad aoadVar) {
        if (!wbgVar.e.isEmpty()) {
            aoadVar.ab((RcsDestinationId) b.fu((wcz) wbgVar.e.get(0)));
            return;
        }
        throw new IllegalArgumentException("user required in request");
    }

    @Override // defpackage.ajsp
    public final void c(aoad aoadVar) {
        Intent intent = new Intent(this.c, getClass());
        ClipData clipData = aipr.a;
        PendingIntent e = aipr.e(this.c, intent);
        e.getClass();
        aoadVar.Z(e);
    }
}
