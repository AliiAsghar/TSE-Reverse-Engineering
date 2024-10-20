package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.PowerManager;
import android.os.StrictMode;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpl {
    public static final /* synthetic */ int c = 0;
    public final Context a;
    public final ahiy b;
    private final armf d;
    private final armf e;
    private final ahow f;

    static {
        albo.D(new abnl(8));
    }

    public ahpl(armf armfVar, Context context, armf armfVar2, armf armfVar3, ahow ahowVar, ahiy ahiyVar) {
        this.f = ahowVar;
        this.b = ahiyVar;
        armfVar.getClass();
        this.d = new rfj(armfVar3, albo.D(new agud(armfVar, 15)), armfVar, 6);
        this.a = context;
        this.e = armfVar2;
    }

    public static /* synthetic */ algw a() {
        try {
            return algw.i(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e) {
            e = e;
            ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'g', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) failure");
            return alfd.a;
        } catch (NoSuchMethodException e2) {
            ((alvg) ((alvg) ((alvg) ahkh.a.d()).g(e2)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'e', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) not found");
            return alfd.a;
        } catch (Exception e3) {
            e = e3;
            ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'g', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) failure");
            return alfd.a;
        }
    }

    private static Long c(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (!matcher.find()) {
                return null;
            }
            String group = matcher.group(1);
            albo.C(group);
            return Long.valueOf(Long.parseLong(group));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ashz b(int i, int i2, String str, String str2, boolean z) {
        ActivityManager.MemoryInfo memoryInfo;
        File file;
        Object b = this.d.b();
        aiut.b();
        ahpk ahpkVar = null;
        if (((ahoz) b).d) {
            memoryInfo = new ActivityManager.MemoryInfo();
            ahlv.a(this.a).getMemoryInfo(memoryInfo);
        } else {
            memoryInfo = null;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                if (((Boolean) this.e.b()).booleanValue()) {
                    file = new File(a.cb(i2, "/proc/", "/status"));
                } else {
                    file = new File("/proc/self/status");
                }
                Charset defaultCharset = Charset.defaultCharset();
                defaultCharset.getClass();
                String str3 = new String(amct.a(file), defaultCharset);
                if (str3.isEmpty()) {
                    ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "procStatusFromString", 252, "MemoryUsageCapture.java")).q("Null or empty proc status");
                } else {
                    ahpk ahpkVar2 = new ahpk();
                    ahpkVar2.f = c(ahpk.a, str3);
                    ahpkVar2.g = c(ahpk.b, str3);
                    ahpkVar2.h = c(ahpk.c, str3);
                    ahpkVar2.i = c(ahpk.d, str3);
                    ahpkVar2.j = c(ahpk.e, str3);
                    ahpkVar = ahpkVar2;
                }
            } catch (IOException e) {
                ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "getProcStatus", (char) 289, "MemoryUsageCapture.java")).q("Error reading proc status");
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            apaa apaaVar = (apaa) ashz.a.createBuilder();
            aozy createBuilder = ashy.a.createBuilder();
            aozy createBuilder2 = ashw.a.createBuilder();
            if (memoryInfo != null) {
                long j = memoryInfo.availMem >> 10;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ashw ashwVar = (ashw) createBuilder2.b;
                ashwVar.b |= 131072;
                ashwVar.c = (int) j;
                long j2 = memoryInfo.totalMem >> 20;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                int i3 = (int) j2;
                ashw ashwVar2 = (ashw) createBuilder2.b;
                ashwVar2.b |= 262144;
                ashwVar2.d = i3;
            }
            if (ahpkVar != null) {
                Long l = ahpkVar.f;
                if (l != null) {
                    long longValue = l.longValue();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ashw ashwVar3 = (ashw) createBuilder2.b;
                    ashwVar3.b |= 524288;
                    ashwVar3.e = longValue;
                }
                Long l2 = ahpkVar.g;
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ashw ashwVar4 = (ashw) createBuilder2.b;
                    ashwVar4.b |= 1048576;
                    ashwVar4.f = longValue2;
                }
                Long l3 = ahpkVar.h;
                if (l3 != null) {
                    long longValue3 = l3.longValue();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ashw ashwVar5 = (ashw) createBuilder2.b;
                    ashwVar5.b |= 2097152;
                    ashwVar5.g = longValue3;
                }
                Long l4 = ahpkVar.i;
                if (l4 != null) {
                    long longValue4 = l4.longValue();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ashw ashwVar6 = (ashw) createBuilder2.b;
                    ashwVar6.b |= 4194304;
                    ashwVar6.h = longValue4;
                }
                Long l5 = ahpkVar.j;
                if (l5 != null) {
                    long longValue5 = l5.longValue();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ashw ashwVar7 = (ashw) createBuilder2.b;
                    ashwVar7.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                    ashwVar7.i = longValue5;
                }
            }
            ashw ashwVar8 = (ashw) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashy ashyVar = (ashy) createBuilder.b;
            ashwVar8.getClass();
            ashyVar.c = ashwVar8;
            ashyVar.b |= 1;
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            ashz ashzVar = (ashz) apaaVar.b;
            ashy ashyVar2 = (ashy) createBuilder.s();
            ashyVar2.getClass();
            ashzVar.c = ashyVar2;
            ashzVar.b |= 1;
            aozy createBuilder3 = asiz.a.createBuilder();
            asiy b2 = ahow.b(str, z, ahlv.b((Context) this.f.b));
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            asiz asizVar = (asiz) createBuilder3.b;
            b2.getClass();
            asizVar.c = b2;
            asizVar.b |= 1;
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            ashz ashzVar2 = (ashz) apaaVar.b;
            asiz asizVar2 = (asiz) createBuilder3.s();
            asizVar2.getClass();
            ashzVar2.d = asizVar2;
            ashzVar2.b |= 2;
            aozy createBuilder4 = ashx.a.createBuilder();
            Object systemService = this.a.getSystemService("power");
            systemService.getClass();
            boolean isInteractive = ((PowerManager) systemService).isInteractive();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            ashx ashxVar = (ashx) createBuilder4.b;
            ashxVar.b |= 1;
            ashxVar.c = isInteractive;
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            ashz ashzVar3 = (ashz) apaaVar.b;
            ashx ashxVar2 = (ashx) createBuilder4.s();
            ashxVar2.getClass();
            ashzVar3.f = ashxVar2;
            ashzVar3.b |= 8;
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            ashz ashzVar4 = (ashz) apaaVar.b;
            ashzVar4.e = i - 1;
            ashzVar4.b |= 4;
            if (str2 != null) {
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                ashz ashzVar5 = (ashz) apaaVar.b;
                ashzVar5.b |= 16;
                ashzVar5.g = str2;
            }
            return (ashz) apaaVar.s();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
