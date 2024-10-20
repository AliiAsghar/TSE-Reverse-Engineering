package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqaw {
    public static volatile aqux a;

    private aqaw() {
    }

    public static /* synthetic */ String a(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 7:
                        return "CREATE_GROUP_PUSH";
                    case 8:
                        return "ADD_GROUP_USERS_PUSH";
                    case 9:
                        return "KICK_GROUP_USERS_PUSH";
                    case 10:
                        return "CHANGE_GROUP_PROFILE_PUSH";
                    case 11:
                        return "CHANGE_GROUP_MEMBER_ROLE_PUSH";
                    case 12:
                        return "CHANGE_GROUP_INFO_PUSH";
                    default:
                        return "null";
                }
            }
            return "UNKNOWN";
        }
        return "UNRECOGNIZED";
    }

    public static int b(int i) {
        if (i != 0) {
            switch (i) {
                case 5:
                    return 7;
                case 6:
                    return 8;
                case 7:
                    return 9;
                case 8:
                    return 10;
                case 9:
                    return 11;
                case 10:
                    return 12;
                default:
                    return 0;
            }
        }
        return 2;
    }

    public static final /* synthetic */ aqcz c(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aqcz) s;
    }

    public static final void d(aqcy aqcyVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqcz aqczVar = (aqcz) aozyVar.b;
        aqcz aqczVar2 = aqcz.a;
        aqczVar.e = aqcyVar;
        aqczVar.b |= 1;
    }

    public static final int e(String[] strArr) {
        return strArr.length >> 1;
    }

    public static final String f(int i, String[] strArr) {
        int i2 = i + i;
        if (i2 >= 0 && i2 < strArr.length) {
            return strArr[i2];
        }
        return null;
    }

    public static final String g(int i, String[] strArr) {
        int i2 = i + i + 1;
        if (i2 >= 0 && i2 < strArr.length) {
            return strArr[i2];
        }
        return null;
    }

    public static /* synthetic */ String h(int i) {
        if (i != 1) {
            return "OUTBOUND";
        }
        return "INBOUND";
    }

    public static /* synthetic */ String i(int i) {
        return "TLS";
    }

    public static final /* synthetic */ aojh j(aozy aozyVar) {
        aozyVar.getClass();
        return new aojh(aozyVar);
    }

    public static final asmb k(final arpi arpiVar, aqux aquxVar, arqv arqvVar) {
        if (aquxVar.a == aquw.UNARY) {
            final akko akkoVar = new akko(aquxVar, arqvVar, 3);
            return new asmb(aquxVar, new aqvs() { // from class: arif
                @Override // defpackage.aqvs
                public final apzj a(aqvr aqvrVar, aqut aqutVar) {
                    Object a2 = arib.a.a(aqsm.k());
                    a2.getClass();
                    arpi plus = arpi.this.plus((arpi) a2);
                    aqsm k = aqsm.k();
                    k.getClass();
                    arpi plus2 = plus.plus(new aric(k));
                    asmb asmbVar = new asmb(new arih(aqvrVar, 0));
                    arzj t = arhi.t(1, 0, 6);
                    return new arig(arrn.J(arwi.e(plus2), null, null, new arik(akkoVar, new asaa(new arii(new AtomicBoolean(false), aqvrVar, t, null)), asmbVar, aqvrVar, null), 3), t, aqvrVar, asmbVar);
                }
            });
        }
        Objects.toString(aquxVar);
        throw new IllegalArgumentException("Expected a unary method descriptor but got ".concat(aquxVar.toString()));
    }
}
