package defpackage;

import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnq extends abno {
    public final apbt p;
    public abom q;

    public abnq(abnr abnrVar, apbt apbtVar) {
        super(abnrVar);
        this.p = apbtVar;
    }

    @Override // defpackage.abno
    public final /* bridge */ /* synthetic */ abno a() {
        Iterator it = ((abnr) this.a).n.iterator();
        while (it.hasNext()) {
            ((abnp) it.next()).a(this);
        }
        Iterator it2 = abnr.m.iterator();
        while (it2.hasNext()) {
            ((abnp) it2.next()).a(this);
        }
        return this;
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
        apaa apaaVar2 = this.o;
        aozb byteString2 = this.p.toByteString();
        if (!apaaVar2.b.isMutable()) {
            apaaVar2.u();
        }
        apvz apvzVar3 = (apvz) apaaVar2.b;
        apvz apvzVar4 = apvz.a;
        byteString2.getClass();
        apvzVar3.b |= 2048;
        apvzVar3.f = byteString2;
        apvz apvzVar5 = (apvz) this.o.s();
        abnr abnrVar = (abnr) this.a;
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(abnrVar.i, abnn.a(abnrVar.f), this.j, this.i, d(), ((abnr) this.a).j);
        byte[] byteArray = apvzVar5.toByteArray();
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
        return new LogEventParcelable(playLoggerContext, apvzVar5, byteArray, f, strArr, f2, experimentTokensArr, strArr2, apvzVar5.e);
    }

    @Override // defpackage.abno
    public final acir c() {
        if (!this.b) {
            this.b = true;
            return ((abnr) this.a).g.a(this);
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }
}
