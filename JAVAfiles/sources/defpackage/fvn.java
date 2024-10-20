package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Looper;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvn implements fvb {
    public final Context a;
    public final fvk b;
    public final eti c;
    public final eth d;
    public fvb e;
    public fvb f;

    public fvn(Context context, fvk fvkVar, eti etiVar) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        this.a = context.getApplicationContext();
        this.b = fvkVar;
        this.c = etiVar;
        int i = eul.a;
        BitmapFactory.Options options = new BitmapFactory.Options();
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        options.inPreferredColorSpace = colorSpace;
        this.d = new evh(albo.bB(Executors.newSingleThreadExecutor()), new evm(context), options);
    }

    @Override // defpackage.fvb
    public final fvd a(fvz fvzVar, Looper looper, fvc fvcVar, ita itaVar) {
        throw null;
    }
}
