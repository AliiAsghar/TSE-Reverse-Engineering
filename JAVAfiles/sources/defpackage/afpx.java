package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class afpx<T> extends View {
    static final /* synthetic */ artm[] a;
    public static final TextPaint b;
    public static final afki c;
    public static final afki d;
    private static final alvi j;
    private static final afki k;
    public arwe e;
    public volatile CharSequence f;
    public volatile ekb[] g;
    public final arml h;
    public final arml i;
    private arxm l;
    private int m;
    private final arsn n;

    static {
        arrr arrrVar = new arrr(afpx.class, "content", "getContent()Ljava/lang/Object;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
        j = alvi.m("com/google/android/libraries/compose/emoji/ui/views/EmojiView");
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        b = textPaint;
        c = new afki(aeua.l);
        k = new afki(aeua.k);
        d = new afki(aeua.m);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpx(Context context) {
        super(context);
        context.getClass();
        this.m = -1;
        this.n = new afpu(b(), this);
        this.h = armd.a(new afpw(this, 1));
        this.i = armd.a(new afpw(this, 0));
    }

    public static /* synthetic */ void g(afpx afpxVar, Canvas canvas, ekb ekbVar, CharSequence charSequence) {
        float width = afpxVar.getWidth();
        int floatValue = (int) ((Number) k.a(Integer.valueOf(afpxVar.getHeight()), Integer.valueOf(afpxVar.getPaddingLeft()), Integer.valueOf(afpxVar.getPaddingRight()))).floatValue();
        ekbVar.getClass();
        charSequence.getClass();
        ekbVar.draw(canvas, charSequence, 0, charSequence.length(), width / 2.0f, 0, floatValue, 0, (Paint) c.a(Integer.valueOf(afpxVar.getHeight()), Integer.valueOf(afpxVar.getPaddingLeft()), Integer.valueOf(afpxVar.getPaddingRight())));
    }

    private final ejx h() {
        ejx b2 = ejx.b();
        if (b2 != null) {
            this.m = b2.a();
            if (b2.a() == 1) {
                return b2;
            }
            return null;
        }
        return null;
    }

    private final void i(ejx ejxVar, Object obj) {
        arxm arxmVar = this.l;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        arwe arweVar = this.e;
        if (arweVar == null) {
            arro.b("cpuBoundScope");
            arweVar = null;
        }
        this.l = arrn.J(arweVar, null, null, new yiv(this, ejxVar, obj, (arpe) null, 8), 3);
    }

    public abstract CharSequence a(Object obj);

    public abstract Object b();

    public final Object c() {
        return this.n.c(a[0]);
    }

    public abstract void d(Canvas canvas, ekb[] ekbVarArr);

    public final void e(Object obj) {
        setContentDescription(a(obj));
        CharSequence contentDescription = getContentDescription();
        contentDescription.getClass();
        if (!arsd.M(contentDescription)) {
            ejx h = h();
            if (h != null) {
                i(h, obj);
                return;
            } else {
                ((alvg) j.i().h("com/google/android/libraries/compose/emoji/ui/views/EmojiView", "onContentChanged", 83, "EmojiView.kt")).r("EmojiCompat was not initialized (status %d)", this.m);
                return;
            }
        }
        arxm arxmVar = this.l;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.f = null;
        this.g = null;
    }

    public final void f(Object obj) {
        this.n.d(a[0], obj);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        arxm arxmVar = this.l;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.l = null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        ejx h;
        canvas.getClass();
        ekb[] ekbVarArr = this.g;
        if (ekbVarArr != null) {
            d(canvas, ekbVarArr);
            return;
        }
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            arxm arxmVar = this.l;
            if ((arxmVar == null || !arxmVar.x()) && (h = h()) != null) {
                i(h, c());
                return;
            }
            return;
        }
        canvas.drawText(charSequence, 0, charSequence.length(), getWidth() / 2.0f, ((Number) k.a(Integer.valueOf(getHeight()), Integer.valueOf(getPaddingLeft()), Integer.valueOf(getPaddingRight()))).floatValue(), (Paint) c.a(Integer.valueOf(getHeight()), Integer.valueOf(getPaddingLeft()), Integer.valueOf(getPaddingRight())));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.m = -1;
        this.n = new afpv(b(), this);
        this.h = armd.a(new afpw(this, 1));
        this.i = armd.a(new afpw(this, 0));
    }
}
