package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpj {
    public final XmlPullParser a;
    private int c = 0;
    public final coz b = new coz();

    public cpj(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        float c = dyv.c(typedArray, this.a, str, i, f);
        e(typedArray.getChangingConfigurations());
        return c;
    }

    public final int b(TypedArray typedArray, String str, int i, int i2) {
        int e = dyv.e(typedArray, this.a, str, i, i2);
        e(typedArray.getChangingConfigurations());
        return e;
    }

    public final TypedArray c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray g = dyv.g(resources, theme, attributeSet, iArr);
        e(g.getChangingConfigurations());
        return g;
    }

    public final String d(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        e(typedArray.getChangingConfigurations());
        return string;
    }

    public final void e(int i) {
        this.c = i | this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpj)) {
            return false;
        }
        cpj cpjVar = (cpj) obj;
        if (d.F(this.a, cpjVar.a) && this.c == cpjVar.c) {
            return true;
        }
        return false;
    }

    public final float f(TypedArray typedArray, int i) {
        float dimension = typedArray.getDimension(i, brg.a);
        e(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(TypedArray typedArray, int i) {
        float f = typedArray.getFloat(i, brg.a);
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public final arrt h(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        arrt t = dyv.t(typedArray, this.a, theme, str, i);
        e(typedArray.getChangingConfigurations());
        return t;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c;
    }

    public final String toString() {
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + this.c + ')';
    }
}
