package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkv extends Property {
    public gkv(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        glc glcVar = (glc) obj;
        PointF pointF = (PointF) obj2;
        glcVar.a = Math.round(pointF.x);
        glcVar.b = Math.round(pointF.y);
        int i = glcVar.e + 1;
        glcVar.e = i;
        if (i == glcVar.f) {
            glcVar.a();
        }
    }
}
