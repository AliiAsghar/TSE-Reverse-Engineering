package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvc extends BroadcastReceiver {
    public static volatile boolean b;
    public static final Object a = new Object();
    public static final ConcurrentMap c = new ConcurrentHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        asqc asqcVar;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (!stringExtra.contains("../") && !stringExtra.contains("/..")) {
                ArrayList arrayList = new ArrayList(c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    algx algxVar = (algx) arrayList.get(i);
                    if (((String) algxVar.a).equals(stringExtra) && (asqcVar = (asqc) c.get(algxVar)) != null) {
                        ahlp ahlpVar = ahut.f;
                        ((ahut) asqcVar.a).b();
                    }
                }
                return;
            }
            Log.w("PhUpdateBroadcastRecv", a.bW(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
        }
    }
}
