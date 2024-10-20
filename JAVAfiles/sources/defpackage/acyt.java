package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.ims.util.common.RcsIntents;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyt extends adtd<Void> {
    public final List a = new CopyOnWriteArrayList();
    private final Context b;
    private boolean c;
    private final acoe d;

    public acyt(Context context, acoe acoeVar) {
        this.b = context;
        this.d = acoeVar;
    }

    public final synchronized void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(RcsIntents.ACTION_CSLIB_FLAGS_UPDATED);
        egl.h(this.b, this, intentFilter);
        this.c = true;
    }

    public final synchronized void b() {
        if (this.c) {
            this.b.unregisterReceiver(this);
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adtd
    public final /* bridge */ /* synthetic */ void c(Context context, Intent intent) {
        if (intent == null) {
            advr.c("Intent is null", new Object[0]);
            return;
        }
        String action = intent.getAction();
        advr.c("Received: %s", action);
        if (RcsIntents.ACTION_CSLIB_FLAGS_UPDATED.equals(action)) {
            aczc.m();
            acpq.J(context);
            this.d.e(context, acpq.E().F());
            advr.c("Notify carrierservices_library phenotype update listeners", new Object[0]);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((acys) it.next()).onCsLibPhenotypeUpdated();
            }
        }
    }
}
