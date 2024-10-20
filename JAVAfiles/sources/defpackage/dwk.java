package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwk extends dwc {
    public ArrayList aL;

    public dwk() {
        this.aL = new ArrayList();
    }

    @Override // defpackage.dwc
    public final void ad(ktk ktkVar) {
        super.ad(ktkVar);
        int size = this.aL.size();
        for (int i = 0; i < size; i++) {
            ((dwc) this.aL.get(i)).ad(ktkVar);
        }
    }

    public void ae() {
        ArrayList arrayList = this.aL;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dwc dwcVar = (dwc) this.aL.get(i);
                if (dwcVar instanceof dwk) {
                    ((dwk) dwcVar).ae();
                }
            }
        }
    }

    public final void am(dwc dwcVar) {
        this.aL.add(dwcVar);
        dwc dwcVar2 = dwcVar.ae;
        if (dwcVar2 != null) {
            ((dwk) dwcVar2).an(dwcVar);
        }
        dwcVar.ae = this;
    }

    public final void an(dwc dwcVar) {
        this.aL.remove(dwcVar);
        dwcVar.u();
    }

    public final void ao() {
        this.aL.clear();
    }

    @Override // defpackage.dwc
    public void u() {
        this.aL.clear();
        super.u();
    }

    public dwk(byte[] bArr) {
        super(0, 0);
        this.aL = new ArrayList();
    }
}
