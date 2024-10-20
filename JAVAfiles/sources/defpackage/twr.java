package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twr extends apag implements apbu {
    public static final twr a;
    private static volatile apca i;
    public int b;
    public long d;
    public qei g;
    public qei h;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        twr twrVar = new twr();
        a = twrVar;
        apag.registerDefaultInstance(twr.class, twrVar);
    }

    private twr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0005Ȉ\u0006ဉ\u0000\u0007ဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new twr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (twr.class) {
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
