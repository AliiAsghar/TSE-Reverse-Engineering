package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajgn extends Property {
    final /* synthetic */ ajgo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajgn(ajgo ajgoVar, Class cls) {
        super(cls, "LABEL_OPACITY_PROPERTY");
        this.a = ajgoVar;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        int alpha = Color.alpha(extendedFloatingActionButton.t.getColorForState(extendedFloatingActionButton.getDrawableState(), this.a.a.t.getDefaultColor()));
        float alpha2 = Color.alpha(extendedFloatingActionButton.getCurrentTextColor());
        TimeInterpolator timeInterpolator = ajdd.a;
        return Float.valueOf(((alpha2 / 255.0f) / alpha) + brg.a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        Float f = (Float) obj2;
        int colorForState = extendedFloatingActionButton.t.getColorForState(extendedFloatingActionButton.getDrawableState(), this.a.a.t.getDefaultColor());
        float alpha = Color.alpha(colorForState);
        float floatValue = f.floatValue();
        TimeInterpolator timeInterpolator = ajdd.a;
        ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (((floatValue * ((alpha / 255.0f) + brg.a)) + brg.a) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
        if (f.floatValue() == 1.0f) {
            extendedFloatingActionButton.o(extendedFloatingActionButton.t);
        } else {
            extendedFloatingActionButton.o(valueOf);
        }
    }
}
