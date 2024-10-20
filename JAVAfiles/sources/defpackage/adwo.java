package defpackage;

import android.content.Context;
import android.telephony.CarrierConfigManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwo {
    private static volatile adwo b;
    public final Object a;

    public adwo(String str) {
        this.a = str;
    }

    public static adwo a(Context context) {
        if (b == null) {
            synchronized (adwo.class) {
                if (b == null) {
                    b = new adwo(context);
                }
            }
        }
        return b;
    }

    public adwo() {
        this.a = ascy.a(afgx.a);
    }

    protected adwo(Context context) {
        this.a = (CarrierConfigManager) context.getSystemService("carrier_config");
    }

    public adwo(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public adwo(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public adwo(armf armfVar, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public adwo(armf armfVar, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public adwo(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
