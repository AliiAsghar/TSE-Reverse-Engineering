package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pro {
    public final int a;
    public final Optional b;
    public long c;
    private String d;

    public pro(int i) {
        this.b = Optional.empty();
        d.s(i != 200);
        this.a = i;
    }

    public final String a() {
        int i = this.a;
        if (i == 200) {
            if (!TextUtils.isEmpty(this.d)) {
                return this.d;
            }
            throw new IllegalStateException("Response string is empty!");
        }
        throw new IllegalStateException(a.bV(i, "Cannot get response string for non-200_OK statuses. Status: "));
    }

    public pro(Optional optional, long j) {
        Optional.empty();
        this.a = 304;
        this.b = optional;
        this.c = j;
    }

    public pro(String str, Optional optional, long j) {
        Optional.empty();
        this.a = BasePaymentResult.ERROR_REQUEST_FAILED;
        this.d = str;
        this.b = optional;
        this.c = j;
    }
}
