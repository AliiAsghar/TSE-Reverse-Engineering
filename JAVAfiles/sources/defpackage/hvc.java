package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvc implements hnl {
    private final /* synthetic */ int a;

    public hvc(int i) {
        this.a = i;
    }

    @Override // defpackage.hnl
    public final /* synthetic */ hpt a(Object obj, int i, int i2, hnj hnjVar) {
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                return new hsy((File) obj);
            }
            return new huw((Bitmap) obj, 1);
        }
        return hva.g((Drawable) obj);
    }

    @Override // defpackage.hnl
    public final /* synthetic */ boolean b(Object obj, hnj hnjVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return true;
            }
            return true;
        }
        return true;
    }
}
