package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqhh extends apag implements apbu {
    public static final aqhh a;
    private static volatile apca i;
    public int b;
    public aqgb c;
    public aqfn d;
    public aqge f;
    public int h;
    public String e = "";
    public apax g = emptyProtobufList();

    static {
        aqhh aqhhVar = new aqhh();
        a = aqhhVar;
        apag.registerDefaultInstance(aqhh.class, aqhhVar);
    }

    private aqhh() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004Ȉ\u0005ဉ\u0002\b\f", new Object[]{"b", "c", "d", "g", aqhg.class, "e", "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqhh();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (aqhh.class) {
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
