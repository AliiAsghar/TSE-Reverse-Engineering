package defpackage;

import android.os.Bundle;
import com.google.android.gms.asterism.SetAsterismConsentRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkn {
    public int a;
    public Long b;
    public int c;
    public Bundle d;
    public String e;
    public String f;
    public String g;
    public int h;
    private int i;
    private int j;
    private int k;

    public final SetAsterismConsentRequest a() {
        int i;
        int i2;
        int i3;
        int i4 = this.i;
        if (i4 != 1 && i4 != 2) {
            throw new IllegalStateException("Invalid AsterismClient.");
        }
        if (i4 != 2 && ((i3 = this.h) == 1 || i3 == 2 || i3 == 3 || i3 == 5)) {
            throw new IllegalStateException("Invalid AsterismClient or ConsentVersion - RCS-only ConsentVersion is only for RCS.");
        }
        int i5 = this.h;
        if ((i4 != 2 || (i5 != 2 && i5 != 3 && i5 != 5)) && (i = this.j) != 1 && i != 2) {
            throw new IllegalStateException("Invalid FlowContext.");
        }
        int i6 = this.c;
        if (i6 != 1 && i6 != 2) {
            throw new IllegalStateException("Invalid ConsentValue.");
        }
        int i7 = this.k;
        if (i7 != 0 && i7 != 1) {
            i2 = 2;
        } else {
            i2 = i7;
        }
        return new SetAsterismConsentRequest(this.a, i4, this.j, null, this.b, i6, this.d, i2, this.e, this.f, this.g, null, null, null, null, null, i5, 0, 0);
    }

    public final void b() {
        this.i = 2;
    }

    public final void c() {
        this.k = 2;
    }

    public final void d() {
        this.j = 2;
    }
}
