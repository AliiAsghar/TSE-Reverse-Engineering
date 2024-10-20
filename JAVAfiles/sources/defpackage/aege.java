package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aege extends aefp {
    public aege() {
        super(abjr.SEND_BROADCAST, 10L);
    }

    @Override // defpackage.aefp
    public final aefu a(aefu aefuVar, algw algwVar) {
        abka abkaVar;
        if (algwVar.f() && ((abke) algwVar.b()).b == 3) {
            abke abkeVar = (abke) algwVar.b();
            if (abkeVar.b == 3) {
                abkaVar = (abka) abkeVar.c;
            } else {
                abkaVar = abka.a;
            }
            String packageName = aefuVar.b.getPackageName();
            Intent intent = new Intent().setPackage(packageName);
            if ((abkaVar.b & 1) != 0) {
                intent.setAction(abkaVar.c);
            }
            if ((abkaVar.b & 2) != 0) {
                intent.setComponent(new ComponentName(packageName, abkaVar.d));
            }
            if ((abkaVar.b & 4) != 0) {
                intent.setData(Uri.parse(abkaVar.e));
            }
            Iterator<E> it = abkaVar.f.iterator();
            while (it.hasNext()) {
                aetn.aW(intent, (abjx) it.next());
            }
            List<ResolveInfo> queryBroadcastReceivers = aefuVar.b.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                Log.d("SEND_BROADCAST_FIX", "Broadcasting: intent=".concat(String.valueOf(String.valueOf(intent))));
                aefuVar.b.sendBroadcast(intent);
                return aefuVar;
            }
            throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.aefp
    public final String b() {
        return "SEND_BROADCAST_FIX";
    }
}
