package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdl extends hdd {
    public hdl(List list) {
        super(list);
    }

    @Override // defpackage.hcw
    public final /* bridge */ /* synthetic */ Object f(hie hieVar, float f) {
        Object obj;
        float floatValue;
        hem hemVar;
        hig higVar = this.d;
        if (higVar != null) {
            float f2 = hieVar.g;
            Float f3 = hieVar.h;
            if (f3 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f3.floatValue();
            }
            hem hemVar2 = (hem) hieVar.b;
            Object obj2 = hieVar.c;
            if (obj2 == null) {
                hemVar = hemVar2;
            } else {
                hemVar = (hem) obj2;
            }
            return (hem) higVar.b(f2, floatValue, hemVar2, hemVar, f, b(), this.c);
        }
        if (f == 1.0f && (obj = hieVar.c) != null) {
            return (hem) obj;
        }
        return (hem) hieVar.b;
    }
}
