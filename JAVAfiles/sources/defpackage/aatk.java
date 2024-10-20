package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatk implements aatg {
    public static final Uri[] a = {MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.EXTERNAL_CONTENT_URI};
    public final anen b;
    public final rvt c;
    public final yjf d;
    public final xnv e;
    public final boolean f;
    public final boolean g = ((Boolean) utw.a.e()).booleanValue();
    public final Function h;
    public final atsg i;

    public aatk(Context context, anen anenVar, enm enmVar, atsg atsgVar, aksr aksrVar, ahiy ahiyVar, rvt rvtVar, yjf yjfVar, xnv xnvVar, abac abacVar) {
        this.b = anenVar;
        this.i = atsgVar;
        this.c = rvtVar;
        this.d = yjfVar;
        this.e = xnvVar;
        this.f = context.getPackageManager().hasSystemFeature("android.hardware.camera");
        this.h = new aaky(abacVar, 11);
        enmVar.N().c(new aati(atsgVar, new aath(aksrVar, anenVar, ahiyVar), 0));
    }

    @Override // defpackage.aatg
    public final akfb a() {
        return new aatj(this);
    }
}
