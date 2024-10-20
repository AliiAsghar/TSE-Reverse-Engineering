package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.UserDevice;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;
import io.grpc.Status;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ttg implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ttg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    maq maqVar = (maq) ((tth) this.a).h.b();
                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                    amfp amfpVar = amfp.BUGLE_E2EE_EMPTY_GENERATED_PREKEYS_BUT_PROVISIONED;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar = (amfr) amfqVar.b;
                    amfrVar.i = amfpVar.dg;
                    amfrVar.b |= 1;
                    maqVar.j(amfqVar);
                }
                return Boolean.valueOf(!r10.booleanValue());
            case 1:
                mbm mbmVar = ((tsp) this.a).n;
                if (mbmVar != null) {
                    mbmVar.c();
                    tsp.b.l("stopping etouffee action timer");
                }
                return null;
            case 2:
                return this.a;
            case 3:
                Status status = (Status) obj;
                if (status.f()) {
                    return 0;
                }
                ((ttj) this.a).e.c("Bugle.Etouffee.OtkCleanUp.FailureCount");
                throw new aqwb(status);
            case 4:
                ((tuc) this.a).b.c("Bugle.Etouffee.ChatApi.EmptyRemoteRegistrationIds.Count");
                return tuc.e((tvv) obj);
            case 5:
                aqwb aqwbVar = (aqwb) obj;
                tup.a.r("Failed to process SIGNAL_FAILURE: ProcessDeliverReceipt failed.", aqwbVar);
                ((mbl) ((tup) this.a).l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 17);
                if (tzx.c(aqwbVar.a)) {
                    return upm.e();
                }
                return upm.d();
            case 6:
                tup.a.q("Skipped processing an FTD because Etouffee is not provisioned.");
                ((mbl) ((tup) this.a).l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 13);
                return upm.d();
            case 7:
                aqwb aqwbVar2 = (aqwb) obj;
                tuu.a.r("Failed to process SIGNAL_FAILURE: ProcessDeliverReceipt failed.", aqwbVar2);
                ((mbl) ((tuu) this.a).l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 17);
                if (tzx.c(aqwbVar2.a)) {
                    return upm.e();
                }
                return upm.d();
            case 8:
                tuu.a.q("Skipped processing an FTD because Etouffee is not provisioned.");
                ((mbl) ((tuu) this.a).l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 13);
                return upm.d();
            case 9:
                xyo c = tvg.a.c();
                qdk qdkVar = (qdk) this.a;
                c.g(rve.a(qdkVar.a.g));
                c.f(qdkVar.a.h);
                c.H("Sent a receipt from Persistent Work Queue.");
                c.q();
                return pwh.SUCCESS;
            case 10:
                return ((NativeBaseCrypto) obj).hasAnyGeneratedPrekeys((Scope) this.a);
            case 11:
                Optional optional = (Optional) obj;
                boolean isPresent = optional.isPresent();
                Object obj2 = this.a;
                if (isPresent) {
                    TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets = (TachyonCommon$PublicPreKeySets) optional.get();
                    aozy aozyVar = (aozy) obj2;
                    if (!aozyVar.b.isMutable()) {
                        aozyVar.u();
                    }
                    aqep aqepVar = (aqep) aozyVar.b;
                    aqep aqepVar2 = aqep.a;
                    aqepVar.o = tachyonCommon$PublicPreKeySets;
                    aqepVar.b |= 1024;
                } else {
                    xyo a = tvn.a.a();
                    a.H("Fall back to empty prekey set");
                    a.q();
                }
                return obj2;
            case 12:
                aqwb aqwbVar3 = (aqwb) obj;
                ((twc) this.a).b(aqwbVar3.a);
                throw aqwbVar3;
            case 13:
                Optional optional2 = (Optional) obj;
                if (optional2.isPresent()) {
                    return Optional.of(new UserDevice(((qei) ((Optional) this.a).get()).d, (String) optional2.get()));
                }
                return Optional.empty();
            case 14:
                aozy builder = ((tyq) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((tyq) builder.b).b = ((typ) this.a).a();
                return (tyq) builder.s();
            case 15:
                String str = ((vfd) this.a).a;
                tyw.a.l("Received LookupRegisteredResponse");
                alok alokVar = new alok();
                for (aqgh aqghVar : ((aqdw) obj).c) {
                    aqfn aqfnVar = aqghVar.b;
                    if (aqfnVar == null) {
                        aqfnVar = aqfn.a;
                    }
                    alokVar.h(aqfnVar.c, alog.n(aqghVar.c));
                }
                return new tyy(1, str, alokVar.g(), 0);
            case 16:
                aqwb aqwbVar4 = (aqwb) obj;
                tyw.a.r("Caught StatusRuntimeException, failed to retrieve registration Ids from tachyon", aqwbVar4);
                return new tyy(3, ((vfd) this.a).a, altc.a, aqwbVar4.a.getCode().value());
            case 17:
                ((usk) this.a).d("user_etouffee_enabled_setting_data_service");
                return null;
            case 18:
                ((usk) this.a).d("user_etouffee_settings_data_service");
                return null;
            case 19:
                return Boolean.valueOf(((ubo) this.a).c.get());
            default:
                ((ucd) this.a).b.b((SQLiteDatabase) obj);
                return null;
        }
    }
}
