package defpackage;

import android.telephony.SmsMessage;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwi implements mwj {
    private final apwt a;
    private final boolean b;
    private final ofi c;
    private final kor d;

    public mwi(apwt apwtVar, ofi ofiVar, boolean z, kor korVar) {
        this.a = apwtVar;
        this.c = ofiVar;
        this.b = z;
        this.d = korVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [qrt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [qrt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [qrt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [qrt, java.lang.Object] */
    @Override // defpackage.mwj
    public final mwh a(String str) {
        int x;
        boolean z;
        aiut.b();
        boolean b = ((xav) this.a.b()).b(str);
        boolean z2 = false;
        int[] iArr = {0, 0, 0, 0};
        try {
            if (kor.w(this.d.a, "SIMPLE_CHARACTERS_ONLY", false) && b) {
                z = true;
            } else {
                z = false;
            }
            iArr = SmsMessage.calculateLength(str, z);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (!this.c.a()) {
                throw e;
            }
        } catch (NullPointerException unused) {
        }
        mwg mwgVar = new mwg();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        mwgVar.d(i);
        mwgVar.c(i2);
        mwgVar.b(i3);
        kor korVar = this.d;
        boolean z3 = this.b;
        ?? r4 = korVar.a;
        int x2 = kor.x(r4, "SMS_MAX_TEXT_PARTS", -1);
        int x3 = kor.x(r4, "SMS_TO_MMS_TEXT_LENGTH_THRESHOLD", -1);
        if (z3) {
            albo.T(true);
            String a = this.d.b.a("EMAIL_GATEWAY");
            if (a == null) {
                a = "";
            }
            if (TextUtils.isEmpty(a) || (((x = kor.x(this.d.b, "EMAIL_SMS_TO_MMS_THRESHOLD", -1)) >= 0 && i > x) || i > x2)) {
                z2 = true;
            }
            mwgVar.e(z2);
        } else {
            if (i > x2) {
                z2 = true;
            }
            mwgVar.e(z2);
        }
        mwgVar.f(x2);
        if (x3 > 0) {
            if (i3 + i2 < 140) {
                x3 >>= 1;
            }
            if (i2 > x3) {
                mwgVar.e(true);
            }
        }
        return mwgVar.a();
    }
}
