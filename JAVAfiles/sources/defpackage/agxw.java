package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.File;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxw {
    public static volatile agxw a;
    public final Object b;

    public agxw(Object obj) {
        this.b = obj;
    }

    public static void a(Executor executor) {
        if (a == null) {
            synchronized (agxw.class) {
                if (a == null) {
                    a = new agxw(executor);
                }
            }
        }
    }

    public static agxw i(long j) {
        aozy createBuilder = aieg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aieg aiegVar = (aieg) createBuilder.b;
        aiegVar.b = 1;
        aiegVar.c = Long.valueOf(j);
        return new agxw(Optional.of((aieg) createBuilder.s()));
    }

    public static agxw j() {
        return new agxw(Optional.empty());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final String b(String str) {
        String str2 = (String) this.b.get(str);
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, aegu] */
    public final long c() {
        return this.b.f().toEpochMilli();
    }

    public final aigy d() {
        armf armfVar = (armf) ((alor) this.b).get(aigz.MSRP_CLIENT);
        armfVar.getClass();
        return (aigy) armfVar.b();
    }

    public final aigy e() {
        armf armfVar = (armf) ((alor) this.b).get(aigz.MSRP_SERVER);
        armfVar.getClass();
        return (aigy) armfVar.b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0142, code lost:
    
        if (r2.signum() >= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0150, code lost:
    
        if (r2.signum() >= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015e, code lost:
    
        if ((java.lang.Double.doubleToRawLongBits(r6) & 1) == 0) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0069. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x00b1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0193 A[LOOP:0: B:27:0x018f->B:29:0x0193, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019c A[LOOP:1: B:31:0x019a->B:32:0x019c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.alog f(defpackage.alog r19, int r20, defpackage.ales r21) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agxw.f(alog, int, ales):alog");
    }

    public final aieg g() {
        return (aieg) ((Optional) this.b).get();
    }

    public final boolean h() {
        return ((Optional) this.b).isEmpty();
    }

    public final ListenableFuture k(int i) {
        if (i == -1) {
            return albo.bH(new ajzn());
        }
        Object obj = this.b;
        ajwt a2 = ajwt.a(i);
        return ancj.f(((ansy) obj).D(a2), akto.a(new ajyn(a2, 9)), andi.a);
    }

    public final Uri l() {
        asqe asqeVar = (asqe) this.b;
        new File(((aohs) asqeVar.a).A((aknr) asqeVar.b), (String) asqeVar.c).getParentFile().mkdirs();
        asqe asqeVar2 = (asqe) this.b;
        Object obj = asqeVar2.a;
        return ((aohs) obj).B((aknr) asqeVar2.b, (String) asqeVar2.c);
    }

    public final ListenableFuture m(ajwt ajwtVar) {
        if (ajwtVar != null) {
            return ancd.f(ancj.f(((ansy) ((alha) this.b).a).B(ajwtVar), akto.a(new ajwz(8)), andi.a), IllegalArgumentException.class, akto.a(new ajwz(9)), andi.a);
        }
        return albo.bH(new ajzn());
    }

    public final ajwt n() {
        return (ajwt) ((ansy) this.b).a;
    }

    public final String o() {
        return (String) ((ansy) this.b).b;
    }

    public final ListenableFuture p(ajwt ajwtVar) {
        return ancj.f(ancd.f(((ansy) this.b).D(ajwtVar), IllegalArgumentException.class, akto.a(new ajwz(3)), andi.a), akto.a(new ajwz(4)), andi.a);
    }

    public final void q(String str) {
        if (Log.isLoggable("SetupLibrary", 3)) {
            Log.d("SetupLibrary", ((String) this.b).concat(str));
        }
    }

    public final void r(String str) {
        if (Log.isLoggable("SetupLibrary", 4)) {
            Log.i("SetupLibrary", ((String) this.b).concat(str));
        }
    }

    public final void s(String str) {
        Log.e("SetupLibrary", ((String) this.b).concat(str));
    }

    public final void t(String str, Throwable th) {
        Log.e("SetupLibrary", ((String) this.b).concat(str), th);
    }

    public final void u(String str) {
        Log.w("SetupLibrary", ((String) this.b).concat(str));
    }

    public final aizi v(Context context, String str, String str2, String str3) {
        return new aizi(context, str, str2, str3, new asqc(this.b));
    }

    public agxw(SecureRandom secureRandom) {
        this.b = secureRandom;
    }

    @Deprecated
    public agxw(CronetEngine cronetEngine) {
        this.b = cronetEngine;
    }

    public agxw(armf armfVar) {
        armfVar.getClass();
        this.b = armfVar;
    }

    public agxw(Map map, byte[] bArr) {
        this.b = alor.j(map);
    }

    private agxw(Executor executor) {
        this.b = executor == null ? agtj.a().d : executor;
    }

    public agxw(aozy aozyVar) {
        d.t(((anas) aozyVar.b).d != 0, "VeIdentifier must be non-zero");
        this.b = aozyVar;
    }

    public agxw(Class cls) {
        this(cls.getSimpleName());
    }

    public agxw(String str) {
        this.b = a.bW(str, "[", "] ");
    }

    public agxw(algw algwVar) {
        this.b = algwVar;
        Boolean bool = false;
        bool.getClass();
    }
}
