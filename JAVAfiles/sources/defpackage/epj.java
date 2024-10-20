package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epj {
    public final epn a;
    private final enm b;

    public epj() {
        throw null;
    }

    public static epj a(enm enmVar) {
        return new epj(enmVar, ((eoz) enmVar).aL());
    }

    public static boolean c(int i) {
        if (Log.isLoggable("LoaderManager", i)) {
            return true;
        }
        return false;
    }

    public final void b(int i) {
        if (!this.a.c) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (c(2)) {
                    Log.v("LoaderManager", "destroyLoader in " + this + " of " + i);
                }
                epk a = this.a.a(i);
                if (a != null) {
                    a.m();
                    vm vmVar = this.a.b;
                    int a2 = vp.a(vmVar.b, vmVar.d, i);
                    if (a2 >= 0) {
                        Object[] objArr = vmVar.c;
                        Object obj = objArr[a2];
                        Object obj2 = vn.a;
                        if (obj != obj2) {
                            objArr[a2] = obj2;
                            vmVar.a = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final void d(int i, Bundle bundle, epi epiVar) {
        if (!this.a.c) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                epk a = this.a.a(i);
                if (c(2)) {
                    Log.v("LoaderManager", a.cd(bundle, this, "initLoader in ", ": args="));
                }
                if (a == null) {
                    try {
                        this.a.c = true;
                        epr a2 = epiVar.a(i, bundle);
                        if (a2 != null) {
                            if (a2.getClass().isMemberClass() && !Modifier.isStatic(a2.getClass().getModifiers())) {
                                throw new IllegalArgumentException(a.ch(a2, "Object returned from onCreateLoader must not be a non-static inner member class: "));
                            }
                            epk epkVar = new epk(i, bundle, a2);
                            if (c(3)) {
                                Log.d("LoaderManager", a.ch(epkVar, "  Created new loader "));
                            }
                            this.a.b.f(i, epkVar);
                            this.a.b();
                            epkVar.n(this.b, epiVar);
                            return;
                        }
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                    } catch (Throwable th) {
                        this.a.b();
                        throw th;
                    }
                }
                if (c(3)) {
                    Objects.toString(a);
                    Log.d("LoaderManager", "  Re-using existing loader ".concat(a.toString()));
                }
                a.n(this.b, epiVar);
                return;
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Deprecated
    public final void e(String str, PrintWriter printWriter) {
        epn epnVar = this.a;
        if (epnVar.b.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            for (int i = 0; i < epnVar.b.c(); i++) {
                String concat = str.concat("    ");
                epk epkVar = (epk) epnVar.b.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(epnVar.b.b(i));
                printWriter.print(": ");
                printWriter.println(epkVar.toString());
                printWriter.print(concat);
                printWriter.print("mId=");
                printWriter.print(epkVar.g);
                printWriter.print(" mArgs=");
                printWriter.println(epkVar.h);
                printWriter.print(concat);
                printWriter.print("mLoader=");
                printWriter.println(epkVar.i);
                epkVar.i.h(concat.concat("  "), printWriter);
                if (epkVar.j != null) {
                    printWriter.print(concat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(epkVar.j);
                    epl eplVar = epkVar.j;
                    printWriter.print(concat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(eplVar.c);
                }
                printWriter.print(concat);
                printWriter.print("mData=");
                epr eprVar = epkVar.i;
                printWriter.println(epr.n(epkVar.a()));
                printWriter.print(concat);
                printWriter.print("mStarted=");
                printWriter.println(epkVar.k());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.b.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.b)));
        sb.append("}}");
        return sb.toString();
    }

    public epj(enm enmVar, efu efuVar) {
        this.b = enmVar;
        this.a = (epn) new eoy(efuVar, epn.a).a(epn.class);
    }
}
