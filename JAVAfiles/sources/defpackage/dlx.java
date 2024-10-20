package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlx implements Comparable<dlx> {
    public static final dlx a;
    public static final dlx b;
    public static final dlx c;
    public static final dlx d;
    public static final dlx e;
    public static final dlx f;
    public static final dlx g;
    private static final dlx i;
    private static final dlx j;
    private static final dlx k;
    private static final dlx l;
    private static final dlx m;
    private static final dlx n;
    public final int h;

    static {
        dlx dlxVar = new dlx(100);
        i = dlxVar;
        dlx dlxVar2 = new dlx(BasePaymentResult.ERROR_REQUEST_FAILED);
        j = dlxVar2;
        dlx dlxVar3 = new dlx(300);
        k = dlxVar3;
        dlx dlxVar4 = new dlx(400);
        a = dlxVar4;
        dlx dlxVar5 = new dlx(500);
        b = dlxVar5;
        dlx dlxVar6 = new dlx(600);
        c = dlxVar6;
        dlx dlxVar7 = new dlx(700);
        l = dlxVar7;
        dlx dlxVar8 = new dlx(800);
        m = dlxVar8;
        dlx dlxVar9 = new dlx(900);
        n = dlxVar9;
        d = dlxVar3;
        e = dlxVar4;
        f = dlxVar5;
        g = dlxVar7;
        aqjn.B(dlxVar, dlxVar2, dlxVar3, dlxVar4, dlxVar5, dlxVar6, dlxVar7, dlxVar8, dlxVar9);
    }

    public dlx(int i2) {
        this.h = i2;
        if (i2 > 0 && i2 < 1001) {
            return;
        }
        doz.b("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(dlx dlxVar) {
        return arro.a(this.h, dlxVar.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dlx) && this.h == ((dlx) obj).h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "FontWeight(weight=" + this.h + ')';
    }
}
