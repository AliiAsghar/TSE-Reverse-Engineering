package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bwj;
import defpackage.dfu;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfv {
    public static final cor a(int i, bwj bwjVar, int i2) {
        TypedValue typedValue;
        boolean z;
        Context context = (Context) bwjVar.g(AndroidCompositionLocals_androidKt.b);
        bwjVar.g(AndroidCompositionLocals_androidKt.a);
        Resources resources = context.getResources();
        dfx dfxVar = (dfx) bwjVar.g(AndroidCompositionLocals_androidKt.d);
        synchronized (dfxVar) {
            typedValue = (TypedValue) dfxVar.a.a(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                tx txVar = dfxVar.a;
                int c = txVar.c(i);
                Object[] objArr = txVar.c;
                Object obj = objArr[c];
                txVar.b[c] = i;
                objArr[c] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        dfu.a aVar = null;
        if (charSequence != null && arsd.P(charSequence, ".xml")) {
            bwjVar.y(-803043333);
            Resources.Theme theme = context.getTheme();
            int i3 = typedValue.changingConfigurations;
            dfu dfuVar = (dfu) bwjVar.g(AndroidCompositionLocals_androidKt.c);
            dfu.b bVar = new dfu.b(theme, i);
            WeakReference weakReference = (WeakReference) dfuVar.a.get(bVar);
            if (weakReference != null) {
                aVar = (dfu.a) weakReference.get();
            }
            if (aVar == null) {
                XmlResourceParser xml = resources.getXml(i);
                cpl.a(xml);
                if (d.F(xml.getName(), "vector")) {
                    aVar = dgb.a(theme, resources, xml, i3);
                    dfuVar.a.put(bVar, new WeakReference(aVar));
                } else {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
            }
            cpg b = cph.b(aVar.a, bwjVar);
            bwjVar.q();
            return b;
        }
        bwjVar.y(-802887899);
        Object theme2 = context.getTheme();
        boolean G = bwjVar.G(charSequence);
        if ((((i2 & 14) ^ 6) <= 4 || !bwjVar.E(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean G2 = G | z | bwjVar.G(theme2);
        Object h = bwjVar.h();
        if (G2 || h == bwj.a.a) {
            try {
                Drawable drawable = resources.getDrawable(i, null);
                drawable.getClass();
                h = new cjz(((BitmapDrawable) drawable).getBitmap());
                bwjVar.B(h);
            } catch (Exception e) {
                Objects.toString(charSequence);
                throw new dfy("Error attempting to load resource: ".concat(String.valueOf(charSequence)), e);
            }
        }
        cop copVar = new cop((clg) h);
        bwjVar.q();
        return copVar;
    }
}
