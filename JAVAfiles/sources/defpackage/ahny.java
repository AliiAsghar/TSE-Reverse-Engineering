package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahny implements ahnw {
    private final Context a;
    private final armf b;
    private final armf c;

    public ahny(Context context, ahkq ahkqVar, armf<Boolean> armfVar, armf<Long> armfVar2) {
        this.a = context;
        this.b = armfVar;
        this.c = armfVar2;
    }

    @Override // defpackage.ahnw
    public ListenableFuture<alog<asha>> a(int i, int i2, String str, long j) {
        List historicalProcessExitReasons;
        String processName;
        String processName2;
        int status;
        long timestamp;
        long pss;
        long rss;
        boolean isLowMemoryKillReportSupported;
        int reason;
        int i3;
        int importance;
        long timestamp2;
        InputStream traceInputStream;
        String description;
        long timestamp3;
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
        activityManager.getClass();
        historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.a.getPackageName(), 0, 0);
        alob alobVar = new alob();
        Iterator it = historicalProcessExitReasons.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo m = anf$$ExternalSyntheticApiModelOutline0.m(it.next());
            processName = m.getProcessName();
            if (processName.equals(str)) {
                timestamp3 = m.getTimestamp();
                if (timestamp3 == j) {
                    return ancj.f(albo.bE(alobVar.g()), new ahnx(0), andi.a);
                }
            }
            asgz createBuilder = asha.a.createBuilder();
            processName2 = m.getProcessName();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asha ashaVar = (asha) createBuilder.b;
            processName2.getClass();
            ashaVar.b |= 1;
            ashaVar.c = processName2;
            status = m.getStatus();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asha ashaVar2 = (asha) createBuilder.b;
            ashaVar2.b |= 4;
            ashaVar2.e = status;
            timestamp = m.getTimestamp();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asha ashaVar3 = (asha) createBuilder.b;
            ashaVar3.b |= 16;
            ashaVar3.g = timestamp;
            pss = m.getPss();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asha ashaVar4 = (asha) createBuilder.b;
            ashaVar4.b |= 64;
            ashaVar4.i = pss;
            rss = m.getRss();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asha ashaVar5 = (asha) createBuilder.b;
            ashaVar5.b |= 128;
            ashaVar5.j = rss;
            isLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asha ashaVar6 = (asha) createBuilder.b;
            ashaVar6.b |= 256;
            ashaVar6.k = isLowMemoryKillReportSupported;
            reason = m.getReason();
            int i4 = 6;
            switch (reason) {
                case 0:
                    i3 = 15;
                    break;
                case 1:
                    i3 = 2;
                    break;
                case 2:
                    i3 = 3;
                    break;
                case 3:
                    i3 = 4;
                    break;
                case 4:
                    i3 = 5;
                    break;
                case 5:
                    i3 = 6;
                    break;
                case 6:
                    i3 = 7;
                    break;
                case 7:
                    i3 = 8;
                    break;
                case 8:
                    i3 = 9;
                    break;
                case 9:
                    i3 = 10;
                    break;
                case 10:
                    i3 = 11;
                    break;
                case 11:
                    i3 = 12;
                    break;
                case 12:
                    i3 = 13;
                    break;
                case 13:
                    i3 = 14;
                    break;
                case 14:
                    i3 = 100;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            if (i3 != 0) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                asha ashaVar7 = (asha) createBuilder.b;
                ashaVar7.d = i3 - 1;
                ashaVar7.b |= 2;
            } else {
                i3 = 0;
            }
            importance = m.getImportance();
            if (importance != 100) {
                if (importance != 125) {
                    if (importance != 200) {
                        if (importance != 230) {
                            if (importance != 300) {
                                if (importance != 325) {
                                    if (importance != 350) {
                                        if (importance != 400) {
                                            if (importance != 1000) {
                                                i4 = 0;
                                            } else {
                                                i4 = 10;
                                            }
                                        } else {
                                            i4 = 9;
                                        }
                                    } else {
                                        i4 = 7;
                                    }
                                } else {
                                    i4 = 4;
                                }
                            } else {
                                i4 = 8;
                            }
                        }
                    } else {
                        i4 = 5;
                    }
                } else {
                    i4 = 3;
                }
            } else {
                i4 = 2;
            }
            if (i4 != 0) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                asha ashaVar8 = (asha) createBuilder.b;
                ashaVar8.f = i4 - 1;
                ashaVar8.b |= 8;
            }
            if (i3 == 7 && Build.VERSION.SDK_INT >= 33 && ((Boolean) this.b.b()).booleanValue()) {
                try {
                    traceInputStream = m.getTraceInputStream();
                    try {
                        description = m.getDescription();
                        if (traceInputStream != null && !albo.ah(description)) {
                            aozb A = aozb.A(traceInputStream);
                            if (((Long) this.c.b()).longValue() < 0 || A.d() <= ((Long) this.c.b()).longValue()) {
                                aozy createBuilder2 = asgy.a.createBuilder();
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                apag apagVar = createBuilder2.b;
                                asgy asgyVar = (asgy) apagVar;
                                A.getClass();
                                asgyVar.b |= 2;
                                asgyVar.d = A;
                                if (!apagVar.isMutable()) {
                                    createBuilder2.u();
                                }
                                asgy asgyVar2 = (asgy) createBuilder2.b;
                                description.getClass();
                                asgyVar2.b |= 1;
                                asgyVar2.c = description;
                                asgy asgyVar3 = (asgy) createBuilder2.s();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                asha ashaVar9 = (asha) createBuilder.b;
                                asgyVar3.getClass();
                                ashaVar9.l = asgyVar3;
                                ashaVar9.b |= 512;
                            }
                            traceInputStream.close();
                        }
                    } catch (Throwable th) {
                        if (traceInputStream != null) {
                            try {
                                traceInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetAnrDiagnostic", (char) 187, "ApplicationExitInfoCaptureImpl.java")).q("Failed to read ANR trace");
                }
            }
            m.getPid();
            timestamp2 = m.getTimestamp();
            apds.b(timestamp2);
            alobVar.h(ancj.f(albo.bI(alfd.a), new abdo(this, createBuilder, 12), andi.a));
        }
        return ancj.f(albo.bE(alobVar.g()), new ahnx(0), andi.a);
    }

    public /* synthetic */ asha b(asgz asgzVar, algw algwVar) {
        int i;
        ahko ahkoVar;
        ashu ashuVar;
        if (!algwVar.f()) {
            return asgzVar.s();
        }
        for (ahkn ahknVar : ((ahkp) algwVar.b()).b) {
            int i2 = ahknVar.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        i = 0;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
            } else {
                i = 3;
            }
            if (i != 0) {
                int i3 = i - 1;
                if (i3 != 0) {
                    if (i3 == 1) {
                        if (i2 == 2) {
                            ahkoVar = (ahko) ahknVar.c;
                        } else {
                            ahkoVar = ahko.a;
                        }
                        apct apctVar = ahkoVar.b;
                        if (apctVar == null) {
                            apctVar = apct.a;
                        }
                        long a = apds.a(apctVar);
                        if (!asgzVar.b.isMutable()) {
                            asgzVar.u();
                        }
                        asha ashaVar = (asha) asgzVar.b;
                        asha ashaVar2 = asha.a;
                        ashaVar.b |= 32;
                        ashaVar.h = a;
                    }
                } else if ((((asha) asgzVar.b).b & 1024) != 0) {
                    ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", 148, "ApplicationExitInfoCaptureImpl.java")).q("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                } else {
                    if (i2 == 1) {
                        ashuVar = (ashu) ahknVar.c;
                    } else {
                        ashuVar = ashu.a;
                    }
                    if (!asgzVar.b.isMutable()) {
                        asgzVar.u();
                    }
                    asha ashaVar3 = (asha) asgzVar.b;
                    ashuVar.getClass();
                    ashaVar3.m = ashuVar;
                    ashaVar3.b |= 1024;
                }
            } else {
                throw null;
            }
        }
        return asgzVar.s();
    }
}
