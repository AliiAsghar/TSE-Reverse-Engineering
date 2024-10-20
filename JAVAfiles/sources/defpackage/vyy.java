package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver;
import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyy {
    public static final xze a = xze.g("BugleRcs", "MessagingServiceGenericMethod");
    public final vyx b;
    private final Context c;
    private final anen d;
    private final waw e;

    public vyy(Context context, anen anenVar, vyx vyxVar, waw wawVar) {
        this.c = context;
        this.d = anenVar;
        this.b = vyxVar;
        this.e = wawVar;
    }

    public final akul a(Object obj) {
        Intent a2 = this.b.a(obj);
        a2.setClass(this.c, MessagingServiceResponseReceiver.class);
        PendingIntent c = aipr.c(this.c, Objects.hashCode(obj), a2, yhy.a | 1073741824, 1);
        c.getClass();
        vyx vyxVar = this.b;
        Object k = vyxVar.k(obj, c);
        aozb f = vyxVar.f(obj);
        byte[] bArr = null;
        return vyxVar.d(k).h(new vqv(this, f, 7, null), this.d).e(ajpt.class, new tul(this, obj, f, 15, bArr), this.d).e(TimeoutException.class, new tul(this, obj, f, 16, bArr), this.d);
    }

    public final akul b(Intent intent) {
        akul i;
        vyx vyxVar = this.b;
        qeg b = vyxVar.b(intent);
        Object j = vyxVar.j(b, intent, vyxVar.e(intent));
        Optional g = this.b.g(intent);
        if (g.isEmpty()) {
            i = this.b.c(j);
        } else {
            i = this.e.a(b, (String) g.get()).h(new vuu(this, 19), this.d).i(new vfj(this, j, 15, null), this.d);
        }
        return i.h(new vuu(this, 18), this.d);
    }
}
