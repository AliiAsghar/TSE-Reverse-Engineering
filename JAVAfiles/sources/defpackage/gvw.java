package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvw implements gts {
    public static final String a = gsy.b("CommandHandler");
    public final Context b;
    public final Map c = new HashMap();
    public final Object d = new Object();
    public final gui e;

    public gvw(Context context, gui guiVar) {
        this.b = context;
        this.e = guiVar;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent c(Context context, gyg gygVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        f(intent, gygVar);
        return intent;
    }

    public static Intent d(Context context, gyg gygVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        f(intent, gygVar);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gyg e(Intent intent) {
        return new gyg(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void f(Intent intent, gyg gygVar) {
        intent.putExtra("KEY_WORKSPEC_ID", gygVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", gygVar.b);
    }

    @Override // defpackage.gts
    public final void a(gyg gygVar, boolean z) {
        synchronized (this.d) {
            gvy gvyVar = (gvy) this.c.remove(gygVar);
            this.e.c(gygVar);
            if (gvyVar != null) {
                gsy.a().c(gvy.a, "onExecuted " + gvyVar.d + ", " + z);
                gvyVar.a();
                if (z) {
                    gvyVar.h.execute(new gwa(gvyVar.e, d(gvyVar.b, gvyVar.d), gvyVar.c, 0));
                }
                if (gvyVar.j) {
                    gvyVar.h.execute(new gwa(gvyVar.e, b(gvyVar.b), gvyVar.c, 0));
                }
            }
        }
    }
}
