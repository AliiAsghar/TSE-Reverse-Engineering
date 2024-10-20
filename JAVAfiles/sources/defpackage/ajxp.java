package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajxp {
    public boolean a;
    public int b;
    public Object c;
    public Object d;

    public ajxp() {
        this.b = 3;
        this.c = null;
        this.d = alfd.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        boolean z;
        int i = this.b;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = 1;
            if (i2 == 0) {
                return true;
            }
            boolean z2 = false;
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                if (i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                albo.T(z);
                Object obj = this.c;
                if (obj == null ? !(((algw) this.d).f() && (!((Boolean) ((algw) this.d).b()).booleanValue() || this.a)) : !(!((Bundle) obj).getBoolean("tiktok_accounts_disabled") || this.a)) {
                    z2 = true;
                }
                if (!z2) {
                    i3 = 2;
                }
                this.b = i3;
                return z2;
            }
            throw new IllegalStateException("Shouldn't reach here");
        }
        throw null;
    }

    public final abtl b() {
        boolean z;
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "execute parameter required");
        return new abtk(this, (Feature[]) this.d, this.a, this.b);
    }

    public final void c() {
        this.a = false;
    }

    public ajxp(byte[] bArr) {
        this.a = true;
        this.b = 0;
    }
}
