package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import defpackage.clr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class clq {
    public static /* synthetic */ void a(clr clrVar, cjp cjpVar) {
        clr.a aVar = clr.a.a;
        cke ckeVar = (cke) clrVar;
        if (ckeVar.b == null) {
            ckeVar.b = new RectF();
        }
        RectF rectF = ckeVar.b;
        rectF.getClass();
        rectF.set(cjpVar.b, cjpVar.c, cjpVar.d, cjpVar.e);
        Path path = ckeVar.a;
        RectF rectF2 = ckeVar.b;
        rectF2.getClass();
        path.addOval(rectF2, ckh.a(aVar));
    }

    public static /* synthetic */ void b(clr clrVar, cjp cjpVar) {
        clr.a aVar = clr.a.a;
        if (Float.isNaN(cjpVar.b) || Float.isNaN(cjpVar.c) || Float.isNaN(cjpVar.d) || Float.isNaN(cjpVar.e)) {
            ckh.b("Invalid rectangle, make sure no value is NaN");
        }
        cke ckeVar = (cke) clrVar;
        if (ckeVar.b == null) {
            ckeVar.b = new RectF();
        }
        RectF rectF = ckeVar.b;
        rectF.getClass();
        rectF.set(cjpVar.b, cjpVar.c, cjpVar.d, cjpVar.e);
        Path path = ckeVar.a;
        RectF rectF2 = ckeVar.b;
        rectF2.getClass();
        path.addRect(rectF2, ckh.a(aVar));
    }

    public static /* synthetic */ void c(clr clrVar, cjr cjrVar) {
        clr.a aVar = clr.a.a;
        cke ckeVar = (cke) clrVar;
        if (ckeVar.b == null) {
            ckeVar.b = new RectF();
        }
        RectF rectF = ckeVar.b;
        rectF.getClass();
        rectF.set(cjrVar.a, cjrVar.b, cjrVar.c, cjrVar.d);
        if (ckeVar.c == null) {
            ckeVar.c = new float[8];
        }
        float[] fArr = ckeVar.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (cjrVar.e >> 32));
        fArr[1] = Float.intBitsToFloat((int) (cjrVar.e & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (cjrVar.f >> 32));
        fArr[3] = Float.intBitsToFloat((int) (cjrVar.f & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (cjrVar.g >> 32));
        fArr[5] = Float.intBitsToFloat((int) (cjrVar.g & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (cjrVar.h >> 32));
        fArr[7] = Float.intBitsToFloat((int) (cjrVar.h & 4294967295L));
        Path path = ckeVar.a;
        RectF rectF2 = ckeVar.b;
        rectF2.getClass();
        float[] fArr2 = ckeVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, ckh.a(aVar));
    }
}
