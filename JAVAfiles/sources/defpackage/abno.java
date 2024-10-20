package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abno {
    public final abnn a;
    public boolean b;
    public amnr c;
    public ArrayList d;
    public ArrayList e;
    protected ArrayList f;
    public ArrayList g;
    public Set h;
    public String i;
    public String j;
    public apwa k;
    public final abnv l;
    public final ListenableFuture m;
    public boolean n;
    public final apaa o;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public abno(abnn abnnVar) {
        abnt abntVar;
        abnv abnvVar;
        long seconds;
        apaa apaaVar = (apaa) apvz.a.createBuilder();
        this.o = apaaVar;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.n = false;
        this.a = abnnVar;
        this.j = abnnVar.h;
        this.i = abnnVar.d;
        if (abnnVar.f.getApplicationContext() instanceof abnt) {
            abntVar = (abnt) abnnVar.f.getApplicationContext();
        } else {
            abntVar = (abnt) abnu.a.get();
        }
        if (abntVar != null) {
            abnvVar = abntVar.a();
        } else {
            abnvVar = null;
        }
        if (abnvVar == null) {
            this.l = null;
        } else {
            apwc apwcVar = abnvVar.a;
            if (apwcVar != apwc.CPS_APP_PROCESS_GLOBAL_PROVIDER && apwcVar != apwc.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER) {
                Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + apwcVar.toString() + " is not one of the process-level expected values: " + String.valueOf(apwc.CPS_APP_PROCESS_GLOBAL_PROVIDER) + " or " + String.valueOf(apwc.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER));
                this.l = null;
            } else {
                this.l = abnvVar;
            }
        }
        this.m = abntVar != null ? abntVar.b() : null;
        long currentTimeMillis = System.currentTimeMillis();
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        apvz apvzVar = (apvz) apaaVar.b;
        apvzVar.b |= 1;
        apvzVar.c = currentTimeMillis;
        long j = ((apvz) apaaVar.b).c;
        seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(j));
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        apvz apvzVar2 = (apvz) apaaVar.b;
        apvzVar2.b |= 131072;
        apvzVar2.g = seconds;
        if (agqa.d(abnnVar.f)) {
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            apvz apvzVar3 = (apvz) apaaVar.b;
            apvzVar3.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            apvzVar3.i = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime != 0) {
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            apvz apvzVar4 = (apvz) apaaVar.b;
            apvzVar4.b |= 2;
            apvzVar4.d = elapsedRealtime;
        }
    }

    public abstract abno a();

    public abstract LogEventParcelable b();

    public abstract acir c();

    public final apwa d() {
        apwa apwaVar = this.k;
        if (apwaVar != null) {
            return apwaVar;
        }
        return this.a.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(abnv abnvVar) {
        apwd apwdVar = ((apvz) this.o.b).k;
        if (apwdVar == null) {
            apwdVar = apwd.a;
        }
        apaa apaaVar = (apaa) apwdVar.toBuilder();
        apwc apwcVar = abnvVar.a;
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        apwd apwdVar2 = (apwd) apaaVar.b;
        apwdVar2.d = apwcVar.l;
        apwdVar2.b |= 2;
        apnd apndVar = apwdVar2.c;
        if (apndVar == null) {
            apndVar = apnd.a;
        }
        aozy builder = apndVar.toBuilder();
        apnc apncVar = ((apnd) builder.b).c;
        if (apncVar == null) {
            apncVar = apnc.a;
        }
        aozy builder2 = apncVar.toBuilder();
        if (!builder2.b.isMutable()) {
            builder2.u();
        }
        apnc apncVar2 = (apnc) builder2.b;
        apncVar2.b |= 1;
        apncVar2.c = 127232436;
        if (!builder.b.isMutable()) {
            builder.u();
        }
        apnd apndVar2 = (apnd) builder.b;
        apnc apncVar3 = (apnc) builder2.s();
        apncVar3.getClass();
        apndVar2.c = apncVar3;
        apndVar2.b |= 1;
        apaa apaaVar2 = this.o;
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        apwd apwdVar3 = (apwd) apaaVar.b;
        apnd apndVar3 = (apnd) builder.s();
        apndVar3.getClass();
        apwdVar3.c = apndVar3;
        apwdVar3.b |= 1;
        apwd apwdVar4 = (apwd) apaaVar.s();
        if (!apaaVar2.b.isMutable()) {
            apaaVar2.u();
        }
        apvz apvzVar = (apvz) apaaVar2.b;
        apwdVar4.getClass();
        apvzVar.k = apwdVar4;
        apvzVar.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
    }

    public final void f(int[] iArr) {
        if (!this.a.e()) {
            if (iArr != null && (iArr.length) != 0) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                for (int i : iArr) {
                    this.f.add(Integer.valueOf(i));
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
    }

    public final void g(String str) {
        if (!this.a.e()) {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(str);
            return;
        }
        throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
    }

    public final void h(String str) {
        if (this.a.j.a(aboo.ACCOUNT_NAME)) {
            this.i = str;
            return;
        }
        throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
    }

    public final void i(int i) {
        apaa apaaVar = this.o;
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        apvz apvzVar = (apvz) apaaVar.b;
        apvz apvzVar2 = apvz.a;
        apvzVar.b |= 32;
        apvzVar.e = i;
    }

    public final void j(long j, long j2) {
        long seconds;
        apaa apaaVar = this.o;
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        apvz apvzVar = (apvz) apaaVar.b;
        apvz apvzVar2 = apvz.a;
        apvzVar.b |= 1;
        apvzVar.c = j;
        apaa apaaVar2 = this.o;
        if (!apaaVar2.b.isMutable()) {
            apaaVar2.u();
        }
        apvz apvzVar3 = (apvz) apaaVar2.b;
        apvzVar3.b |= 2;
        apvzVar3.d = j2;
        apaa apaaVar3 = this.o;
        long j3 = ((apvz) apaaVar3.b).c;
        seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(j3));
        if (!apaaVar3.b.isMutable()) {
            apaaVar3.u();
        }
        apvz apvzVar4 = (apvz) apaaVar3.b;
        apvzVar4.b |= 131072;
        apvzVar4.g = seconds;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.i);
        sb.append(", logSourceName: ");
        sb.append(this.j);
        sb.append(", qosTier: ");
        sb.append(d().f);
        sb.append(", veMessage: ");
        sb.append(this.c);
        sb.append(", testCodes: ");
        ArrayList arrayList = this.d;
        String str4 = null;
        if (arrayList != null) {
            str = abnn.c(arrayList);
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", mendelPackages: ");
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null) {
            str2 = abnn.c(arrayList2);
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(", experimentIds: ");
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            str3 = abnn.c(arrayList3);
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(", experimentTokens: ");
        ArrayList arrayList4 = this.g;
        if (arrayList4 != null) {
            str4 = abnn.c(arrayList4);
        }
        sb.append(str4);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
