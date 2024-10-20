package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aj {
    public final ArrayList a = new ArrayList();

    public final void a(ak akVar) {
        this.a.clear();
        for (int i = 1; i < akVar.e; i++) {
            al alVar = ((al[]) akVar.g.c)[i];
            for (int i2 = 0; i2 < 6; i2++) {
                alVar.e[i2] = 0.0f;
            }
            alVar.e[alVar.c] = 1.0f;
            if (alVar.h == 4) {
                this.a.add(alVar);
            }
        }
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            al alVar2 = (al) this.a.get(i3);
            int i4 = alVar2.b;
            if (i4 != -1) {
                ah ahVar = akVar.c[i4].d;
                int i5 = ahVar.a;
                for (int i6 = 0; i6 < i5; i6++) {
                    al d = ahVar.d(i6);
                    if (d != null) {
                        float b = ahVar.b(i6);
                        for (int i7 = 0; i7 < 6; i7++) {
                            float[] fArr = d.e;
                            fArr[i7] = fArr[i7] + (alVar2.e[i7] * b);
                        }
                        if (!this.a.contains(d)) {
                            this.a.add(d);
                        }
                    }
                }
                for (int i8 = 0; i8 < 6; i8++) {
                    alVar2.e[i8] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        String str;
        int size = this.a.size();
        String str2 = "Goal: ";
        for (int i = 0; i < size; i++) {
            al alVar = (al) this.a.get(i);
            Objects.toString(alVar);
            String str3 = "null[";
            int i2 = 0;
            while (true) {
                float[] fArr = alVar.e;
                if (i2 < 6) {
                    String str4 = str3 + alVar.e[i2];
                    float[] fArr2 = alVar.e;
                    if (i2 < 5) {
                        str = ", ";
                    } else {
                        str = "] ";
                    }
                    str3 = str4.concat(str);
                    i2++;
                }
            }
            str2 = str2.concat(str3);
        }
        return str2;
    }
}
