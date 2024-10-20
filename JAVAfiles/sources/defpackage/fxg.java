package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxg {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public fxg() {
        this.a = -1;
    }

    private final Object k(long j, boolean z) {
        long j2 = Long.MAX_VALUE;
        Object obj = null;
        while (this.a > 0) {
            long j3 = j - ((long[]) this.c)[this.b];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = l();
            j2 = j3;
        }
        return obj;
    }

    private final Object l() {
        boolean z;
        if (this.a > 0) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        Object obj = this.d;
        int i = this.b;
        Object[] objArr = (Object[]) obj;
        Object obj2 = objArr[i];
        objArr[i] = null;
        this.b = (i + 1) % objArr.length;
        this.a--;
        return obj2;
    }

    public final fxh a() {
        int i = this.a;
        Object obj = this.c;
        return new fxh(i, (String) obj, (String) this.d, this.b);
    }

    public final void b(String str) {
        String e = erl.e(str);
        boolean z = true;
        if (e != null && !erl.g(e)) {
            z = false;
        }
        d.t(z, "Not an audio MIME type: ".concat(String.valueOf(e)));
        this.c = e;
    }

    public final void c(String str) {
        String e = erl.e(str);
        boolean z = true;
        if (e != null && !erl.j(e)) {
            z = false;
        }
        d.t(z, "Not a video MIME type: ".concat(String.valueOf(e)));
        this.d = e;
    }

    public final synchronized int d() {
        return this.a;
    }

    public final synchronized Object e(long j) {
        return k(j, false);
    }

    public final synchronized Object f() {
        if (this.a == 0) {
            return null;
        }
        return l();
    }

    public final synchronized Object g(long j) {
        return k(j, true);
    }

    public final synchronized void h(long j, Object obj) {
        if (this.a > 0) {
            if (j <= ((long[]) this.c)[((this.b + r0) - 1) % ((Object[]) this.d).length]) {
                i();
            }
        }
        int length = ((Object[]) this.d).length;
        if (this.a >= length) {
            int i = length + length;
            long[] jArr = new long[i];
            Object[] objArr = new Object[i];
            int i2 = this.b;
            int i3 = length - i2;
            System.arraycopy(this.c, i2, jArr, 0, i3);
            System.arraycopy(this.d, this.b, objArr, 0, i3);
            int i4 = this.b;
            if (i4 > 0) {
                System.arraycopy(this.c, 0, jArr, i3, i4);
                System.arraycopy(this.d, 0, objArr, i3, this.b);
            }
            this.c = jArr;
            this.d = objArr;
            this.b = 0;
        }
        int i5 = this.b;
        int i6 = this.a;
        Object obj2 = this.d;
        int length2 = (i5 + i6) % ((Object[]) obj2).length;
        ((long[]) this.c)[length2] = j;
        ((Object[]) obj2)[length2] = obj;
        this.a = i6 + 1;
    }

    public final synchronized void i() {
        this.b = 0;
        this.a = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public final void j(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        this.d = attribute;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    public fxg(fxh fxhVar) {
        this.a = fxhVar.a;
        this.c = fxhVar.b;
        this.d = fxhVar.c;
        this.b = fxhVar.d;
    }

    public fxg(byte[] bArr) {
        this.c = new long[10];
        this.d = new Object[10];
    }

    public fxg(Object obj, int i, int i2) {
        j(g.a, obj, i, i2);
    }

    public fxg(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        j(attribute, obj, i, i2);
    }

    public fxg(Context context, XmlPullParser xmlPullParser) {
        this.d = new ArrayList();
        this.b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), dxp.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(0, this.a);
            } else if (index == 1) {
                this.b = obtainStyledAttributes.getResourceId(1, this.b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.b);
                context.getResources().getResourceName(this.b);
                if ("layout".equals(resourceTypeName)) {
                    dxl dxlVar = new dxl();
                    this.c = dxlVar;
                    dxlVar.e(context, this.b);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
