package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vgm implements vgp {
    public final String a;
    private final vgo d = vgo.PHONE_NUMBER;

    public vgm(String str) {
        this.a = str;
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException("normalizedPhoneNumber is empty");
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
        if (!(obj instanceof vgm)) {
            return false;
        }
        return Objects.equals(this.a, ((vgm) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
