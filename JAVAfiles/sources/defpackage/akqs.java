package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akqs implements akta, aiev {
    private final akte a;

    public akqs(akte akteVar) {
        this.a = akteVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void c(aktq aktqVar, int i) {
        String str;
        String concat;
        if ((aktqVar.b & 32) != 0) {
            akpv akpvVar = aktqVar.i;
            if (akpvVar == null) {
                akpvVar = akpv.a;
            }
            if ((akpvVar.b & 2) != 0) {
                Locale locale = Locale.US;
                String str2 = ((akrg) aktqVar.e.get(0)).c;
                akpt akptVar = akpvVar.d;
                if (akptVar == null) {
                    akptVar = akpt.a;
                }
                Log.println(i, "trace_manager", String.format(locale, "Trace %s timed out before completion. %s spans remaining", str2, Integer.valueOf(akptVar.d)));
            }
            if ((akpvVar.b & 1) != 0) {
                Locale locale2 = Locale.US;
                String str3 = ((akrg) aktqVar.e.get(0)).c;
                akpu akpuVar = akpvVar.c;
                if (akpuVar == null) {
                    akpuVar = akpu.a;
                }
                Log.println(i, "trace_manager", String.format(locale2, "Trace %s tried to log too many spans. %s spans dropped", str3, Integer.valueOf(akpuVar.c)));
            }
        }
        uj ujVar = new uj();
        Iterator<E> it = aktqVar.e.iterator();
        while (it.hasNext()) {
            ujVar.h(r5.d, (akrg) it.next());
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < ujVar.b(); i2++) {
            akrg akrgVar = (akrg) ujVar.e(i2);
            long j = akrgVar.d;
            if ((akrgVar.b & 32) != 0) {
                str = akrgVar.h + " ms";
            } else {
                str = "unfinished";
            }
            while (true) {
                akrg akrgVar2 = (akrg) ujVar.d(j);
                if (akrgVar2 == null) {
                    concat = "Orphaned Root > ".concat(str);
                    break;
                }
                long j2 = akrgVar2.e;
                str = akrgVar2.c + " > " + str;
                if (j2 != -1) {
                    j = j2;
                } else {
                    concat = str;
                    break;
                }
            }
            arrayList.add(String.format(Locale.US, "%06d\t%s", Long.valueOf(akrgVar.f), concat));
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Log.println(i, "trace_manager", (String) arrayList.get(i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aiev
    public final ListenableFuture a() {
        if (this.a.a().isEmpty()) {
            return aneh.a;
        }
        if (Log.isLoggable("trace_manager", 4)) {
            Log.i("trace_manager", "The following traces were active when the app crashed:");
            alur it = ((alog) this.a.a()).iterator();
            int i = 0;
            while (it.hasNext()) {
                akts aktsVar = (akts) it.next();
                Log.println(4, "trace_manager", a.bV(i, "Trace: "));
                c(aktsVar.c, 4);
                i++;
            }
        }
        return aneh.a;
    }

    @Override // defpackage.akta
    public final void b(aktq aktqVar, SparseArray sparseArray) {
        if (Log.isLoggable("trace_manager", 2)) {
            c(aktqVar, 2);
        }
    }
}
