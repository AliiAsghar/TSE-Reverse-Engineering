package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfj {
    public final Object a;

    @Deprecated
    public zfj() {
        this.a = new msl(13);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    private final void f(amyt amytVar) {
        mar a = ((mbb) this.a.b()).a();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.WELCOME_FLOW_PAGE_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amfrVar2.aZ = amytVar;
        amfrVar2.f |= 1048576;
        a.b(amfqVar, mbt.LOG_SPEC_WELCOME_FLOW_EVENTS);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mbl, java.lang.Object] */
    public final void a() {
        this.a.e("Bugle.ContactDetailsPage.Open.Count", 1);
    }

    public final void b(int i, int i2) {
        aozy createBuilder = amyt.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amyt amytVar = (amyt) apagVar;
        amytVar.d = i - 1;
        amytVar.b |= 4;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amyt amytVar2 = (amyt) apagVar2;
        amytVar2.e = i2 - 1;
        amytVar2.b |= 8;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amyt amytVar3 = (amyt) createBuilder.b;
        amytVar3.c = 2;
        amytVar3.b = 2 | amytVar3.b;
        apag s = createBuilder.s();
        s.getClass();
        f((amyt) s);
    }

    public final void c(int i) {
        aozy createBuilder = amyt.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amyt amytVar = (amyt) apagVar;
        amytVar.d = i - 1;
        amytVar.b |= 4;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amyt amytVar2 = (amyt) createBuilder.b;
        amytVar2.c = 1;
        amytVar2.b |= 2;
        apag s = createBuilder.s();
        s.getClass();
        f((amyt) s);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void d(uta utaVar) {
        ((uof) this.a.b()).b(upk.b("sync_data_to_wearable_app", und.a, utaVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void e(uta utaVar) {
        ((uof) this.a.b()).a(upk.b("sync_data_to_wearable_app", und.a, utaVar));
    }

    public zfj(armf armfVar, short[] sArr) {
        this.a = armfVar;
    }

    public zfj(Object obj) {
        this.a = obj;
    }

    public zfj(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public zfj(String[] strArr) {
        this.a = strArr;
        new ArrayList();
        new HashMap();
    }

    public zfj(armf armfVar, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public zfj(mbl mblVar) {
        mblVar.getClass();
        this.a = mblVar;
    }

    public zfj(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public zfj(armf armfVar, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
