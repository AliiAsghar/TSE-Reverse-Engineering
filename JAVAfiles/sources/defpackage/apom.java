package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apom extends apag implements apbu {
    public static final apom a;
    private static volatile apca i;
    public int b;
    public apoc c;
    public apnn d;
    public apnp e;
    public apon f;
    public apax g = emptyProtobufList();
    public apao h = emptyIntList();

    static {
        apom apomVar = new apom();
        a = apomVar;
        apag.registerDefaultInstance(apom.class, apomVar);
    }

    private apom() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0007,", new Object[]{"b", "c", "d", "e", "f", "g", apoq.class, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apom();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (apom.class) {
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
