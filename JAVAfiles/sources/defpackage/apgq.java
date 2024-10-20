package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apgq extends apag implements apbu {
    public static final apgq a;
    private static volatile apca i;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public apax h = apag.emptyProtobufList();

    static {
        apgq apgqVar = new apgq();
        a = apgqVar;
        apag.registerDefaultInstance(apgq.class, apgqVar);
    }

    private apgq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006\u001a", new Object[]{"b", "c", "d", apgo.d, "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apgq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (apgq.class) {
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
