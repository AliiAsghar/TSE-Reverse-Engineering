package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lcf implements Function {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ConversationIdType c;
    private final /* synthetic */ int d;

    public /* synthetic */ lcf(boolean z, long j, ConversationIdType conversationIdType, int i) {
        this.d = i;
        this.a = z;
        this.b = j;
        this.c = conversationIdType;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Function$CC.$default$andThen(this, function);
                }
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.d;
        if (i != 0) {
            final int i2 = 0;
            final int i3 = 1;
            if (i != 1) {
                if (i != 2) {
                    lcy lcyVar = (lcy) obj;
                    final boolean z = this.a;
                    final long j = this.b;
                    lcyVar.b(new lcg(z, 2), new Function() { // from class: ldh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo416andThen(Function function) {
                            if (i2 != 0) {
                                return Function$CC.$default$andThen(this, function);
                            }
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            if (i2 != 0) {
                                lcy lcyVar2 = (lcy) obj2;
                                lcyVar2.W(lga.t(z));
                                lcyVar2.p(j);
                                return lcyVar2;
                            }
                            lcy lcyVar3 = (lcy) obj2;
                            lcyVar3.W(lga.t(z));
                            lcyVar3.p(j);
                            return lcyVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            if (i2 != 0) {
                                return Function$CC.$default$compose(this, function);
                            }
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new lcf(z, j, this.c, 2));
                    return lcyVar;
                }
                lcy lcyVar2 = (lcy) obj;
                lcyVar2.W(lga.t(this.a));
                lcyVar2.n(this.b);
                lcyVar2.i(this.c.a);
                return lcyVar2;
            }
            lcy lcyVar3 = (lcy) obj;
            final boolean z2 = this.a;
            final long j2 = this.b;
            lcyVar3.b(new lcg(z2, 1), new Function() { // from class: ldh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo416andThen(Function function) {
                    if (i3 != 0) {
                        return Function$CC.$default$andThen(this, function);
                    }
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    if (i3 != 0) {
                        lcy lcyVar22 = (lcy) obj2;
                        lcyVar22.W(lga.t(z2));
                        lcyVar22.p(j2);
                        return lcyVar22;
                    }
                    lcy lcyVar32 = (lcy) obj2;
                    lcyVar32.W(lga.t(z2));
                    lcyVar32.p(j2);
                    return lcyVar32;
                }

                public final /* synthetic */ Function compose(Function function) {
                    if (i3 != 0) {
                        return Function$CC.$default$compose(this, function);
                    }
                    return Function$CC.$default$compose(this, function);
                }
            }, new lcf(z2, j2, this.c, 0));
            return lcyVar3;
        }
        lcy lcyVar4 = (lcy) obj;
        lcyVar4.W(lga.t(this.a));
        lcyVar4.n(this.b);
        lcyVar4.i(this.c.a);
        return lcyVar4;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}
