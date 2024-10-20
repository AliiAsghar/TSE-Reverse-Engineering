package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class le extends eal {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ lg d;

    public le(lg lgVar, int i, int i2, WeakReference weakReference) {
        this.d = lgVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.eal
    public final void b(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            if ((this.b & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = Typeface.create(typeface, i, z);
        }
        lg lgVar = this.d;
        WeakReference weakReference = this.c;
        if (lgVar.c) {
            lgVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new qq(textView, typeface, lgVar.a, 1));
                } else {
                    lg.f(textView, typeface, lgVar.a);
                }
            }
        }
    }

    @Override // defpackage.eal
    public final void a(int i) {
    }
}
