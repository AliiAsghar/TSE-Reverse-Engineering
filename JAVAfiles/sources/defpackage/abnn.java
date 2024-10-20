package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abnn {
    static final ExperimentTokens[] a = new ExperimentTokens[0];
    static final String[] b = new String[0];

    @Deprecated
    public static final aaoc k;
    private static volatile int m = -1;
    private static final abqt n;
    private static final abmt o;
    public final abol c;
    public final String d;
    public final apwa e;
    protected final Context f;
    public final abns g;
    public final String h;
    protected final String i;
    public final abon j;
    public final ahxe l;

    static {
        abmt abmtVar = new abmt();
        o = abmtVar;
        abnk abnkVar = new abnk();
        n = abnkVar;
        k = new aaoc("ClearcutLogger.API", abnkVar, abmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abnn(Context context, String str, String str2, abon abonVar, apwa apwaVar, abns abnsVar, abol abolVar, alhr alhrVar, ahxe ahxeVar) {
        boolean z;
        if (!abonVar.a(aboo.ACCOUNT_NAME)) {
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            d.t(z, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        d(abonVar);
        this.f = context.getApplicationContext();
        this.i = context.getPackageName();
        this.h = str;
        this.d = str2;
        this.j = abonVar;
        this.e = apwaVar == null ? apwa.DEFAULT : apwaVar;
        this.g = abnsVar == null ? new aboy(context, alhrVar) : abnsVar;
        this.c = abolVar == null ? new abpa(context) : abolVar;
        this.l = ahxeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(Context context) {
        if (m == -1) {
            synchronized (abnn.class) {
                if (m == -1) {
                    try {
                        m = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("AbstractClearcutLogger", "This can't happen.", e);
                    }
                }
            }
        }
        return m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String c(Iterable iterable) {
        return new algs(", ").d(iterable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(abon abonVar) {
        if (!abonVar.equals(abon.c) && !abonVar.equals(abon.a) && !abonVar.equals(abon.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int[] f(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    public final boolean e() {
        return this.j.equals(abon.b);
    }
}
