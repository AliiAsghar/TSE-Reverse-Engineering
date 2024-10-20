package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erc {
    public static final erc a = new erc();
    public final Uri b = null;
    public final String c = null;
    public final Bundle d = null;

    static {
        eul.M(0);
        eul.M(1);
        eul.M(2);
    }

    private erc() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erc)) {
            return false;
        }
        erc ercVar = (erc) obj;
        Uri uri = ercVar.b;
        if (Objects.equals(null, null)) {
            String str = ercVar.c;
            if (Objects.equals(null, null)) {
                Bundle bundle = ercVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
