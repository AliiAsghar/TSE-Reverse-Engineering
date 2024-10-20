package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.Scope;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ikg implements algk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ikg(int i, amlg amlgVar, int i2) {
        this.c = i2;
        this.a = i;
        this.b = amlgVar;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = 2;
        switch (this.c) {
            case 0:
                akfa akfaVar = (akfa) obj;
                int i2 = this.a;
                Object obj2 = this.b;
                synchronized (((iki) obj2).g) {
                    alvw g = iki.a.g();
                    g.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "fetchAndStoreData", 225, "RcsCapabilitiesDataSourceWrapper.java")).r("fetchAndStoreData updating cache result with subId: %d", i2);
                    ((iki) obj2).s = akfaVar;
                }
                return null;
            case 1:
                Optional of = Optional.of((psv) obj);
                ikf ikfVar = (ikf) this.b;
                boolean a = ((omb) ikfVar.m.b()).a();
                int i3 = this.a;
                if (!a) {
                    i3 = ikfVar.o.get();
                }
                return ikfVar.f.b(of, i3);
            case 2:
                yiy yiyVar = (yiy) obj;
                aozy l = ((mie) this.b).l(this.a);
                boolean z = yiyVar.b;
                if (!l.b.isMutable()) {
                    l.u();
                }
                amie amieVar = (amie) l.b;
                amie amieVar2 = amie.a;
                amieVar.b |= 1073741824;
                amieVar.G = z;
                boolean z2 = yiyVar.c;
                if (!l.b.isMutable()) {
                    l.u();
                }
                amie amieVar3 = (amie) l.b;
                amieVar3.b |= Integer.MIN_VALUE;
                amieVar3.H = z2;
                if (ier.a()) {
                    boolean z3 = yiyVar.d;
                    if (!l.b.isMutable()) {
                        l.u();
                    }
                    amie amieVar4 = (amie) l.b;
                    amieVar4.c |= 1;
                    amieVar4.I = z3;
                }
                return (amie) l.s();
            case 3:
                long count = Collection.EL.stream((List) obj).filter(new ilu(19)).count();
                alvw i4 = mlb.a.i();
                i4.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl", "failUndeliveredMessagesWithLogAndThenAttemptFallback", 224, "MessageStatusControllerImpl.java")).J("%s fallback attempts are cancelled or failed, with %d and %s", Long.valueOf(count), Integer.valueOf(this.a), ((amlg) this.b).name());
                return null;
            case 4:
                upm upmVar = (upm) obj;
                if (upmVar.a) {
                    ((iji) ((tva) this.b).h.b()).n(amkb.SUCCESS, this.a);
                }
                return upmVar;
            case 5:
                alvw i5 = tva.a.i();
                i5.X(alwp.a, "BugleEtouffee");
                ((alvg) ((alvg) ((alvg) i5).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "tryProcessPendingMessages", 310, "IdentityVerificationPendingMessageProcessor.java")).q("Failure when processing messages pending messages.");
                ((iji) ((tva) this.b).h.b()).n(amkb.OTHER_EXCEPTION, this.a);
                return upm.e();
            case 6:
                alvw i6 = tva.a.i();
                i6.X(alwp.a, "BugleEtouffee");
                ((alvg) ((alvg) ((alvg) i6).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", 371, "IdentityVerificationPendingMessageProcessor.java")).q("Failure when processing messages in queue");
                ((iji) ((tva) this.b).h.b()).n(amkb.OTHER_EXCEPTION, this.a);
                return upm.e();
            case 7:
                return ((NativeBaseCrypto) obj).generatePrekeySet((Scope) this.b, this.a);
            case 8:
                Throwable th = (Throwable) obj;
                if (this.a >= ((Integer) ulj.b.e()).intValue()) {
                    Object obj3 = this.b;
                    ulj.a.r("Exceeds max retry count, will not retry anymore", th);
                    ((ulj) obj3).d.c("Bugle.Cms.Backfill.Failure.Counts");
                    return upm.d();
                }
                return upm.e();
            case 9:
                Exception exc = (Exception) obj;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                int i7 = this.a;
                Object obj4 = this.b;
                ((alwl) ((alwl) ((alwl) una.a.i()).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attachForegroundService", 'Z', "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper unable to attach foreground service");
                ((mbl) ((una) obj4).b.b()).e("Bugle.AttachingAndroidFutureWrapper.Failure.Counts", umx.a(i7));
                return null;
            case 10:
                String str = (String) obj;
                aozy createBuilder = amkt.a.createBuilder();
                long millis = ((Duration) this.b).toMillis();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                amkt amktVar = (amkt) apagVar;
                amktVar.b = 4 | amktVar.b;
                amktVar.e = millis;
                str.getClass();
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                amkt amktVar2 = (amkt) apagVar2;
                amktVar2.b = 1 | amktVar2.b;
                amktVar2.c = str;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                int i8 = this.a;
                apag apagVar3 = createBuilder.b;
                amkt amktVar3 = (amkt) apagVar3;
                amktVar3.b = 2 | amktVar3.b;
                amktVar3.d = i8;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                amkt amktVar4 = (amkt) createBuilder.b;
                amktVar4.b |= 8;
                amktVar4.f = false;
                return (amkt) createBuilder.s();
            case 11:
                xze xzeVar = whj.a;
                aozy builder = ((whc) obj).toBuilder();
                Object obj5 = this.b;
                obj5.getClass();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                whc whcVar = (whc) builder.b;
                apbo apboVar = whcVar.k;
                if (!apboVar.b) {
                    whcVar.k = apboVar.a();
                }
                whcVar.k.put(obj5, Integer.valueOf(this.a));
                return (whc) builder.s();
            case 12:
                xze xzeVar2 = whj.a;
                aozy builder2 = ((whc) obj).toBuilder();
                aozy createBuilder2 = whl.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                int i9 = this.a;
                Object obj6 = this.b;
                ((whl) createBuilder2.b).b = a.an(i9);
                builder2.ab((String) obj6, (whl) createBuilder2.s());
                return (whc) builder2.s();
            case 13:
                int i10 = this.a;
                Object obj7 = this.b;
                xze xzeVar3 = whj.a;
                return (Integer) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((whc) obj).k), obj7, Integer.valueOf(i10));
            case 14:
                xze xzeVar4 = whj.a;
                aozy builder3 = ((whc) obj).toBuilder();
                Object obj8 = this.b;
                obj8.getClass();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                whc whcVar2 = (whc) builder3.b;
                apbo apboVar2 = whcVar2.j;
                if (!apboVar2.b) {
                    whcVar2.j = apboVar2.a();
                }
                whcVar2.j.put(obj8, Integer.valueOf(this.a));
                return (whc) builder3.s();
            case 15:
                Duration duration = (Duration) obj;
                xzb.j("Bugle", "Scheduling custom retry");
                RcsProvisioningListenableWorker rcsProvisioningListenableWorker = (RcsProvisioningListenableWorker) this.b;
                rcsProvisioningListenableWorker.g.l(rcsProvisioningListenableWorker.k(), duration, this.a, amww.STATE_MACHINE_RETRY);
                return duration;
            case 16:
                return wxz.d((IllegalArgumentException) obj, (rve) this.b, this.a);
            case 17:
                Collection.EL.forEach((alog) obj, new wog(this.b, this.a, i));
                return true;
            case 18:
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    ((yvs) this.b).c(this.a);
                } else {
                    yvs.a.q("Start group call failure, not logging click.");
                }
                return bool;
            case 19:
                Boolean bool2 = (Boolean) obj;
                if (bool2 != null && bool2.booleanValue()) {
                    ((yvs) this.b).c(this.a);
                } else {
                    yvs.a.m("Start call failure, not logging click.");
                }
                return bool2;
            default:
                Cursor cursor = (Cursor) obj;
                int length = zlt.b.length;
                int[] iArr = new int[4];
                for (int i11 = 0; i11 < 4; i11++) {
                    iArr[i11] = cursor.getColumnIndex(zlt.b[i11]);
                }
                int i12 = this.a;
                Object obj9 = this.b;
                zln zlnVar = new zln();
                zlt zltVar = (zlt) obj9;
                zlnVar.b = ((msk) zltVar.f.b()).t(cursor.getString(iArr[0]), i12);
                zlnVar.a = cursor.getString(iArr[1]);
                zlnVar.c = zltVar.a(cursor.getLong(iArr[2]));
                zlnVar.c(cursor.getInt(iArr[3]));
                zlnVar.b(cursor.getPosition());
                return zlnVar.a();
        }
    }

    public /* synthetic */ ikg(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
