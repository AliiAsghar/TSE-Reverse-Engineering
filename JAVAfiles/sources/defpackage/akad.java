package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akad implements akoa {
    public static final alvi a = alvi.m("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet");
    public static final long b = TimeUnit.DAYS.toMillis(30);
    public final aegu c;
    public final ajzk d;
    public final ajzg e;
    public final anen f;
    public final anen g;
    public final ansy h;
    public final ansy i;
    private final andr j;

    public akad(aegu aeguVar, ansy ansyVar, ajzk ajzkVar, ajzg ajzgVar, anen anenVar, anen anenVar2, ansy ansyVar2, andr andrVar) {
        this.c = aeguVar;
        this.i = ansyVar;
        this.d = ajzkVar;
        this.e = ajzgVar;
        this.f = anenVar;
        this.g = anenVar2;
        this.h = ansyVar2;
        this.j = andrVar;
    }

    @Override // defpackage.akoa
    public final ListenableFuture a() {
        return ancd.f(albo.bN(akto.c(new aarj(this, 19)), this.f), Throwable.class, akto.a(new ajwz(16)), this.f);
    }

    public final ListenableFuture b() {
        return this.j.b(akto.c(new aarj(this, 20)), this.g);
    }
}
