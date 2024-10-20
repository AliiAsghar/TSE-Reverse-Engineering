package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavq extends Property {
    final /* synthetic */ View a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aavq(Class cls, View view) {
        super(cls, "scale");
        this.a = view;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getScaleX());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        this.a.setScaleX(f.floatValue());
        this.a.setScaleY(f.floatValue());
    }
}
