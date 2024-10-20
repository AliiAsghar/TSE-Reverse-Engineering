package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lba implements lbb {
    public final Function a;
    private final Context b;
    private final Map c;
    private final Paint d;
    private Drawable e;
    private float f;
    private atal g;

    public lba(Context context, atal atalVar, atal atalVar2, Function function) {
        d.s(true);
        d.s(true);
        this.b = context;
        this.g = atalVar;
        this.f = brg.a;
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(ahnz.f(context, R.attr.colorPrimary, "SwipeActionCallback"));
        this.a = function;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.put(atalVar, Optional.empty());
        hashMap.put(atalVar2, Optional.empty());
    }

    @Override // defpackage.lbb
    public final void a() {
        if (this.c.containsValue(Optional.empty())) {
            for (atal atalVar : this.c.keySet()) {
                Drawable p = atalVar.p();
                p.setTint(ahnz.f(this.b, R.attr.colorOnPrimary, "SwipeActionCallback"));
                this.c.put(atalVar, Optional.of(p));
            }
            c(this.g);
        }
    }

    @Override // defpackage.lbb
    public final void b(Canvas canvas, RecyclerView recyclerView, oo ooVar, float f, boolean z) {
        law lawVar = new law();
        lawVar.a = this.b;
        lawVar.h(this.g);
        lawVar.e(this.e);
        lawVar.b = this.d;
        lawVar.b(canvas);
        lawVar.c = recyclerView;
        lawVar.d = ooVar;
        lawVar.c(f);
        lawVar.d(this.f);
        lawVar.f(z);
        lawVar.g();
        this.f = lga.C(lawVar.a());
    }

    public final void c(atal atalVar) {
        d.s(this.c.containsKey(atalVar));
        Optional optional = (Optional) this.c.get(atalVar);
        if (optional != null && optional.isPresent()) {
            this.g = atalVar;
            this.e = (Drawable) optional.get();
        }
    }
}
