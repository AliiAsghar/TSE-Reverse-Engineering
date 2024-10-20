package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addt {
    public final Optional a;
    public final int b;
    public final Optional c;
    public final Optional d;
    private final String e;

    public addt() {
        throw null;
    }

    public static adds a() {
        adds addsVar = new adds(null);
        addsVar.d(BasePaymentResult.ERROR_REQUEST_FAILED);
        addsVar.c("OK");
        return addsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof addt) {
            addt addtVar = (addt) obj;
            if (this.a.equals(addtVar.a) && this.b == addtVar.b && this.e.equals(addtVar.e) && this.c.equals(addtVar.c) && this.d.equals(addtVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        return "SessionEstablishedResult{session=" + String.valueOf(this.a) + ", responseCode=" + this.b + ", reason=" + this.e + ", exception=" + String.valueOf(optional2) + ", instantMessageError=" + String.valueOf(optional) + "}";
    }

    public addt(Optional optional, int i, String str, Optional optional2, Optional optional3) {
        this.a = optional;
        this.b = i;
        this.e = str;
        this.c = optional2;
        this.d = optional3;
    }
}
