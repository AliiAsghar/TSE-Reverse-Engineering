package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vgl implements vgp {
    private final vgo d = vgo.GAIA;
    public final String a = "GDitto";

    public vgl() {
        if (!TextUtils.isEmpty("GDitto")) {
        } else {
            throw new IllegalArgumentException("appName is empty");
        }
    }

    @Override // defpackage.vgp
    public final vgo a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgl)) {
            return false;
        }
        return Objects.equals(this.a, ((vgl) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
