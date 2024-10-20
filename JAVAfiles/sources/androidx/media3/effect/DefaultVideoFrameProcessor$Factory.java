package androidx.media3.effect;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory;
import defpackage.eqd;
import defpackage.eqg;
import defpackage.eqp;
import defpackage.esh;
import defpackage.esi;
import defpackage.esj;
import defpackage.eul;
import defpackage.ewy;
import defpackage.exg;
import defpackage.exi;
import defpackage.exx;
import defpackage.ezc;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DefaultVideoFrameProcessor$Factory implements esi {
    public final boolean a;
    public final eqp b;
    public final ExecutorService c;
    public final exx d;
    public final int e;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static final class Builder {
        public ExecutorService a;
        public eqp b;
        public exx c;
        public int d;
        private final boolean e;

        public Builder() {
            this.e = true;
        }

        public DefaultVideoFrameProcessor$Factory build() {
            eqp eqpVar = this.b;
            if (eqpVar == null) {
                eqpVar = new ewy();
            }
            return new DefaultVideoFrameProcessor$Factory(!this.e, eqpVar, this.a, this.c, this.d);
        }

        public Builder(DefaultVideoFrameProcessor$Factory defaultVideoFrameProcessor$Factory) {
            this.a = defaultVideoFrameProcessor$Factory.c;
            this.b = defaultVideoFrameProcessor$Factory.b;
            this.c = defaultVideoFrameProcessor$Factory.d;
            this.d = defaultVideoFrameProcessor$Factory.e;
            this.e = !defaultVideoFrameProcessor$Factory.a;
        }
    }

    public DefaultVideoFrameProcessor$Factory(boolean z, eqp eqpVar, ExecutorService executorService, exx exxVar, int i) {
        this.a = z;
        this.b = eqpVar;
        this.c = executorService;
        this.d = exxVar;
        this.e = i;
    }

    @Override // defpackage.esi
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final exi a(final Context context, eqg eqgVar, final eqd eqdVar, final boolean z, final Executor executor, final esj esjVar) {
        boolean z2;
        ExecutorService executorService = this.c;
        if (executorService == null) {
            executorService = eul.P("Effect:DefaultVideoFrameProcessor:GlThread");
        }
        int i = 0;
        if (this.c == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        final ezc ezcVar = new ezc(executorService, z2, new exg(esjVar, i));
        try {
            return (exi) executorService.submit(new Callable() { // from class: exh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int[] iArr;
                    Pair i2;
                    eqd eqdVar2;
                    int i3 = exi.m;
                    DefaultVideoFrameProcessor$Factory defaultVideoFrameProcessor$Factory = DefaultVideoFrameProcessor$Factory.this;
                    eqp eqpVar = defaultVideoFrameProcessor$Factory.b;
                    EGLDisplay h = ett.h();
                    eqd eqdVar3 = eqdVar;
                    if (eqd.i(eqdVar3)) {
                        iArr = ett.b;
                    } else {
                        iArr = ett.a;
                    }
                    try {
                        i2 = exi.i(eqpVar, h, 3, iArr);
                    } catch (ets unused) {
                        i2 = exi.i(eqpVar, h, 2, iArr);
                    }
                    Pair pair = i2;
                    esj esjVar2 = esjVar;
                    ezc ezcVar2 = ezcVar;
                    boolean z3 = z;
                    Context context2 = context;
                    boolean z4 = defaultVideoFrameProcessor$Factory.a;
                    int i4 = defaultVideoFrameProcessor$Factory.e;
                    exx exxVar = defaultVideoFrameProcessor$Factory.d;
                    eqd eqdVar4 = new eqd(eqdVar3.c, eqdVar3.d, 1, null, eqdVar3.g, eqdVar3.h);
                    if (true != eqd.i(eqdVar3)) {
                        eqdVar2 = eqdVar3;
                    } else {
                        eqdVar2 = eqdVar4;
                    }
                    return new exi(context2, eqpVar, h, new eyb(context2, eqdVar2, eqpVar, ezcVar2, new exe(esjVar2), z4), ezcVar2, esjVar2, new exo(context2, h, (EGLContext) pair.first, (EGLSurface) pair.second, eqdVar3, ezcVar2, esjVar2, exxVar, i4, z3), z3, eqdVar3);
                }
            }).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new esh(e);
        } catch (ExecutionException e2) {
            throw new esh(e2);
        }
    }
}
