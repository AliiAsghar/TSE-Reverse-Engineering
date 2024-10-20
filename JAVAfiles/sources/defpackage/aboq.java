package defpackage;

import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aboq extends abno {
    public aboq(abor aborVar, aozb aozbVar) {
        super(aborVar);
        apaa apaaVar = this.o;
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        apvz apvzVar = (apvz) apaaVar.b;
        apvz apvzVar2 = apvz.a;
        apvzVar.b |= 2048;
        apvzVar.f = aozbVar;
    }

    @Override // defpackage.abno
    public final /* bridge */ /* synthetic */ abno a() {
        Iterator it = ((abor) this.a).m.iterator();
        aboq aboqVar = this;
        while (it.hasNext()) {
            aboqVar = ((abop) it.next()).a();
            if (aboqVar == null) {
                return null;
            }
        }
        return aboqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.abno
    public final LogEventParcelable b() {
        String[] strArr;
        ExperimentTokens[] experimentTokensArr;
        String[] strArr2;
        amnr amnrVar = this.c;
        if (amnrVar != null) {
            apaa apaaVar = this.o;
            aozb byteString = amnrVar.toByteString();
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            apvz apvzVar = (apvz) apaaVar.b;
            apvz apvzVar2 = apvz.a;
            apvzVar.b |= 524288;
            apvzVar.h = byteString;
        }
        apvz apvzVar3 = (apvz) this.o.s();
        abor aborVar = (abor) this.a;
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(aborVar.i, abnn.a(aborVar.f), this.j, this.i, d(), ((abor) this.a).j);
        byte[] byteArray = apvzVar3.toByteArray();
        int[] f = abnn.f(this.d);
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            strArr = (String[]) arrayList.toArray(abnn.b);
        } else {
            strArr = null;
        }
        int[] f2 = abnn.f(this.f);
        ArrayList arrayList2 = this.g;
        if (arrayList2 != null) {
            experimentTokensArr = (ExperimentTokens[]) arrayList2.toArray(abnn.a);
        } else {
            experimentTokensArr = null;
        }
        Set set = this.h;
        if (set != null) {
            strArr2 = (String[]) set.toArray(abnn.b);
        } else {
            strArr2 = null;
        }
        return new LogEventParcelable(playLoggerContext, apvzVar3, byteArray, f, strArr, f2, experimentTokensArr, strArr2, apvzVar3.e);
    }

    @Override // defpackage.abno
    public final acir c() {
        throw null;
    }
}
