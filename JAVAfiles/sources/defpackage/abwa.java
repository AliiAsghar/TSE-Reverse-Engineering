package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.droidguard.internal.IDroidGuardService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwa extends abug {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public abwa(android.content.Context r11, android.os.Looper r12, defpackage.absf r13, defpackage.abtc r14) {
        /*
            r10 = this;
            abrd r0 = new abrd
            r0.<init>(r11)
            achx r1 = defpackage.achx.a
            java.lang.Object r2 = r0.e
            aaoc r3 = defpackage.achv.c
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L1b
            java.lang.Object r1 = r0.e
            aaoc r2 = defpackage.achv.c
            java.lang.Object r1 = r1.get(r2)
            achx r1 = (defpackage.achx) r1
        L1b:
            r8 = r1
            abua r9 = new abua
            java.lang.Object r4 = r0.a
            java.lang.Object r5 = r0.d
            java.lang.Object r1 = r0.b
            java.lang.Object r0 = r0.c
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            r3 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r4 = 25
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r9
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwa.<init>(android.content.Context, android.os.Looper, absf, abtc):void");
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IDroidGuardService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.droidguard.service.START";
    }
}
