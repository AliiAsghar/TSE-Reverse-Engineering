package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amxn extends apag implements apbu {
    public static final amxn a;
    private static volatile apca q;
    public int b;
    public int c;
    public apax d = emptyProtobufList();
    public apax e = emptyProtobufList();
    public amxg f;
    public amxm g;
    public amxj h;
    public amxh i;
    public amxi j;
    public amxk k;
    public amxk l;
    public amxk m;
    public amxk n;
    public amxk o;
    public amxl p;

    static {
        amxn amxnVar = new amxn();
        a = amxnVar;
        apag.registerDefaultInstance(amxn.class, amxnVar);
    }

    private amxn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eဉ\u000b", new Object[]{"b", "c", amwm.p, "d", amxm.class, "e", amxm.class, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new amxn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = q;
                if (apcaVar == null) {
                    synchronized (amxn.class) {
                        apcaVar = q;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            q = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
