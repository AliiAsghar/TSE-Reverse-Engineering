package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzg {
    public static final alvi a = alvi.m("com/google/apps/tiktok/account/data/AccountInvalidator");
    public final ajzk b;

    public ajzg(ajzk ajzkVar) {
        this.b = ajzkVar;
    }

    public final ListenableFuture a() {
        ListenableFuture g = ancd.g(this.b.a(), Throwable.class, akto.d(new ahce(this, 19)), andi.a);
        this.b.c(g);
        return g;
    }
}
