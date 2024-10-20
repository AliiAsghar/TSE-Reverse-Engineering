package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvw extends apag implements apvx {
    public static final apvw a;
    private static volatile apca e;
    public String b = "";
    public apax c;
    public apax d;
    private int f;

    static {
        apvw apvwVar = new apvw();
        a = apvwVar;
        apag.registerDefaultInstance(apvw.class, apvwVar);
    }

    private apvw() {
        emptyBooleanList();
        emptyLongList();
        this.c = apag.emptyProtobufList();
        this.d = emptyProtobufList();
        aozb aozbVar = aozb.b;
        emptyDoubleList();
    }

    @Override // defpackage.apvx
    public final int bD() {
        return this.c.size();
    }

    @Override // defpackage.apvx
    public final String bE() {
        return this.b;
    }

    @Override // defpackage.apvx
    public final List bF() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apvx
    public final String bG() {
        return (String) this.c.get(0);
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0004\u001a\u0005\u001b", new Object[]{"f", "b", "c", "d", apvy.class});
            case NEW_MUTABLE_INSTANCE:
                return new apvw();
            case NEW_BUILDER:
                return new aozy((float[]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (apvw.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
