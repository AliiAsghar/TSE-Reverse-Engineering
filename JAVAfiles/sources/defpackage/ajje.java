package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajje extends Property {
    public ajje(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = ajjf.a;
        return Float.valueOf(((ajjf) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        int[] iArr = ajjf.a;
        ((ajjf) obj).g = floatValue;
    }
}
