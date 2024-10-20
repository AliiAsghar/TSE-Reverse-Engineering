package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahsh {
    public final String a;
    public final String b;
    public final boolean c;
    private final ahrx d;
    private final ahrz e;
    private final ahse f;

    public ahsh(Context context, algw algwVar) {
        String packageName = context.getPackageName();
        ahrx ahrxVar = ahrx.a;
        ahrz ahrzVar = ahrz.a;
        ahse ahseVar = ahse.a;
        Boolean bool = false;
        bool.getClass();
        boolean booleanValue = ((Boolean) algwVar.d(bool)).booleanValue();
        this.b = "ANDROID_MESSAGING_PRIMES";
        this.d = ahrxVar;
        this.e = ahrzVar;
        this.f = ahseVar;
        this.c = booleanValue;
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
    }

    public final ListenableFuture a() {
        ListenableFuture bI = albo.bI(alfd.a);
        int i = alog.d;
        ListenableFuture bI2 = albo.bI(alsx.a);
        ListenableFuture bI3 = albo.bI(alfd.a);
        return albo.bW(bI, bI2, bI3).a(new imh(this, bI, bI2, bI3, 19), andi.a);
    }
}
