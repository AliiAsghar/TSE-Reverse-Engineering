package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzv {
    public static final arml a;
    public static final tzv b;
    public static final tzv c;
    public static final tzv d;
    public static final tzv e;
    public static final tzv f;
    public static final tzv g;
    public static final tzv h;
    public static final tzv i;
    public static final tzv j;
    public static final tzv k;
    private static final /* synthetic */ tzv[] m;
    public final int l;

    static {
        tzv tzvVar = new tzv("SELF_REMOVED_FROM_ENCRYPTED_GROUP", 0, 230);
        b = tzvVar;
        tzv tzvVar2 = new tzv("ENCRYPTED_GROUP_PARTICIPANT_LEFT", 1, 227);
        c = tzvVar2;
        tzv tzvVar3 = new tzv("ENCRYPTED_GROUP_SELF_LEFT", 2, 228);
        d = tzvVar3;
        tzv tzvVar4 = new tzv("ENCRYPTED_GROUP_PARTICIPANT_JOINED", 3, 225);
        e = tzvVar4;
        tzv tzvVar5 = new tzv("PARTICIPANT_REMOVED_FROM_ENCRYPTED_GROUP", 4, 231);
        f = tzvVar5;
        tzv tzvVar6 = new tzv("SELF_REMOVED_FROM_GROUP", 5, 220);
        g = tzvVar6;
        tzv tzvVar7 = new tzv("PARTICIPANT_LEFT", 6, BasePaymentResult.ERROR_REQUEST_TIMEOUT);
        h = tzvVar7;
        tzv tzvVar8 = new tzv("SELF_LEFT", 7, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED);
        i = tzvVar8;
        tzv tzvVar9 = new tzv("PARTICIPANT_JOINED", 8, BasePaymentResult.ERROR_REQUEST_FAILED);
        j = tzvVar9;
        tzv tzvVar10 = new tzv("PARTICIPANT_REMOVED_FROM_GROUP", 9, 221);
        k = tzvVar10;
        tzv[] tzvVarArr = {tzvVar, tzvVar2, tzvVar3, tzvVar4, tzvVar5, tzvVar6, tzvVar7, tzvVar8, tzvVar9, tzvVar10};
        m = tzvVarArr;
        arhi.f(tzvVarArr);
        a = armd.a(tzt.c);
    }

    private tzv(String str, int i2, int i3) {
        this.l = i3;
    }

    public static tzv[] values() {
        return (tzv[]) m.clone();
    }
}
