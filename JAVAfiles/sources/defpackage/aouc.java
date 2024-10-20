package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aouc extends apag implements apbu {
    private static volatile apca T;
    public static final aouc a;
    public int A;
    public int C;
    public boolean D;
    public boolean E;
    public boolean G;
    public boolean H;
    public int I;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean y;
    public aozn z;
    public String g = "";
    public String h = "";
    public String B = "";
    public String F = "";
    public String J = "";

    static {
        aouc aoucVar = new aouc();
        a = aoucVar;
        apag.registerDefaultInstance(aouc.class, aoucVar);
    }

    private aouc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000*\u0000\u0002\u0001**\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဇ\u0005\u0007င\u0006\bဇ\u0007\tဇ\b\nင\t\u000bင\n\fင\u000b\rဇ\f\u000eဇ\r\u000fဇ\u000e\u0010ဋ\u000f\u0011ဋ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015င\u0014\u0016ဇ\u0015\u0017ဉ\u0016\u0018င\u0017\u0019ለ\u0018\u001aင\u0019\u001bဇ\u001a\u001cဇ\u001b\u001dለ\u001c\u001eဇ\u001d\u001fဇ\u001e င\u001f!ለ \"င!#ဇ\"$ဇ#%ဇ$&ဇ%'ဌ&(င')ဇ(*ဇ)", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", VCardConstants.PARAM_ENCODING_B, "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N, "O", "P", "Q", "R", "S"});
            case NEW_MUTABLE_INSTANCE:
                return new aouc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = T;
                if (apcaVar == null) {
                    synchronized (aouc.class) {
                        apcaVar = T;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            T = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
