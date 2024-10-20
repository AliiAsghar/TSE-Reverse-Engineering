package defpackage;

import android.graphics.Bitmap;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aavg implements aavi {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aavg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aavi
    public final void a(OutputStream outputStream) {
        if (this.b != 0) {
            ((Bitmap) this.a).compress(Bitmap.CompressFormat.JPEG, 90, outputStream);
            return;
        }
        outputStream.write((byte[]) this.a);
    }
}
