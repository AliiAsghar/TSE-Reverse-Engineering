package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class gmv extends gvf {
    protected eas[] m;
    String n;
    int o;
    int p;

    public gmv() {
        this.m = null;
        this.o = 0;
    }

    public boolean d() {
        return false;
    }

    public eas[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(eas[] easVarArr) {
        eas[] easVarArr2 = this.m;
        if (easVarArr2 != null && easVarArr != null) {
            if (easVarArr2.length == easVarArr.length) {
                for (int i = 0; i < easVarArr2.length; i++) {
                    eas easVar = easVarArr2[i];
                    char c = easVar.a;
                    eas easVar2 = easVarArr[i];
                    if (c == easVar2.a && easVar.b.length == easVar2.b.length) {
                    }
                }
                eas[] easVarArr3 = this.m;
                for (int i2 = 0; i2 < easVarArr.length; i2++) {
                    easVarArr3[i2].a = easVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = easVarArr[i2].b;
                        if (i3 < fArr.length) {
                            easVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = dyw.d(easVarArr);
    }

    public gmv(gmv gmvVar) {
        this.m = null;
        this.o = 0;
        this.n = gmvVar.n;
        int i = gmvVar.p;
        this.p = 0;
        this.m = dyw.d(gmvVar.m);
    }
}
