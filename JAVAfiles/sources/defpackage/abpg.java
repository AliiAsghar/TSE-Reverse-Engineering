package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpg extends abph {
    public abpg(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // defpackage.abph
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new abpi("Invalid response to one way request"));
        }
    }

    @Override // defpackage.abph
    public final boolean b() {
        return true;
    }
}
