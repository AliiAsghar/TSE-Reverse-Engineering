package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class myg implements Predicate {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ myg(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return Predicate$CC.$default$and(this, predicate);
                    }
                    return Predicate$CC.$default$and(this, predicate);
                }
                return Predicate$CC.$default$and(this, predicate);
            }
            return Predicate$CC.$default$and(this, predicate);
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo407negate() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return Predicate$CC.$default$negate(this);
                    }
                    return Predicate$CC.$default$negate(this);
                }
                return Predicate$CC.$default$negate(this);
            }
            return Predicate$CC.$default$negate(this);
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return Predicate$CC.$default$or(this, predicate);
                    }
                    return Predicate$CC.$default$or(this, predicate);
                }
                return Predicate$CC.$default$or(this, predicate);
            }
            return Predicate$CC.$default$or(this, predicate);
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Integer num;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (((ykb) obj).d() == this.a) {
                            return true;
                        }
                        return false;
                    }
                    yel yelVar = (yel) obj;
                    xze xzeVar = yee.a;
                    if (yelVar.a == null || yelVar.d == null || (num = yelVar.c) == null) {
                        return false;
                    }
                    if (num.intValue() <= this.a) {
                        return true;
                    }
                    return false;
                }
                vbe vbeVar = vbe.NONE;
                if (((vbe) obj).g == this.a) {
                    return true;
                }
                return false;
            }
            MessagePartData messagePartData = (MessagePartData) obj;
            if (messagePartData.M() == ameb.RICH_CARD_MEDIA) {
                if (messagePartData.a() == this.a) {
                    return true;
                }
            }
            return false;
        }
        MessagePartData messagePartData2 = (MessagePartData) obj;
        if (messagePartData2.M() == ameb.RICH_CARD_THUMBNAIL) {
            if (messagePartData2.a() == this.a) {
                return true;
            }
        }
        return false;
    }
}
