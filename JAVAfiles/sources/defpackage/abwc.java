package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abwc {
    final String d;
    public final DroidGuardResultsRequest e;
    boolean f = false;
    public final abwn g;

    public abwc(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        abwm abwmVar;
        int i = 0;
        this.d = str;
        if (droidGuardResultsRequest == null) {
            this.e = new DroidGuardResultsRequest();
        } else {
            this.e = droidGuardResultsRequest;
        }
        String[] split = aqmt.a.get().a().split(",");
        int length = split.length;
        while (true) {
            if (i < length) {
                if (str.equals(split[i])) {
                    abwmVar = abwm.FINE;
                    break;
                }
                i++;
            } else {
                abwmVar = abwm.COARSE;
                break;
            }
        }
        this.g = new abwn(abwmVar, abvc.a);
    }

    public final void c(abwb abwbVar) {
        synchronized (this) {
            if (this.f) {
                abwbVar.close();
                return;
            }
            this.f = true;
            try {
                a(abwbVar);
            } catch (Exception unused) {
            }
        }
    }

    protected void a(abwb abwbVar) {
    }
}
