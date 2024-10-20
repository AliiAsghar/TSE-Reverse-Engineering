package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwd extends dwk {
    public final dwp a;
    public int aB;
    public boolean aC;
    public boolean aD;
    public WeakReference aE;
    public WeakReference aF;
    public WeakReference aG;
    public WeakReference aH;
    final HashSet aI;
    public final dwl aJ;
    final kkc aK;
    public int b;
    public dwm c;
    public boolean d;
    public final dun e;
    int f;
    int g;
    public int h;
    public int i;
    public dwa[] j;
    public dwa[] k;

    public dwd() {
        this.aK = new kkc(this);
        this.a = new dwp(this);
        this.c = null;
        this.d = false;
        this.e = new dun();
        this.h = 0;
        this.i = 0;
        this.j = new dwa[4];
        this.k = new dwa[4];
        this.aB = 257;
        this.aC = false;
        this.aD = false;
        this.aE = null;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aI = new HashSet();
        this.aJ = new dwl();
    }

    public static void al(dwc dwcVar, dwm dwmVar, dwl dwlVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (dwmVar == null) {
            return;
        }
        if (dwcVar.ar != 8 && !(dwcVar instanceof dwg) && !(dwcVar instanceof dvz)) {
            dwlVar.i = dwcVar.W();
            dwlVar.j = dwcVar.X();
            dwlVar.a = dwcVar.j();
            dwlVar.b = dwcVar.h();
            dwlVar.g = false;
            dwlVar.h = 0;
            if (dwlVar.i == 3) {
                z = true;
            } else {
                z = false;
            }
            if (dwlVar.j == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && dwcVar.ah > brg.a) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && dwcVar.ah > brg.a) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && dwcVar.P(0) && dwcVar.C == 0 && !z3) {
                dwlVar.i = 2;
                if (z2 && dwcVar.D == 0) {
                    dwlVar.i = 1;
                }
                z = false;
            }
            if (z2 && dwcVar.P(1) && dwcVar.D == 0 && !z4) {
                dwlVar.j = 2;
                if (z && dwcVar.C == 0) {
                    dwlVar.j = 1;
                }
                z2 = false;
            }
            if (dwcVar.e()) {
                dwlVar.i = 1;
                z = false;
            }
            if (dwcVar.f()) {
                dwlVar.j = 1;
                z2 = false;
            }
            if (z3) {
                if (dwcVar.E[0] == 4) {
                    dwlVar.i = 1;
                } else if (!z2) {
                    if (dwlVar.j == 1) {
                        i2 = dwlVar.b;
                    } else {
                        dwlVar.i = 2;
                        dwmVar.b(dwcVar, dwlVar);
                        i2 = dwlVar.d;
                    }
                    dwlVar.i = 1;
                    dwlVar.a = (int) (dwcVar.ah * i2);
                }
            }
            if (z4) {
                if (dwcVar.E[1] == 4) {
                    dwlVar.j = 1;
                } else if (!z) {
                    if (dwlVar.i == 1) {
                        i = dwlVar.a;
                    } else {
                        dwlVar.j = 2;
                        dwmVar.b(dwcVar, dwlVar);
                        i = dwlVar.c;
                    }
                    dwlVar.j = 1;
                    float f = i;
                    if (dwcVar.ai == -1) {
                        dwlVar.b = (int) (f / dwcVar.ah);
                    } else {
                        dwlVar.b = (int) (dwcVar.ah * f);
                    }
                }
            }
            dwmVar.b(dwcVar, dwlVar);
            dwcVar.M(dwlVar.c);
            dwcVar.B(dwlVar.d);
            dwcVar.P = dwlVar.f;
            dwcVar.x(dwlVar.e);
            dwlVar.h = 0;
            boolean z5 = dwlVar.g;
            return;
        }
        dwlVar.c = 0;
        dwlVar.d = 0;
    }

    private final void ap(dwb dwbVar, duq duqVar) {
        dun dunVar = this.e;
        dunVar.g(duqVar, dunVar.b(dwbVar), 0, 5);
    }

    private final void aq(dwb dwbVar, duq duqVar) {
        dun dunVar = this.e;
        dunVar.g(dunVar.b(dwbVar), duqVar, 0, 5);
    }

    private final void ar() {
        this.h = 0;
        this.i = 0;
    }

    @Override // defpackage.dwc
    public final void N(boolean z, boolean z2) {
        super.N(z, z2);
        int size = this.aL.size();
        for (int i = 0; i < size; i++) {
            ((dwc) this.aL.get(i)).N(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0621 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0962 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0970 A[LOOP:14: B:248:0x096e->B:249:0x0970, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x05ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:708:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x05ce  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12 */
    @Override // defpackage.dwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ae() {
        /*
            Method dump skipped, instructions count: 2662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwd.ae():void");
    }

    public final void af(dwm dwmVar) {
        this.c = dwmVar;
        this.a.f = dwmVar;
    }

    public final void ag(int i) {
        this.aB = i;
        dun.a = aj(512);
    }

    public final void ah() {
        this.aK.C(this);
    }

    public final boolean ai(boolean z, int i) {
        boolean z2;
        boolean z3;
        dwp dwpVar = this.a;
        boolean z4 = false;
        int V = dwpVar.a.V(0);
        int V2 = dwpVar.a.V(1);
        int k = dwpVar.a.k();
        int l = dwpVar.a.l();
        if (z) {
            if (V != 2) {
                if (V2 == 2) {
                    V2 = 2;
                }
            }
            ArrayList arrayList = dwpVar.e;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    dwy dwyVar = (dwy) arrayList.get(i2);
                    if (dwyVar.f == i && !dwyVar.e()) {
                        z3 = false;
                        break;
                    }
                    i2++;
                } else {
                    z3 = true;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && V == 2) {
                    dwpVar.a.aa(1);
                    dwd dwdVar = dwpVar.a;
                    dwdVar.M(dwpVar.a(dwdVar, 0));
                    dwd dwdVar2 = dwpVar.a;
                    dwdVar2.o.e.c(dwdVar2.j());
                }
            } else if (z3 && V2 == 2) {
                dwpVar.a.ab(1);
                dwd dwdVar3 = dwpVar.a;
                dwdVar3.B(dwpVar.a(dwdVar3, 1));
                dwd dwdVar4 = dwpVar.a;
                dwdVar4.p.e.c(dwdVar4.h());
            }
        }
        if (i == 0) {
            dwd dwdVar5 = dwpVar.a;
            int i3 = dwdVar5.aA[0];
            if (i3 == 1 || i3 == 4) {
                int j = dwdVar5.j() + k;
                dwdVar5.o.i.c(j);
                dwpVar.a.o.e.c(j - k);
                z2 = true;
            }
            z2 = false;
        } else {
            dwd dwdVar6 = dwpVar.a;
            int i4 = dwdVar6.aA[1];
            if (i4 == 1 || i4 == 4) {
                int h = dwdVar6.h() + l;
                dwdVar6.p.i.c(h);
                dwpVar.a.p.e.c(h - l);
                z2 = true;
            }
            z2 = false;
        }
        dwpVar.c();
        ArrayList arrayList2 = dwpVar.e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            dwy dwyVar2 = (dwy) arrayList2.get(i5);
            if (dwyVar2.f == i && (dwyVar2.d != dwpVar.a || dwyVar2.g)) {
                dwyVar2.c();
            }
        }
        ArrayList arrayList3 = dwpVar.e;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (true) {
            if (i6 < size3) {
                dwy dwyVar3 = (dwy) arrayList3.get(i6);
                if (dwyVar3.f == i && ((z2 || dwyVar3.d != dwpVar.a) && (!dwyVar3.h.i || !dwyVar3.i.i || (!(dwyVar3 instanceof dwn) && !dwyVar3.e.i)))) {
                    break;
                }
                i6++;
            } else {
                z4 = true;
                break;
            }
        }
        dwpVar.a.aa(V);
        dwpVar.a.ab(V2);
        return z4;
    }

    public final boolean aj(int i) {
        if ((this.aB & i) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ak(int r21, int r22, int r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwd.ak(int, int, int, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(dwc dwcVar, int i) {
        if (i == 0) {
            int i2 = this.h + 1;
            dwa[] dwaVarArr = this.k;
            int length = dwaVarArr.length;
            if (i2 >= length) {
                this.k = (dwa[]) Arrays.copyOf(dwaVarArr, length + length);
            }
            dwa[] dwaVarArr2 = this.k;
            int i3 = this.h;
            dwaVarArr2[i3] = new dwa(dwcVar, 0, this.d);
            this.h = i3 + 1;
            return;
        }
        int i4 = this.i + 1;
        dwa[] dwaVarArr3 = this.j;
        int length2 = dwaVarArr3.length;
        if (i4 >= length2) {
            this.j = (dwa[]) Arrays.copyOf(dwaVarArr3, length2 + length2);
        }
        dwa[] dwaVarArr4 = this.j;
        int i5 = this.i;
        dwaVarArr4[i5] = new dwa(dwcVar, 1, this.d);
        this.i = i5 + 1;
    }

    public final void c() {
        this.a.b = true;
    }

    @Override // defpackage.dwk, defpackage.dwc
    public final void u() {
        this.e.k();
        this.f = 0;
        this.g = 0;
        super.u();
    }

    public dwd(byte[] bArr) {
        super(null);
        this.aK = new kkc(this);
        this.a = new dwp(this);
        this.c = null;
        this.d = false;
        this.e = new dun();
        this.h = 0;
        this.i = 0;
        this.j = new dwa[4];
        this.k = new dwa[4];
        this.aB = 257;
        this.aC = false;
        this.aD = false;
        this.aE = null;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aI = new HashSet();
        this.aJ = new dwl();
    }
}
