package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzw {
    public static final arml a;
    public static final tzw b;
    public static final tzw c;
    public static final tzw d;
    public static final tzw e;
    public static final tzw f;
    private static final /* synthetic */ tzw[] h;
    public final int g;

    static {
        tzw tzwVar = new tzw("RCS_GROUP_CREATED", 0, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED);
        b = tzwVar;
        tzw tzwVar2 = new tzw("ENCRYPTED_GROUP_CREATED", 1, 229);
        c = tzwVar2;
        tzw tzwVar3 = new tzw("PARTICIPANT_JOINED", 2, BasePaymentResult.ERROR_REQUEST_FAILED);
        d = tzwVar3;
        tzw tzwVar4 = new tzw("ENCRYPTED_GROUP_PARTICIPANT_JOINED", 3, 225);
        e = tzwVar4;
        tzw tzwVar5 = new tzw("ENCRYPTED_GROUP_PARTICIPANT_JOINED_INFO", 4, 226);
        f = tzwVar5;
        tzw[] tzwVarArr = {tzwVar, tzwVar2, tzwVar3, tzwVar4, tzwVar5};
        h = tzwVarArr;
        arhi.f(tzwVarArr);
        a = armd.a(tzt.d);
    }

    private tzw(String str, int i, int i2) {
        this.g = i2;
    }

    public static tzw[] values() {
        return (tzw[]) h.clone();
    }

    public final tzf a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                        throw null;
                    }
                }
            }
            return tzf.d;
        }
        return tzf.c;
    }
}
