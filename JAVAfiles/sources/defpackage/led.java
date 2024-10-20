package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class led implements ancs {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ led(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul c;
        akul a;
        int i = 3;
        int i2 = 1;
        int i3 = 6;
        switch (this.c) {
            case 0:
                if (this.a) {
                    Object obj2 = this.b;
                    rae raeVar = (rae) obj2;
                    return aktp.ah(new kut(obj2, i3), raeVar.f).h(new itk(obj2, 13), raeVar.g);
                }
                return aktp.ag(null);
            case 1:
                if (!this.a) {
                    return ((rae) this.b).a(false);
                }
                return aktp.ag(null);
            case 2:
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                if (messageCoreData == null) {
                    return aktp.ag(mks.FAILED);
                }
                boolean z = this.a;
                Object obj3 = this.b;
                mkt mktVar = (mkt) obj3;
                return mktVar.l.b(messageCoreData.B()).q().i(new prn(obj3, messageCoreData, z, i2), mktVar.e).h(new mdr(17), mktVar.e);
            case 3:
                Conversation conversation = (Conversation) obj;
                mnw mnwVar = (mnw) this.b;
                wqv wqvVar = (wqv) mnwVar.c.b();
                c = qjh.c(wqvVar.c, arpj.a, arwf.a, new vck(wqvVar, (arpe) null, 11));
                qiu.f(c, "Failed to schedule questionnaire retrieval in PWQ.");
                if (this.a) {
                    qiu.f(((mlu) mnwVar.e.b()).D(conversation.c()), "Failed to disable emergency sos conversation.");
                }
                return aktp.ag(mnwVar.g.k((BugleConversation) conversation));
            case 4:
                Object obj4 = this.b;
                uyj uyjVar = (uyj) obj4;
                uyjVar.a.l("Clean up all Lighter conversations in Bugle DB");
                if (((Boolean) uyjVar.e.b()).booleanValue() && ((Optional) ((apxx) uyjVar.d).a).isPresent()) {
                    a = ((uyv) ((Optional) ((apxx) uyjVar.d).a).get()).a().i(new uwa(obj4, i3), uyjVar.f);
                } else {
                    a = ((ifq) uyjVar.c.get()).a();
                }
                if (this.a) {
                    uyjVar.a.l("Start lighter registration");
                    return a.i(new uwa(obj4, 7), uyjVar.f).i(new uva(2), uyjVar.f);
                }
                uyjVar.a.l("Skip Lighter registration since the account is not eligible.");
                return a.i(new uva(i), uyjVar.f);
            case 5:
                byte[] bArr = (byte[]) obj;
                boolean z2 = this.a;
                Object obj5 = this.b;
                if (bArr != null && bArr.length != 0) {
                    return ((vby) obj5).f().i(new prn(obj5, bArr, z2, i), andi.a);
                }
                if (!z2) {
                    return aktp.af(new aqwb(Status.g.d(new IllegalStateException("No registration and not allowed to re-register"))));
                }
                return ((vby) obj5).d();
            case 6:
                aqwb aqwbVar = (aqwb) obj;
                asky b = vch.b(aqwbVar);
                Status.Code a2 = vch.a(aqwbVar);
                xyo e = vby.m.e();
                e.H("Got StatusRuntimeException for RegisterRefresh");
                e.z("error", b.name());
                e.z("status", a2);
                e.z("exception", aqwbVar);
                e.q();
                if (b != asky.REGISTRATION_NOT_FOUND && b != asky.REGISTRATION_UNAUTHENTICATED && b != asky.GAIA_ID_MISMATCH) {
                    throw aqwbVar;
                }
                boolean z3 = this.a;
                Object obj6 = this.b;
                if (!z3) {
                    return ((vby) obj6).c().i(new uva(i3), andi.a);
                }
                vby.m.o("Handle non-retriable RegisterRefresh error by re-registering");
                return ((vby) obj6).d();
            case 7:
                alpt alptVar = (alpt) obj;
                alvw g = vhm.b.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/tachyonrefresh/TachyonRefreshManagerImpl", "refreshForAllPhoneNumbers", 136, "TachyonRefreshManagerImpl.java")).r("Found %s registrations in settings", alptVar.size());
                Stream map = Collection.EL.stream(alptVar).map(new lch(this.b, this.a, i3));
                int i4 = alog.d;
                return aktp.am((alog) map.collect(alls.a)).h(new vcr(5), andi.a);
            default:
                Boolean bool = (Boolean) obj;
                alwo alwoVar = wkk.a;
                Object obj7 = this.b;
                boolean z4 = this.a;
                if (obj7 == amwt.DISABLED_FROM_PREFERENCES && bool.booleanValue() && z4) {
                    return aktp.ag(true);
                }
                ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "checkSettingsRedesignedMultiSimScheduleRevokeGoogleConsentTask", 1746, "RcsProvisioningTriggerImpl.java")).J("RcsProvisioningTrigger: Should not schedule Revoke Google Consent Task because availability=%s, anySimInDeviceGoogleTos=%s, isToggleStateUserDisabled=%s", obj7, bool, Boolean.valueOf(z4));
                return aktp.ag(false);
        }
    }
}
