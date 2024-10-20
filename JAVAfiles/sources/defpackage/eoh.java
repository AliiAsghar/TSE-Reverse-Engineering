package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoh implements enk {
    private final /* synthetic */ int a;
    private final Object b;

    public eoh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [ena, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [ena, java.lang.Object] */
    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        ena[] enaVarArr;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                this.b.a();
                this.b.a();
                return;
            }
            new HashMap();
            int i2 = 0;
            while (true) {
                enaVarArr = (ena[]) this.b;
                if (i2 >= enaVarArr.length) {
                    break;
                }
                enaVarArr[i2].a();
                i2++;
            }
            for (ena enaVar : enaVarArr) {
                enaVar.a();
            }
            return;
        }
        if (enfVar == enf.ON_CREATE) {
            enmVar.N().d(this);
            ((eom) this.b).b();
        } else {
            Objects.toString(enfVar);
            throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(enfVar.toString()));
        }
    }
}
