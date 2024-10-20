package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwi {
    static final boolean[] a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(dwd dwdVar, dun dunVar, dwc dwcVar) {
        dwcVar.z = -1;
        dwcVar.A = -1;
        if (dwdVar.aA[0] != 2 && dwcVar.aA[0] == 4) {
            dwb dwbVar = dwcVar.T;
            int i = dwbVar.f;
            int j = dwdVar.j() - dwcVar.V.f;
            dwbVar.h = dunVar.b(dwbVar);
            dwb dwbVar2 = dwcVar.V;
            dwbVar2.h = dunVar.b(dwbVar2);
            dunVar.f(dwcVar.T.h, i);
            dunVar.f(dwcVar.V.h, j);
            dwcVar.z = 2;
            dwcVar.aj = i;
            int i2 = j - i;
            dwcVar.af = i2;
            int i3 = dwcVar.am;
            if (i2 < i3) {
                dwcVar.af = i3;
            }
        }
        if (dwdVar.aA[1] != 2 && dwcVar.aA[1] == 4) {
            dwb dwbVar3 = dwcVar.U;
            int i4 = dwbVar3.f;
            int h = dwdVar.h() - dwcVar.W.f;
            dwbVar3.h = dunVar.b(dwbVar3);
            dwb dwbVar4 = dwcVar.W;
            dwbVar4.h = dunVar.b(dwbVar4);
            dunVar.f(dwcVar.U.h, i4);
            dunVar.f(dwcVar.W.h, h);
            if (dwcVar.al > 0 || dwcVar.ar == 8) {
                dwb dwbVar5 = dwcVar.X;
                dwbVar5.h = dunVar.b(dwbVar5);
                dunVar.f(dwcVar.X.h, dwcVar.al + i4);
            }
            dwcVar.A = 2;
            dwcVar.ak = i4;
            int i5 = h - i4;
            dwcVar.ag = i5;
            int i6 = dwcVar.an;
            if (i5 < i6) {
                dwcVar.ag = i6;
            }
        }
    }

    public static final boolean b(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }
}
