package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmq {
    public final String a;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final String a = "com.google.android.gms.fonts";
        public final String b = "com.google.android.gms";
        private final List c = null;
        private final int d = R.array.com_google_android_gms_fonts_certs;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!d.F(this.a, aVar.a) || !d.F(this.b, aVar.b)) {
                return false;
            }
            List list = aVar.c;
            if (!d.F(null, null)) {
                return false;
            }
            int i = aVar.d;
            return true;
        }

        public final int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + R.array.com_google_android_gms_fonts_certs;
        }
    }

    public /* synthetic */ dmq(String str) {
        this.a = str;
        if (str.length() > 0) {
        } else {
            throw new IllegalArgumentException("name cannot be empty");
        }
    }
}
