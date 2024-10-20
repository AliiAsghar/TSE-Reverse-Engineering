package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzk {
    public final armf a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public ajzk(Context context, algw algwVar, String str, armf armfVar) {
        int i;
        this.e = context;
        this.a = armfVar;
        this.f = context.getPackageName();
        int i2 = ahlv.b;
        this.g = ahlv.d(context.getPackageName(), ahlv.c());
        if (algwVar.f()) {
        }
        this.c = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            i = 3;
        } else {
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        }
        this.b = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : i;
        this.h = new akub(context);
        this.d = albo.D(new agud(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture a() {
        return ((andr) this.f).b(akto.c(new ajzj(this, this.e.f().toEpochMilli(), 0)), this.g);
    }

    public final ListenableFuture b(long j) {
        tti ttiVar = new tti(this, j, 11);
        return ((aiwu) this.h).b(ttiVar, andi.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void c(ListenableFuture listenableFuture) {
        albo.bR(listenableFuture, akto.h(new xch(this, 4)), this.g);
    }

    public final ListenableFuture d() {
        return ((aiwu) this.h).a();
    }

    public ajzk(armf armfVar, ansy ansyVar, aiwu aiwuVar, aegu aeguVar, armf armfVar2, int i, Executor executor) {
        this.f = new andr();
        this.c = armfVar;
        this.d = ansyVar;
        this.h = aiwuVar;
        this.e = aeguVar;
        this.a = armfVar2;
        this.b = i;
        this.g = executor;
    }
}
