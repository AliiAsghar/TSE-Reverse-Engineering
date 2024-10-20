package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aegg extends aefp {
    public aegg() {
        super(abjr.START_SERVICE, 10L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aefp
    public final aefu a(aefu aefuVar, algw algwVar) {
        abkc abkcVar;
        if (algwVar.f() && ((abke) algwVar.b()).b == 10) {
            abke abkeVar = (abke) algwVar.b();
            if (abkeVar.b == 10) {
                abkcVar = (abkc) abkeVar.c;
            } else {
                abkcVar = abkc.a;
            }
            String packageName = aefuVar.b.getPackageName();
            Intent intent = new Intent().setPackage(packageName);
            if ((abkcVar.b & 1) != 0) {
                intent.setAction(abkcVar.c);
            }
            if ((abkcVar.b & 2) != 0) {
                intent.setComponent(new ComponentName(packageName, abkcVar.d));
            }
            for (int i = 0; i < abkcVar.e.size(); i++) {
                intent.addCategory((String) abkcVar.e.get(i));
            }
            Iterator<E> it = abkcVar.f.iterator();
            while (it.hasNext()) {
                aetn.aW(intent, (abjx) it.next());
            }
            List<ResolveInfo> queryIntentServices = aefuVar.b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                Log.i("START_SERVICE_FIX", "Starting service: intent=".concat(String.valueOf(String.valueOf(intent))));
                if (abkcVar.g) {
                    aefuVar.b.startForegroundService(intent);
                } else {
                    aefuVar.b.startService(intent);
                }
                return aefuVar;
            }
            throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.aefp
    public final String b() {
        return "START_SERVICE_FIX";
    }
}
