package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aniz implements Function {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public aniz(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.wcq a(com.google.android.rcs.client.messaging.MessagingResult r9) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aniz.a(com.google.android.rcs.client.messaging.MessagingResult):wcq");
    }

    public static final wcq b(MessagingResult messagingResult) {
        aozy builder = a(messagingResult).toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        wcq wcqVar = (wcq) builder.b;
        wcqVar.b &= -9;
        wcqVar.f = 0;
        return (wcq) builder.s();
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
                                throw null;
                            }
                            throw null;
                        }
                        return Function$CC.$default$andThen(this, function);
                    }
                    return Function$CC.$default$andThen(this, function);
                }
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        throw null;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw null;
                            }
                            throw null;
                        }
                        aqhe aqheVar = (aqhe) obj;
                        int ordinal = aqheVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aqheVar))));
                                        }
                                    } else {
                                        return anje.d;
                                    }
                                } else {
                                    return anje.c;
                                }
                            } else {
                                return anje.b;
                            }
                        }
                        return anje.a;
                    }
                    aqhd aqhdVar = (aqhd) obj;
                    int ordinal2 = aqhdVar.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aqhdVar))));
                                }
                            } else {
                                return anjd.c;
                            }
                        } else {
                            return anjd.b;
                        }
                    }
                    return anjd.a;
                }
                aqhc aqhcVar = (aqhc) obj;
                int ordinal3 = aqhcVar.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            if (ordinal3 != 3) {
                                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aqhcVar))));
                            }
                        } else {
                            return anjc.c;
                        }
                    } else {
                        return anjc.b;
                    }
                }
                return anjc.a;
            }
            return a((MessagingResult) obj);
        }
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw null;
                            }
                            throw null;
                        }
                        return Function$CC.$default$compose(this, function);
                    }
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        throw null;
    }
}
