package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwh extends dwc {
    public dwc[] aL = new dwc[4];
    public int aM = 0;

    public final void af(dwc dwcVar) {
        if (dwcVar != this && dwcVar != null) {
            int i = this.aM + 1;
            dwc[] dwcVarArr = this.aL;
            int length = dwcVarArr.length;
            if (i > length) {
                this.aL = (dwc[]) Arrays.copyOf(dwcVarArr, length + length);
            }
            dwc[] dwcVarArr2 = this.aL;
            int i2 = this.aM;
            dwcVarArr2[i2] = dwcVar;
            this.aM = i2 + 1;
        }
    }

    public final void ag(ArrayList arrayList, int i, dwx dwxVar) {
        for (int i2 = 0; i2 < this.aM; i2++) {
            dwxVar.d(this.aL[i2]);
        }
        for (int i3 = 0; i3 < this.aM; i3++) {
            ef.m(this.aL[i3], i, arrayList, dwxVar);
        }
    }

    public void ah() {
    }
}
