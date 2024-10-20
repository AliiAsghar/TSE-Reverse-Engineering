package defpackage;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzc extends dzk {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.dzk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dzk
    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle.remove("android.textLines");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dzk
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.a.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(this.a, bundle.getCharSequenceArray("android.textLines"));
        }
    }

    @Override // defpackage.dzk
    public final void f(fqf fqfVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) fqfVar.e).setBigContentTitle(this.h);
        if (this.j) {
            bigContentTitle.setSummaryText(this.i);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bigContentTitle.addLine((CharSequence) arrayList.get(i));
        }
    }
}
