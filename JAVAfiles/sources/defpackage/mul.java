package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mul implements yga {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mul(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.yga
    public final void a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Object obj = this.a;
                        Object obj2 = this.b;
                        synchronized (((ndj) obj2).a) {
                            ((ndj) obj2).a.remove(obj);
                            if (((ndj) obj2).a.isEmpty()) {
                                Boolean bool = ((ndj) obj2).b;
                                bool.getClass();
                                if (bool.booleanValue()) {
                                    ((ndj) obj2).f.G(((ndj) obj2).d);
                                } else {
                                    ((ndj) obj2).e.G(((ndj) obj2).d);
                                }
                                akrh e = aktp.e("ParticipantObservableSupplier#removeCallbackInternal_dsdrGroupsFlag");
                                try {
                                    if (((ndj) obj2).c) {
                                        ((ndj) obj2).j.G(((ndj) obj2).h);
                                    } else {
                                        ((ndj) obj2).i.G(((ndj) obj2).g);
                                    }
                                    armd.i(e, null);
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    Object obj3 = this.a;
                    Object obj4 = ((mzk) obj3).a;
                    Object obj5 = this.b;
                    synchronized (obj4) {
                        ((mzk) obj3).b.remove(obj5);
                    }
                    return;
                }
                Object obj6 = this.b;
                Object obj7 = this.a;
                synchronized (((muw) obj7).e) {
                    ((muw) obj7).d.remove(obj6);
                    if (((muw) obj7).d.isEmpty()) {
                        ((muw) obj7).c.G(((muw) obj7).a);
                    }
                }
                return;
            }
            Object obj8 = this.b;
            Object obj9 = this.a;
            synchronized (((mue) obj9).a) {
                ((mue) obj9).b.remove(obj8);
            }
            return;
        }
        Object obj10 = this.a;
        List list = ((mum) obj10).a;
        Object obj11 = this.b;
        synchronized (list) {
            ((mum) obj10).a.remove(obj11);
        }
    }

    @Override // defpackage.yga, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        yyb.aJ(this);
                        return;
                    } else {
                        yyb.aJ(this);
                        return;
                    }
                }
                yyb.aJ(this);
                return;
            }
            yyb.aJ(this);
            return;
        }
        yyb.aJ(this);
    }

    public /* synthetic */ mul(ndj ndjVar, ndk ndkVar, int i) {
        this.c = i;
        this.b = ndjVar;
        this.a = ndkVar;
    }
}
