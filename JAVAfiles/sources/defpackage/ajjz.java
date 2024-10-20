package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajjz {
    public final ColorStateList a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public final ColorStateList k;
    public float l;
    public Typeface m;
    private final int n;
    private boolean o = false;
    private boolean p = false;

    public ajjz(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ajjw.b);
        this.l = obtainStyledAttributes.getDimension(0, brg.a);
        this.k = ajki.e(context, obtainStyledAttributes, 3);
        ajki.e(context, obtainStyledAttributes, 4);
        ajki.e(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.e = obtainStyledAttributes.getInt(1, 1);
        int d = ajki.d(obtainStyledAttributes, 12, 10);
        this.n = obtainStyledAttributes.getResourceId(d, 0);
        this.b = obtainStyledAttributes.getString(d);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = ajki.e(context, obtainStyledAttributes, 6);
        this.f = obtainStyledAttributes.getFloat(7, brg.a);
        this.g = obtainStyledAttributes.getFloat(8, brg.a);
        this.h = obtainStyledAttributes.getFloat(9, brg.a);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, ajjw.a);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.j = obtainStyledAttributes2.getFloat(0, brg.a);
        this.c = obtainStyledAttributes2.getString(ajki.d(obtainStyledAttributes2, 3, 1));
        obtainStyledAttributes2.recycle();
    }

    private final void g() {
        Typeface typeface;
        String str;
        if (this.m == null && (str = this.b) != null) {
            this.m = Typeface.create(str, this.d);
        }
        if (this.m == null) {
            int i = this.e;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.m = Typeface.DEFAULT;
                        this.m = Typeface.create(this.m, this.d);
                    }
                    typeface = Typeface.MONOSPACE;
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            this.m = typeface;
            this.m = Typeface.create(this.m, this.d);
        }
    }

    private final boolean h(Context context) {
        Typeface e;
        String str;
        Typeface create;
        if (this.o) {
            return true;
        }
        int i = this.n;
        if (i == 0) {
            return false;
        }
        WeakHashMap weakHashMap = ean.a;
        Typeface typeface = null;
        if (context.isRestricted()) {
            e = null;
        } else {
            e = ean.e(context, i, new TypedValue(), 0, null, false, true);
        }
        if (e == null) {
            if (!this.p) {
                this.p = true;
                int i2 = this.n;
                Resources resources = context.getResources();
                if (i2 != 0 && resources.getResourceTypeName(i2).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i2);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), dxy.b);
                                str = obtainAttributes.getString(7);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.d);
                }
            }
            if (typeface == null) {
                return false;
            }
            e = typeface;
        }
        this.m = e;
        this.o = true;
        return true;
    }

    public final Typeface a() {
        g();
        return this.m;
    }

    public final void b(Context context, ajka ajkaVar) {
        if (!h(context)) {
            g();
        }
        int i = this.n;
        if (i == 0) {
            this.o = true;
            i = 0;
        }
        if (!this.o) {
            try {
                ean.d(context, i, new ajjx(this, ajkaVar));
                return;
            } catch (Resources.NotFoundException unused) {
                this.o = true;
                ajkaVar.a(1);
                return;
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font ".concat(String.valueOf(this.b)), e);
                this.o = true;
                ajkaVar.a(-3);
                return;
            }
        }
        ajkaVar.b(this.m, true);
    }

    public final void c(Context context, TextPaint textPaint, ajka ajkaVar) {
        int i;
        int i2;
        d(context, textPaint, ajkaVar);
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, this.k.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.h;
        float f2 = this.f;
        float f3 = this.g;
        ColorStateList colorStateList2 = this.a;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, this.a.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public final void d(Context context, TextPaint textPaint, ajka ajkaVar) {
        Typeface typeface;
        if (h(context) && this.o && (typeface = this.m) != null) {
            e(context, textPaint, typeface);
        } else {
            e(context, textPaint, a());
            b(context, new ajjy(this, context, textPaint, ajkaVar));
        }
    }

    public final void e(Context context, TextPaint textPaint, Typeface typeface) {
        float f;
        Typeface b = ajki.b(context.getResources().getConfiguration(), typeface);
        if (b != null) {
            typeface = b;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        boolean z = true;
        if (1 != (i & 1)) {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = brg.a;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(this.c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
