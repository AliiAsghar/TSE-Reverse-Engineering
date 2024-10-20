package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aegd extends aefp {
    public aegd() {
        super(abjr.PROCESS_RESTART, 60L);
    }

    @Override // defpackage.aefp
    public final aefu a(aefu aefuVar, algw algwVar) {
        abjz abjzVar;
        abjz abjzVar2;
        String str;
        algw algwVar2;
        if (algwVar.f() && ((abke) algwVar.b()).b == 5) {
            abke abkeVar = (abke) algwVar.b();
            if (abkeVar.b == 5) {
                abjzVar = (abjz) abkeVar.c;
            } else {
                abjzVar = abjz.a;
            }
            if (abjzVar.b == 1 && ((Boolean) abjzVar.c).booleanValue()) {
                aeft aeftVar = new aeft(aefuVar);
                aeftVar.c();
                return aeftVar.a();
            }
            abke abkeVar2 = (abke) algwVar.b();
            if (abkeVar2.b == 5) {
                abjzVar2 = (abjz) abkeVar2.c;
            } else {
                abjzVar2 = abjz.a;
            }
            if (abjzVar2.b == 2) {
                str = (String) abjzVar2.c;
            } else {
                str = "";
            }
            ActivityManager activityManager = (ActivityManager) aefuVar.b.getSystemService("activity");
            if (activityManager != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
                while (true) {
                    if (it.hasNext()) {
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.processName.equals(str)) {
                            algwVar2 = algw.i(Integer.valueOf(next.pid));
                            break;
                        }
                    } else {
                        algwVar2 = alfd.a;
                        break;
                    }
                }
                if (!algwVar2.f()) {
                    Log.d("ProcessRestartFix", String.format("Process '%s' is not currently running.", str));
                    return aefuVar;
                }
                Integer num = (Integer) algwVar2.b();
                int intValue = num.intValue();
                Log.i("ProcessRestartFix", String.format("Killing '%s' pid=%d", str, num));
                if (intValue == Process.myPid()) {
                    aeft aeftVar2 = new aeft(aefuVar);
                    aeftVar2.h = true;
                    return aeftVar2.a();
                }
                Process.killProcess(intValue);
                aeft aeftVar3 = new aeft(aefuVar);
                aeftVar3.h = false;
                return aeftVar3.a();
            }
            throw new IllegalStateException("ActivityManager is null!");
        }
        throw new IllegalArgumentException("Required ProcessRestartFixConfig missing.");
    }

    @Override // defpackage.aefp
    public final String b() {
        return "ProcessRestartFix";
    }
}
