package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpf implements hpk, hqu, hpm {
    public static final boolean a = Log.isLoggable("Engine", 2);
    public final hqv b;
    public final hpd c;
    public final hoo d;
    public final hmk e;
    public final apvo f;
    public final iql g;
    public final arrt h;

    public hpf(hqv hqvVar, hgi hgiVar, hrc hrcVar, hrc hrcVar2, hrc hrcVar3, hrc hrcVar4) {
        this.b = hqvVar;
        hpd hpdVar = new hpd(hgiVar);
        this.c = hpdVar;
        hoo hooVar = new hoo();
        this.d = hooVar;
        synchronized (this) {
            synchronized (hooVar) {
            }
        }
        this.e = new hmk((byte[]) null);
        this.g = new iql(hrcVar, hrcVar2, hrcVar4, this, this);
        this.h = new arrt(hpdVar);
        this.f = new apvo((byte[]) null);
        ((hqt) hqvVar).a = this;
    }

    public static void a(String str, long j, hne hneVar) {
        Log.v("Engine", str + " in " + hyq.a(j) + "ms, key: " + hneVar.toString());
    }

    @Override // defpackage.hpk
    public final synchronized void b(hpj hpjVar, hne hneVar) {
        this.e.a(hneVar, hpjVar);
    }

    @Override // defpackage.hpk
    public final synchronized void c(hpj hpjVar, hne hneVar, hpn hpnVar) {
        if (hpnVar != null) {
            if (hpnVar.a) {
                this.d.b(hneVar, hpnVar);
            }
        }
        this.e.a(hneVar, hpjVar);
    }
}
