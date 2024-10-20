package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.arnb;
import defpackage.arqv;
import defpackage.arrj;
import defpackage.arrp;
import defpackage.bwj;
import defpackage.byn;
import defpackage.byu;
import defpackage.bzf;
import defpackage.bzh;
import defpackage.bzz;
import defpackage.cav;
import defpackage.czt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ComposeView extends czt {
    private final byn a;
    private boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.platform.ComposeView$1, reason: invalid class name */
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
            ComposeView.this.b((bwj) obj, a);
            return arnb.a;
        }
    }

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void a(arqv arqvVar) {
        this.b = true;
        this.a.h(arqvVar);
        if (isAttachedToWindow()) {
            e();
        }
    }

    @Override // defpackage.czt
    public final void b(bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        bwj c = bwjVar.c(420213850);
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
            arqv arqvVar = (arqv) this.a.a();
            if (arqvVar != null) {
                arqvVar.a(c, 0);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(i);
        }
    }

    @Override // defpackage.czt
    protected final boolean d() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new byu(null, cav.a);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, arrj arrjVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
