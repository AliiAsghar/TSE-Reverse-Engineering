package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euu {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public euu(efu efuVar, eov eovVar, epd epdVar) {
        this.a = efuVar;
        this.c = eovVar;
        this.d = epdVar;
        this.b = new dzd();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, eov] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map, java.lang.Object] */
    public final eor a(artf artfVar, String str) {
        eor x;
        synchronized (this.b) {
            x = ((efu) this.a).x(str);
            if (artfVar.d(x)) {
                Object obj = this.c;
                if (obj instanceof eox) {
                    x.getClass();
                    ((eox) obj).d(x);
                }
                x.getClass();
            } else {
                epe epeVar = new epe((epd) this.d);
                epeVar.b(eoy.a, str);
                x = dza.d(this.c, artfVar, epeVar);
                Object obj2 = this.a;
                x.getClass();
                eor eorVar = (eor) ((efu) obj2).a.put(str, x);
                if (eorVar != null) {
                    eorVar.m();
                }
            }
        }
        return x;
    }

    public final ArrayList b(Object obj) {
        return (ArrayList) ((vl) this.a).get(obj);
    }

    public final void c(Object obj) {
        if (!((vl) this.a).containsKey(obj)) {
            ((vl) this.a).put(obj, null);
        }
    }

    public final void d(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((vl) this.a).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    d(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public euu(List list, fdx fdxVar, fdx fdxVar2, fdx fdxVar3) {
        alog alogVar;
        if (list != null) {
            alogVar = alog.n(list);
        } else {
            int i = alog.d;
            alogVar = alsx.a;
        }
        this.a = alogVar;
        this.d = fdxVar;
        this.c = fdxVar2;
        this.b = fdxVar3;
    }

    public euu(byte[] bArr) {
        this.b = new ecg(10);
        this.a = new vl();
        this.c = new ArrayList();
        this.d = new HashSet();
    }

    euu() {
        this.a = Typeface.DEFAULT;
        this.c = null;
        this.b = new fcp(1024, (byte[]) null);
        this.d = new char[0];
    }

    public euu(Typeface typeface, gku gkuVar) {
        this.a = typeface;
        this.c = gkuVar;
        this.b = new fcp(1024, (byte[]) null);
        int e = gkuVar.e();
        this.d = new char[e + e];
        int e2 = gkuVar.e();
        for (int i = 0; i < e2; i++) {
            ejy ejyVar = new ejy(this, i);
            Character.toChars(ejyVar.c(), (char[]) this.d, i + i);
            d.t(ejyVar.b() > 0, "invalid metadata codepoint length");
            ((fcp) this.b).d(ejyVar, 0, ejyVar.b() - 1);
        }
    }

    public euu(Typeface typeface, fjl fjlVar) {
        this.c = typeface;
        this.d = fjlVar;
        this.a = new fcp(1024);
        int B = fjlVar.B();
        this.b = new char[B + B];
        int B2 = fjlVar.B();
        for (int i = 0; i < B2; i++) {
            elg elgVar = new elg(this, i);
            Character.toChars(elgVar.e(), (char[]) this.b, i + i);
            d.t(elgVar.b() > 0, "invalid metadata codepoint length");
            ((fcp) this.a).b(elgVar, 0, elgVar.b() - 1);
        }
    }
}
