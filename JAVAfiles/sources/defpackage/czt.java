package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bzj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class czt extends ViewGroup {
    private WeakReference a;
    private IBinder b;
    private bwq c;
    private bwr d;
    private arqg e;
    private boolean f;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: czt$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                czt.this.b(bwjVar, 0);
            }
            return arnb.a;
        }
    }

    public czt(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void a() {
        if (this.f) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (true != r4) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122 A[Catch: all -> 0x0218, TryCatch #1 {all -> 0x0218, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:17:0x002b, B:19:0x0032, B:21:0x0036, B:23:0x003e, B:26:0x0047, B:28:0x004d, B:29:0x0058, B:30:0x005d, B:32:0x0061, B:34:0x006d, B:37:0x0075, B:39:0x007b, B:40:0x00b6, B:41:0x00b0, B:43:0x00b4, B:44:0x00ba, B:45:0x00c1, B:50:0x00c2, B:52:0x00db, B:53:0x00fa, B:56:0x0103, B:57:0x0104, B:60:0x0109, B:61:0x010a, B:62:0x010b, B:64:0x0111, B:66:0x0119, B:68:0x0122, B:69:0x0134, B:71:0x013f, B:73:0x0145, B:74:0x0159, B:76:0x0168, B:78:0x0178, B:79:0x017e, B:81:0x0186, B:82:0x018b, B:84:0x019c, B:86:0x01a7, B:88:0x01ab, B:92:0x01bb, B:96:0x01c4, B:128:0x01c8, B:130:0x01ce, B:121:0x0207, B:98:0x01d4, B:100:0x01d9, B:102:0x01dd, B:104:0x01e5, B:106:0x01ea, B:112:0x01f2, B:114:0x01fb, B:115:0x01fe, B:110:0x0202, B:132:0x020c, B:135:0x020f, B:138:0x01a4, B:139:0x0213, B:144:0x011c, B:55:0x00fb), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f A[Catch: all -> 0x0218, TryCatch #1 {all -> 0x0218, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:17:0x002b, B:19:0x0032, B:21:0x0036, B:23:0x003e, B:26:0x0047, B:28:0x004d, B:29:0x0058, B:30:0x005d, B:32:0x0061, B:34:0x006d, B:37:0x0075, B:39:0x007b, B:40:0x00b6, B:41:0x00b0, B:43:0x00b4, B:44:0x00ba, B:45:0x00c1, B:50:0x00c2, B:52:0x00db, B:53:0x00fa, B:56:0x0103, B:57:0x0104, B:60:0x0109, B:61:0x010a, B:62:0x010b, B:64:0x0111, B:66:0x0119, B:68:0x0122, B:69:0x0134, B:71:0x013f, B:73:0x0145, B:74:0x0159, B:76:0x0168, B:78:0x0178, B:79:0x017e, B:81:0x0186, B:82:0x018b, B:84:0x019c, B:86:0x01a7, B:88:0x01ab, B:92:0x01bb, B:96:0x01c4, B:128:0x01c8, B:130:0x01ce, B:121:0x0207, B:98:0x01d4, B:100:0x01d9, B:102:0x01dd, B:104:0x01e5, B:106:0x01ea, B:112:0x01f2, B:114:0x01fb, B:115:0x01fe, B:110:0x0202, B:132:0x020c, B:135:0x020f, B:138:0x01a4, B:139:0x0213, B:144:0x011c, B:55:0x00fb), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145 A[Catch: all -> 0x0218, TryCatch #1 {all -> 0x0218, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:17:0x002b, B:19:0x0032, B:21:0x0036, B:23:0x003e, B:26:0x0047, B:28:0x004d, B:29:0x0058, B:30:0x005d, B:32:0x0061, B:34:0x006d, B:37:0x0075, B:39:0x007b, B:40:0x00b6, B:41:0x00b0, B:43:0x00b4, B:44:0x00ba, B:45:0x00c1, B:50:0x00c2, B:52:0x00db, B:53:0x00fa, B:56:0x0103, B:57:0x0104, B:60:0x0109, B:61:0x010a, B:62:0x010b, B:64:0x0111, B:66:0x0119, B:68:0x0122, B:69:0x0134, B:71:0x013f, B:73:0x0145, B:74:0x0159, B:76:0x0168, B:78:0x0178, B:79:0x017e, B:81:0x0186, B:82:0x018b, B:84:0x019c, B:86:0x01a7, B:88:0x01ab, B:92:0x01bb, B:96:0x01c4, B:128:0x01c8, B:130:0x01ce, B:121:0x0207, B:98:0x01d4, B:100:0x01d9, B:102:0x01dd, B:104:0x01e5, B:106:0x01ea, B:112:0x01f2, B:114:0x01fb, B:115:0x01fe, B:110:0x0202, B:132:0x020c, B:135:0x020f, B:138:0x01a4, B:139:0x0213, B:144:0x011c, B:55:0x00fb), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168 A[Catch: all -> 0x0218, TryCatch #1 {all -> 0x0218, blocks: (B:5:0x0006, B:7:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x001d, B:17:0x002b, B:19:0x0032, B:21:0x0036, B:23:0x003e, B:26:0x0047, B:28:0x004d, B:29:0x0058, B:30:0x005d, B:32:0x0061, B:34:0x006d, B:37:0x0075, B:39:0x007b, B:40:0x00b6, B:41:0x00b0, B:43:0x00b4, B:44:0x00ba, B:45:0x00c1, B:50:0x00c2, B:52:0x00db, B:53:0x00fa, B:56:0x0103, B:57:0x0104, B:60:0x0109, B:61:0x010a, B:62:0x010b, B:64:0x0111, B:66:0x0119, B:68:0x0122, B:69:0x0134, B:71:0x013f, B:73:0x0145, B:74:0x0159, B:76:0x0168, B:78:0x0178, B:79:0x017e, B:81:0x0186, B:82:0x018b, B:84:0x019c, B:86:0x01a7, B:88:0x01ab, B:92:0x01bb, B:96:0x01c4, B:128:0x01c8, B:130:0x01ce, B:121:0x0207, B:98:0x01d4, B:100:0x01d9, B:102:0x01dd, B:104:0x01e5, B:106:0x01ea, B:112:0x01f2, B:114:0x01fb, B:115:0x01fe, B:110:0x0202, B:132:0x020c, B:135:0x020f, B:138:0x01a4, B:139:0x0213, B:144:0x011c, B:55:0x00fb), top: B:4:0x0006 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, java.lang.Object, czt] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [cbh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c() {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czt.c():void");
    }

    private final void k(bwr bwrVar) {
        if (true != l(bwrVar)) {
            bwrVar = null;
        }
        if (bwrVar != null) {
            this.a = new WeakReference(bwrVar);
        }
    }

    private static final boolean l(bwr bwrVar) {
        if ((bwrVar instanceof bzj) && ((bzj.d) ((bzj) bwrVar).n.c()).compareTo(bzj.d.b) <= 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        a();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        a();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(bwj bwjVar, int i);

    protected boolean d() {
        throw null;
    }

    public final void e() {
        if (this.d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        c();
    }

    public final void f() {
        bwq bwqVar = this.c;
        if (bwqVar != null) {
            bwqVar.b();
        }
        this.c = null;
        requestLayout();
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public final void i(bwr bwrVar) {
        if (this.d != bwrVar) {
            this.d = bwrVar;
            this.a = null;
            bwq bwqVar = this.c;
            if (bwqVar != null) {
                bwqVar.b();
                this.c = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.g && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    public final void j() {
        arqg dekVar;
        arqg arqgVar = this.e;
        if (arqgVar != null) {
            arqgVar.a();
        }
        if (isAttachedToWindow()) {
            enm c = dyx.c(this);
            if (c != null) {
                dekVar = den.a(this, c.N());
            } else {
                csg.a(a.cc(this, "View tree for ", " has no ViewTreeLifecycleOwner"));
                throw new armj();
            }
        } else {
            arsb arsbVar = new arsb();
            del delVar = new del(this, arsbVar);
            addOnAttachStateChangeListener(delVar);
            arsbVar.a = new dej(this, delVar);
            dekVar = new dek(arsbVar);
        }
        this.e = dekVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IBinder windowToken = getWindowToken();
        if (this.b != windowToken) {
            this.b = windowToken;
            this.a = null;
        }
        if (d()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        c();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    @Override // android.view.ViewGroup
    public final void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.g = true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public czt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public czt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        dei deiVar = new dei(this);
        addOnAttachStateChangeListener(deiVar);
        deg degVar = new deg(this);
        ((ArrayList) ego.c(this).a).add(degVar);
        this.e = new deh(this, deiVar, degVar);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        a();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        a();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        a();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        a();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a();
        super.addView(view, layoutParams);
    }

    public /* synthetic */ czt(Context context, AttributeSet attributeSet, int i, int i2, arrj arrjVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
