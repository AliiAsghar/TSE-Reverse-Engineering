package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwm {
    public volatile Object a;

    public adwm() {
    }

    public static PowerManager a(Context context) {
        return (PowerManager) context.getSystemService("power");
    }

    public adwm(byte[] bArr) {
        this();
    }
}
