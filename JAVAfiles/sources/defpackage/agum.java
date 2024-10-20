package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agum implements alhr {
    public static volatile agum b;
    public final ListenableFuture d;
    private final Future e;
    private volatile alpt f;
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier");
    public static final agum c = new agum(albo.bI(new alpr().g()));

    public agum(Context context, Executor executor) {
        Executor b2 = agtj.b(executor);
        ListenableFuture bM = albo.bM(new aaze(context, 13), b2);
        this.d = bM;
        this.e = ancj.f(bM, new agui(context, 2), b2);
    }

    @Override // defpackage.alhr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final alpt get() {
        ahbe ahbeVar = new ahbe("EmojiSetSupplier.get");
        try {
            if (this.f == null) {
                synchronized (this) {
                    if (this.f == null) {
                        try {
                            this.f = (alpt) this.e.get(10L, TimeUnit.SECONDS);
                        } catch (InterruptedException | ExecutionException | TimeoutException e) {
                            ((alvg) ((alvg) ((alvg) a.h()).g(e)).h("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier", "get", (char) 127, "EmojiSetSupplier.java")).q("Reading emoji list failed.");
                            this.f = altg.a;
                        }
                    }
                }
            }
            alpt alptVar = this.f;
            ahbeVar.close();
            return alptVar;
        } catch (Throwable th) {
            try {
                ahbeVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public agum(Future future) {
        this.e = future;
        this.d = albo.bI(altc.a);
    }
}
