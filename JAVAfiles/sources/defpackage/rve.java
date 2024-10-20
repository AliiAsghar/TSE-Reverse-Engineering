package defpackage;

import android.os.BaseBundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rve extends rvf {
    public static final rve a = new rve(null);

    private rve(String str) {
        super(str);
    }

    public static rve a(String str) {
        if (str == null) {
            return a;
        }
        return new rve(str);
    }

    public static rve b(BaseBundle baseBundle, String str) {
        if (baseBundle == null) {
            return a;
        }
        return a(baseBundle.getString(str));
    }

    public final String toString() {
        return "RcsMessageIdType:".concat(String.valueOf(this.b));
    }
}
