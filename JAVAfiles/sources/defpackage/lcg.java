package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lcg implements Function {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ lcg(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return Function$CC.$default$andThen(this, function);
                            }
                            return Function$CC.$default$andThen(this, function);
                        }
                        return Function$CC.$default$andThen(this, function);
                    }
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
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                String str = (String) obj;
                                ThreadLocal threadLocal = agoz.a;
                                if (this.a) {
                                    return agnc.k(str);
                                }
                                return str;
                            }
                            alnr alnrVar = yul.a;
                            aozy builder = ((yuf) obj).toBuilder();
                            if (!builder.b.isMutable()) {
                                builder.u();
                            }
                            ((yuf) builder.b).h = this.a;
                            return builder;
                        }
                        alwo alwoVar = InsertNewMessageAction.a;
                        return albo.ag(((msh) obj).o(this.a));
                    }
                    lcy lcyVar = (lcy) obj;
                    lcyVar.W(lga.v(this.a));
                    return lcyVar;
                }
                lcy lcyVar2 = (lcy) obj;
                lcyVar2.W(lga.v(this.a));
                return lcyVar2;
            }
            lcy lcyVar3 = (lcy) obj;
            lcyVar3.W(lga.v(this.a));
            return lcyVar3;
        }
        lcy lcyVar4 = (lcy) obj;
        lcyVar4.W(lga.v(this.a));
        return lcyVar4;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return Function$CC.$default$compose(this, function);
                            }
                            return Function$CC.$default$compose(this, function);
                        }
                        return Function$CC.$default$compose(this, function);
                    }
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}
