package defpackage;

import android.os.Bundle;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvv {
    public String a;
    public IdTokenRequest b;
    public Bundle c;
    public List d;
    private boolean e;
    private List f;

    public final VerifyPhoneNumberRequest a() {
        if (this.a == null) {
            this.a = aqmn.a.get().a();
        }
        if (this.b == null) {
            this.b = new adxq().i();
        }
        if (this.c == null) {
            this.c = Bundle.EMPTY;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        return new VerifyPhoneNumberRequest(this.a, 0L, this.b, this.c, this.d, this.e, 0, this.f);
    }

    public final void b() {
        this.e = true;
    }
}
