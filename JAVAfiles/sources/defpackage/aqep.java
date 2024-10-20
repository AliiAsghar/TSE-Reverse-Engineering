package defpackage;

import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqep extends apag implements apbu {
    public static final aqep a;
    private static volatile apca q;
    public int b;
    public Object d;
    public aqfm e;
    public aqfu i;
    public aqhz l;
    public aqfj m;
    public aqfk n;
    public TachyonCommon$PublicPreKeySets o;
    public int c = 0;
    public String f = "";
    public aozb g = aozb.b;
    public String h = "";
    public String j = "";
    public apao k = emptyIntList();
    public String p = "";

    static {
        aqep aqepVar = new aqep();
        a = aqepVar;
        apag.registerDefaultInstance(aqep.class, aqepVar);
    }

    private aqep() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u000e\u0001\u0001\u0001#\u000e\u0000\u0001\u0000\u0001ဉ\u0000\u0003Ȉ\u0004\n\u0005Ȉ\u0006ဉ\u0002\u0007Ȼ\u0000\bȈ\t'\u0010ဉ\u0007\u001cဉ\n\u001eဉ\u0003\u001fဉ\u0004\"Ȉ#Ȼ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", "n", "o", "l", "m", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new aqep();
            case NEW_BUILDER:
                return new aozy((boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = q;
                if (apcaVar == null) {
                    synchronized (aqep.class) {
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
