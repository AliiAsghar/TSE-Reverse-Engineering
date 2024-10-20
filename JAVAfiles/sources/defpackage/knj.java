package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class knj {
    public final String a;
    public alog b;
    public boolean c;
    public int d = 1;
    public ndk e;
    public final jxv f;

    public knj(kni kniVar, String str) {
        this.f = new jxv(kniVar, str);
        this.a = str;
        int i = alog.d;
        this.b = alsx.a;
        this.c = true;
    }

    public abstract knk a();

    public final void b(int i) {
        int i2 = alog.d;
        c(i, alsx.a);
    }

    public final void c(int i, alog alogVar) {
        this.d = i;
        this.b = alogVar;
        ndk ndkVar = this.e;
        if (ndkVar != null) {
            ((Activity) ndkVar.a).runOnUiThread(new ivl(ndkVar.b, 16));
        }
    }
}
