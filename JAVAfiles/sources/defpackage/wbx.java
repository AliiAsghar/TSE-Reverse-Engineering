package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wbx extends apag implements apbu {
    public static final wbx a;
    private static volatile apca i;
    public int b;
    public wed e;
    public wbv g;
    public wdt h;
    public String c = "";
    public String d = "";
    public apax f = emptyProtobufList();

    static {
        wbx wbxVar = new wbx();
        a = wbxVar;
        apag.registerDefaultInstance(wbx.class, wbxVar);
    }

    private wbx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", wbz.class, "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new wbx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (wbx.class) {
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
