package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbw implements byd {
    public final Choreographer a;
    private final dbu b;

    /* compiled from: PG */
    /* renamed from: dbw$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<Throwable, arnb> {
        final /* synthetic */ dbu a;
        final /* synthetic */ Choreographer.FrameCallback b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(dbu dbuVar, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.a = dbuVar;
            this.b = frameCallback;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dbu dbuVar = this.a;
            Object obj2 = dbuVar.e;
            Choreographer.FrameCallback frameCallback = this.b;
            synchronized (obj2) {
                dbuVar.f.remove(frameCallback);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: dbw$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<Throwable, arnb> {
        final /* synthetic */ Choreographer.FrameCallback b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.b = frameCallback;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dbw.this.a.removeFrameCallback(this.b);
            return arnb.a;
        }
    }

    public dbw(Choreographer choreographer, dbu dbuVar) {
        this.a = choreographer;
        this.b = dbuVar;
    }

    @Override // defpackage.byd
    public final Object a(final arqr arqrVar, arpe arpeVar) {
        final arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
        arvpVar.A();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: dbw.3
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object O;
                try {
                    O = arqrVar.a(Long.valueOf(j));
                } catch (Throwable th) {
                    O = aqil.O(th);
                }
                arvo.this.w(O);
            }
        };
        dbu dbuVar = this.b;
        if (d.F(dbuVar.c, this.a)) {
            synchronized (dbuVar.e) {
                dbuVar.f.add(frameCallback);
                if (!dbuVar.h) {
                    dbuVar.h = true;
                    dbuVar.c.postFrameCallback(dbuVar.i);
                }
            }
            arvpVar.d(new AnonymousClass1(dbuVar, frameCallback));
        } else {
            this.a.postFrameCallback(frameCallback);
            arvpVar.d(new AnonymousClass2(frameCallback));
        }
        return arvpVar.l();
    }

    @Override // defpackage.arpi
    public final <R> R fold(R r, arqv<? super R, ? super arpg, ? extends R> arqvVar) {
        return (R) arhi.k(this, r, arqvVar);
    }

    @Override // defpackage.arpg, defpackage.arpi
    public final <E extends arpg> E get(arph<E> arphVar) {
        return (E) arhi.l(this, arphVar);
    }

    @Override // defpackage.arpg
    public final /* synthetic */ arph getKey() {
        return byd.e;
    }

    @Override // defpackage.arpi
    public final arpi minusKey(arph<?> arphVar) {
        return arhi.m(this, arphVar);
    }

    @Override // defpackage.arpi
    public final arpi plus(arpi arpiVar) {
        return arhi.n(this, arpiVar);
    }
}
