package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.android.vcard.VCardConfig;
import defpackage.a;
import defpackage.efu;
import defpackage.efw;
import defpackage.efx;
import defpackage.mn;
import defpackage.mp;
import defpackage.mq;
import defpackage.mr;
import defpackage.mv;
import defpackage.mx;
import defpackage.no;
import defpackage.nw;
import defpackage.nx;
import defpackage.od;
import defpackage.ol;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set J = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    private int K;
    boolean a;
    public int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    public mr g;
    final Rect h;
    int i;
    int j;

    public GridLayoutManager(int i) {
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new mp();
        this.h = new Rect();
        this.K = -1;
        this.i = -1;
        this.j = -1;
        r(i);
    }

    private final int bJ(int i) {
        if (this.k == 0) {
            RecyclerView recyclerView = this.u;
            return bL(recyclerView.e, recyclerView.M, i);
        }
        RecyclerView recyclerView2 = this.u;
        return bM(recyclerView2.e, recyclerView2.M, i);
    }

    private final int bK(int i) {
        if (this.k == 1) {
            RecyclerView recyclerView = this.u;
            return bL(recyclerView.e, recyclerView.M, i);
        }
        RecyclerView recyclerView2 = this.u;
        return bM(recyclerView2.e, recyclerView2.M, i);
    }

    private final int bL(od odVar, ol olVar, int i) {
        if (!olVar.g) {
            return this.g.c(i, this.b);
        }
        int a = odVar.a(i);
        if (a == -1) {
            Log.w("GridLayoutManager", a.bV(i, "Cannot find span size for pre layout position. "));
            return 0;
        }
        return this.g.c(a, this.b);
    }

    private final int bM(od odVar, ol olVar, int i) {
        if (!olVar.g) {
            return this.g.a(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = odVar.a(i);
        if (a == -1) {
            Log.w("GridLayoutManager", a.bV(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
            return 0;
        }
        return this.g.a(a, this.b);
    }

    private final int bN(od odVar, ol olVar, int i) {
        if (!olVar.g) {
            return this.g.b(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = odVar.a(i);
        if (a == -1) {
            Log.w("GridLayoutManager", a.bV(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
            return 1;
        }
        return this.g.b(a);
    }

    private final Set bO(int i) {
        return bQ(bJ(i), i);
    }

    private final Set bP(int i) {
        return bQ(bK(i), i);
    }

    private final Set bQ(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.u;
        int bN = bN(recyclerView.e, recyclerView.M, i2);
        for (int i3 = i; i3 < i + bN; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void bR(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 > 0 && i3 - i5 < i7) {
                i2 = i6 + 1;
                i5 -= i3;
            } else {
                i2 = i6;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void bS() {
        View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new View[this.b];
    }

    private final void bT(View view, int i, boolean z) {
        int i2;
        int i3;
        mq mqVar = (mq) view.getLayoutParams();
        Rect rect = mqVar.d;
        int i4 = rect.top + rect.bottom + mqVar.topMargin + mqVar.bottomMargin;
        int i5 = rect.left + rect.right + mqVar.leftMargin + mqVar.rightMargin;
        int c = c(mqVar.a, mqVar.b);
        if (this.k == 1) {
            i3 = au(c, i, i5, mqVar.width, false);
            i2 = au(this.l.k(), this.E, i4, mqVar.height, true);
        } else {
            int au = au(c, i, i4, mqVar.height, false);
            int au2 = au(this.l.k(), this.D, i5, mqVar.width, true);
            i2 = au;
            i3 = au2;
        }
        bU(view, i3, i2, z);
    }

    private final void bU(View view, int i, int i2, boolean z) {
        boolean bo;
        nx nxVar = (nx) view.getLayoutParams();
        if (z) {
            bo = true;
            if (this.z && nw.bl(view.getMeasuredWidth(), i, nxVar.width) && nw.bl(view.getMeasuredHeight(), i2, nxVar.height)) {
                bo = false;
            }
        } else {
            bo = bo(view, i, i2, nxVar);
        }
        if (bo) {
            view.measure(i, i2);
        }
    }

    private final void bV() {
        int az;
        int aC;
        if (this.k == 1) {
            az = this.F - aB();
            aC = aA();
        } else {
            az = this.G - az();
            aC = aC();
        }
        bR(az - aC);
    }

    @Override // defpackage.nw
    public final void A(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.nw
    public final void B(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.nw
    public final int bX(od odVar, ol olVar) {
        if (this.k == 1) {
            return Math.min(this.b, av());
        }
        if (olVar.a() <= 0) {
            return 0;
        }
        return bL(odVar, olVar, olVar.a() - 1) + 1;
    }

    @Override // defpackage.nw
    public final int bY(od odVar, ol olVar) {
        if (this.k == 0) {
            return Math.min(this.b, av());
        }
        if (olVar.a() <= 0) {
            return 0;
        }
        return bL(odVar, olVar, olVar.a() - 1) + 1;
    }

    @Override // defpackage.nw
    public final nx bZ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new mq((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new mq(layoutParams);
    }

    final int c(int i, int i2) {
        if (this.k == 1 && aj()) {
            int[] iArr = this.c;
            int i3 = this.b - i;
            return iArr[i3] - iArr[i3 - i2];
        }
        int[] iArr2 = this.c;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final int d(int i, od odVar, ol olVar) {
        bV();
        bS();
        return super.d(i, odVar, olVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final int e(int i, od odVar, ol olVar) {
        bV();
        bS();
        return super.e(i, odVar, olVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final nx f() {
        if (this.k == 0) {
            return new mq(-2, -1);
        }
        return new mq(-1, -2);
    }

    @Override // defpackage.nw
    public final nx h(Context context, AttributeSet attributeSet) {
        return new mq(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(od odVar, ol olVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int at = at();
        if (z2) {
            i = -1;
            i2 = at() - 1;
            i3 = -1;
        } else {
            i = at;
            i2 = 0;
            i3 = 1;
        }
        int a = olVar.a();
        X();
        int j = this.l.j();
        int f = this.l.f();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View aF = aF(i2);
            int bt = bt(aF);
            if (bt >= 0 && bt < a && bM(odVar, olVar, bt) == 0) {
                if (((nx) aF.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = aF;
                    }
                } else {
                    if (this.l.d(aF) < f && this.l.a(aF) >= j) {
                        return aF;
                    }
                    if (view == null) {
                        view = aF;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        if (r13 == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ed, code lost:
    
        if (r13 == r4) goto L69;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View j(android.view.View r23, int r24, defpackage.od r25, defpackage.ol r26) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.j(android.view.View, int, od, ol):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0219, code lost:
    
        r1 = aC() + r18.c[r6.a];
        r12 = r1;
        r1 = r18.l.c(r5) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x024b, code lost:
    
        java.util.Arrays.fill(r18.d, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0251, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b6, code lost:
    
        r12 = r21.b;
        r1 = r12 + r7;
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c0, code lost:
    
        if (r21.f != (-1)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c2, code lost:
    
        r12 = r21.b;
        r2 = r12 - r7;
        r1 = 0;
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d1, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ca, code lost:
    
        r12 = r21.b;
        r3 = r12 + r7;
        r1 = 0;
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x009b, code lost:
    
        r12 = r13 - 1;
        r14 = -1;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r11 != 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        r15 = 1;
        r14 = r13;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r12 == r14) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r7 = r18.d[r12];
        r9 = (defpackage.mq) r7.getLayoutParams();
        r7 = bN(r19, r20, bt(r7));
        r9.b = r7;
        r9.a = r8;
        r8 = r8 + r7;
        r12 = r12 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        r1 = defpackage.brg.a;
        r2 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (r2 >= r13) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        r8 = r18.d[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if (r21.l != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        if (r11 != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        aJ(r8);
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        aL(r8, r18.h);
        bT(r8, r5, r12);
        r9 = r18.l.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
    
        if (r9 <= r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
    
        r8 = r18.l.c(r8) / ((defpackage.mq) r8.getLayoutParams()).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0107, code lost:
    
        if (r8 <= r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0109, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
    
        r12 = false;
        aK(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if (r11 != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        aH(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        aI(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010d, code lost:
    
        if (r10 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:
    
        bR(java.lang.Math.max(java.lang.Math.round(r1 * r18.b), r6));
        r7 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
    
        if (r12 >= r13) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0122, code lost:
    
        r1 = r18.d[r12];
        bT(r1, 1073741824, true);
        r1 = r18.l.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        if (r1 <= r7) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0134, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0135, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0138, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0139, code lost:
    
        if (r12 >= r13) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013b, code lost:
    
        r1 = r18.d[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0145, code lost:
    
        if (r18.l.b(r1) == r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0147, code lost:
    
        r2 = (defpackage.mq) r1.getLayoutParams();
        r5 = r2.d;
        r6 = ((r5.top + r5.bottom) + r2.topMargin) + r2.bottomMargin;
        r8 = ((r5.left + r5.right) + r2.leftMargin) + r2.rightMargin;
        r5 = c(r2.a, r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0170, code lost:
    
        if (r18.k != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
    
        r2 = au(r5, 1073741824, r8, r2.width, false);
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r6, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0192, code lost:
    
        bU(r1, r2, r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019a, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
    
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r8, 1073741824);
        r5 = au(r5, 1073741824, r6, r2.height, false);
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019d, code lost:
    
        r22.a = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a3, code lost:
    
        if (r18.k != 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a8, code lost:
    
        if (r21.f != (-1)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01aa, code lost:
    
        r12 = r21.b;
        r2 = 0;
        r3 = 0;
        r12 = r12 - r7;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d2, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d3, code lost:
    
        if (r7 >= r13) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d5, code lost:
    
        r5 = r18.d[r7];
        r6 = (defpackage.mq) r5.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e2, code lost:
    
        if (r18.k != 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e8, code lost:
    
        if (aj() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ea, code lost:
    
        r2 = aA() + r18.c[r18.b - r6.a];
        r3 = r2;
        r2 = r2 - r18.l.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x022d, code lost:
    
        by(r5, r2, r12, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0234, code lost:
    
        if (r6.c() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023a, code lost:
    
        if (r6.b() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023f, code lost:
    
        r22.d = r5.hasFocusable() | r22.d;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023c, code lost:
    
        r22.c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0206, code lost:
    
        r2 = aA() + r18.c[r6.a];
        r3 = r18.l.c(r5) + r2;
     */
    @Override // android.support.v7.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.od r19, defpackage.ol r20, defpackage.mx r21, defpackage.mw r22) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.k(od, ol, mx, mw):void");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void l(od odVar, ol olVar, mv mvVar, int i) {
        bV();
        if (olVar.a() > 0 && !olVar.g) {
            int bM = bM(odVar, olVar, mvVar.b);
            if (i == 1) {
                while (bM > 0) {
                    int i2 = mvVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    mvVar.b = i3;
                    bM = bM(odVar, olVar, i3);
                }
            } else {
                int a = olVar.a() - 1;
                int i4 = mvVar.b;
                while (i4 < a) {
                    int i5 = i4 + 1;
                    int bM2 = bM(odVar, olVar, i5);
                    if (bM2 <= bM) {
                        break;
                    }
                    i4 = i5;
                    bM = bM2;
                }
                mvVar.b = i4;
            }
        }
        bS();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final void m(od odVar, ol olVar, efx efxVar) {
        super.m(odVar, olVar, efxVar);
        efxVar.q(GridView.class.getName());
        no noVar = this.u.l;
        if (noVar != null && noVar.b() > 1) {
            efxVar.h(efw.n);
        }
    }

    @Override // defpackage.nw
    public final void n(od odVar, ol olVar, View view, efx efxVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof mq)) {
            super.aU(view, efxVar);
            return;
        }
        mq mqVar = (mq) layoutParams;
        int bL = bL(odVar, olVar, mqVar.a());
        if (this.k == 0) {
            efxVar.t(efu.i(mqVar.a, mqVar.b, bL, 1, false));
        } else {
            efxVar.t(efu.i(bL, 1, mqVar.a, mqVar.b, false));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final void o(od odVar, ol olVar) {
        if (olVar.g) {
            int at = at();
            for (int i = 0; i < at; i++) {
                mq mqVar = (mq) aF(i).getLayoutParams();
                int a = mqVar.a();
                this.e.put(a, mqVar.b);
                this.f.put(a, mqVar.a);
            }
        }
        super.o(odVar, olVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final void p(ol olVar) {
        View U;
        super.p(olVar);
        this.a = false;
        int i = this.K;
        if (i != -1 && (U = U(i)) != null) {
            U.sendAccessibilityEvent(VCardConfig.FLAG_APPEND_TYPE_PARAM);
            this.K = -1;
        }
    }

    @Override // defpackage.nw
    public final void q(Rect rect, int i, int i2) {
        int as;
        int as2;
        if (this.c == null) {
            super.q(rect, i, i2);
        }
        int aA = aA() + aB();
        int aC = aC() + az();
        if (this.k == 1) {
            as2 = as(i2, rect.height() + aC, ax());
            as = as(i, this.c[r7.length - 1] + aA, ay());
        } else {
            as = as(i, rect.width() + aA, ay());
            as2 = as(i2, this.c[r5.length - 1] + aC, ax());
        }
        bg(as, as2);
    }

    public final void r(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i > 0) {
            this.b = i;
            this.g.e();
            bc();
            return;
        }
        throw new IllegalArgumentException(a.bV(i, "Span count should be at least 1. Provided "));
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void s(boolean z) {
        if (!z) {
            super.s(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // defpackage.nw
    public final boolean t(nx nxVar) {
        return nxVar instanceof mq;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.u(int, android.os.Bundle):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final boolean v() {
        if (this.r == null && !this.a) {
            return true;
        }
        return false;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void w(ol olVar, mx mxVar, mn mnVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && mxVar.d(olVar) && i > 0; i2++) {
            int i3 = mxVar.d;
            mnVar.a(i3, Math.max(0, mxVar.g));
            i -= this.g.b(i3);
            mxVar.d += mxVar.e;
        }
    }

    @Override // defpackage.nw
    public final void x(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.nw
    public final void y() {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.nw
    public final void z(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    public GridLayoutManager(int i, int i2) {
        super(i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new mp();
        this.h = new Rect();
        this.K = -1;
        this.i = -1;
        this.j = -1;
        r(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new mp();
        this.h = new Rect();
        this.K = -1;
        this.i = -1;
        this.j = -1;
        r(aD(context, attributeSet, i, i2).b);
    }
}
