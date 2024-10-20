package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amjc extends apag implements apbu {
    private static volatile apca O;
    public static final amjc a;
    public amle A;
    public amle B;
    public amle C;
    public amle D;
    public amle E;
    public amle F;
    public ammw G;
    public amef H;
    public amef I;
    public amef J;
    public amef K;
    public amef L;
    public amef M;
    public amef N;
    public int b;
    public int c;
    public amef d;
    public amef e;
    public amef f;
    public amef g;
    public amef h;
    public amle i;
    public amle j;
    public amle k;
    public amef l;
    public amef m;
    public amef n;
    public amle o;
    public ammw p;
    public ammw q;
    public ammw r;
    public ammw s;
    public amef t;
    public amle u;
    public amle v;
    public amef w;
    public amef x;
    public amef y;
    public amef z;

    static {
        amjc amjcVar = new amjc();
        a = amjcVar;
        apag.registerDefaultInstance(amjc.class, amjcVar);
    }

    private amjc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001%\u0000\u0002\u0001&%\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015\u0017ဉ\u0016\u0018ဉ\u0017\u0019ဉ\u0018\u001aဉ\u0019\u001bဉ\u001a\u001cဉ\u001b\u001dဉ\u001c\u001eဉ\u001d\u001fဉ\u001e ဉ\u001f!ဉ \"ဉ!#ဉ\"$ဉ#%ဉ$&ဉ%", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", VCardConstants.PARAM_ENCODING_B, "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N});
            case NEW_MUTABLE_INSTANCE:
                return new amjc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = O;
                if (apcaVar == null) {
                    synchronized (amjc.class) {
                        apcaVar = O;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            O = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
