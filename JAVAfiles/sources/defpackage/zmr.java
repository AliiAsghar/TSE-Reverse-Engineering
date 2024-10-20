package defpackage;

import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmr {
    public final Object a;

    public zmr(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final zpv a(View.OnClickListener onClickListener) {
        xnv xnvVar = (xnv) this.a.b();
        xnvVar.getClass();
        onClickListener.getClass();
        return new zpv(xnvVar, onClickListener);
    }

    public zmr(ImageView imageView) {
        imageView.getClass();
        this.a = imageView;
    }

    public zmr(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
