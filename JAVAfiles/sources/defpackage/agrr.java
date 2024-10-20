package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agrr {
    public boolean a;
    public boolean b;

    public agrr() {
    }

    public final void a(Context context) {
        if (this.b) {
            aefx.a(context);
            aefx.b();
        } else if (this.a) {
            aefx.b();
        }
    }

    public final boolean b() {
        if (!this.a && !this.b) {
            return false;
        }
        return true;
    }

    public agrr(byte[] bArr) {
        this.a = false;
        this.b = false;
    }
}
