package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akwu {
    public static final akwu a = new akwu(5);
    public static final akwu b = new akwu(3);
    public static final akwu c = new akwu(4);
    public static final akwu d = new akwu(7);
    public static final akwu e = new akwu(8);
    private final String f;
    private final int g;

    public akwu() {
        throw null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("__error__", albo.r(this.g));
        if (!this.f.isEmpty()) {
            bundle.putString("__error_details__", this.f);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akwu) {
            akwu akwuVar = (akwu) obj;
            if (this.g == akwuVar.g && this.f.equals(akwuVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        a.aS(i);
        return ((i ^ 1000003) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return String.format("%s, %s", albo.r(this.g), this.f);
    }

    public akwu(int i) {
        this.g = i;
        this.f = "";
    }
}
