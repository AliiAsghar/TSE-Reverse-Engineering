package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.apps.messaging.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajli {
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public ajli() {
    }

    private final void a() {
        this.b = new ajkr();
        this.c = new int[10];
        this.d = new ajkr[10];
    }

    public ajli(Context context, int i) {
        int next;
        int depth;
        TypedArray obtainStyledAttributes;
        a();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            try {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == 3)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    Resources resources = context.getResources();
                                    if (theme == null) {
                                        obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, ajkn.a);
                                    } else {
                                        obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, ajkn.a, 0, 0);
                                    }
                                    ajkr ajkrVar = new ajkr(ajkr.f(context, obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), new ajkd(brg.a)));
                                    obtainStyledAttributes.recycle();
                                    int attributeCount = asAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i2 = 0;
                                    for (int i3 = 0; i3 < attributeCount; i3++) {
                                        int attributeNameResource = asAttributeSet.getAttributeNameResource(i3);
                                        if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                            int i4 = i2 + 1;
                                            iArr[i2] = asAttributeSet.getAttributeBooleanValue(i3, false) ? attributeNameResource : -attributeNameResource;
                                            i2 = i4;
                                        }
                                    }
                                    int[] trimStateSet = StateSet.trimStateSet(iArr, i2);
                                    int i5 = this.a;
                                    if (i5 == 0 || trimStateSet.length == 0) {
                                        this.b = ajkrVar;
                                    }
                                    Object obj = this.c;
                                    if (i5 >= ((int[][]) obj).length) {
                                        int i6 = i5 + 10;
                                        int[][] iArr2 = new int[i6];
                                        System.arraycopy(obj, 0, iArr2, 0, i5);
                                        this.c = iArr2;
                                        ajkr[] ajkrVarArr = new ajkr[i6];
                                        System.arraycopy(this.d, 0, ajkrVarArr, 0, i5);
                                        this.d = ajkrVarArr;
                                    }
                                    Object obj2 = this.c;
                                    int i7 = this.a;
                                    ((int[][]) obj2)[i7] = trimStateSet;
                                    ((ajkr[]) this.d)[i7] = ajkrVar;
                                    this.a = i7 + 1;
                                }
                            }
                        }
                        if (xml != null) {
                            xml.close();
                            return;
                        }
                        return;
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } catch (Throwable th) {
                if (xml == null) {
                    throw th;
                }
                try {
                    xml.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            a();
        }
    }
}
