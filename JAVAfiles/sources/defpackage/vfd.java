package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfd implements vgq {
    private final nib b;
    private final String c;
    private final armf e;
    private final ArrayList d = new ArrayList();
    public String a = "";
    private long f = 0;

    public vfd(armf armfVar, nib nibVar, String str, Iterable iterable) {
        this.b = nibVar;
        this.c = str;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            ArrayList arrayList = this.d;
            aozy createBuilder = aqfn.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            str2.getClass();
            ((aqfn) apagVar).c = str2;
            asku askuVar = asku.PHONE_NUMBER;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ((aqfn) createBuilder.b).b = askuVar.a();
            arrayList.add((aqfn) createBuilder.s());
        }
        this.e = armfVar;
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.f;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return new vgm(this.c);
    }

    @Override // defpackage.vgq
    public final ListenableFuture c(aqgb aqgbVar) {
        aozy createBuilder = aqdv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqdv aqdvVar = (aqdv) createBuilder.b;
        aqgbVar.getClass();
        aqdvVar.c = aqgbVar;
        aqdvVar.b |= 1;
        createBuilder.bK(this.d);
        aozy createBuilder2 = aqdl.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aqdl) createBuilder2.b).b = a.an(4);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqdv aqdvVar2 = (aqdv) createBuilder.b;
        aqdl aqdlVar = (aqdl) createBuilder2.s();
        aqdlVar.getClass();
        aqdvVar2.f = aqdlVar;
        aqdvVar2.b |= 4;
        if (this.b.a()) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aqdv) createBuilder.b).g = true;
        }
        this.a = aqgbVar.c;
        return albo.bI((aqdv) createBuilder.s());
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        aqar a = veoVar.b(yyb.cI(((psq) this.e.b()).c(this.c))).a();
        return akul.g(arlj.a(a.a.a(aqas.b(), a.b), (aqdv) apbtVar));
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqdw aqdwVar = (aqdw) apbtVar;
        if (aqdwVar != null) {
            aqgc aqgcVar = aqdwVar.b;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.f = j;
        return albo.bI(aqdwVar);
    }

    @Override // defpackage.vgq
    public final String f() {
        return "RetrieveRegistrationIdHandler";
    }

    @Override // defpackage.vgq
    public final String g() {
        return this.a;
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void h(Throwable th) {
        vht.c(this);
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void i() {
        vht.a(this);
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void j() {
        vht.b(this);
    }
}
