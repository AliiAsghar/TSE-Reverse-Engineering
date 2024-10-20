package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amiq extends apag implements apbu {
    public static final amiq a;
    private static volatile apca au;
    public int A;
    public long B;
    public int C;
    public int D;
    public int E;
    public long G;
    public long H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public amhr U;
    public int V;
    public int W;
    public long X;
    public long Y;
    public long Z;
    public long aa;
    public long ab;
    public int ac;
    public long ad;
    public int ae;
    public int af;
    public amkm ag;
    public boolean ah;
    public boolean ai;
    public amju aj;
    public int al;
    public amkp am;
    public int an;
    public int ao;
    public apct ap;
    public amhm aq;
    public amhl ar;
    public boolean as;
    public uwr at;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public amim f;
    public amim g;
    public boolean j;
    public int k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public ameq p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public amje z;
    public int h = -1;
    public apax i = emptyProtobufList();
    public String F = "";
    public String ak = "";

    static {
        amiq amiqVar = new amiq();
        a = amiqVar;
        apag.registerDefaultInstance(amiq.class, amiqVar);
    }

    private amiq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amid.l;
                return newMessageInfo(a, "\u0001D\u0000\u0003\u0001ND\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005င\u0004\u0007\u001b\bဇ\u0006\tင\u0007\u000bဇ\t\u000e᠌\f\u000f᠌\r\u0010᠌\u000e\u0011ဉ\u000f\u0012င\u0010\u0013᠌\u0011\u0014င\u0012\u0015င\u0013\u0016င\u0014\u0017င\u0015\u0018᠌\u0016\u0019᠌\u0017\u001a᠌\u0018\u001bဉ\u0019\u001c᠌\u001a\u001dဂ\u001b\u001eင\u001c\u001fင\u001d ᠌\u001e!ဈ\u001f\"ဂ #ဂ!$ဂ\"%ဂ#&ဂ$'ဂ%(᠌&)င'*᠌(+᠌),᠌*.᠌,/᠌-0᠌.1ဉ/2᠌04᠌25ဂ36ဂ47ဂ58ဂ69ဂ7:᠌8;ဂ9<᠌:=င;>ဉ<?ဇ=@ဇ>Aဉ?Bဈ@C᠌AEဉCG᠌EH᠌FIဉGJဉHKဉIMဇJNဉK", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", amig.class, "j", "k", "l", "m", amid.f, "n", amid.j, "o", amid.k, "p", "q", "r", amid.i, "s", "t", "u", "v", "w", apamVar, "x", apamVar, "y", amid.r, "z", "A", amid.q, VCardConstants.PARAM_ENCODING_B, "C", "D", "E", amid.e, "F", "G", "H", "I", "J", "K", "L", "M", amid.n, VCardConstants.PROPERTY_N, "O", apamVar, "P", apamVar, "Q", apamVar, "R", amid.h, "S", amid.m, "T", apkm.g, "U", "V", amid.s, "W", amid.t, "X", "Y", "Z", "aa", "ab", "ac", amln.e, "ad", "ae", amiv.c, "af", "ag", "ah", "ai", "aj", "ak", "al", amid.o, "am", "an", amid.p, "ao", amid.g, "ap", "aq", "ar", "as", "at"});
            case NEW_MUTABLE_INSTANCE:
                return new amiq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = au;
                if (apcaVar == null) {
                    synchronized (amiq.class) {
                        apcaVar = au;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            au = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
