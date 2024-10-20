package defpackage;

import android.content.Context;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmz extends czt implements dtf {
    private final Window a;
    private final boolean b;
    private final arqg c;
    private final zj d;
    private final arwe e;
    private final byn f;
    private Object g;
    private boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bmz$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.b = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.b | 1);
            bmz.this.b((bwj) obj, a);
            return arnb.a;
        }
    }

    public bmz(Context context, Window window, arqg arqgVar, zj zjVar, arwe arweVar) {
        super(context, null, 0, 6, null);
        this.a = window;
        this.b = true;
        this.c = arqgVar;
        this.d = zjVar;
        this.e = arweVar;
        this.f = new byu(blm.a, cav.a);
    }

    @Override // defpackage.dtf
    public final Window a() {
        return this.a;
    }

    @Override // defpackage.czt
    public final void b(bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        bwj c = bwjVar.c(576708319);
        if (i4 == 0) {
            if (true != c.I(this)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c.L()) {
            c.v();
        } else {
            ((arqv) this.f.a()).a(c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(i);
        }
    }

    public final void c(bwr bwrVar, arqv arqvVar) {
        super.i(bwrVar);
        this.f.h(arqvVar);
        this.h = true;
        e();
    }

    @Override // defpackage.czt
    protected final boolean d() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r1 = findOnBackInvokedDispatcher();
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // defpackage.czt, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            boolean r0 = r4.b
            if (r0 == 0) goto L3f
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto Le
            goto L3f
        Le:
            java.lang.Object r0 = r4.g
            if (r0 != 0) goto L2d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L24
            arqg r0 = r4.c
            zj r1 = r4.d
            arwe r2 = r4.e
            bmy r3 = new bmy
            r3.<init>(r2, r1, r0)
            goto L2b
        L24:
            arqg r0 = r4.c
            bmx r3 = new bmx
            r3.<init>()
        L2b:
            r4.g = r3
        L2d:
            java.lang.Object r0 = r4.g
            boolean r1 = defpackage.bo$$ExternalSyntheticApiModelOutline0.m120m(r0)
            if (r1 == 0) goto L3f
            android.window.OnBackInvokedDispatcher r1 = defpackage.bo$$ExternalSyntheticApiModelOutline0.m(r4)
            if (r1 == 0) goto L3f
            r2 = 0
            defpackage.bo$$ExternalSyntheticApiModelOutline0.m(r1, r2, r0)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmz.onAttachedToWindow():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r1 = findOnBackInvokedDispatcher();
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDetachedFromWindow() {
        /*
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1a
            java.lang.Object r0 = r2.g
            boolean r1 = defpackage.bo$$ExternalSyntheticApiModelOutline0.m120m(r0)
            if (r1 == 0) goto L1a
            android.window.OnBackInvokedDispatcher r1 = defpackage.bo$$ExternalSyntheticApiModelOutline0.m(r2)
            if (r1 == 0) goto L1a
            defpackage.bo$$ExternalSyntheticApiModelOutline0.m(r1, r0)
        L1a:
            r0 = 0
            r2.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmz.onDetachedFromWindow():void");
    }
}
