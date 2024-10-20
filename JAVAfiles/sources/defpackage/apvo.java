package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.widget.CheckedTextView;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvo {
    public boolean a;
    public final Object b;

    public apvo(CheckedTextView checkedTextView) {
        this.b = checkedTextView;
    }

    public final synchronized void a(hpt hptVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            hptVar.e();
            this.a = false;
            return;
        }
        ((Handler) this.b).obtainMessage(1, hptVar).sendToTarget();
    }

    public final eql b() {
        dzg.d(!this.a);
        this.a = true;
        return new eql((SparseBooleanArray) this.b);
    }

    public final void c(int i) {
        dzg.d(!this.a);
        ((SparseBooleanArray) this.b).append(i, true);
    }

    public final void d() {
        ((CheckedTextView) this.b).getCheckMarkDrawable();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:3:0x002e, B:5:0x0034, B:8:0x003a, B:9:0x006b, B:11:0x0072, B:12:0x007d, B:14:0x0084, B:21:0x004d, B:23:0x0053, B:25:0x0059), top: B:2:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #1 {all -> 0x0099, blocks: (B:3:0x002e, B:5:0x0034, B:8:0x003a, B:9:0x006b, B:11:0x0072, B:12:0x007d, B:14:0x0084, B:21:0x004d, B:23:0x0053, B:25:0x0059), top: B:2:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.util.AttributeSet r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.b
            android.widget.CheckedTextView r0 = (android.widget.CheckedTextView) r0
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.gc.m
            r2 = 2130969043(0x7f0401d3, float:1.7546757E38)
            r3 = 0
            ktk r0 = defpackage.ktk.A(r0, r13, r1, r2, r3)
            java.lang.Object r1 = r0.b
            java.lang.Object r2 = r12.b
            r4 = r2
            android.widget.CheckedTextView r4 = (android.widget.CheckedTextView) r4
            android.content.Context r6 = r4.getContext()
            int[] r7 = defpackage.gc.m
            r5 = r2
            android.view.View r5 = (android.view.View) r5
            r9 = r1
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 2130969043(0x7f0401d3, float:1.7546757E38)
            r11 = 0
            r8 = r13
            defpackage.eek.m(r5, r6, r7, r8, r9, r10, r11)
            r13 = 1
            boolean r1 = r0.v(r13)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L4d
            int r13 = r0.n(r13, r3)     // Catch: java.lang.Throwable -> L99
            if (r13 == 0) goto L4d
            java.lang.Object r1 = r12.b     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            r2 = r1
            android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            android.content.Context r2 = r2.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            android.graphics.drawable.Drawable r13 = defpackage.d.f(r2, r13)     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            r1.setCheckMarkDrawable(r13)     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            goto L6b
        L4d:
            boolean r13 = r0.v(r3)     // Catch: java.lang.Throwable -> L99
            if (r13 == 0) goto L6b
            int r13 = r0.n(r3, r3)     // Catch: java.lang.Throwable -> L99
            if (r13 == 0) goto L6b
            java.lang.Object r1 = r12.b     // Catch: java.lang.Throwable -> L99
            r2 = r1
            android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2     // Catch: java.lang.Throwable -> L99
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Throwable -> L99
            android.graphics.drawable.Drawable r13 = defpackage.d.f(r2, r13)     // Catch: java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: java.lang.Throwable -> L99
            r1.setCheckMarkDrawable(r13)     // Catch: java.lang.Throwable -> L99
        L6b:
            r13 = 2
            boolean r1 = r0.v(r13)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r12.b     // Catch: java.lang.Throwable -> L99
            android.content.res.ColorStateList r13 = r0.o(r13)     // Catch: java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: java.lang.Throwable -> L99
            r1.setCheckMarkTintList(r13)     // Catch: java.lang.Throwable -> L99
        L7d:
            r13 = 3
            boolean r1 = r0.v(r13)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L95
            java.lang.Object r1 = r12.b     // Catch: java.lang.Throwable -> L99
            r2 = -1
            int r13 = r0.k(r13, r2)     // Catch: java.lang.Throwable -> L99
            r2 = 0
            android.graphics.PorterDuff$Mode r13 = defpackage.a.u(r13, r2)     // Catch: java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: java.lang.Throwable -> L99
            r1.setCheckMarkTintMode(r13)     // Catch: java.lang.Throwable -> L99
        L95:
            r0.t()
            return
        L99:
            r13 = move-exception
            r0.t()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apvo.e(android.util.AttributeSet):void");
    }

    public apvo(char[] cArr) {
        this.b = new SparseBooleanArray();
    }

    public apvo(byte[] bArr, byte[] bArr2) {
        this.b = new ArrayDeque();
    }

    public apvo(byte[] bArr) {
        this.b = new Handler(Looper.getMainLooper(), new hxm(1));
    }

    public apvo(armf armfVar) {
        armfVar.getClass();
        this.b = armfVar;
    }

    public apvo() {
        this.b = new ArrayDeque();
        this.a = false;
    }
}
