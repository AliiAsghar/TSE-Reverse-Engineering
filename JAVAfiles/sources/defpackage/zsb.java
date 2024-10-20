package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsb extends Property {
    public zsb(Class cls) {
        super(cls, "level");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getLevel());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((Drawable) obj).setLevel(((Integer) obj2).intValue());
    }
}
