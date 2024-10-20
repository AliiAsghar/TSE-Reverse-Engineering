package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahdj {
    public final ahcg a;
    public final ahdf b;
    public final agxw g;
    public final ahjj f = new ahjj(this, (byte[]) null);
    public int d = 0;
    public Runnable e = null;
    public final ahdm c = new ahdm();

    public ahdj(ahcg ahcgVar, ahdf ahdfVar, agxw agxwVar) {
        this.a = ahcgVar;
        this.b = ahdfVar;
        this.g = agxwVar;
    }

    public final void a() {
        this.e = null;
        ahdm ahdmVar = this.c;
        if (ahdmVar.d.isEmpty() && ahdmVar.a.isEmpty() && ahdmVar.b.isEmpty() && ahdmVar.f.isEmpty()) {
            return;
        }
        akrh e = aktp.e("GIL:AutoProcessBatch");
        try {
            this.a.b(new ahcf() { // from class: ahdi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ahcf
                public final List a() {
                    ahdj ahdjVar = ahdj.this;
                    ahdm ahdmVar2 = ahdjVar.c;
                    char c = 3;
                    int i = 1;
                    if (Log.isLoggable("GIL", 2)) {
                        Log.v("GIL", String.format(Locale.US, "AutoGIL Batch: inserts=%d; visibility=%d; removes=%d", Integer.valueOf(ahdmVar2.a.size()), Integer.valueOf(ahdmVar2.b.size()), Integer.valueOf(ahdmVar2.f.size())));
                    }
                    akrh e2 = aktp.e("GIL:CreateInsertGrafts");
                    try {
                        for (ahcq ahcqVar : ahdmVar2.a) {
                            if (ahcqVar.d == -1) {
                                ahdmVar2.b(ahcqVar);
                            }
                        }
                        ahdmVar2.a.clear();
                        Iterator it = ahdmVar2.e.iterator();
                        while (it.hasNext()) {
                            ((ahcq) it.next()).d = -1;
                        }
                        ahdmVar2.e.clear();
                        e2.close();
                        akrh e3 = aktp.e("GIL:CreateVisibilityGrafts");
                        try {
                            for (ahcq ahcqVar2 : ahdmVar2.b) {
                                albo.X(ahcqVar2.c(), "Not impressed: %s", ahcqVar2);
                                int d = ahcqVar2.d();
                                apaa apaaVar = ahcqVar2.f;
                                int i2 = ((ahcw) apaaVar.b).e;
                                int U = a.U(i2);
                                if (U == 0) {
                                    U = 1;
                                }
                                if (U != d) {
                                    int U2 = a.U(i2);
                                    if (U2 == 0) {
                                        U2 = 1;
                                    }
                                    int i3 = U2 - 1;
                                    if (i3 == 2 || i3 == 4) {
                                        if (d != 2) {
                                            albo.U(false, "Repressed VE was visible.");
                                            d = 1;
                                        }
                                    }
                                    if (!apaaVar.b.isMutable()) {
                                        apaaVar.u();
                                    }
                                    ahcw ahcwVar = (ahcw) apaaVar.b;
                                    ahcwVar.e = d - 1;
                                    ahcwVar.b |= 2;
                                    ArrayList arrayList = new ArrayList();
                                    ahji.aH(ahcqVar2, arrayList);
                                    ahdl a = ahdmVar2.a(arrayList, 0);
                                    int U3 = a.U(((ahcw) arrayList.get(0)).e);
                                    if (U3 != 0 && U3 != 1) {
                                        a.b(new ahdv(3, arrayList, -1));
                                    }
                                    a.b(new ahdv(2, arrayList, a.e.size()));
                                    ahdk ahdkVar = new ahdk(a);
                                    anas anasVar = ((ahcw) ahcqVar2.f.b).d;
                                    if (anasVar == null) {
                                        anasVar = anas.a;
                                    }
                                    anat anatVar = anasVar.e;
                                    if (anatVar == null) {
                                        anatVar = anat.a;
                                    }
                                    if ((anatVar.b & 2) != 0) {
                                        ahdkVar.a(ahcqVar2);
                                    }
                                }
                            }
                            ahdmVar2.b.clear();
                            e3.close();
                            if (!ahdmVar2.f.isEmpty()) {
                                e2 = aktp.e("GIL:CreateRemoveGrafts");
                                try {
                                    for (Map.Entry entry : ahdmVar2.f.entrySet()) {
                                        Collection<ahcw> collection = (Collection) entry.getValue();
                                        for (ahcw ahcwVar2 : collection) {
                                            ahcq ahcqVar3 = (ahcq) entry.getKey();
                                            int U4 = a.U(ahcwVar2.e);
                                            if (U4 != 0 && U4 != i) {
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            apaa apaaVar2 = (apaa) ahcwVar2.toBuilder();
                                            if (!apaaVar2.b.isMutable()) {
                                                apaaVar2.u();
                                            }
                                            ahcw ahcwVar3 = (ahcw) apaaVar2.b;
                                            ahcwVar3.e = i;
                                            ahcwVar3.b |= 2;
                                            arrayList2.add((ahcw) apaaVar2.s());
                                            if (ahcqVar3 != null) {
                                                ahji.aH(ahcqVar3, arrayList2);
                                            }
                                            ahdmVar2.a(arrayList2, 0).b(new ahdv(3, arrayList2, -1));
                                            c = 3;
                                            i = 1;
                                        }
                                        char c2 = c;
                                        collection.clear();
                                        ahdmVar2.g = collection;
                                        c = c2;
                                        i = 1;
                                    }
                                    e2.close();
                                    ahdmVar2.f.clear();
                                } finally {
                                }
                            }
                            ahdm ahdmVar3 = ahdjVar.c;
                            boolean z = ahdmVar3.i;
                            e2 = aktp.e("GIL:LogBatch");
                            try {
                                ArrayList arrayList3 = new ArrayList(ahdmVar3.d.size());
                                for (ahdl ahdlVar : ahdmVar3.d) {
                                    arrayList3.add(new ahdw(ahdlVar.a, ahdlVar.b, ahdlVar.c, ahdlVar.d, ahdlVar.e, ahdlVar.f));
                                }
                                ahdmVar3.d.clear();
                                ahdmVar3.c.clear();
                                e2.close();
                                return arrayList3;
                            } finally {
                            }
                        } finally {
                            try {
                                e3.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } finally {
                        try {
                            e2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
            });
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (this.e != null) {
            return;
        }
        Runnable a = this.b.a(new agqd(this, 13));
        this.e = a;
        int i = this.d;
        if (i > 0) {
            aiut.d(a, i);
        } else {
            aiut.e(a);
        }
    }
}
