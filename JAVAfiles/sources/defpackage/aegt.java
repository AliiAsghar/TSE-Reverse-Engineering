package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aegt extends apag implements apbu {
    public static final aegt a;
    private static volatile apca i;
    public int b;
    public String c = "";
    public long d;
    public String e;
    public String f;
    public boolean g;
    public aegs h;

    static {
        aegt aegtVar = new aegt();
        a = aegtVar;
        apag.registerDefaultInstance(aegt.class, aegtVar);
    }

    private aegt() {
        emptyProtobufList();
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0012\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0004ဂ\u0003\bဇ\u000b\tဈ\u0006\nဈ\u0007\u0012ဉ\r", new Object[]{"b", "c", "d", "g", "e", "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aegt();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (aegt.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
