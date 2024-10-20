package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwd implements byd {
    public final Object a;
    public List b;
    public List c;
    public final cdh d;
    private final arqg f;
    private Throwable g;

    /* compiled from: PG */
    /* renamed from: bwd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<Throwable, arnb> {
        final /* synthetic */ a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar) {
            super(1);
            this.b = aVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            bwd bwdVar = bwd.this;
            Object obj2 = bwdVar.a;
            a aVar = this.b;
            synchronized (obj2) {
                bwdVar.b.remove(aVar);
                if (bwdVar.b.isEmpty()) {
                    bwdVar.d.set(0);
                }
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a<R> {
        public final arqr a;
        public final arpe b;

        public a(arqr arqrVar, arpe arpeVar) {
            this.a = arqrVar;
            this.b = arpeVar;
        }
    }

    public bwd() {
        this(null);
    }

    @Override // defpackage.byd
    public final Object a(arqr arqrVar, arpe arpeVar) {
        arqg arqgVar;
        arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
        arvpVar.A();
        a aVar = new a(arqrVar, arvpVar);
        synchronized (this.a) {
            Throwable th = this.g;
            if (th != null) {
                arvpVar.w(aqil.O(th));
            } else {
                boolean isEmpty = this.b.isEmpty();
                this.b.add(aVar);
                if (isEmpty) {
                    this.d.set(1);
                }
                arvpVar.d(new AnonymousClass1(aVar));
                if (isEmpty && (arqgVar = this.f) != null) {
                    try {
                        arqgVar.a();
                    } catch (Throwable th2) {
                        synchronized (this.a) {
                            if (this.g == null) {
                                this.g = th2;
                                List list = this.b;
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    ((a) list.get(i)).b.w(aqil.O(th2));
                                }
                                this.b.clear();
                                this.d.set(0);
                            }
                        }
                    }
                }
            }
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

    public bwd(arqg arqgVar) {
        this.f = arqgVar;
        this.a = new Object();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new cdh();
    }
}
