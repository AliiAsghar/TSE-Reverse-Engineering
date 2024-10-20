package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asjt extends apag implements apbu {
    private static volatile apca A;
    public static final asjt a;
    private asje B;
    public int b;
    public long c;
    public ashz f;
    public asju g;
    public asie h;
    public asjg i;
    public asjo j;
    public ashf k;
    public asjm l;
    public asii m;
    public asis n;
    public asjw o;
    public ashb q;
    public asjs r;
    public asja s;
    public asjj t;
    public apax u;
    public asjd v;
    public asjr w;
    public asjk x;
    public ashu y;
    public asjc z;
    private byte C = 2;
    public String d = "";
    public String e = "";
    public apax p = emptyProtobufList();

    static {
        asjt asjtVar = new asjt();
        a = asjtVar;
        apag.registerDefaultInstance(asjt.class, asjtVar);
    }

    private asjt() {
        emptyProtobufList();
        this.u = emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.C);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.C = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0001\u0001%\u0019\u0000\u0002\u000b\u0001ᐉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0004ဉ\u0004\u0005ဉ\u0016\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0017\tဉ\u0007\nᐉ\b\fဉ\n\u000eᐉ\u0019\u0010ᐉ\u000b\u0011ဈ\u0002\u0015ဉ\u001a\u0017ဉ\u0018\u001dᐉ\u0012\u001eဉ\u0014\u001fဉ\u0015 ᐉ\u0010!ဉ\u0011\"\u001b#ဉ\f$ᐉ\r%Л", new Object[]{"b", "f", "c", "d", "g", "v", "h", "i", "w", "j", "k", "l", "y", "m", "e", "z", "x", VCardConstants.PARAM_ENCODING_B, "s", "t", "q", "r", "u", ashv.class, "n", "o", "p", asjx.class});
            case NEW_MUTABLE_INSTANCE:
                return new asjt();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = A;
                if (apcaVar == null) {
                    synchronized (asjt.class) {
                        apcaVar = A;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            A = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
