package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes5.dex */
final class L extends AbstractC0119c {
    private final F j;
    private final boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(F f, boolean z, AbstractC0114b abstractC0114b, Spliterator spliterator) {
        super(abstractC0114b, spliterator);
        this.k = z;
        this.j = f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final Object a() {
        CountedCompleter completer;
        AbstractC0114b abstractC0114b = this.a;
        Q3 q3 = (Q3) this.j.d.get();
        abstractC0114b.R(this.b, q3);
        Object obj = q3.get();
        if (!this.k) {
            if (obj != null) {
                j$.util.concurrent.n.a(this.h, null, obj);
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC0129e abstractC0129e = this;
        while (true) {
            if (abstractC0129e != null) {
                completer = abstractC0129e.getCompleter();
                AbstractC0129e abstractC0129e2 = (AbstractC0129e) completer;
                if (abstractC0129e2 != null && abstractC0129e2.d != abstractC0129e) {
                    i();
                    break;
                }
                abstractC0129e = abstractC0129e2;
            } else {
                j$.util.concurrent.n.a(this.h, null, obj);
                break;
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0129e
    public final AbstractC0129e e(Spliterator spliterator) {
        return new L(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0119c
    protected final Object j() {
        return this.j.b;
    }

    @Override // j$.util.stream.AbstractC0129e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        CountedCompleter completer;
        if (this.k) {
            L l = (L) this.d;
            L l2 = null;
            while (true) {
                if (l != l2) {
                    Object c = l.c();
                    if (c != null && this.j.c.test(c)) {
                        f(c);
                        AbstractC0129e abstractC0129e = this;
                        while (true) {
                            if (abstractC0129e != null) {
                                completer = abstractC0129e.getCompleter();
                                AbstractC0129e abstractC0129e2 = (AbstractC0129e) completer;
                                if (abstractC0129e2 != null && abstractC0129e2.d != abstractC0129e) {
                                    i();
                                    break;
                                }
                                abstractC0129e = abstractC0129e2;
                            } else {
                                j$.util.concurrent.n.a(this.h, null, c);
                                break;
                            }
                        }
                    } else {
                        l2 = l;
                        l = (L) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }

    L(L l, Spliterator spliterator) {
        super(l, spliterator);
        this.k = l.k;
        this.j = l.j;
    }
}
