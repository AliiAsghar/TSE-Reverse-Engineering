package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cj extends re {
    boolean b;
    boolean c;
    public final efu e = new efu(new ci(this));
    final eno a = new eno(this);
    boolean d = true;

    public cj() {
        int i = 1;
        aK().c("android:support:lifecycle", new cp(this, i));
        gS(new ch(this, i));
        this.i.add(new ch(this, 0));
        u(new ew(this, i));
    }

    private static boolean j(da daVar, eng engVar) {
        boolean z = false;
        for (cg cgVar : daVar.l()) {
            if (cgVar != null) {
                if (cgVar.R() != null) {
                    z |= j(cgVar.G(), engVar);
                }
                dn dnVar = cgVar.aa;
                if (dnVar != null && ((eno) dnVar.N()).c.a(eng.STARTED)) {
                    cgVar.aa.a.f(engVar);
                    z = true;
                }
                if (cgVar.Z.c.a(eng.STARTED)) {
                    cgVar.Z.f(engVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final da a() {
        return this.e.q();
    }

    final View b(View view, String str, Context context, AttributeSet attributeSet) {
        return ((cn) this.e.a).e.d.onCreateView(view, str, context, attributeSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0.equals("--list-dumpables") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r0.equals("--dump-dumpable") == false) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0010. Please report as an issue. */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            super.dump(r3, r4, r5, r6)
            if (r6 == 0) goto L54
            int r0 = r6.length
            if (r0 != 0) goto L9
            goto L54
        L9:
            r0 = 0
            r0 = r6[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L45;
                case 100470631: goto L35;
                case 472614934: goto L2c;
                case 1159329357: goto L1d;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L54
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L53
            goto L54
        L1d:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L54
            goto L53
        L2c:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            goto L3e
        L35:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L54
        L3e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L54
            goto L53
        L45:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L54
        L53:
            return
        L54:
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "  "
            java.lang.String r0 = r0.concat(r1)
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.b
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.c
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.d
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto La4
            epj r1 = defpackage.epj.a(r2)
            r1.e(r0, r5)
        La4:
            efu r0 = r2.e
            da r0 = r0.q()
            r0.G(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        do {
        } while (j(a(), eng.CREATED));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.e.r();
        super.onActivityResult(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.e(enf.ON_CREATE);
        ((cn) this.e.a).e.t();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View b = b(view, str, context, attributeSet);
        return b == null ? super.onCreateView(view, str, context, attributeSet) : b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((cn) this.e.a).e.u();
        this.a.e(enf.ON_DESTROY);
    }

    @Override // defpackage.re, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((cn) this.e.a).e.U(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.c = false;
        ((cn) this.e.a).e.A();
        this.a.e(enf.ON_PAUSE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.a.e(enf.ON_RESUME);
        ((cn) this.e.a).e.C();
    }

    @Override // defpackage.re, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.e.r();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.e.r();
        super.onResume();
        this.c = true;
        this.e.s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.e.r();
        super.onStart();
        this.d = false;
        if (!this.b) {
            this.b = true;
            ((cn) this.e.a).e.r();
        }
        this.e.s();
        this.a.e(enf.ON_START);
        ((cn) this.e.a).e.D();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.e.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.d = true;
        f();
        ((cn) this.e.a).e.F();
        this.a.e(enf.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View b = b(null, str, context, attributeSet);
        return b == null ? super.onCreateView(str, context, attributeSet) : b;
    }

    @Deprecated
    public void h(cg cgVar) {
    }
}
