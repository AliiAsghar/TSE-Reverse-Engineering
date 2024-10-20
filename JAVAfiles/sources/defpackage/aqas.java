package defpackage;

import android.os.Parcel;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqas {
    public static volatile aqux a;
    public static volatile aqux b;
    public static volatile aqux c;
    public static volatile aqux d;
    public static volatile aqux e;
    public static volatile aqux f;
    public static volatile aqux g;
    public static volatile aqux h;
    private static volatile aqux i;

    private aqas() {
    }

    public static aqar a(aqrs aqrsVar) {
        return (aqar) aqar.g(new wci(10), aqrsVar);
    }

    public static aqux b() {
        aqux aquxVar = i;
        if (aquxVar == null) {
            synchronized (aqas.class) {
                aquxVar = i;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("google.internal.communications.instantmessaging.v1.Registration", "LookupRegistered");
                    a2.b();
                    aqdv aqdvVar = aqdv.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(aqdvVar);
                    a2.d = new arkw(aqdw.a);
                    aquxVar = a2.a();
                    i = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static final apcp c(aqfq aqfqVar) {
        aqfp aqfpVar = (aqfp) aqfqVar;
        if ((aqfpVar.b & 1) != 0) {
            apcp apcpVar = aqfpVar.c;
            if (apcpVar == null) {
                return apcp.a;
            }
            return apcpVar;
        }
        return null;
    }

    public static final /* synthetic */ aqcy d(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aqcy) s;
    }

    public static final void e(aqbc aqbcVar, aozy aozyVar) {
        aqbcVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqcy aqcyVar = (aqcy) aozyVar.b;
        apap apapVar = aqcy.a;
        aqcyVar.k = aqbcVar.a();
    }

    public static int f(int i2) {
        return i2 - 2;
    }

    public static int g(int i2) {
        switch (i2) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
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
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            default:
                return 0;
        }
    }

    public static arcw h() {
        if (arfm.a == null) {
            return new arfm();
        }
        return new aqzn();
    }

    public static int i(Parcel parcel, Status status) {
        int value = status.getCode().value() << 16;
        String description = status.getDescription();
        if (description != null && description.length() > 1000) {
            description = description.substring(0, 1000);
        }
        if (description != null) {
            int i2 = value | 32;
            parcel.writeString(description);
            return i2;
        }
        return value;
    }

    public static Status j(int i2, Parcel parcel) {
        int i3 = i2 >> 16;
        int i4 = i2 & 32;
        Status fromCodeValue = Status.fromCodeValue(i3 & 255);
        if (i4 != 0) {
            return fromCodeValue.withDescription(parcel.readString());
        }
        return fromCodeValue;
    }

    public static void k(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    public static boolean l(int i2, int i3) {
        if ((i2 & i3) != 0) {
            return true;
        }
        return false;
    }
}
