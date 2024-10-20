package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwx {
    static int a;
    public final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public dwx(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(dun dunVar, int i) {
        int o;
        int o2;
        if (this.b.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.b;
        dwd dwdVar = (dwd) ((dwc) arrayList.get(0)).ae;
        dunVar.k();
        dwdVar.a(dunVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((dwc) arrayList.get(i2)).a(dunVar, false);
        }
        if (i == 0 && dwdVar.h > 0) {
            ef.p(dwdVar, dunVar, arrayList, 0);
        }
        if (i == 1 && dwdVar.i > 0) {
            ef.p(dwdVar, dunVar, arrayList, 1);
        }
        try {
            dunVar.j();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new ef((dwc) arrayList.get(i3)));
        }
        if (i == 0) {
            o = dun.o(dwdVar.T);
            o2 = dun.o(dwdVar.V);
            dunVar.k();
        } else {
            o = dun.o(dwdVar.U);
            o2 = dun.o(dwdVar.W);
            dunVar.k();
        }
        return o2 - o;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                dwx dwxVar = (dwx) arrayList.get(i);
                if (this.f == dwxVar.c) {
                    c(this.d, dwxVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, dwx dwxVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dwc dwcVar = (dwc) arrayList.get(i2);
            dwxVar.d(dwcVar);
            if (i == 0) {
                dwcVar.ay = dwxVar.c;
            } else {
                dwcVar.az = dwxVar.c;
            }
        }
        this.f = dwxVar.c;
    }

    public final boolean d(dwc dwcVar) {
        if (this.b.contains(dwcVar)) {
            return false;
        }
        this.b.add(dwcVar);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = "Both";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.c);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb2 = sb2 + " " + ((dwc) arrayList.get(i2)).as;
        }
        return sb2.concat(" >");
    }
}
