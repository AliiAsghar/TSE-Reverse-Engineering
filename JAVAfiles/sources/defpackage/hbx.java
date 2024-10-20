package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbx extends Paint {
    public hbx() {
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((hhy.e(i) << 24) | (getColor() & 16777215));
        } else {
            super.setAlpha(hhy.e(i));
        }
    }

    public hbx(int i) {
        super(i);
    }

    public hbx(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public hbx(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
