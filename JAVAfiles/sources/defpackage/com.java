package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import defpackage.cnr;
import defpackage.cog;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class com extends View {
    public static final /* synthetic */ int h = 0;
    private static final ViewOutlineProvider i = new ViewOutlineProvider() { // from class: com.1
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            if (view instanceof com) {
                int i2 = com.h;
                Outline outline2 = ((com) view).b;
                if (outline2 != null) {
                    outline.set(outline2);
                }
            }
        }
    };
    public boolean a;
    public Outline b;
    public boolean c;
    public dqv d;
    public drk e;
    public arqr f;
    public cof g;
    private final cks j;
    private final cnr k;

    public com(View view, cks cksVar, cnr cnrVar) {
        super(view.getContext());
        this.j = cksVar;
        this.k = cnrVar;
        setOutlineProvider(i);
        this.c = true;
        this.d = cnv.a;
        this.e = drk.a;
        this.f = cog.a.a;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        cks cksVar = this.j;
        cjw cjwVar = cksVar.a;
        Canvas canvas2 = cjwVar.a;
        cjwVar.a = canvas;
        dqv dqvVar = this.d;
        drk drkVar = this.e;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = Float.floatToRawIntBits(width);
        long floatToRawIntBits2 = Float.floatToRawIntBits(height);
        cnr cnrVar = this.k;
        cnu cnuVar = cnrVar.b;
        cof cofVar = this.g;
        arqr arqrVar = this.f;
        dqv c = cnuVar.c();
        drk d = cnrVar.b.d();
        ckr b = cnrVar.b.b();
        long a = cnrVar.b.a();
        cnu cnuVar2 = cnrVar.b;
        cnr.AnonymousClass1 anonymousClass1 = (cnr.AnonymousClass1) cnuVar2;
        cof cofVar2 = anonymousClass1.b;
        cnuVar2.f(dqvVar);
        cnuVar2.g(drkVar);
        cnuVar2.e(cjwVar);
        cnuVar2.h((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L));
        anonymousClass1.b = cofVar;
        cjwVar.l();
        try {
            arqrVar.a(cnrVar);
            cjwVar.j();
            cnu cnuVar3 = cnrVar.b;
            cnuVar3.f(c);
            cnuVar3.g(d);
            cnuVar3.e(b);
            cnuVar3.h(a);
            ((cnr.AnonymousClass1) cnuVar3).b = cofVar2;
            cksVar.a.a = canvas2;
            this.a = false;
        } catch (Throwable th) {
            cjwVar.j();
            cnu cnuVar4 = cnrVar.b;
            cnuVar4.f(c);
            cnuVar4.g(d);
            cnuVar4.e(b);
            cnuVar4.h(a);
            ((cnr.AnonymousClass1) cnuVar4).b = cofVar2;
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.a) {
            this.a = true;
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
