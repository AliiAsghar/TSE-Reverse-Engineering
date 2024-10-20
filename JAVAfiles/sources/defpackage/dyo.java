package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyo extends dzk {
    private CharSequence a;

    public dyo() {
    }

    @Override // defpackage.dzk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dzk
    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle.remove("android.bigText");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dzk
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.a = bundle.getCharSequence("android.bigText");
    }

    public final void d(CharSequence charSequence) {
        this.a = dyu.c(charSequence);
    }

    @Override // defpackage.dzk
    public final void f(fqf fqfVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) fqfVar.e).setBigContentTitle(this.h).bigText(this.a);
        if (this.j) {
            bigText.setSummaryText(this.i);
        }
    }

    public dyo(dyu dyuVar) {
        h(dyuVar);
    }
}
