package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbr extends de {
    public final List a;
    public final aiyq b;
    private final Integer c;
    private alor d;

    public ajbr(da daVar, apri apriVar, Integer num, boolean z, boolean z2, aiyq aiyqVar, int i) {
        super(daVar);
        ArrayList arrayList = new ArrayList(apriVar.g.size());
        for (apro aproVar : apriVar.g) {
            int T = a.T(aproVar.i);
            int i2 = (T == 0 ? 1 : T) - 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            arrayList.add(new ajaf(aproVar));
                        }
                    } else {
                        arrayList.add(new ajaq(aproVar));
                    }
                } else {
                    arrayList.add(new aizx(aproVar));
                }
            } else {
                arrayList.add(new ajba(aproVar));
            }
        }
        ahnz ahnzVar = aizp.c;
        if (aizp.c(aqqo.b(aizp.b))) {
            if (aiyqVar == aiyq.CARD) {
                apqp apqpVar = apriVar.d;
                arrayList.add(new ajbu(apqpVar == null ? apqp.b : apqpVar));
            }
        } else {
            apqp apqpVar2 = apriVar.d;
            arrayList.add(new ajbu(apqpVar2 == null ? apqp.b : apqpVar2));
        }
        this.a = arrayList;
        int i3 = 0;
        if (z && !arrayList.isEmpty()) {
            arrayList.remove(0);
            i--;
        }
        if (aizp.a() && i > 0) {
            arrayList.subList(0, i).clear();
        }
        if (z2 && !arrayList.isEmpty()) {
            arrayList.subList(0, arrayList.size() - 1).clear();
        }
        alok alokVar = new alok();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i4 = ((ajbn) it.next()).b;
            if (i4 != 0) {
                if (i4 != 5) {
                    alokVar.h(Integer.valueOf(r9.a.e - 1), Integer.valueOf(i3));
                    i3++;
                }
            } else {
                throw null;
            }
        }
        this.d = alokVar.b();
        if (!this.a.isEmpty()) {
            this.c = num;
            this.b = aiyqVar;
            return;
        }
        throw new NullPointerException("Questions were missing!");
    }

    public static int m(cg cgVar) {
        Bundle bundle = cgVar.m;
        if (bundle == null) {
            return -1;
        }
        return bundle.getInt("QuestionIndex", -1);
    }

    @Override // defpackage.de
    public final cg b(int i) {
        cg a = ((ajbn) this.a.get(i)).a(this.c, i);
        a.m.putInt("QuestionIndex", i);
        return a;
    }

    @Override // defpackage.gnd
    public final int j() {
        return this.a.size();
    }

    public final int n(int i) {
        return ((Integer) this.d.get(Integer.valueOf(i))).intValue();
    }

    public final apro o(int i) {
        return ((ajbn) this.a.get(i)).a;
    }
}
