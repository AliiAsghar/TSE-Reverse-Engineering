package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneSchedulerWorker;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeba extends gto {
    private final qdq a;
    private final qdq b;

    public aeba(qdq qdqVar, qdq qdqVar2) {
        qdqVar.getClass();
        qdqVar2.getClass();
        this.b = qdqVar;
        this.a = qdqVar2;
    }

    @Override // defpackage.gto
    public final gsx a(Context context, String str, WorkerParameters workerParameters) {
        if (d.F(str, PersephoneDownloadWorker.class.getName())) {
            qdq qdqVar = this.b;
            krv krvVar = ((krw) qdqVar.a).a;
            aeec hf = krvVar.hf();
            Optional.empty();
            krx krxVar = krvVar.a;
            krxVar.a.ha();
            Object b = krxVar.P.b();
            b.getClass();
            aebc aebcVar = (aebc) b;
            aegu aeguVar = (aegu) ((krw) qdqVar.a).a.i.b();
            Optional of = Optional.of(new adzn());
            aedw aedwVar = (aedw) ((krw) qdqVar.a).a.rI.b();
            krv krvVar2 = ((krw) qdqVar.a).a;
            krv krvVar3 = krvVar2.a.a;
            aeak ha = krvVar2.ha();
            aeaj aeajVar = new aeaj((aebo) krvVar3.rK.b());
            krv krvVar4 = ((krw) qdqVar.a).a;
            return new PersephoneDownloadWorker(context, workerParameters, hf, aebcVar, aeguVar, (Optional<adzm>) of, aedwVar, ha, aeajVar, krvVar4.hb(), krvVar4.hd(), krvVar4.gZ(), (Optional<aead>) Optional.empty());
        }
        if (!d.F(str, PersephoneSchedulerWorker.class.getName())) {
            return null;
        }
        return new PersephoneSchedulerWorker(context, workerParameters, ((krw) this.a.a).a.hb());
    }
}
