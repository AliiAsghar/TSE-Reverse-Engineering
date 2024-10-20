package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ufi extends ugh {
    private final ufj g;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        yyb b();
    }

    public ufi(Context context, ufk ufkVar, int i) {
        super(context, ufkVar);
        ugc ugcVar = ufj.d;
        if (ugcVar.a == null) {
            synchronized (ugcVar) {
                if (ugcVar.a == null) {
                    ugcVar.a = new ufj(context);
                }
            }
        }
        ufj ufjVar = (ufj) ugcVar.a;
        this.g = ufjVar;
        if (i != ufjVar.c) {
            ufjVar.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ugh, defpackage.ufr
    public final ufu b(List list) {
        aiut.b();
        Uri uri = ((ufk) this.b).k;
        if (uri != null && ydk.v(uri)) {
            String str = uri.getPathSegments().get(1);
            String m = m();
            ugf i = i();
            ufk ufkVar = (ufk) this.b;
            Bitmap a2 = i.a(ufkVar.b, ufkVar.c);
            Canvas canvas = new Canvas();
            canvas.setBitmap(a2);
            String charSequence = str.toString();
            int height = a2.getHeight();
            ufj ufjVar = this.g;
            ugc ugcVar = ufj.d;
            canvas.drawText(charSequence, brg.a, height - ufjVar.b.bottom, this.g.a);
            return new ufh(m, a2, 1, this.c, this.d);
        }
        throw new IllegalArgumentException("Invalid emoji URI: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.ufr
    public final int f() {
        return 3;
    }
}
