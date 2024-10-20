package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vch {
    public static final aquo a = new aqul("google.internal.communications.instantmessaging.v1.tachyonerror-bin", new ankj(1));

    public static Status.Code a(Throwable th) {
        Status c = Status.c(th);
        if (c == null) {
            return Status.Code.UNKNOWN;
        }
        return c.getCode();
    }

    public static asky b(Throwable th) {
        aqut a2 = Status.a(th);
        if (a2 == null) {
            return asky.UNKNOWN;
        }
        aqgi aqgiVar = (aqgi) a2.b(a);
        if (aqgiVar != null) {
            int i = aqgiVar.b;
            asky b = asky.b(i);
            if (b == null) {
                b = asky.UNRECOGNIZED;
            }
            asky askyVar = asky.UNRECOGNIZED;
            if (b != askyVar) {
                asky b2 = asky.b(i);
                if (b2 != null) {
                    return b2;
                }
                return askyVar;
            }
        }
        return asky.UNKNOWN;
    }

    public static boolean c(Status.Code code) {
        Status.Code code2 = Status.Code.OK;
        int ordinal = code.ordinal();
        if (ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 13 || ordinal == 14) {
            return true;
        }
        return false;
    }

    public static boolean d(Throwable th) {
        return c(a(th));
    }
}
