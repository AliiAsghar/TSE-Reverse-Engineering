package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahow {
    public final Object a;
    public final Object b;

    public ahow(ahiy ahiyVar, Context context) {
        this.a = ahiyVar;
        this.b = context;
    }

    public static final asiy b(String str, boolean z, ahlw ahlwVar) {
        algw algwVar;
        algw algwVar2;
        RandomAccessFile randomAccessFile;
        aozy createBuilder = asiy.a.createBuilder();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        asiy asiyVar = (asiy) apagVar;
        asiyVar.b |= 1;
        asiyVar.c = elapsedCpuTime;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        asiy asiyVar2 = (asiy) createBuilder.b;
        asiyVar2.b |= 2;
        asiyVar2.d = z;
        int activeCount = Thread.activeCount();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        asiy asiyVar3 = (asiy) apagVar2;
        asiyVar3.b |= 4;
        asiyVar3.e = activeCount;
        if (str != null) {
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            asiy asiyVar4 = (asiy) createBuilder.b;
            asiyVar4.b |= 8;
            asiyVar4.f = str;
        }
        final int myPid = Process.myPid();
        String format = String.format(Locale.US, "/proc/%d/oom_score_adj", Integer.valueOf(myPid));
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                randomAccessFile = new RandomAccessFile(format, "r");
            } catch (IOException unused) {
                algwVar = alfd.a;
            }
            try {
                algwVar = algw.h(randomAccessFile.readLine()).a(new ahnx(3));
                randomAccessFile.close();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                if (algwVar.f()) {
                    int intValue = ((Integer) algwVar.b()).intValue();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    asiy asiyVar5 = (asiy) createBuilder.b;
                    asiyVar5.b |= 16;
                    asiyVar5.g = intValue;
                }
                if (!ahlwVar.a) {
                    algwVar2 = alfd.a;
                } else {
                    algwVar2 = (algw) alzz.aJ(ahlwVar.a(), new algy() { // from class: ahlu
                        @Override // defpackage.algy
                        public final boolean a(Object obj) {
                            if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                                return true;
                            }
                            return false;
                        }
                    }).a(new abes(20)).d(alfd.a);
                }
                if (algwVar2.f()) {
                    String flattenToString = ((ComponentName) algwVar2.b()).flattenToString();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    asiy asiyVar6 = (asiy) createBuilder.b;
                    flattenToString.getClass();
                    asiyVar6.b |= 32;
                    asiyVar6.h = flattenToString;
                }
                return (asiy) createBuilder.s();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th3;
        }
    }

    public static arrt d(int i) {
        arrt arrtVar = new arrt((byte[]) null, (byte[]) null);
        arrtVar.a = i;
        return arrtVar;
    }

    public final asiy a() {
        ahlw b = ahlv.b((Context) this.b);
        return b(null, ((ahiy) this.a).n(b), b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final void c(apab apabVar, List list, apbs apbsVar, List list2) {
        ahee aheeVar;
        apae checkIsLite;
        Object c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.intValue();
            armf armfVar = (armf) this.a.get(num);
            if (armfVar == null) {
                aheeVar = null;
            } else {
                aheeVar = (ahee) armfVar.b();
            }
            if (aheeVar != null) {
                apae b = ((aozs) this.b).b((apab) apabVar.getDefaultInstanceForType(), num.intValue());
                if (b != null) {
                    checkIsLite = apag.checkIsLite(b);
                    apabVar.b(checkIsLite);
                    Object l = apabVar.l.l(checkIsLite.d);
                    if (l == null) {
                        c = checkIsLite.b;
                    } else {
                        c = checkIsLite.c(l);
                    }
                    ListenableFuture a = aheeVar.a((apbt) c);
                    if (ahee.b.equals(a)) {
                        continue;
                    } else if (apbsVar != null) {
                        try {
                            ((ahed) albo.bQ(a)).a(apbsVar);
                        } catch (ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        list2.add(a);
                    }
                } else {
                    ahji.az(new IllegalStateException("Extension with tag #" + num + " not found. Ensure " + String.valueOf(apabVar.getClass()) + "is properly extended."));
                }
            }
        }
    }

    public ahow(ahow ahowVar, ahow ahowVar2) {
        this.b = ahowVar;
        this.a = ahowVar2;
    }

    public ahow(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ahow() {
        this.a = new WeakHashMap();
        this.b = new ahla(this);
    }

    public ahow(Context context) {
        this.a = new ahmf();
        this.b = context;
    }

    public ahow(Map map) {
        this.b = aozs.a();
        this.a = map;
    }

    public ahow(armf armfVar, armf armfVar2) {
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }
}
