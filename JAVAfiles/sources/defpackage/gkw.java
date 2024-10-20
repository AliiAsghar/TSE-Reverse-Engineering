package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkw extends Property {
    public gkw(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        glc glcVar = (glc) obj;
        PointF pointF = (PointF) obj2;
        glcVar.c = Math.round(pointF.x);
        glcVar.d = Math.round(pointF.y);
        int i = glcVar.f + 1;
        glcVar.f = i;
        if (glcVar.e == i) {
            glcVar.a();
        }
    }
}
