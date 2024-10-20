package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrm implements hsf, hro {
    private final Context a;
    private final /* synthetic */ int b;

    public hrm(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.hro
    public final Class a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return InputStream.class;
            }
            return AssetFileDescriptor.class;
        }
        return Drawable.class;
    }

    @Override // defpackage.hsf
    public final hse b(hsj hsjVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new hrp(this.a, (hro) this, 0);
            }
            return new hrp(this.a, (hro) this, 0);
        }
        return new hrp(this.a, (hro) this, 0);
    }

    @Override // defpackage.hro
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                return resources.openRawResource(i);
            }
            return resources.openRawResourceFd(i);
        }
        Context context = this.a;
        return hux.a(context, context, i, theme);
    }

    @Override // defpackage.hro
    public final /* synthetic */ void d(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((InputStream) obj).close();
                return;
            } else {
                ((AssetFileDescriptor) obj).close();
                return;
            }
        }
    }
}
