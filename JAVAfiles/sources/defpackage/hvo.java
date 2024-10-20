package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvo implements hvq {
    private final /* synthetic */ int a;
    private final Object b;

    public hvo(int i) {
        this.a = i;
        this.b = Bitmap.CompressFormat.JPEG;
    }

    @Override // defpackage.hvq
    public final hpt a(hpt hptVar, hnj hnjVar) {
        if (this.a != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ((Bitmap) hptVar.c()).compress((Bitmap.CompressFormat) this.b, 100, byteArrayOutputStream);
            hptVar.e();
            return new huw(byteArrayOutputStream.toByteArray(), 0);
        }
        return huh.f((Resources) this.b, hptVar);
    }

    public hvo(Resources resources, int i) {
        this.a = i;
        hwr.i(resources);
        this.b = resources;
    }
}
