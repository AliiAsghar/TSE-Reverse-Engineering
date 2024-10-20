package defpackage;

import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahdl {
    public final List c;
    public final SparseIntArray d;
    private final int g;
    public final anat a = ahca.a();
    public final List b = new ArrayList();
    public final List e = new ArrayList();
    public final SparseIntArray f = new SparseIntArray();

    public ahdl(int i, int i2) {
        this.g = i;
        this.c = new ArrayList(i2);
        this.d = new SparseIntArray(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Set, java.lang.Object] */
    public final ahcw a(ahcq ahcqVar, int i) {
        ahcqVar.d = this.g;
        if (i == -1) {
            i = -1;
        }
        List list = this.c;
        apaa apaaVar = ahcqVar.f;
        int size = list.size();
        int d = ahcqVar.d();
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        ahcw ahcwVar = (ahcw) apaaVar.b;
        ahcw ahcwVar2 = ahcw.a;
        ahcwVar.e = d - 1;
        ahcwVar.b |= 2;
        anat anatVar = this.a;
        anas anasVar = ((ahcw) ahcqVar.f.b).d;
        if (anasVar == null) {
            anasVar = anas.a;
        }
        aozy builder = anasVar.toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        apag apagVar = builder.b;
        anas anasVar2 = (anas) apagVar;
        anatVar.getClass();
        anasVar2.e = anatVar;
        anasVar2.b |= 2048;
        if (!apagVar.isMutable()) {
            builder.u();
        }
        anas anasVar3 = (anas) builder.b;
        anasVar3.b |= 1;
        anasVar3.c = size;
        anas anasVar4 = (anas) builder.s();
        apaa apaaVar2 = ahcqVar.f;
        if (!apaaVar2.b.isMutable()) {
            apaaVar2.u();
        }
        ahcw ahcwVar3 = (ahcw) apaaVar2.b;
        anasVar4.getClass();
        ahcwVar3.d = anasVar4;
        ahcwVar3.b |= 1;
        adwq adwqVar = ahcqVar.g;
        if (!adwqVar.a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "ImpressionSet: ".concat(ahcqVar.toString()));
            }
            for (ahjj ahjjVar : adwqVar.a) {
            }
        }
        ahcw a = ahcqVar.a();
        this.c.add(a);
        this.d.append(size, i);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahdv ahdvVar) {
        boolean z = true;
        if (ahdvVar.b == 1) {
            if (this.d.valueAt(ahdvVar.c()) != -1) {
                z = false;
            }
            d.s(z);
        }
        this.b.add(ahdvVar);
    }
}
