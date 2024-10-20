package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwj extends dwh {
    public int aN = 0;
    public int aO = 0;
    public int aP = 0;
    public int aQ = 0;
    public int aR = 0;
    public int aS = 0;
    public boolean aT = false;
    public int aU = 0;
    public int aV = 0;
    protected final dwl aW = new dwl();
    dwm aX = null;

    @Override // defpackage.dwh
    public final void ah() {
        for (int i = 0; i < this.aM; i++) {
            dwc dwcVar = this.aL[i];
            if (dwcVar != null) {
                dwcVar.Q = true;
            }
        }
    }

    public final void ai(int i, int i2) {
        this.aU = i;
        this.aV = i2;
    }

    public final void aj(int i) {
        this.aP = i;
        this.aR = i;
        this.aS = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ak(dwc dwcVar, int i, int i2, int i3, int i4) {
        dwm dwmVar;
        dwc dwcVar2;
        while (true) {
            dwmVar = this.aX;
            if (dwmVar != null || (dwcVar2 = this.ae) == null) {
                break;
            } else {
                this.aX = ((dwd) dwcVar2).c;
            }
        }
        dwl dwlVar = this.aW;
        dwlVar.i = i;
        dwlVar.j = i3;
        dwlVar.a = i2;
        dwlVar.b = i4;
        dwmVar.b(dwcVar, dwlVar);
        dwcVar.M(this.aW.c);
        dwcVar.B(this.aW.d);
        dwl dwlVar2 = this.aW;
        dwcVar.P = dwlVar2.f;
        dwcVar.x(dwlVar2.e);
    }

    public void b(int i, int i2, int i3, int i4) {
    }
}
