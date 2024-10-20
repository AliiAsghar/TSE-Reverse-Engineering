package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class pvu extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        FileInformation fileInformation = (FileInformation) obj;
        aozy createBuilder = qep.a.createBuilder();
        if (fileInformation.h().isPresent() && fileInformation.h().isPresent()) {
            String str = (String) fileInformation.h().get();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((qep) createBuilder.b).c = str;
        }
        int a = fileInformation.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((qep) createBuilder.b).d = a;
        qel qelVar = (qel) pwc.a.m().fu(fileInformation.b());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qep qepVar = (qep) apagVar;
        qelVar.getClass();
        qepVar.e = qelVar;
        qepVar.b |= 1;
        String i = fileInformation.i();
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((qep) createBuilder.b).f = i;
        e(fileInformation, createBuilder);
        return (qep) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qep qepVar = (qep) obj;
        ajqc ajqcVar = new ajqc((byte[]) null);
        c(qepVar, ajqcVar);
        ajqcVar.g(qepVar.d);
        if ((qepVar.b & 1) != 0) {
            algf algfVar = pwc.a;
            qel qelVar = qepVar.e;
            if (qelVar == null) {
                qelVar = qel.a;
            }
            ajqcVar.d((ContentType) algfVar.fu(qelVar));
        }
        ajqcVar.h(qepVar.f);
        if ((qepVar.b & 2) != 0) {
            d(qepVar, ajqcVar);
        }
        return ajqcVar.a();
    }

    public void c(qep qepVar, ajqc ajqcVar) {
        throw null;
    }

    public abstract void d(qep qepVar, ajqc ajqcVar);

    public abstract void e(FileInformation fileInformation, aozy aozyVar);
}
